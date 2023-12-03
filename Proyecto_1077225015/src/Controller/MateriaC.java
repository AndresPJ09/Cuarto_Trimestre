/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.Entity.Materia;

/**
 *
 * @author SENA
 */
public class MateriaC {
    public void GuardarRegistro(String nombre_materia, String profesor, double nota){
        Materia materia = new Materia();
        materia.setMateria_id(0);
        materia.setNombreMateria(nombre_materia);
        materia.setprofesor(profesor);
        materia.setnota(nota);
        materia.Agregar();
    }

    public void ModificarRegistro(int materia_id, String nombre_materia, String profesor, double nota){
        Materia materia = new Materia();
        materia.setMateria_id(0);
        materia.setNombreMateria(nombre_materia);
        materia.setprofesor(profesor);
        materia.setnota(nota);
        materia.Modificar();
    }
   
    public void EliminarRegistro(int materia_id) {
        Materia materia = new Materia();
        materia.setMateria_id(materia_id);
        materia.EliminarLogico();
        
    }
    
}
