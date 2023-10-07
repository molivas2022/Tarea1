package otros;

import documentos.*;

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
    public void set_nombre(String nombre) {
        this.nombre = nombre;
    }
    public String get_rut() {
        return rut;
    }
    public void set_rut(String rut) {
        this.rut = rut;
    }
    public Direccion get_direccion() {
        return direccion;
    }
    public void set_direccion(Direccion direccion) {
        this.direccion = direccion;
    }
    public ArrayList<OrdenCompra> get_ordenes() {
        return (ArrayList<OrdenCompra>) ordenes.clone(); //Creo que es mejor devolver una copia para dejar protegido al original
    }
    public void add_orden(OrdenCompra orden) {
        ordenes.add(orden);
    }

    @Override
    public String toString() {
        String string = "";
        string += String.format("Cliente: %s (%s)\nDireccion: %s\n", this.nombre, this.rut, this.direccion);
        string += "\nÓrdenes activas:";
        for (int i = 0; i < this.ordenes.size(); i++) {
            string += String.format("\n\n-------------ORDEN N°%d-------------\n", i+1);
            string += this.ordenes.get(i);
        }
        return string;
    }
}