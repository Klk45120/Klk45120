import java.util.Scanner;

public class AsignacionEjercicios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Eres mayor de edad? (Sí/No): ");
        String respuestaEdad = scanner.nextLine();

        if (respuestaEdad.equalsIgnoreCase("si")) {
            System.out.print("Ingrese su edad: ");
            int edad = scanner.nextInt();

            if (edad >= 18) {
                System.out.print("Ingrese su peso en gramos: ");
                double pesoGramos = scanner.nextDouble();

                System.out.print("Ingrese su altura en centímetros: ");
                double alturaCentimetros = scanner.nextDouble();

                // Convertir peso a kilogramos y altura a metros
                double pesoKg = pesoGramos / 1000;
                double alturaMetros = alturaCentimetros / 100;

                // Asignar categoría en función del peso y la altura
                String categoria;
                if (pesoKg >= 100 && alturaMetros >= 2.0) {
                    categoria = "Fuerza Avanzada";
                } else if (pesoKg >= 90 && alturaMetros >= 1.9) {
                    categoria = "Fuerza Intermedia";
                } else if (pesoKg >= 80 && alturaMetros >= 1.8) {
                    categoria = "Fuerza Básica";
                } else if (pesoKg <= 70 && alturaMetros <= 1.7) {
                    categoria = "Resistencia Básica";
                } else if (pesoKg <= 60 && alturaMetros <= 1.6) {
                    categoria = "Resistencia Intermedia";
                } else {
                    categoria = "Resistencia Avanzada";
                }

                System.out.println("¡Hola! Basado en tu peso, altura y edad, te hemos asignado a la categoría " + categoria);

                // Asignar nombres a los ejercicios según la categoría
                String[] ejercicios = new String[5];
                if (categoria.startsWith("Fuerza")) {
                    ejercicios[0] = "Sentadillas";
                    ejercicios[1] = "Press de banca";
                    ejercicios[2] = "Peso muerto";
                    ejercicios[3] = "Dominadas";
                    ejercicios[4] = "Press militar";
                } else if (categoria.startsWith("Resistencia")) {
                    ejercicios[0] = "Correr en cinta";
                    ejercicios[1] = "Saltos al cajón";
                    ejercicios[2] = "Remo en máquina";
                    ejercicios[3] = "Caminadora elíptica";
                    ejercicios[4] = "Escaladora";
                }

                System.out.println("Te recomendamos los siguientes ejercicios:");

                for (String ejercicio : ejercicios) {
                    System.out.println("- " + ejercicio);
                }
            } else {
                System.out.println("Lo siento, debes ser mayor de edad para acceder a los ejercicios.");
            }
        } else {
            System.out.println("Lo siento, debes ser mayor de edad para acceder a los ejercicios.");
        }
    }
}
