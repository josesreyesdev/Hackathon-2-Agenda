package org.generation.model;

public class Contacto {
    private String Nombre;
    private String nuevoTelefono;

    public Contacto(String Nombre, String nuevoTelefono){
        this.Nombre = Nombre;
        this.nuevoTelefono = nuevoTelefono;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getNuevoTelefono() {
        return nuevoTelefono;
    }

    public void setNuevoTelefono(String nuevoTelefono) {
        this.nuevoTelefono = nuevoTelefono;
    }

    @Override
    public java.lang.String toString() {
        return "Contacto{" +
                "Nombre='" + Nombre + '\'' +
                ", nuevoTelefono='" + nuevoTelefono + '\'' +
                '}';
    }
}
