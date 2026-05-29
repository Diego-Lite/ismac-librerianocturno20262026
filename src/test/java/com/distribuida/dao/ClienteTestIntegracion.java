package com.distribuida.dao;

import com.distribuida.model.Cliente;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.mockito.internal.matchers.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.data.jpa.test.autoconfigure.DataJpaTest;
import org.springframework.boot.jdbc.test.autoconfigure.AutoConfigureTestDatabase;
import org.springframework.test.annotation.Rollback;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;


@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Transactional
@Rollback(value = false)

public class ClienteTestIntegracion {


    @Autowired
    private ClienteDao clienteDao;

    @Test
    public void findAll(){
        List<Cliente> clientes = clienteDao.findAll();
        assertNotNull(clientes);
        assertTrue(clientes.size() > 0 );
        for (Cliente item : clientes){
            System.out.println(item.toString());
        }
    }

    @Test
    public void findOne(){
        Optional<Cliente> cliente = clienteDao.findById(1);
        assertTrue(cliente.isPresent(),"El cliente con id = 1, deberia existir");
        System.out.println(cliente.toString());
    }

    @Test
    public void save( ){
        Cliente cliente = new Cliente(
                0,"1701234566","Juan","Taipe","Av.por ahi"
                ,"09876543216","jtaipe@correo.com"
        );



    }



}
