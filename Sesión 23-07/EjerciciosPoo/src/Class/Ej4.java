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
public class Ej4 extends NumeroAbstract implements NumberProcess {
    @Override
    public void processNumber() {
        if (numero > 0) {
            System.out.println("El número " + numero + " es positivo.");
        } else if (numero < 0) {
            System.out.println("El número " + numero + " es negativo.");
        } else {
            System.out.println("El número " + numero + " es cero.");
        }
    }
}
