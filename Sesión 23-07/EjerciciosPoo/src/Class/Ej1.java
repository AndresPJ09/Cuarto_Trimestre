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
public class Ej1 extends NumeroAbstract implements NumberProcess {
    @Override
    public void processNumber() {
        if (numero > 5.0) {
            System.out.println("El número " + numero + " es mayor que 5.");
        } else {
            System.out.println("El número " + numero + " no es mayor que 5.");
        }
    }
}