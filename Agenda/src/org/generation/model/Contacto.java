package org.generation.model;

public class Contacto {
    private String Nombre;
    private String Apellido;
    private String nuevoTelefono;

    public Contacto(String Nombre, String Apellido, String nuevoTelefono){
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.nuevoTelefono = nuevoTelefono;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getNuevoTelefono() {
        return nuevoTelefono;
    }

    public void setNuevoTelefono(String nuevoTelefono) {
        this.nuevoTelefono = nuevoTelefono;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Contacto{" +
                "Nombre='" + Nombre + '\'' +
                ", Apellido='" + Apellido + '\'' +
                ", nuevoTelefono='" + nuevoTelefono + '\'' +
                '}';
    }
}
