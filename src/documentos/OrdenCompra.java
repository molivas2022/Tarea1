package documentos;

import otros.*;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class OrdenCompra {
    private Date fecha;
    private String estado;
    private Cliente cliente;
    private DocTributario documento;
    private ArrayList<DetalleOrden> detalleCompras;
    public float calcPrecioSinIVA(){
        float suma = 0;
        for (DetalleOrden detalleCompra : detalleCompras) {
            suma += detalleCompra.calcPrecioSinIVA();
        }
        return suma;
    }
    public float calcIVA() {
        float suma = 0;
        for (DetalleOrden detalleCompra : detalleCompras) {
            suma += detalleCompra.calcIVA();
        }
        return suma;
    }
    public float calcPrecio() {
        float suma = 0;
        for (DetalleOrden detalleCompra : detalleCompras) {
            suma += detalleCompra.calcPrecio();
        }
        return suma;
    }
    public float calcPeso() {
        float suma = 0;
        for (DetalleOrden detalleCompra : detalleCompras) {
            suma += detalleCompra.calcPeso();
        }
        return suma;
    }
    public void agregarArticulo(Articulo articulo, int cantidad) {
        DetalleOrden nueva = new DetalleOrden(articulo, cantidad);
        this.detalleCompras.add(nueva);
        nueva.setOrden(this);
    }
    public void eliminarArticulo(int posicionEnDetalleCompras) {
        if (posicionEnDetalleCompras >= 0 && posicionEnDetalleCompras < this.detalleCompras.size()) {
            this.detalleCompras.remove(posicionEnDetalleCompras);
        }
    }
    public ArrayList<DetalleOrden> getDetalleCompras() {
        return (ArrayList<DetalleOrden>) detalleCompras.clone();
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String pagar(String metodo, float cantidad) {
        if (Objects.equals(metodo, "efectivo")) {

        } else if (Objects.equals(metodo, "tarjeta")) {

        } else if (Objects.equals(metodo, "transferencia")) {

        } else {
            return "Método de pago inválido.";
        }
        this.estado = "Pagado";
        return "Transacción realizada con éxito!";
    }

    @Override
    public String toString() {
        String lineSep = "\n--------------------------------------------------------";
        String string = String.format("%s de Compra || %s || Estado: %s",this.documento.getDocName(), String.valueOf(this.fecha.toString().toCharArray(), 4, 15), this.estado);
        string += String.format("\nComprador: %s (%s)", cliente.get_nombre(), cliente.get_rut());
        string += lineSep;
        for (int i = 0; i < this.detalleCompras.size(); i++) {
            string += String.format("\n(%d) ", i+1) + this.detalleCompras.get(i).toString();
        }
        string += lineSep;
        string += String.format("\nTotal sin IVA: $%.2f || IVA: $%.2f || TOTAL: $%.2f", this.calcPrecioSinIVA(), this.calcIVA(), this.calcPrecio());
        return string;
    }

    public OrdenCompra(Cliente cliente, String documento) {
        this.fecha = new Date();
        this.estado = "Incompleto";
        this.detalleCompras = new ArrayList<>();
        this.cliente = cliente;
        if (Objects.equals(documento, "factura")) {
            this.documento = new Factura(cliente.get_rut(), cliente.get_direccion());
        } else {
            this.documento = new Boleta(cliente.get_rut(), cliente.get_direccion());
        }
    }
}
