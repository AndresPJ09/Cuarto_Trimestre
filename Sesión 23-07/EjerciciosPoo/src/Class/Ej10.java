/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import Abstract.NumeroAbstract;
import Interface.NumberProcess;

/**
 *
 * @author Jackeline
 */
//1.3.11. Leer dos números e imprimir cuál de los dos números es mayor y cual es menor.
public class Ej10 extends NumeroAbstract implements NumberProcess {
    protected double numero2;

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    @Override
    public void processNumber() {
        double mayor = Math.max(numero, numero2);
        double menor = Math.min(numero, numero2);

        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);
    }
}




