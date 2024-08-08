import java.util.Scanner;
// Ejercicio 2
public class Calificacion {

        public static void main(String[] args) {
            // Se crea el objeto Scanner para leer la entrada de la calificacion:
            Scanner scanner = new Scanner(System.in);

            // Leer la calificación numérica
            System.out.print("Por favor ingrese su calificación de 1 a 10: ");
            int calificacion = scanner.nextInt();

            // Se determina la categoría usando switch
            switch (calificacion) {
                case 1:
                case 2:
                    System.out.println("Su calificación es: F");
                    break;
                case 3:
                case 4:
                    System.out.println("Su calificación es: D");
                    break;
                case 5:
                case 6:
                    System.out.println("Su calificación es: C");
                    break;
                case 7:
                case 8:
                    System.out.println("Su calificación es: B");
                    break;
                case 9:
                case 10:
                    System.out.println("Su calificación es: A");
                    break;
                default:
                    System.out.println("Calificación no válida, por favor verifique");
                    break;
            }

            scanner.close();
        }
    }

