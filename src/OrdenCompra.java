import java.util.ArrayList;
import java.util.Date;

public class OrdenCompra {
    private Date fecha;
    private String estado;
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
    }
    public void eliminarArticulo(int posicionEnDetalleCompras) {
        if (posicionEnDetalleCompras >= 0 && posicionEnDetalleCompras < this.detalleCompras.size()) {
            this.detalleCompras.remove(posicionEnDetalleCompras);
        }
    }
    public ArrayList<DetalleOrden> getDetalleCompras() {
        return this.detalleCompras;
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

    @Override
    public String toString() {
        String string = String.format("Orden de Compra || %s || Estado: %s\n--------------------------------------------------------", String.valueOf(this.fecha.toString().toCharArray(), 4, 15), this.estado);
        for (int i = 0; i < this.detalleCompras.size(); i++) {
            string += String.format("\n(%d) ", i+1) + this.detalleCompras.get(i).toString();
        }
        string += String.format("\n--------------------------------------------------------\nTotal sin IVA: $%.2f || IVA: $%.2f || TOTAL: $%.2f", this.calcPrecioSinIVA(), this.calcIVA(), this.calcPrecio());
        return string;
    }

    public OrdenCompra() {
        this.fecha = new Date();
        this.estado = "Incompleto";
        this.detalleCompras = new ArrayList<>();
    }
}
