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
public class Ej3 extends NumeroAbstract implements NumberProcess {
    @Override
    public void processNumber() {
        double absoluteValue = Math.abs(numero);
        System.out.println("El valor absoluto de " + numero + " es " + absoluteValue + ".");
    }
}
