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
public class Ej9 extends NumeroAbstract implements NumberProcess {
     @Override
    public void processNumber() {
        if (numero >= 200 && numero <= 300) {
            System.out.println("El número " + numero + " está dentro del rango de 200-300.");

            if (numero % 2 == 0) {
                System.out.println("El número " + numero + " es par.");
            } else {
                System.out.println("El número " + numero + " es impar.");
            }
        } else {
            System.out.println("El número " + numero + " no está dentro del rango de 200-300.");
        }
    }
}
