
package calculadora3b;

import java.util.Scanner;


public class Calculadora3b {

    
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el primer número:");
        int a = sc.nextInt();

        System.out.println("Ingrese el segundo número:");
        int b = sc.nextInt();

        Rsuma suma = new Rsuma();
        //Resta resta = new Resta();
        
        System.out.println("Suma: " + suma.calcular(a, b));
        //System.out.println("Resta: " + resta.calcular(a, b));
    }
    
}
