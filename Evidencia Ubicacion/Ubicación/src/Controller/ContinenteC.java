/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Entity.Continente;

/**
 *
 * @author JACKE JARAMILLO
 */
public class ContinenteC {
    
    public void GuardarRegistro(String codigo_postal, String descripcion){
        Continente continente = new Continente();
        continente.setCodigo_Postal(codigo_postal);
        continente.setDescripcion(descripcion);
        continente.Agregar();
    }

    public void ModificarRegistro(Long id, String codigo_postal, String descripcion) {
        Continente continente = new Continente();
        continente.setId(id);
        continente.setCodigo_Postal(codigo_postal);
        continente.setDescripcion(descripcion);
        continente.Modificar();
    }
   
    public void EliminarRegistro(Long id) {
        Continente continente = new Continente();
        continente.setId(id);
        continente.EliminarFisico();
    }
   
}