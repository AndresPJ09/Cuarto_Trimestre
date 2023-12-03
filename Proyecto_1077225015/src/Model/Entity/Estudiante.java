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
public class Estudiante implements Accion {
    
    private int estudiante_id;
    private String nombre;
    private String numero_telefono;
    private String genero;
    private String direccion;
    private String correo_electronico;
    public Conexion conn = new Conexion();
    
      public Estudiante() {
         
    }  

    public int getEstudiante_id() {
        return estudiante_id;
    }

    public void setEstudiante_id(int estudiante_id) {
        this.estudiante_id = estudiante_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroTelefono() {
        return numero_telefono;
    }

    public void setNumero_telefono(String numero_telefono) {
        this.numero_telefono = numero_telefono;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreoElectronico() {
        return correo_electronico;
    }

    public void setCorreo_electronico(String correo_electronico) {
        this.correo_electronico = correo_electronico;
    }

    @Override
    public void Agregar() {
        String sql = "INSERT INTO Estudiante (estudiante_id, nombre, numero_telefono, genero, direccion, correo_electronico) " +
        "VALUES ('" + this.getNombre() + "', '" + this.getNumeroTelefono() + "', '" + this.getGenero() + "', '" +
        this.getDireccion() + "', '" + this.getCorreoElectronico() + "')";
    
    conn.ejecutarSQL(sql);
    conn.cerrarConexion();
}

         
    @Override
    public void Modificar() {
        String sql;
    
        sql = "UPDATE Estudiante SET ";
        sql += "nombre = '" + this.getNombre() + "', ";
        sql += "numero_telefono = '" + this.getNumeroTelefono() + "' ";
        sql += "genero = '" + this.getGenero() + "' ";
        sql += "direccion = '" + this.getDireccion() + "' ";
        sql += "correo_electronico = '" + this.getCorreoElectronico() + "' ";
        sql += "WHERE id = " + this.getEstudiante_id();

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
