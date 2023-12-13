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
//1.3.6.	Leer un real e imprimir si el número es mayor a 200 o no.
public class Ej6 extends NumeroAbstract implements NumberProcess {
     @Override
    public void processNumber() {
        if (numero >= 50 && numero <= 100) {
            System.out.println("El número " + numero + " está en el rango de 50 y 100.");
        } else {
            System.out.println("El número " + numero + " no está en el rango de 50 y 100.");
        }
    }
}
