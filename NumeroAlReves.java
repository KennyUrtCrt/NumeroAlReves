//18. Programa que permite leer un número entero positivo y lo escribe al revés. El programa se debe repetir X veces.
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        int x, invertido = 0, resto;
        char car;
        Scanner s = new Scanner(System.in);
        do{
        System.out.print("Introduce un número entero: ");
        x = s.nextInt();
        while(x>0){
          resto = x % 10;
          invertido = invertido * 10 + resto;
          x/=10;
        }
        System.out.println("El número al reves es: " + invertido);
        System.out.print("Presiona ENTER para Continuar: ");          
        car = (char)System.in.read();
        }while(car!='X' && car != 'x');   
    }
}