/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Entity.Estado;

/**
 *
 * @author JACKE JARAMILLO
 */
public class EstadoC {
public void GuardarRegistro(String codigo_postal, String descripcion, Long pais_id){
        Estado estado = new Estado();
        estado.setCodigo_postal(codigo_postal);
        estado.setDescripcion(descripcion);
        estado.setPais_id(pais_id);
        estado.Agregar();
    }

    public void ModificarRegistro(Long id, String codigo_postal, String descripcion, Long pais_id) {
        Estado estado = new Estado();
        estado.setId(id);
        estado.setCodigo_postal(codigo_postal);
        estado.setDescripcion(descripcion);
        estado.setPais_id(pais_id);
        estado.Modificar();
    }
   
    public void EliminarRegistro(Long id) {
        Estado estado = new Estado();
        estado.setId(id);
        estado.EliminarLogico();}
} 