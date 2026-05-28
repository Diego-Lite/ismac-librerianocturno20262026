package com.distribuida.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CategoriaTest {

    // Este método es una prueba unitaria
    @Test
    public void testCategoria() {

        // Se crea un objeto Categoria con datos de prueba (simulación)
        Categoria categoria = new Categoria(
                1,
                "Novela",
                "ACTIVO"
        );

        assertEquals(1, categoria.getIdCategoria());
        assertEquals("Novela", categoria.getDescripcion());
        assertEquals("ACTIVO", categoria.getEstado());
    }
}

