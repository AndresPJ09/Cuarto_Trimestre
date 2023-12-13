package com.sena.continentes.IService;

import java.util.List;
import java.util.Optional;

import com.sena.continentes.Entity.Pais;

public interface IPaisServices {
    
    /**
     * Método para consultar todo
     **/
    List<Pais> findAll();

    /**
     * Método para consultar por id
     **/
    Optional<Pais> findById(Long id);

    /**
     * Método para guardar
     **/
    Pais save(Pais pais);

    /**
     * Método para modificar
     **/
    void update(Pais pais, Long id);

    /**
     * Método para eliminar
     **/
    void delete(Long id);

    /**
     * Método para eliminar lógico
     **/
    void deletedAt(Long id);
}
