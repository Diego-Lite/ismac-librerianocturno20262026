package com.distribuida.model;

import jakarta.persistence.*;

    @Entity
    @Table(name = "autor")
    public class Autor {

        //atributos
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id_autor")
        private int idAutor;

        @Column(name = "nombre")
        private String nombre;

        @Column(name = "apellido")
        private String apellido;

        @Column(name = "nacionalidad")
        private String nacionalidad;

        //constructor vacio
        public Autor() {
        }

        //constructor con parametros
        public Autor(int idAutor, String nombre, String apellido, String nacionalidad) {
            this.idAutor = idAutor;
            this.nombre = nombre;
            this.apellido = apellido;
            this.nacionalidad = nacionalidad;
        }

        //metodos getters and setters
        public int getIdAutor() {
            return idAutor;
        }

        public void setIdAutor(int idAutor) {
            this.idAutor = idAutor;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getApellido() {
            return apellido;
        }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }

        public String getNacionalidad() {
            return nacionalidad;
        }

        public void setNacionalidad(String nacionalidad) {
            this.nacionalidad = nacionalidad;
        }

        //metodo toString
        @Override
        public String toString() {
            return "Autor{" +
                    "idAutor=" + idAutor +
                    ", nombre='" + nombre + '\'' +
                    ", apellido='" + apellido + '\'' +
                    ", nacionalidad='" + nacionalidad + '\'' +
                    '}';
        }
    }

