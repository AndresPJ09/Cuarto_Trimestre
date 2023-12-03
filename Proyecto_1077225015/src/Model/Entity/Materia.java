/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Entity;

import Conexion1.Conexion;
import Model.Interface.Accion;

/**
 *
 * @author SENA
 */
public class Materia implements Accion {
    private int materia_id;
    private String nombre_materia;
    private String profesor;
    private double nota;
    public Conexion conn = new Conexion();
    
    public Materia() {
         
    }  

    public int getMateria_id() {
        return materia_id;
    }

    public void setMateria_id(int materia_id) {
        this.materia_id = materia_id;
    }

    public String getNombreMateria() {
        return nombre_materia;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombre_materia = nombreMateria;
    }

    public String getprofesor() {
        return profesor;
    }

    public void setprofesor(String profesor) {
        this.profesor = profesor;
    }

    public double getnota() {
        return nota;
    }

    public void setnota(double nota) {
        this.nota = nota;
    }

    
    @Override
    public void Agregar() {
        String sql = "INSERT INTO Materia (nombre_materia, profesor, nota, materia_id) " +
                 "VALUES ('" + this.getNombreMateria() + "', '" + this.getprofesor() + "', " + this.getnota() + ", " + this.getMateria_id() + ")";
    
        conn.ejecutarSQL(sql);
        conn.cerrarConexion();
}

    @Override
    public void Modificar() {
        String sql;
    
        sql = "UPDATE Materia SET ";
        sql += "nombre_materia = '" + this.getMateria_id() + "', ";
        sql += "profesor = '" + this.getprofesor() + "' ";
        sql += "nota = '" + this.getnota() + "' ";
        sql += "WHERE id = " + this.getMateria_id();

        conn.ejecutarSQL(sql);
        conn.cerrarConexion();
    }

    @Override
    public void EliminarLogico() {
        String sql; 
        
          sql = "DELETE FROM Materia WHERE materia_id = " + this.getMateria_id();
        
        conn.ejecutarSQL(sql);
        conn.cerrarConexion();
    }

    @Override
    public String ConsultarWhereAnd() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
