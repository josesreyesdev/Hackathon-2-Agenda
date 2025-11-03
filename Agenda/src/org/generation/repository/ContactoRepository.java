package org.generation.repository;

import org.generation.exception.ContactoNotFoundException;
import org.generation.model.Contacto;
import java.util.List;

public interface ContactoRepository {

    void anadirContacto(Contacto c);
    void eliminarContacto(Contacto c);
    boolean existeContacto(Contacto c);
    Contacto buscaContacto(String nombre) throws ContactoNotFoundException;
    List<Contacto> listarContactos();
    Boolean agendaLlena();
    int espaciosLibres();

}
