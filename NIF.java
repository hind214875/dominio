/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominó;

import ej9.*;
import java.util.Scanner;

/**
 *
 * @author hinda
 */
public class NIF {
    //Atributos
    private String dni;
    private char letra;
    private int contador;
    //constrictores

    public NIF() { //nif no valido
       this.dni="0";
       this.letra='O';
       contador++;
    }

    public NIF(String dni) {
        this.dni =dni;
        this.letra=calcularLetra(dni);
        contador++;
    }
    
    private static char calcularLetra(String dni){
         String letras="TRWAGMYFPDXBNJZSOVHLCKE";
         final int CONSTANTE=23;
         
         int resto=Integer.parseInt(dni)%CONSTANTE;//convertimos el strin a int
         return letras.charAt(resto);
     }
     
    public String leer(){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Introduce el dni: ");
        dni=sc.nextLine();
        
        return dni;
    }
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public int getContador() {
        return contador;
    }
    

    @Override
    public String toString() {
        return  dni +"-"+letra;
    }
    
    public void Mostrar(){
        System.out.println(toString());
    }
    
}
