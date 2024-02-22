package ejercicios;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        //Input: n(float)
        Scanner console = new Scanner( System.in );
        System.out.println("Ingrese un número:");
        float n = console.nextFloat();
        float nSquare = (float) Math.pow(n, 2);
        float nCube = (float) Math.pow(n, 3);

        //Output:
        StringBuilder sb = new StringBuilder();
        sb.append("Su número es: ").append(n).append(".\n");
        sb.append("Su número al cuadrado es: ").append(nSquare).append(".\n");
        sb.append("Su número al cubo es: ").append(nCube).append(".");
        System.out.println(sb);
    }
}
