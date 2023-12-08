/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Entity;

import Conexion1.Conexion;
import Model.Interface.Accion;

/**
 *
 * @author JACKE JARAMILLO
 */
public class Continente implements Accion {
    
    private Long id;
    private String codigo_postal;
    private String descripcion;
    public Conexion conn = new Conexion();
    
    public Continente() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo_postal() {
        return codigo_postal;
    }

    public void setCodigo_Postal(String codigo_postal) {
        this.codigo_postal = codigo_postal;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
     
    @Override
    public void Agregar() {
        String sql; 
        
        sql = "INSERT INTO continente (codigo_postal, descripcion) VALUES (";
        sql += "' " + this.getCodigo_postal() + "', ";
        sql += "' " + this.getDescripcion() + "');";
        
        conn.ejecutarSQL(sql);
        conn.cerrarConexion();}
    

    @Override
    public void Modificar() {
        String sql;
    
        sql = "UPDATE continente SET ";
        sql += "codigo_postal = '" + this.getCodigo_postal() + "', ";
        sql += "descripcion = '" + this.getDescripcion() + "' ";
        sql += "WHERE id = " + this.getId() + ";";

        conn.ejecutarSQL(sql);
        conn.cerrarConexion();
}

    
    @Override
    public void EliminarFisico() {
        String sql; 
        
        sql = " DELETE FROM continente WHERE id = "+this.getId()+";";
        conn.ejecutarSQL(sql);
        conn.cerrarConexion();
    }

    
    @Override
    public void EliminarLogico() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
   @Override
    public String ConsultarWhereAnd() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}


