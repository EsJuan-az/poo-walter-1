package ejercicios;

public class Ejercicio5 {
    public static void main(String[] args) {
        //Reescritura del programa del libro:
        double suma = 0;
        double x = 20;
        suma += x;
        double y = 40;
        x += Math.pow(y, 2);
        suma += x / y;
        System.out.println("El valor de suma es: " + suma);
    }
}
