package com.distribuida.dao;

import com.distribuida.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

//interfaz dao para la entidad Autor
public interface AutorDao extends JpaRepository<Autor, Integer> {
}

