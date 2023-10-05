package otros;
import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private String rut;
    private ArrayList<OrdenCompra> ordenes;
    private Direccion direccion;
    public Cliente(String nombre, String rut, Direccion direccion) {
        this.nombre = nombre;
        this.rut = rut;
        this.direccion = direccion;
        ordenes = new ArrayList<OrdenCompra>();
    }
    /*
    No creo que tenga sentido que Cliente se inicialice con ordenes, más bien,
    las ordenes deberian iniciarse con una referencia a un cliente.
    */
    public String get_nombre() {
        return nombre;
    }
    public String get_rut() {
        return rut;
    }
    public Direccion get_direccion() {
        return direccion;
    }
    public ArrayList<OrdenCompra> get_ordenes() {
        return (ArrayList<OrdenCompra>) ordenes.clone(); //Creo que es mejor devolver una copia para dejar protegido al original
    }
    public void add_orden(OrdenCompra orden) {
        ordenes.add(orden);
    }
}

class OrdenCompra {

}

