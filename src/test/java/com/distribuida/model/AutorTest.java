package com.distribuida.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AutorTest {

    // Método que se ejecuta como prueba
    @Test
    public void testAutor() {

        // Se crea un objeto Autor con datos de prueba
        Autor autor = new Autor(
                1,
                "Gabriel",
                "Garcia Marquez",
                "Colombiano"
        );

        assertEquals(1, autor.getIdAutor());
        assertEquals("Gabriel", autor.getNombre());
        assertEquals("Garcia Marquez", autor.getApellido());
        assertEquals("Colombiano", autor.getNacionalidad());
    }
}

