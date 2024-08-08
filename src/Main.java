//Ejercicio 1 Mayor y Menor
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       //Se declaran las variables ABC
        int A;
        int B;
        int C;
        //Se crea el objeto para ingresar los valores:

        System.out.println("Por favor ingrese el valor de A");
        Scanner scannerA=new Scanner(System.in);
        A=scannerA.nextInt();

        System.out.println("Por favor ingrese el valor de B");
        Scanner scannerB=new Scanner(System.in);
        B=scannerB.nextInt();

        System.out.println("Por favor ingrese el valor de C");
        Scanner scannerC=new Scanner(System.in);
        C=scannerC.nextInt();

        //Se valida que los valores no sean iguales:
        if(A==B && B==C){
            System.out.println("Los valores no pueden ser iguales");
        //Se valida cual es el mayor y cual el menor:
        } if(A>B && A>C){
            System.out.println("El mayor es A:"+A);
            if(B>C){
                System.out.println("El Mayor es B:"+B);
            }else{
                System.out.println("El mayor es C:"+C);
            }
        }else if(A<B && A<C){
            System.out.println("El menor es A:"+A);
            if(B<C){
                System.out.println("El menor es B:"+B);
            }else{
                System.out.println("El menor es C:"+C);
            }
        }
    }
}
