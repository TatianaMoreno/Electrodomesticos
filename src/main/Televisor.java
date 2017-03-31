/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author natalia
 */
public class Televisor extends Electrodomestico{
    private int  resolucion;
    private boolean  sincronizador_TDT;

    public Televisor(int resolucion, boolean sincronizador_TDT, float precio_base, int peso, Colores color, Consumo consumo, float precio_final) {
        super(precio_base, peso, color, consumo);
        this.resolucion = resolucion;
        this.sincronizador_TDT = sincronizador_TDT;
    }
      @Override
     public void darDatos(){
        super.darDatos();
        if (resolucion>40){
            precio_final=(float) (precio_base+0.30);
        }else{
            precio_final=precio_base;}
         if(sincronizador_TDT==true){
             precio_final=precio_base+50;}
        else{
            precio_final=precio_base;
        }
        if((resolucion>40)&&(sincronizador_TDT==true)){
             precio_final=(float) (precio_base+0.30)+50;
        }
            System.out.println(" Resolucion:"+this.resolucion+" Sincronizador TDT: "+this.sincronizador_TDT);
            System.out.println(" Precio final :"+precio_final);
     }

    public double getResolucion() {
        return resolucion;
    }

    public boolean getSincronizador_TDT() {
        return sincronizador_TDT;
    }

}

    

      
