package com.distribuida.model;

import jakarta.persistence.*;


    @Entity
    @Table(name = "categoria")
    public class Categoria {

        //atributos
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id_categoria")
        private int idCategoria;

        @Column(name = "descripcion")
        private String descripcion;

        @Column(name = "estado")
        private String estado;

        //constructor vacio
        public Categoria() {
        }

        //constructor con parametros
        public Categoria(int idCategoria, String descripcion, String estado) {
            this.idCategoria = idCategoria;
            this.descripcion = descripcion;
            this.estado = estado;
        }

        //metodos getters and setters
        public int getIdCategoria() {
            return idCategoria;
        }

        public void setIdCategoria(int idCategoria) {
            this.idCategoria = idCategoria;
        }

        public String getDescripcion() {
            return descripcion;
        }

        public void setDescripcion(String descripcion) {
            this.descripcion = descripcion;
        }

        public String getEstado() {
            return estado;
        }

        public void setEstado(String estado) {
            this.estado = estado;
        }

        //metodo toString
        @Override
        public String toString() {
            return "Categoria{" +
                    "idCategoria=" + idCategoria +
                    ", descripcion='" + descripcion + '\'' +
                    ", estado='" + estado + '\'' +
                    '}';
        }
    }

