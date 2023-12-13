package com.sena.continentes.IRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sena.continentes.Entity.Pais;

@Repository
public interface IPaisRepository extends JpaRepository<Pais, Long> {

}
