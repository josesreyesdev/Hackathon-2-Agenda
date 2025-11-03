package org.generation.main;

import org.generation.model.Contacto;
import org.generation.service.AgendaService;

import java.util.List;
import java.util.Scanner;

public class Main {

    private final static Scanner scanner = new Scanner(System.in);
    private static AgendaService service;

    static void main() {
        System.out.println("Indica el tamaño de tu agenda");
        int capacidad = scanner.nextInt();
        service = new AgendaService(capacidad);

        String menu = """
                \n********************Bienvenid@ a tu agenda *********************
                Ingresa el número de la opción que deseas realizar:
                
                1.- Agregar nuevo contacto
                2.- Lista de contactos
                3.- Buscar contacto
                4.- Eliminar contacto
                5.- Espacio de mi agenda
                
                0.- Salir
                """;

        while (true) {
            System.out.println(menu);
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1 -> agregarContacto();
                case 2 -> listaContactos();
                case 3 -> buscarContacto();
                case 4 -> eliminarContacto();
                case 5 -> espacioDeMiAgenda();
                case 0 -> {
                    System.out.println("\n***************** Regresa pronto ******************");
                    return;
                }
                default -> System.out.println("Ingresa una opción válida");
            }
        }
    }

    private static void agregarContacto() {
        if (service.espaciosLibres() == 0) {
            System.out.println("No hay espacio para agregar nuevo contacto");
            return;
        }

        System.out.println("\nIngresa nombre completo:");
        String nombre = scanner.nextLine();
        System.out.println("Ingresa tu número de teléfono");
        String numero = String.valueOf(scanner.nextInt());
        scanner.nextLine();

        Contacto contacto = new Contacto(nombre, numero);
        service.anadirContacto(contacto);
    }

    private static void listaContactos() {
        System.out.println();
        if (service.listarContactos().isEmpty()) {
            System.out.println("\nTu lista de contactos esta vacia.");
            return;
        }
        List<Contacto> contactos = service.listarContactos();
        for (int i = 0; i < contactos.size(); i++) {
            System.out.println((i + 1) + ".- " + contactos.get(i));
        }
    }

    private static void buscarContacto() {
        System.out.println("\nIngresa el nombre del contacto a buscar:");
        String buscarPorNombre = scanner.nextLine();
        System.out.println("Contacto: " + service.buscaContacto(buscarPorNombre).getNuevoTelefono());
    }

    private static void eliminarContacto() {
        System.out.println("\nIngresa nombre completo del contacto a eliminar");
        String nombre = scanner.nextLine();
        Contacto contacto = service.buscaContacto(nombre);
        service.eliminarContacto(contacto);
        System.out.println("Contacto eliminado exitosamente");
    }

    private static void espacioDeMiAgenda() {
        System.out.println("\nEspacio de mi agenda: " + service.espaciosLibres());
    }
}
