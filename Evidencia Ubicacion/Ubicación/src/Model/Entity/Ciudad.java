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
public class Ciudad implements Accion {
    private Long id;
    private String codigo_postal;
    private String descripcion;
    private Long estado_id;
    public Conexion conn = new Conexion();
    
    public Ciudad() {
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

    public void setCodigo_postal(String codigo_postal) {
        this.codigo_postal = codigo_postal;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Long getEstado_id() {
        return estado_id;
    
    }
    
    public void setEstado_id(Long estado_id) {
        this.estado_id = estado_id;
    }
    

    @Override
    public void Agregar() {
    String sql = "INSERT INTO ciudad (codigo_postal, descripcion, estado_id ) VALUES ("
            + (this.getCodigo_postal() != null ? "'" + this.getCodigo_postal() + "'" : "NULL") + ", "
            + (this.getDescripcion() != null ? "'" + this.getDescripcion() + "'" : "NULL") + ", "
            + (this.getEstado_id() != null ? "'" + this.getEstado_id() + "'" : "NULL") + ")";

    if (conn.ejecutarSQL(sql)) {
        System.out.println("Error al insertar el registro en la tabla pais.");
                } else {
            System.out.println("Registro insertado correctamente en la tabla pais.");
        }
    }

    @Override
    public void Modificar() {
        String sql;
    
        sql = "UPDATE ciudad SET ";
        sql += "codigo_postal = '" + this.getCodigo_postal() + "', ";
        sql += "descripcion = '" + this.getDescripcion() + "', ";
        sql += "estado_id = '" + this.getEstado_id() + "' ";
        sql += "WHERE id = " + this.getId();

        conn.ejecutarSQL(sql);
        conn.cerrarConexion();
    }


    @Override
    public void EliminarLogico() {
        String sql; 
        
        sql = " DELETE FROM ciudad WHERE id = "+this.getId()+";";
        
        conn.ejecutarSQL(sql);
        conn.cerrarConexion();
}

    @Override
    public void EliminarFisico() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String ConsultarWhereAnd() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}