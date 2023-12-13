/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Entity.ConvercionMoneda.ConvercionMonedas;
import Utils.FunctionNumeric;
import Utils.FunctionString;

/**
 *
 * @author Ambiente 209-2
 */
public class Mostrar {
    public static void main(String[] args) {
        
    // FunctionString fs = new FunctionString();
    //FunctionNumeric fn = new FunctionNumeric();
    ConvercionMonedas cm = new ConvercionMonedas();
   
    
    
    cm.ConversionPesosColombianos();
    cm.ConversionDolares();
    
    
}
}