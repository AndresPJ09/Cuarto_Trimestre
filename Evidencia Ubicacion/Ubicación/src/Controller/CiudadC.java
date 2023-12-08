/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Entity.Ciudad;
import Model.Entity.Estado;

/**
 *
 * @author JACKE JARAMILLO
 */
public class CiudadC {
    public void GuardarRegistro(String codigo_postal, String descripcion, Long estado_id){
        Ciudad ciudad = new Ciudad();
        ciudad.setCodigo_postal(codigo_postal);
        ciudad.setDescripcion(descripcion);
        ciudad.setEstado_id(estado_id);
        ciudad.Agregar();
    }

    public void ModificarRegistro(Long id, String codigo_postal, String descripcion, Long estado_id) {
        Ciudad ciudad = new Ciudad();
        ciudad.setId(id);
        ciudad.setCodigo_postal(codigo_postal);
        ciudad.setDescripcion(descripcion);
        ciudad.setEstado_id(estado_id);
        ciudad.Modificar();
    }
   
    public void EliminarRegistro(Long id) {
        Ciudad ciudad = new Ciudad();
        ciudad.setId(id);
        ciudad.EliminarLogico();}
}
