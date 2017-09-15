/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warcraftdungeon;

import java.util.Scanner;

/**
 *
 * @author areym01
 */
public class Principal {

    public static String pedirNombre() {
        Scanner entrada = new Scanner(System.in);
        return entrada.nextLine();
    }

    public static void main(String[] args) {

        System.out.println("Ingrese el nombre del primer personaje: ");
        Characters pj1 = new Characters(pedirNombre());
        pj1.mostrarPJ();
        System.out.println("Ingrese el nombre del segundo personaje: ");
        Characters pj2 = new Characters(pedirNombre());
        pj2.mostrarPJ();

        while ((pj1.beAlive() == true) && (pj2.beAlive())) {

            pj1.ataca(pj2);
            if (pj2.beAlive() == true) {
                pj2.ataca(pj1);
            }

        }

    }

}
