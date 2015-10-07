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
    int cantMon100,cantMon200,cantMon500,recipiente100,recipiente200,recipiente500,pago,vuelto;
    //variable para cantidad de cafe
    int cantCN,cantCC,cantCE;
    //nivel de azucar
    int nivelAzucar;
    //tipos de cafe de la cafetera
    String []TIPO_CAFE={"café negro","café claro","café expresso"};
    //dinero del cliente
  
    
    //inicializa las variables de la cafetera
    // se indica nivel de azucar y tipos de cafe como valor a 100, cantidad de monedas 10
    public Maquina(){
        cantMon100=10;
        cantMon200=10;
        cantMon500=10;
        nivelAzucar=100;
        cantCN=100;
        cantCC=100;
        cantCE=100;
        //recipiente para los 3 tipos de monedas
        recipiente100=0;
        recipiente200=0;
        recipiente500=0;
    }
    //comprobar cafe disponible antes de operar
    boolean comprobarCafe(int option){
        boolean bool = false;
        switch(option){
            case 1:
                    bool= cantCN>10;
                break;
            case 2:
                    bool= cantCC>10;
                break;
            case 3:
                    bool= cantCE>10;
                break;
        }
        return bool;
    }
    boolean comprobarAzucar(){
        return nivelAzucar>0;
    }

    public int getRecipiente100() {
        return recipiente100;
    }

    public int getRecipiente200() {
        return recipiente200;
    }

    public int getRecipiente500() {
        return recipiente500;
    }

    public int getCantMon100() {
        return cantMon100;
    }

    public int getCantMon200() {
        return cantMon200;
    }

    public int getCantMon500() {
        return cantMon500;
    }
    
    public void setCantMon100(int cantMon100) {
        this.cantMon100 -= cantMon100;
    }

    public void setCantMon200(int cantMon200) {
        this.cantMon200 -= cantMon200;
    }

    public void setCantMon500(int cantMon500) {
        this.cantMon500 -= cantMon500;
    }

    public void setRecipiente100(int recipiente100) {
        this.recipiente100 += recipiente100;
    }

    public void setRecipiente200(int recipiente200) {
        this.recipiente200 += recipiente200;
    }

    public void setRecipiente500(int recipiente500) {
        this.recipiente500 += recipiente500;
    }

    public void setCantCN(int cantCN) {
        this.cantCN = cantCN;
    }

    public void setCantCC(int cantCC) {
        this.cantCC = cantCC;
    }

    public void setCantCE(int cantCE) {
        this.cantCE = cantCE;
    }

    public void setNivelAzucar(int nivelAzucar) {
        this.nivelAzucar = nivelAzucar;
    }
    public void setPago(int pago){
        this.pago=pago;
    }
    
    void darVuelto(int vuelto){
        int aux,aux1=0,aux2=0,aux3=0;
        aux=vuelto;
        do{   
            if(aux>=500){
                aux=aux%500;
                aux1++;
            }
            else if(aux>=200 && aux<500){
                aux=aux%200;
                aux2++;
            }
            else if(aux>=100&& aux<200){
                aux=aux%100;
                aux3++;
                    }
        }
        while(aux!=0);
        System.out.println("monedas de 500: "+getCantMon500()+" monedas de 200: "+getCantMon200()+" monedas de 100: "+getCantMon100());
            setCantMon500(aux1);
            setCantMon200(aux2);
            setCantMon100(aux3);
        System.out.println("ACTUALES monedas de 500: "+getCantMon500()+" monedas de 200: "+getCantMon200()+" monedas de 100: "+getCantMon100());

        }
    }


