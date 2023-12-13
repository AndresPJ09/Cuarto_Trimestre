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
public class Ej7 extends NumeroAbstract implements NumberProcess {

    @Override
    public void processNumber() {
        if (numero % 2 == 0) {
            System.out.println("El número " + numero + " es par.");
        } else {
            System.out.println("El número " + numero + " es impar.");
        }
    }
}
