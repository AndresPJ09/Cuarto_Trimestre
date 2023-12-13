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
public class Ej2 extends NumeroAbstract implements NumberProcess {
    @Override
    public void processNumber() {
        double square = numero * numero;
        if (square > 5000.0) {
            System.out.println("El cuadrado de " + numero + " es mayor que 5000.");
        } else {
            System.out.println("El cuadrado de " + numero + " no es mayor que 5000.");
        }
    }
}