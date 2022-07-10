package com.gaussito.springweb.models;

public class Usuario {
    private String nombre;
    private String apellido;
    private String email;

    // Constructor
    public Usuario() {
        this.nombre = "Nombre";
        this.apellido = "Apellido";
    }
    public Usuario(String name, String apellido) {
        this(name, apellido, null);
    }
    public Usuario(String name, String apellido, String email) {
        this.nombre = name;
        this.apellido = apellido;
        this.email = email;
    }

    // Getters and Setters
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
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

}
