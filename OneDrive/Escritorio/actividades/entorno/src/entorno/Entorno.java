/*
Crea un conversor de dólares a euros. 1€=1,1$
*/
package entorno;

import java.util.Scanner;


public class Entorno {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca los dolares a convertir");
        float dolares = sc.nextFloat();
        sc.nextLine();
        float euros = (float) dolares * 1.1);
        


    }

}
