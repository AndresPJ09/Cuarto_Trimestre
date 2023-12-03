/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.Entity.Matricula;
import java.util.Date;

/**
 *
 * @author SENA
 */
public class MatriculaC {
    public void GuardarRegistro(int matricula_id, int estudiante_id, int materia_id, Date fecha_matricula){
        Matricula matricula = new Matricula();
        matricula.setMatricula_id(0);
        matricula.setEstudiante_id(0);
        matricula.setMateria_id(0);
        matricula.setFecha_matricula(fecha_matricula);
        matricula.Agregar();
    }

    public void ModificarRegistro(int materia_id, String nombre_materia, String profesor, double nota){
        Matricula matricula = new Matricula();
        matricula.setMatricula_id(0);
        matricula.setEstudiante_id(0);
        matricula.setMateria_id(0);
        Date fecha_matricula = null;
        matricula.setFecha_matricula(fecha_matricula);
        matricula.Agregar();
    }
   
    public void EliminarRegistro(int matricula_id) {
        Matricula matricula = new Matricula();
        matricula.setMatricula_id(matricula_id);
        matricula.EliminarLogico();}
}
