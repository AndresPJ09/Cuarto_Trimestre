/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplomatriz;

import java.util.Scanner;

/**
 *
 * @author Ambiente 209-3
 */
public class EJEMPLOMATRIZ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         // Definir la matriz
        int[][] matriz = new int[3][3];
        Scanner sc = new Scanner(System.in);

        // Se recorre la matriz para ingresar valores
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese el valor para la posición " + (i + 1) + "," + (j + 1));
                matriz[i][j] = sc.nextInt();
            }
        }

        // Se recorre la matriz para mostrar los valores ingresados
        System.out.println("Valores ingresados:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("El valor de la posición " + (i + 1) + "," + (j + 1) + ": " + matriz[i][j]);
            }
        }

        // Se recorre la matriz para mostrarla organizada
        System.out.println("Matriz organizada:");
        for (int i = 0; i < 3; i++) {
            System.out.print("|");
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "|");
            }
            System.out.println();
        }
    }
}
    
