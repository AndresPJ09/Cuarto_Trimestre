/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;
import Class.CapturaNumero;
import Class.Ej1;
import Class.Ej10;
import Class.Ej2;
import Class.Ej3;
import Class.Ej4;
import Class.Ej5;
import Class.Ej6;
import Class.Ej7;
import Class.Ej8;
import Class.Ej9;
import java.util.Scanner;
/**
 *
 * @author Jackeline
 */
public class Ejecutar {
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);
        CapturaNumero capturaNumero = new CapturaNumero();
        int opcion;
        do {
            System.out.println("---------------------------Elija una Opción---------------------------");
            System.out.println("1. Ver si el número es mayor que 5.");
            System.out.println("2. Ver si el cuadrado del número es mayor que 5000.");
            System.out.println("3. Ver el valor absoluto del número.");
            System.out.println("4. Ver si el número es positivo o negativo.");
            System.out.println("5. Ver si el número es mayor a 200 o no");
            System.out.println("6. Ver si el número está en el rango de 50 y 100");
            System.out.println("7. Ver si el número es par o impar");
            System.out.println("8. Ver si el números par o impar y si es positivo o no");
            System.out.println("9. Ver si el número está dentro del rango 200-300 y si es par o impar");
            System.out.println("10. Ver cuál de los dos números es mayor y cual es menor");
            System.out.println("11. Salir.");
            System.out.println("----------------------------------------------------------------------");   
            opcion = scanner.nextInt();       
            switch (opcion) {
                case 1:
                    Ej1 ej1 = new Ej1();
                    capturaNumero.capturarNumero();             
                    ej1.setNumero(capturaNumero.getNumero1());
                    ej1.processNumber();
                    break;
                case 2:
                    Ej2 ej2 = new Ej2();
                    capturaNumero.capturarNumero();
                    ej2.setNumero(capturaNumero.getNumero1());
                    ej2.processNumber();
                    break;
                case 3:
                    Ej3 ej3 = new Ej3();
                    capturaNumero.capturarNumero();                    
                    ej3.setNumero(capturaNumero.getNumero1());
                    ej3.processNumber();
                    break;
                case 4:
                    Ej4 ej4 = new Ej4();
                    capturaNumero.capturarNumero();                   
                    ej4.setNumero(capturaNumero.getNumero1());
                    ej4.processNumber();
                    break;
                case 5:
                    Ej5 ej5 = new Ej5();
                    capturaNumero.capturarNumero();
                   
                    ej5.setNumero(capturaNumero.getNumero1());
                    ej5.processNumber();
                    break;
                case 6:
                    Ej6 ej6 = new Ej6();
                    capturaNumero.capturarNumero();
                    ej6.setNumero(capturaNumero.getNumero1());
                    ej6.processNumber();
                    break;
                case 7:
                    Ej7 ej7 = new Ej7();
                    capturaNumero.capturarNumero();
                    ej7.setNumero(capturaNumero.getNumero1());
                    ej7.processNumber();
                    break;
                case 8:
                    Ej8 ej8 = new Ej8();
                    capturaNumero.capturarNumero();
                    ej8.setNumero(capturaNumero.getNumero1());
                    ej8.processNumber();
                    break;
                case 9:
                    Ej9 ej9 = new Ej9();
                    capturaNumero.capturarNumero();
                    ej9.setNumero(capturaNumero.getNumero1());
                    ej9.processNumber();
                case 10:
                    Ej10 ej10 = new Ej10();
                    capturaNumero.capturarNumeros();
                    ej10.setNumero(capturaNumero.getNumero1());
                    ej10.setNumero2(capturaNumero.getNumero2());
                    ej10.processNumber();     
                    break;
                case 11:
                    System.out.println("Saliendo...");
                    scanner.close();
                    break;
                default:
                    System.out.println("Opción no válida.");
                    continue;
            }
            System.out.println("");
        } while (opcion != 11);
    }
}