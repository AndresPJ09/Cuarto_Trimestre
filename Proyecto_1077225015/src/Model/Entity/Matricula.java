/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Entity;

import Conexion1.Conexion;
import Model.Interface.Accion;
import java.util.Date;

/**
 *
 * @author SENA
 */
public class Matricula implements Accion{
    private int matricula_id;
    private int estudiante_id;
    private int materia_id;
    private Date fecha_matricula;
    public Conexion conn = new Conexion();
    
    public Matricula() {
         
    }  

    public int getMatricula_id() {
        return matricula_id;
    }

    public void setMatricula_id(int matricula_id) {
        this.matricula_id = matricula_id;
    }

    public int getEstudiante_id() {
        return estudiante_id;
    }

    public void setEstudiante_id(int estudiante_id) {
        this.estudiante_id = estudiante_id;
    }

    public int getMateria_id() {
        return materia_id;
    }

    public void setMateria_id(int materia_id) {
        this.materia_id = materia_id;
    }

    public Date getFechaMatricula() {
        return fecha_matricula;
    }

    public void setFecha_matricula(Date fecha_matricula) {
        this.fecha_matricula = fecha_matricula;
    }

    @Override
    public void Agregar() {
       String sql = "INSERT INTO Matricula (estudiante_id, materia_id, fecha_matricula) " +
        "VALUES (" + this.getEstudiante_id() + ", " + this.getMateria_id() + ", '" + this.getFechaMatricula() + "')";
       
        conn.ejecutarSQL(sql);
        conn.cerrarConexion();
}
    @Override
    public void Modificar() {
        String sql;
    
        sql = "UPDATE Estudiante SET ";
        sql += "estudiante_id = '" + this.getEstudiante_id() + "' ";
        sql += "materia_id = '" + this.getMateria_id() + "' ";
        sql += "fecha_matricula = '" + this.getFechaMatricula() + "' ";
        sql += "WHERE id = " + this.getFechaMatricula();

        conn.ejecutarSQL(sql);
        conn.cerrarConexion();
    }

    @Override
    public void EliminarLogico() {
        String sql; 
        
          sql = "DELETE FROM Estudiante WHERE estudiante_id = " + this.getEstudiante_id();
        
        conn.ejecutarSQL(sql);
        conn.cerrarConexion();
    }

    @Override
    public String ConsultarWhereAnd() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
          
    
}
