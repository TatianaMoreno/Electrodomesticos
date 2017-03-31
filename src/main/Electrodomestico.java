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
public class Electrodomestico {

    public  float precio_base;
    private int peso;
    private Colores color;
    private Consumo consumo;
    public  float precio_final;

    public Electrodomestico(float precio_base, int peso, Colores color, Consumo consumo) {
        this.precio_base = 100;
        this.peso = peso;
        this.color = color;
        this.consumo = consumo;
    
    }
       
    public void darDatos(){
         System.out.print(" Precio: "+ this.precio_base +" Peso: "+this.peso+" Color: " +this.color +" Consumo:"+ this.consumo);
    }

    public float getPrecio_base() {
          return precio_base;
    }

    public int getPeso() {
             return peso;
    }

    public Colores getColores() {
        return color;
    }

    public Consumo getConsumo() {
        return consumo;
    }
    public float getPrecio_final() {
        return precio_final;
    }

    public void setPrecio_base(float precio_base) {
        this.precio_base = precio_base;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setColor(Colores color) {
        this.color = color;
    }

    public void setConsumo(Consumo consumo) {
        this.consumo = consumo;
    }

    public void setPrecio_final(float precio_final) {
        this.precio_final = precio_final;
    }
  

}