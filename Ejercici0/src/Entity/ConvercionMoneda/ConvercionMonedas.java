/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity.ConvercionMoneda;

import Utils.FunctionNumeric;
import Utils.FunctionString;

/**
 *
 * @author Ambiente 209-2
 */
public class ConvercionMonedas {
    public double PesosColombianos;
    public double dolares;
    public double bolivares;
    public double soles;
    public double pesetas;
    public double francos;
    
    public FunctionNumeric fn = new FunctionNumeric();
    public FunctionString fs = new FunctionString();

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
    
    public void ConversionPesosColombianos(){
        setPesosColombianos(fn.InputDoubleNumericScanner("Digite el Valor en pesos colombianos"));
        this.setDolares(this.getPesosColombianos()*0.00024);
        this.setBolivares(this.getPesosColombianos()*0.0076);
        this.setSoles(this.getPesosColombianos()*0.00088);
        this.setPesetas(this.getPesosColombianos()*0.036784934);
        this.setFrancos(this.getPesosColombianos()*0.00021);
      fs.ShowScanner("la conversion de"+getPesosColombianos()+"pesos a \n Dolares:"+getDolares()+",\n Bolivares:"+getBolivares()+",\n francos:"+getFrancos()+",\nsoles:"+getSoles()+",\n pesetas:"+getPesetas());
    }
    public void ConversionDolares(){
        this.setPesosColombianos(fn.InputDoubleNumericScanner("Digite el valor en dolares"));
         this.setDolares(this.getPesosColombianos()*4.14021);
        this.setBolivares(this.getPesosColombianos()*0.0076);
        this.setSoles(this.getPesosColombianos()*0.00088);
        this.setPesetas(this.getPesosColombianos()*0.036784934);
        this.setFrancos(this.getPesosColombianos()*0.00021);
      fs.ShowScanner("la conversion de"+getPesosColombianos()+"pesos a \n Dolares:"+getDolares()+",\n Bolivares:"+getBolivares()+",\n francos:"+getFrancos()+",\nsoles:"+getSoles()+",\n pesetas:"+getPesetas());
    }
    
}
