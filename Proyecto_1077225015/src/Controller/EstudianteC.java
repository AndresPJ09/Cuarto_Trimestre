/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Entity.Estudiante;

/**
 *
 * @author SENA
 */
public class EstudianteC {
    
    public void GuardarRegistro(int estudiante_id, String nombre, String numero_telefono, String genero, String direccion, String correo_electronico){
        Estudiante estudiante = new Estudiante();
        estudiante.setEstudiante_id(estudiante_id);
        estudiante.setNombre(nombre);
        estudiante.setNumero_telefono(numero_telefono);
        estudiante.setGenero(genero);
        estudiante.setDireccion(direccion);
        estudiante.setCorreo_electronico(correo_electronico);
        estudiante.Agregar();
    }

    public void ModificarRegistro(int estudiante_id, String nombre, String numero_telefono, String genero, String direccion, String correo_electronico){
        Estudiante estudiante = new Estudiante();
        estudiante.setEstudiante_id(estudiante_id);
        estudiante.setNombre(nombre);
        estudiante.setNumero_telefono(numero_telefono);
        estudiante.setGenero(genero);
        estudiante.setDireccion(direccion);
        estudiante.setCorreo_electronico(correo_electronico);
        estudiante.Modificar();
    }
   
    public void EliminarRegistro(int estudiante_id) {
        Estudiante estudiante = new Estudiante();
        estudiante.setEstudiante_id(estudiante_id);
        estudiante.EliminarLogico();}
}
