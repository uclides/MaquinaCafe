/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Leasetech
 */
public class Maquina {
    //variables para monto cada moneda
    int cantMon100,cantMon200,cantMon500;
    //tipos de cafe de la cafetera
    String []TIPO_CAFE={"café negro","café claro","café expresso"};
    //nivel de azucar
    int nivelAzucar;
    //vuelto del cliente
    float vuelto;
    
    
    public Maquina(int moneda1,int moneda2,int moneda3){
        cantMon100=moneda1;
    }
    
}
