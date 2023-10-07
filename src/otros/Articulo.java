package otros;

import documentos.DetalleOrden;
import documentos.OrdenCompra;

import java.util.ArrayList;

public class Articulo {
    private ArrayList<DetalleOrden> ordenes;
    private float peso;
    private String nombre;
    private String descripcion;
    private float precio;

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void agregarOrden(DetalleOrden orden) {
        this.ordenes.add(orden);
    }

    public ArrayList<DetalleOrden> getOrdenes() {
        return (ArrayList<DetalleOrden>) ordenes.clone();
    }

    @Override
    public String toString() {
        return String.format("%s || %s || Peso: %.2f || Precio: $%.2f", this.nombre, this.descripcion, this.peso, this.precio);
    }

    public Articulo(String nombre, String descripcion, float precio, float peso) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.peso = peso;
        this.ordenes = new ArrayList<>();
    }
}
