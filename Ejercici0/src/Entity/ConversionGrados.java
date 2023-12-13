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
 * @author Jackeline
 */
public class ConversionGrados extends SuperEntity{
    private Double grados;
    private Double resultado;
    
    //Objeto de la clase FunctionNumeric
    FunctionNumeric fn = new FunctionNumeric();
    
    //Objeto de la clase FunctionString
    FunctionString fs = new FunctionString();
    
    public Double getGrados() {
        return grados;
    }

    public void setGrados(Double grados) {
        this.grados = grados;
    }

    public Double getResultado() {
        return resultado;
    }

    public void setResultado(Double resultado) {
        this.resultado = resultado;
    }
    
    public void CelsiusFahrenheit(){
        this.setGrados(fn.InputDoubleNumericScanner("Digite los grados Celsius "));
        this.setResultado((this.getGrados()* 9/5) + 32);
        fs.ShowScanner("La conversión de "+this.getGrados()+"Celsius a fahrenheit es: "+this.getResultado()+"\n");
    }
    public void CelsiusKelvin(){
        this.setGrados(fn.InputDoubleNumericScanner("Digite los grados Celsius "));
        this.setResultado((this.getGrados()+ 273.15));
        fs.ShowScanner("La conversión de "+this.getGrados()+"Celsius a Kelvin es: "+this.getResultado()+"\n");
    }
    public void FahrenheitCelsius(){
        this.setGrados(fn.InputDoubleNumericScanner("Digite los grados Fahrenheit "));
        this.setResultado((this.getGrados()- 32) * 5/9);
        fs.ShowScanner("La conversión de "+this.getGrados()+"Fahrenheit a Celsius es: "+this.getResultado()+"\n");
    }
    public void FahrenheitKelvin(){
        this.setGrados(fn.InputDoubleNumericScanner("Digite los grados Fahrenheit "));
        this.setResultado((this.getGrados()- 32) * 5/9 + 273.15);
        fs.ShowScanner("La conversión de "+this.getGrados()+"Fahrenheit a Kelvin es "+this.getResultado()+"\n");
    }
    public void KelvinFahrenheit(){
        this.setGrados(fn.InputDoubleNumericScanner("Digite los grados Kelvin "));
        this.setResultado((this.getGrados()- 273.15) * 9/5 + 32);
        fs.ShowScanner("La conversión de "+this.getGrados()+"Kelvin a Fahrenheit es: "+this.getResultado()+"\n");
    }
    public void KelvinCelsius(){
        this.setGrados(fn.InputDoubleNumericScanner("Digite los grados Kelvin "));
        this.setResultado((this.getGrados()- 273.15));
        fs.ShowScanner("La conversión de "+this.getGrados()+"Kelvin a Celsius es: "+this.getResultado()+"\n");
    }
    
            
}
            