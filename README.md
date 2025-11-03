# Hackathon-2-Agenda
Realizar una programa de una agenda de contactos.
AñadirContacto(Contacto c): Añade un contacto a la agenda, sino se pueden añadir más a la agenda se indicará por pantalla. No se pueden añadir contactos que existan, es decir, no podemos duplicar nombres, aunque tengan distinto teléfono.
ExisteContacto(Conctacto c): Indica si el contacto pasado existe o no.
ListarContactos(): Lista toda la agenda
BuscaContacto(String nombre): Busca un contacto por su nombre y muestra su teléfono.
EliminarContacto(Contacto c): Elimina el contacto de la agenda, indica si se ha eliminado o no por pantalla
AgendaLlena(): Indica si la agenda está llena.
EspacioLibres (): Indica cuantos contactos más podemos ingresar. 

Crea un menú con opciones por consola para probar todas estas funcionalidades. 

añadirContacto(Contacto c):
Añade un contacto a la agenda. Si no hay espacio suficiente, se debe indicar al usuario que la agenda está llena.

Antes de añadir el contacto, se debe comprobar que no exista ya en la agenda (contactos con el mismo nombre y apellido se consideran duplicados).

No se puede añadir un contacto si el nombre o apellido están vacíos.

existeContacto(Conctacto c):
Verifica si un contacto ya existe en la agenda.

Los contactos se consideran iguales si tienen el mismo nombre y apellido, sin importar el teléfono.

listarContactos(): 
Muestra todos los contactos de la agenda en el siguiente formato: Nombre Apellido - Teléfono.

Ordena los contactos alfabéticamente por nombre y apellido antes de mostrarlos.

buscaContacto(String nombre): 
Permite buscar un contacto por nombre y apellido.

Si el contacto existe, muestra el teléfono. Si no existe, muestra un mensaje indicando que no se ha encontrado.

eliminarContacto(Contacto c):
Elimina un contacto de la agenda. Muestra un mensaje indicando si la eliminación ha sido exitosa o no.

Si se intenta eliminar un contacto que no existe, debe indicarse al usuario.

 modificarTelefono(String nombre, String apellido, String nuevoTelefono):
Permite modificar el teléfono de un contacto existente.

Si el contacto no existe, debe mostrar un mensaje.

agendaLlena(): 
Indica si la agenda está llena.

Muestra un mensaje indicando que no hay espacio disponible para nuevos contactos.

espacioLibres(): 
Muestra cuántos contactos más se pueden agregar a la agenda.

Esto debe basarse en el tamaño máximo definido al crear la agenda.
