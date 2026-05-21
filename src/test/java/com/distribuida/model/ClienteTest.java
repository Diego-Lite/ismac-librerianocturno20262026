package com.distribuida.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {

    private Cliente cliente;

    @BeforeEach
    public void setClient(){
        cliente = new Cliente(
                1
                ,"14854556"
                ,"Bob"
                ,"Espoja"
                ,"En mar"
                ,"0964564694"
                ,"esponj@correo.com"
        );

    }
    @Test
    public void testClienteConstructorAndGetters(){
        assertAll("Pruebas unitarias - Constructor y Getters - Cliente",
                () -> assertEquals(1, cliente.getIdCliente()),
                () -> assertEquals("14854556", cliente.getCedula()),
                () -> assertEquals("Bob", cliente.getNombre()),
                () -> assertEquals("Espoja", cliente.getApellido()),
                () -> assertEquals("En mar", cliente.getDireccion()),
                () -> assertEquals("0964564694", cliente.getTelefono()),
                () -> assertEquals("esponj@correo.com", cliente.getCorreo())
        );
        System.out.println(cliente.toString());
    }

    @Test
    public void testClienteSetters(){
        cliente.setIdCliente(2);
        cliente.setCedula("14854556");
        cliente.setNombre("Bob");
        cliente.setApellido("Esponja");
        cliente.setDireccion("En mar");
        cliente.setTelefono("05646815");
        cliente.setCorreo("esponj@correo.com");

        assertAll("Pruebas unitarias - Setteres - Cliente",
        () -> assertEquals(2,cliente.getIdCliente()),
                () -> assertEquals("14854556",cliente.getCedula()),
                () -> assertEquals("Bob",cliente.getNombre()),
                () -> assertEquals("Esponja",cliente.getApellido()),
                () -> assertEquals("En mar",cliente.getDireccion()),
                () -> assertEquals("05646815",cliente.getTelefono()),
                () -> assertEquals("esponj@correo.com", cliente.getCorreo())

        );
        System.out.println();
    System.out.println(cliente.toString());

    }
    @Test
    public void testClienteToString(){
        String str = cliente.toString();
    assertAll("Valida datos de cliente con toString",
            () -> assertTrue(str.contains("1")),
            () -> assertTrue(str.contains("1701234567")),
            () -> assertTrue(str.contains("Juan")),
            () -> assertTrue(str.contains("Taipe")),
            () -> assertTrue(str.contains("Av. por ahi")),
            () -> assertTrue(str.contains("0987654321")),
            () -> assertTrue(str.contains("jtaipe@cprrep.com"))

            );


    }

}



