/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.System.exit;
import static javafx.scene.paint.Color.color;

/**
 *
 * @author natalia
 */
public class aparatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        Electrodomestico electrodomestico;
        Electrodomestico aparato;
        int tele=0;
        int lava=0;
        float precioTele=0;
        float precioLava=0;
                    
        for(int i=1;i<=10;i++){
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese el electrodomestico");
            System.out.println("1. Lavadora");
            System.out.println("2. Televisor");
            int opc=Integer.parseInt(in.readLine());

        switch(opc){
                case 1:
                    System.out.println("Ingrese la carga");
                    double carga=Double.parseDouble(in.readLine());
                    System.out.println("Ingrese el peso");
                    int peso=Integer.parseInt(in.readLine());
                    //colores
                                       
                    System.out.println("Ingrese el color");
                    System.out.println("1. Azul");
                    System.out.println("2. Negro");
                    System.out.println("3. Gris");
                    System.out.println("4. Blanco");
                    System.out.println("5. Rojo");
                    int opcion=Integer.parseInt(in.readLine());
                    Colores color;
                    color= Colores.white;
                       switch(opcion){
                           case 1: color=Colores.blue;
                               break;
                           case 2:color=Colores.black;
                               break;
                           case 3:color=Colores.gray;
                               break;
                           case 4:color=Colores.white;
                               break;
                           case 5:color=Colores.red;
                               break;
                       }
                    //comsumo
                    System.out.println("Ingrese el consumo");
                    System.out.println("1. A");
                    System.out.println("2. B");
                    System.out.println("3. C");
                    System.out.println("4. D");
                    System.out.println("5. E");
                    System.out.println("6. F");
                    int opcioncon=Integer.parseInt(in.readLine());
                    
                       Consumo consumo;
                    consumo= Consumo.A;
                       switch(opcioncon){
                           case 1: consumo=Consumo.A;
                               break;
                           case 2:consumo=Consumo.B;
                               break;
                           case 3:consumo=Consumo.C;
                               break;
                           case 4:consumo=Consumo.D;
                               break;
                           case 5:consumo=Consumo.E;
                               break;
                            case 6:consumo=Consumo.F;
                               break;
                       }
                    aparato=new Lavadora(carga,100,peso,color ,consumo);
                    aparato.darDatos();
                    lava=lava+1;
                    precioLava=precioLava+aparato.precio_final;
                    
       //             carga peso color precio_base consumo;
                    break;
                case 2:
                    System.out.println("Ingrese la resolucion");
                    int resolucion=Integer.parseInt(in.readLine());
                    System.out.println("Ingrese el peso");
                    int pesol=Integer.parseInt(in.readLine());
                    peso=pesol;
                    System.out.println("Ingrese si tiene sincronizador TDT");
                    System.out.println("Si es falso ingrese FALSE si no TRUE");
                    boolean sincronizador_TDT=Boolean.parseBoolean(in.readLine());
                                        //colores
                                       
                    System.out.println("Ingrese el color");
                    System.out.println("1. Azul");
                    System.out.println("2. Negro");
                    System.out.println("3. Gris");
                    System.out.println("4. Blanco");
                    System.out.println("5. Rojo");
                    int opcioncol=Integer.parseInt(in.readLine());
                    Colores colors;
                    colors= Colores.white;
                       switch(opcioncol){
                           case 1: colors=Colores.blue;
                               break;
                           case 2:colors=Colores.black;
                               break;
                           case 3:colors=Colores.gray;
                               break;
                           case 4:colors=Colores.white;
                               break;
                           case 5:colors=Colores.red;
                               break;
                       }
                    //comsumo
                    System.out.println("Ingrese el consumo");
                    System.out.println("1. A");
                    System.out.println("2. B");
                    System.out.println("3. C");
                    System.out.println("4. D");
                    System.out.println("5. E");
                    System.out.println("6. F");
                    int opcionco=Integer.parseInt(in.readLine());
                    
                       Consumo consumos;
                    consumos= Consumo.A;
                       switch(opcionco){
                           case 1: consumos=Consumo.A;
                               break;
                           case 2:consumos=Consumo.B;
                               break;
                           case 3:consumos=Consumo.C;
                               break;
                           case 4:consumos=Consumo.D;
                               break;
                           case 5:consumos=Consumo.E;
                               break;
                            case 6:consumos=Consumo.F;
                               break;
                       }
                    aparato= new Televisor(resolucion,sincronizador_TDT,100,peso,colors,consumos,(float)32);
                    aparato.darDatos();
                    tele=tele+1;
                    precioTele=precioTele+aparato.precio_final;
                    break;
                            }      
        System.out.println("Desea ingresar otro electrodomestico?");
        System.out.println("Dijite 1 para Si o 2 para No");
        int dijite=Integer.parseInt(in.readLine());
                    
        if(dijite==1){
        i++;   
        }else{
            i=10;
            System.out.println("La cantidad de lavadoras registradas es " +lava);
            System.out.println("Precio total de todas las  lavadoras " +precioLava);
            System.out.println("La cantidad de televiciones registradas es " +tele);
            System.out.println("Precio total de todas las  televiciones " +precioTele);
            
        }
        
    }
  

    }}