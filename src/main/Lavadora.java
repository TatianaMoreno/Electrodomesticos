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
    public class Lavadora extends Electrodomestico{
    private double carga;
    

    public Lavadora(double carga, float precio_base, int peso, Colores color, Consumo consumo) {
        super(precio_base, peso, color, consumo);
        this.carga = carga;
    }
       
    @Override
    public void darDatos(){
        super.darDatos();
        if (carga>30){
         precio_final=precio_base+50;}
        else{
         precio_final=precio_base;}
         System.out.println(" Precio final :"+precio_final);
         System.out.println(" Carga:"+this.carga);
    
    }
    public double getCarga() {
           return carga;
    }

    public void setCarga(double carga) {
          this.carga = carga;
    }

  
    
}
    
    
