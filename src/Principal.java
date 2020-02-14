import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    private static final Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        String nombre, tel;
        int id, opcion;
        ArrayList<Persona> arreglo = new ArrayList<Persona>();

        do {
            System.out.println("1. Nuevo" + "\n2. Buscar" + "\n3. Eliminar" + "\n4. Modificar" + "\n5. Mostrar todo" + "\n6. Salir");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    arreglo.add(new Persona().nuevo());
                    for (Persona p : arreglo) {
                        System.out.println("Id: " + p.getId() + "\tNombre: " + p.getNombre() + "\tTel: " + p.getTel());
                    }
                    break;
                case 2:
                    System.out.println("Ingresa el id de la persona");
                    id = teclado.nextInt();
                    if (Persona.buscarPersona(arreglo, id) != null) {
                        System.out.println("Id: " + Persona.buscarPersona(arreglo, id).getId() + "\tNombre: " + Persona.buscarPersona(arreglo, id).getNombre() + "\tTel: " + Persona.buscarPersona(arreglo, id).getTel());
                    }
                    break;
                case 3:
                    System.out.println("Ingresa el id de la persona");
                    id = teclado.nextInt();
                    if (Persona.eleminarPersona(arreglo, id)) {
                        System.out.println("Se ha eliminado la persona");
                    }

                    break;
                case 4:
                    System.out.println("Ingrese el id de la persona");
                    id = teclado.nextInt();
                    for (Persona p : arreglo) {
                        if (Persona.modificarPersona(arreglo, id) != null) {
                            System.out.println("Id: " + p.getId() + "\tNombre: " + p.getNombre() + "\tTel: " + p.getTel());
                        }
                    }

                    break;
                case 5:
                    for (Persona p : arreglo) {
                        System.out.println(p.toString(arreglo));
                    }
            }


        } while (opcion != 6);
    }

}
