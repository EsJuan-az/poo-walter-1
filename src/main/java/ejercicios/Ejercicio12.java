package ejercicios;

public class Ejercicio12 {
    public static void main(String[] args) {
        // Declaración de datos iniciales.
        int horasSemana = 48;
        float salarioHora = 5000F;
        float retencionFuente = 12.5F;

        // Declaración de variables independientes.
        float salarioBruto = horasSemana * salarioHora;
        float salario = salarioBruto * ( 100 - retencionFuente ) / 100;

        //Output mediante clase Stringbuilder.
        StringBuilder sb = new StringBuilder();
        sb.append("El salario bruto es $").append(salarioBruto).append(".\n");
        sb.append("Con una retención en la fuente de del ").append(retencionFuente).append("%,\n");
        sb.append("su salario neto es $").append(salario).append(".");
        System.out.println( sb
        );


    }
}
