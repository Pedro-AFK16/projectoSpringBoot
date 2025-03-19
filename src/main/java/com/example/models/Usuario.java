package com.example.models;

public class Usuario {
    private String nombre;
    private String apellido;
    private String mail;
    private int telefono;
    private String password;

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

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Usuario(String apellido, String nombre, String mail, int telefono, String password) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.mail = mail;
        this.telefono = telefono;
        this.password = password;
    }
}
