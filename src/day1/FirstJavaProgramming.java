package day1;

public class FirstJavaProgramming {
    public static void main(String[] args) {

        int parcial1 = 30;
        int parcial2 = 35;
        int parcial3 = 15;

        // System.out.println("La nota de tu primer parcial fue " + parcial1);
        // System.out.println("La nota de tu segundo parcial fue " + parcial2);
        // System.out.println("La nota de tu tercer parcial fue " + parcial3);
        int notanal = parcial1 + parcial2 + parcial3;

        System.out.println("Tu nota final es " + notanal);

        // Condiciones
        if (notanal >= 90) {
            System.out.println("Pasaste con calificacion A");

        } else if (notanal >= 80) {
            System.out.println("Pasaste con calificacion B");

        } else {
            System.out.println("Te quemaste");
        }

    }

}
