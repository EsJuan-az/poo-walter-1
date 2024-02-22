package ejercicios;
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        // Input consola: Edad de Juan(int).
        Scanner console = new Scanner(System.in);
        System.out.println("¿Qué edad tiene juan?");
        int edadJuan = console.nextInt();
        // Declaración de variables dependientes.
        int edadAlberto = edadJuan * 2 / 3 ;
        int edadAna =  edadAlberto * 2;
        int edadMadre = edadJuan + edadAlberto + edadAna;

        // Output de texto mediante clase StringBuilder.
        StringBuilder sb = new StringBuilder();
        sb.append("Juan tiene ").append(edadJuan).append(" años.\n");
        sb.append("Alberto tiene ").append(edadAlberto).append(" años.\n");
        sb.append("Ana tiene ").append(edadAna).append(" años.\n");
        sb.append("La madre de los niños tiene ").append(edadMadre).append(" años.");
        System.out.println(sb);
    }
}
