/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warcraftdungeon;

import java.util.Scanner;

/**
 *
 * @author Alberto Rey Moreno
 * Endless Pre-Alpha v1.00
 */
public class Principal {

    public static String askName() {
        Scanner entrada = new Scanner(System.in);
        return entrada.nextLine();
    }

    public static void main(String[] args) {

        System.out.println("Ingrese el nombre del primer personaje: ");
        Characters ch1 = new Characters(askName());
        ch1.showCH();
        System.out.println("Ingrese el nombre del segundo personaje: ");
        Characters ch2 = new Characters(askName());
        ch2.showCH();

        while ((ch1.beAlive() == true) && (ch2.beAlive())) {

            ch1.ataca(ch2);
            if (ch2.beAlive() == true) {
                ch2.ataca(ch1);
            }

        }

    }

}
