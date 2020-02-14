import java.util.ArrayList;
import java.util.Scanner;
import java.lang.String;

public class Persona {

    private static final Scanner teclado = new Scanner(System.in);
    private String nombre, tel;
    private int id;
    private ArrayList arreglo;

    public Persona() {


    }

    public Persona(String nombre, String tel, int id) {
        this.nombre = nombre;
        this.tel = tel;
        this.id = id;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public String getNombre() {

        return this.nombre;
    }

    public void setId(int id) {

        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getTel() {
        return this.tel;
    }

    public Persona nuevo() {
        System.out.println("Ingresa tu id");
        this.id = teclado.nextInt();
        System.out.println("Ingresa tu nombre");
        this.nombre = teclado.nextLine();
        this.nombre = teclado.nextLine();
        System.out.println("Ingresa tu telefono");
        this.tel = teclado.nextLine();

        return this;
    }
    public static Persona buscarPersona(ArrayList<Persona> arreglo, int id){
        Persona busqueda = null;
        for(Persona p : arreglo){
            if(p.getId()==id){
                busqueda = p;
            }
        }
        if(busqueda == null){
            System.out.println("No existe la persona");
        }
        return busqueda;
    }

    public static boolean eleminarPersona(ArrayList<Persona> arreglo, int id){
        boolean eliminado = Boolean.parseBoolean(null);
        for(Persona p : arreglo){
            if(p.getId()==id){
                eliminado = arreglo.remove(p);
            }
        }
        return eliminado;
    }

    public static Persona modificarPersona(ArrayList<Persona> arreglo, int id){
        Persona modificar = null;
        for(Persona p : arreglo){
            if(p.getId()==id){
                modificar = p.nuevo();
            }
        }
        return modificar;
    }


    public String toString(ArrayList<Persona> arreglo){
        String datos = "Id: " + (int)id + "\tNombre: " + nombre + "\tTel: " + tel;
        return datos;
    }


}
