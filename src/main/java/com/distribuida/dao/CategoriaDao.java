package com.distribuida.dao;

import com.distribuida.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

    //interfaz dao para la entidad Categoria
    public interface CategoriaDao extends JpaRepository<Categoria, Integer> {
    }

