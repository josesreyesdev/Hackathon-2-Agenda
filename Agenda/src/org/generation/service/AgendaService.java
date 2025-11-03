package org.generation.service;

import org.generation.exception.ContactoNotFoundException;
import org.generation.model.Contacto;
import org.generation.repository.ContactoRepository;

import java.util.ArrayList;
import java.util.List;

public class AgendaService implements ContactoRepository {

    private final List<Contacto> contactos;
    private final int capacidadMaxima;

    public AgendaService(){
        this(10);
    }
    public AgendaService(int capacidad) {
        this.capacidadMaxima = capacidad;
        this.contactos = new ArrayList<>();
    }

    @Override
    public void anadirContacto(Contacto c) {
        if (!agendaLlena()) {
            try {
                buscaContacto(c.getNombre());
                System.out.println("El contacto ya existe.");
            } catch (ContactoNotFoundException e) {
                contactos.add(c);
                System.out.println("Contacto añadido: " + c.getNombre());
            }

        }
    }

    @Override
    public void eliminarContacto(Contacto c) {
        contactos.remove(c);
    }

    @Override
    public boolean existeContacto(Contacto c) {
        return contactos.contains(c);
    }

    @Override
    public Contacto buscaContacto(String nombre) throws ContactoNotFoundException {

        for (Contacto contacto: contactos) {
            if(contacto.getNombre().equalsIgnoreCase(nombre)){
                return contacto;
            }
        }
        throw new ContactoNotFoundException("No se encuentra el contacto: " + nombre);
    }

    @Override
    public List<Contacto> listarContactos() {
        return contactos;
    }

    @Override
    public Boolean agendaLlena() {
        if(contactos.size() == capacidadMaxima) {
            System.out.println("Agenda Llena");
            return true;
        } else{
            return false;
        }
    }

    @Override
    public int espaciosLibres() {
        if(agendaLlena()){
            return 0;
        }else {
            return (capacidadMaxima - contactos.size());
        }
    }
}
