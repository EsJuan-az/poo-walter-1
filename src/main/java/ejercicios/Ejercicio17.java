package ejercicios;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        // Input: radio del círculo
        Scanner console = new Scanner( System.in );
        System.out.println("Ingrese el radio de su círculo: ");
        float radius = console.nextFloat();
        float area = (float) ( Math.PI * Math.pow( radius, 2 ) );

        //Output:
        StringBuilder sb = new StringBuilder();
        sb.append("El radio de su círculo es: ").append(radius).append("u.\n");
        sb.append("Así, su área es de: ").append(area).append("u².");
        System.out.println(sb);
    }
}
