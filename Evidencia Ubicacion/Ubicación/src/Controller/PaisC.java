/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Entity.Pais;

/**
 *
 * @author JACKE JARAMILLO
 */
public class PaisC {
    public void GuardarRegistro(String codigo_postal, String descripcion, Long continente_id){
        Pais pais = new Pais();
        pais.setCodigo_postal(codigo_postal);
        pais.setDescripcion(descripcion);
        pais.setContinente_id(continente_id);
        pais.Agregar();
    }

    public void ModificarRegistro(Long id, String codigo_postal, String descripcion, Long continente_id) {
        Pais pais = new Pais();
        pais.setId(id);
        pais.setCodigo_postal(codigo_postal);
        pais.setDescripcion(descripcion);
        pais.setContinente_id(continente_id);
        pais.Modificar();
    }
   
    public void EliminarRegistro(Long id) {
        Pais pais = new Pais();
        pais.setId(id);
        pais.EliminarLogico();
    }
   
}