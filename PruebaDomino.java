/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominó;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author hinda
 */
public class PruebaDomino {

    //metodos
    public static int leerEnteros() {
        boolean solicitarDatos = true;
        Scanner sc = new Scanner(System.in);
        int a = 0;
        do {
            solicitarDatos = true;
            try {
                // Bloque de código candidato a lanzar la excepción
                System.out.println("Introduce un numero ");
                a = sc.nextInt();
                solicitarDatos = false;
            } catch (InputMismatchException ime) {
                // Código para tratar el error
                System.out.println("Se ha introducido texto en lugar de números. "
                        + "Vuelva a introducir los datos");
                sc.nextLine();
            }
        } while (solicitarDatos);
        return a;
    }

    public static boolean DevuelveFichasiSeisDouble(FichaDomino fichaDomino) {
        return fichaDomino.getParte1() == 6 && fichaDomino.getParte2() == 6;
    }

    public static void main(String[] args) {
//
//        FichaDomino f1 = new FichaDomino(leerEnteros(), leerEnteros());
//        FichaDomino f2 = new FichaDomino(leerEnteros(), leerEnteros());
//        System.out.println(f1.toString());
//        System.out.println(f2.toString());

//        FichaDomino f3 = new FichaDomino(-6, 9);
//        System.out.println(f3.toString());
//
//        FichaDomino f4 = new FichaDomino();
//        System.out.println(f4.toString());
//        f4.setParte1(4);
//        f4.setParte2(2);
//        System.out.println(f4.toString());
        int contador = 1;
        FichaDomino f5 = new FichaDomino();
        do {
            f5.setParte1(f5.generaFichaAleatoria(0, 6));
            f5.setParte2(f5.generaFichaAleatoria(0, 6));
            System.out.println(f5.toString());
            System.out.println(f5.getValorTotal());
            if(!(DevuelveFichasiSeisDouble(f5))){
                
                contador++;
            }
        } while (!(DevuelveFichasiSeisDouble(f5)));
        System.out.println(contador);
    }
}
