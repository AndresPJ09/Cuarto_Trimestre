/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.util.Scanner;

/**
 *
 * @author Jackeline
 */
public class CapturaNumero {
    private double numero1;
    private double numero2;
    private double resultado;

    public double getNumero1() {
        return numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public double getResultado() {
        return resultado;
    }

    public void capturarNumero() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        numero1 = scanner.nextDouble();
    }

    public void capturarNumeros() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        numero1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        numero2 = scanner.nextDouble();
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
}