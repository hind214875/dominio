/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominó;

import java.util.Random;

/**
 *
 * @author hinda
 */
public class FichaDomino {

    //Atributos
    private int parte1;
    private int parte2;
    
    //constrectores
    public FichaDomino(int parte1, int parte2) {
        this.parte1 = parte1;
        this.parte2 = parte2;
        if (this.parte1 < 0 || this.parte1 > 6) {
            if (this.parte1 % 2 == 0) {
                this.parte1 = 6;

            } else if (this.parte1 % 2 != 0) {
                this.parte1 = 5;

            }
        }
        if (this.parte2 < 0 || this.parte2 > 6) {
            if (this.parte2 % 2 == 0) {
                this.parte2 = 6;

            } else if (this.parte2 % 2 != 0) {
                this.parte2 = 5;

            }
        }

    }
    //constrector por defecto

    public FichaDomino() {
        this.parte1 = 0;
        this.parte2 = 0;
          
    }
    //getters y setters

    public int getParte1() {
        return parte1;
    }

    public void setParte1(int parte1) {
        this.parte1 = parte1;
        if (this.parte1 < 0 || this.parte1 > 6) {
            if (this.parte1 % 2 == 0) {
                this.parte1 = 6;

            } else if (this.parte1 % 2 != 0) {
                this.parte1 = 5;

            }
        }

    }

    public int getParte2() {
        return parte2;
    }

    public void setParte2(int parte2) {
        this.parte2 = parte2;
        if (this.parte1 < 0 || this.parte1 > 6) {
            if (this.parte2 % 2 == 0) {
                this.parte2 = 6;

            } else if (this.parte2 % 2 != 0) {
                this.parte2 = 5;

            }
        }
    }

    @Override
    public String toString() {
        return "[" + parte1 + "|" + parte2 + ']';
    }

    public byte getValorTotal() {
        int suma = parte1 + parte2;
        return (byte) suma;
    }

    public int generaFichaAleatoria(int parte1, int parte2) {
        Random rd = new Random();
        int numeroAl = 0;
        
        if(parte1<0 || parte1>6 && parte2<0 || parte2>6){
            if(parte1%2==0 || parte2%2==0){
                numeroAl=6;
            }else if((parte1%2)!=0 || (parte2%2)!=0){
                numeroAl=5;
            }
        }else{
            numeroAl= rd.nextInt(7);
        }
         
        return numeroAl;
    }

}
