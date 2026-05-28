package com.distribuida.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {

    private Cliente cliente;

    @BeforeEach
    public void setUp() {
        cliente = new Cliente(
                1,
                "14854556",
                "Bob",
                "Esponja",
                "En mar",
                "0964564694",
                "esponj@correo.com"
        );
    }

    @Test
    public void testClienteConstructorAndGetters() {
        assertAll(
                () -> assertEquals(1, cliente.getIdCliente()),
                () -> assertEquals("14854556", cliente.getCedula()),
                () -> assertEquals("Bob", cliente.getNombre()),
                () -> assertEquals("Esponja", cliente.getApellido()),
                () -> assertEquals("En mar", cliente.getDireccion()),
                () -> assertEquals("0964564694", cliente.getTelefono()),
                () -> assertEquals("esponj@correo.com", cliente.getCorreo())
        );
    }

    @Test
    public void testClienteSetters() {
        cliente.setIdCliente(2);
        cliente.setCedula("14854556");
        cliente.setNombre("Bob");
        cliente.setApellido("Esponja");
        cliente.setDireccion("En mar");
        cliente.setTelefono("05646815");
        cliente.setCorreo("esponj@correo.com");

        assertAll(
                () -> assertEquals(2, cliente.getIdCliente()),
                () -> assertEquals("14854556", cliente.getCedula()),
                () -> assertEquals("Bob", cliente.getNombre()),
                () -> assertEquals("Esponja", cliente.getApellido()),
                () -> assertEquals("En mar", cliente.getDireccion()),
                () -> assertEquals("05646815", cliente.getTelefono()),
                () -> assertEquals("esponj@correo.com", cliente.getCorreo())
        );
    }

    @Test
    public void testClienteToString() {
        String str = cliente.toString();

        assertAll(
                () -> assertTrue(str.contains("1")),
                () -> assertTrue(str.contains("14854556")),
                () -> assertTrue(str.contains("Bob")),
                () -> assertTrue(str.contains("Esponja")),
                () -> assertTrue(str.contains("En mar")),
                () -> assertTrue(str.contains("0964564694")),
                () -> assertTrue(str.contains("esponj@correo.com"))
        );
    }
}



