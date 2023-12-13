/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

import Entity.Abstract.SuperEntity;
import Utils.FunctionNumeric;
import Utils.FunctionString;

/**
 *
 * @author Ambiente 209-2
 */
//Esta clase realiza conversiones entre diferentes monedas.
public class ConversionMonedas extends SuperEntity{
    // Atributos para almacenar los valores de diferentes monedas.
    public double PesosColombianos;
    public double dolares;
    public double bolivares;
    public double soles;
    public double pesetas;
    public double francos;

     // Instancias de funciones de utilidad.
    public FunctionNumeric fn = new FunctionNumeric();
    public FunctionString fs = new FunctionString();

    // Métodos.
    public double getPesosColombianos() {
        return PesosColombianos;
    }

    public void setPesosColombianos(double PesosColombianos) {
        this.PesosColombianos = PesosColombianos;
    }

    public double getDolares() {
        return dolares;
    }

    public void setDolares(double dolares) {
        this.dolares = dolares;
    }

    public double getBolivares() {
        return bolivares;
    }

    public void setBolivares(double bolivares) {
        this.bolivares = bolivares;
    }

    public double getSoles() {
        return soles;
    }

    public void setSoles(double soles) {
        this.soles = soles;
    }

    public double getPesetas() {
        return pesetas;
    }

    public void setPesetas(double pesetas) {
        this.pesetas = pesetas;
    }

    public double getFrancos() {
        return francos;
    }

    public void setFrancos(double francos) {
        this.francos = francos;
    }
    
    //Realiza la conversión desde Pesos Colombianos a otras monedas.
    public void ConversionPesosColombianos() {
        setPesosColombianos(fn.InputDoubleNumericScanner("Digite el valor en pesos colombianos "));
        this.setDolares(getPesosColombianos() * 0.00024);
        this.setBolivares(getPesosColombianos() * 0.0076);
        this.setSoles(getPesosColombianos() * 0.00088);
        this.setPesetas(getPesosColombianos() * 0.036784934);
        this.setFrancos(getPesosColombianos() * 0.00021);
        fs.ShowScanner("la conversion de " + getPesosColombianos() + " Pesos Colombianos a \n Dolares:" + getDolares() + ",\n Bolivares:" + getBolivares() + ",\n Francos:" + getFrancos() + ",\n Soles:" + getSoles() + ",\n Pesetas:" + getPesetas());
    }
    
    //Realiza la conversión desde Dólares a otras monedas.
    public void ConversionDolares(){
        System.out.println("\n\n");
        this.setDolares(fn.InputDoubleNumericScanner("Digite el valor en dolares "));
        this.setPesosColombianos(getDolares()* 4.14021);
        this.setBolivares(getDolares()* 300.656);
        this.setSoles(getDolares() * 0.87);
        this.setPesetas(getDolares() * 3.66);
        this.setFrancos(getDolares() * 151.155);
        fs.ShowScanner("la conversion de " + getDolares() + " Dolares a \n Pesos Colombiano: " + getPesosColombianos() + ",\n Bolivares: " + getBolivares() + ",\n Francos: " + getFrancos() + ",\n Soles: " + getSoles() + ",\n Pesetas: " + getPesetas());
    }
    
    //Realiza la conversión desde Bolívares a otras monedas.
    public void ConversionBolivares() {
        System.out.println("\n\n");
        this.setBolivares(fn.InputDoubleNumericScanner("Digite el valor en bolivares "));
        this.setPesosColombianos(getBolivares() * 0.00136318);
        this.setDolares(getBolivares() * 0.033257308);
        this.setSoles(getBolivares() * 0.000000294833);
        this.setPesetas(getBolivares() * 0.0000000512566);
        this.setFrancos(getBolivares() * 0.000000294833);
        fs.ShowScanner("la conversion de " + getBolivares() + " Bolivares a \n Pesos Colombiano: " + getPesosColombianos() + ",\n Francos: " + getFrancos() + ",\n Soles: " + getSoles() + ",\n Pesetas: " + getPesetas());
    }
    
    //Realiza la conversión desde Soles a otras monedas.
    public void ConversionSoles() {
        System.out.println("\n\n");
        this.setSoles(fn.InputDoubleNumericScanner("Digite el valor en soles "));
        this.setPesosColombianos(getSoles()*4.66);
        this.setDolares(getSoles()*0.27);
        this.setBolivares(getSoles()*8.21);
        this.setPesetas(getSoles()*41.1686);
        this.setFrancos(getSoles()*0.24);
      fs.ShowScanner("la conversion de "+getSoles() + " Soles a \n Pesos Colombiano: " + getPesosColombianos() + ",\n Bolivares: " + getBolivares() + ",\n Francos: " + getFrancos() + ",\n Pesetas: " + getPesetas());
    }
}
