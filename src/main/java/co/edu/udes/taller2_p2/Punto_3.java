package co.edu.udes.taller2_p2;

import java.util.Scanner;

public class Punto_3 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int cans, aux, cotator = 1;
        System.out.println("inserte el numero de latas");
         cans = reader.nextInt();
         aux = cans;
        do
        {

            if (aux > 0)
            {
                aux -= cotator;
                cotator++;
            }

            if (aux == 0)
            {
                System.out.println(" no le hace faltan latas para armar una piramide por que quedo justa");
                break;
            } else if (aux < 0)
            {
                System.out.println("le faltan " + (aux * -1)+" para poder hacer el sigiente piso ");
                break;
            }

        } while (aux > 0);
    }
}
