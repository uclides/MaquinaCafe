
import java.util.Scanner;

  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Uclides Gil
 */
public class MaquinaCafe {

        static Maquina cafetera;
        static Scanner input=new Scanner(System.in);
        static int monedas500=0,monedas200=0,monedas100=0;
        static int aux=0,aux1=0,aux2=0,aux3=0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int val=0;
        String[] opciones={"1) comprar café negro (200bs)","2) comprar café claro (300bs)","1) comprar café expresso (600bs)","0) Salir"};
        MaquinaCafe maquinaCafe=new MaquinaCafe();
//mensajes iniciales
        System.out.println("*******CAFETERA*******");
        System.out.println("encendiendo cafetera...");
        System.out.println("inicializando parametros...");
        System.out.println("___________________________");
        //instancia objeto de la clase
        cafetera=new Maquina();
        maquinaCafe.mostrarMenu("OPCIONES DE VENTA", opciones,val);
        
        
    }
    //metodo para mostrar menu generico
    void mostrarMenu(String msj,String[] options,int val){
        //leer valores de consola
        Scanner input=new Scanner(System.in);
  
        do{
            System.out.println("\t\t"+msj);
            System.out.println("*************************************************");
            
//muestra todas las opciones del menú
            for (String option : options) {
                System.out.println("\t"+option);
            }
            System.out.println("*************************************************");
            System.out.print("ingrese opcion a realizar: ");
            val=input.nextInt();
            
//comprobar si existe disponibilidad del tipo de cafe y la cantidad de azucar
            if(cafetera.comprobarCafe(val) && cafetera.comprobarAzucar()){
               
                    switch(val){
                        case 1:
                                recibirPago(200);
                            break;
                    }
            }
            else{
                System.out.println("NO DISPONE DE INGREDIENTES");
            }
            System.out.println("¿Desea comprar otro cafe? SI(1)/ NO(0)");
            val=input.nextInt();
        }
  
        while(val!=0);
    }
    
    //recibe las monedas de pago y las almacena por denominacion
    void recibirPago(int montocafe){
        
        
        do{
            System.out.print("¿con cuantas monedas de 500 pagara?: ");
            monedas500=input.nextInt();
            aux1+=monedas500;
            if(aux1*500>=montocafe){
                System.out.print("PAGO REALIZADO SU VUELTO ES: ");
                cafetera.setRecipiente500(aux1);
                aux=monedas500*500;
                cafetera.darVuelto(aux-montocafe);
                System.out.println("cantidad de monedas: "+cafetera.getRecipiente500()+","+cafetera.getRecipiente200()+","+cafetera.getRecipiente100());
            }
            else{
                aux=monedas500*500;
                System.out.print("¿con cuantas monedas de 200 pagara?: ");
                monedas200=input.nextInt(); 
                aux2+=monedas200;
                if((aux2*200)+aux>=montocafe){
                    System.out.print("PAGO REALIZADO SU VUELTO ES: ");
                    cafetera.setRecipiente500(aux1);
                    cafetera.setRecipiente200(aux2);
                    aux+=aux2*200;
                }
                else{
                    aux+=aux2*200;
                    System.out.print("¿con cuantas monedas de 100 pagara?: ");
                    monedas100=input.nextInt(); 
                    aux3+=monedas100;
                    if((aux3*100)+aux>=montocafe){
                        System.out.print("PAGO REALIZADO SU VUELTO ES: ");
                        cafetera.setRecipiente500(aux1);
                        cafetera.setRecipiente200(aux2);
                        cafetera.setRecipiente100(aux3);
                        aux+=aux3*100;
                    }
                    else{
                        aux+=aux3*100;
                        System.out.println("¡FALTA DINERO PARA PROCESAR SU CAFE!");
                    }
                }
            }
        }   
        while(aux<montocafe);
    }
    
}
