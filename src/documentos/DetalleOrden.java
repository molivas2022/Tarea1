package documentos;

import otros.Articulo;

public class DetalleOrden {
    private int cantidad;
    private final Articulo articulo;
    private OrdenCompra orden;
    public float calcPrecioSinIVA(){
        return this.articulo.getPrecio() * cantidad;
    }
    public float calcIVA() {
        return this.calcPrecioSinIVA() * (float) 0.19;
    }
    public float calcPrecio() {
        return this.calcPrecioSinIVA() + this.calcIVA();
    }
    public float calcPeso() {
        return this.articulo.getPeso() * cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public OrdenCompra getOrden() {
        return orden;
    }

    public void setOrden(OrdenCompra orden) {
        this.orden = orden;
    }

    public DetalleOrden(Articulo articulo, int cantidad) {
        this.articulo = articulo;
        this.cantidad = cantidad;
        articulo.agregarOrden(this);
    }

    @Override
    public String toString() {
        return String.format("%s x%d ($%.2f c/u) || Subtotal: $%.2f, IVA: $%.2f, Precio Total: $%.2f", this.articulo.getNombre(), this.cantidad, this.articulo.getPrecio(), this.calcPrecioSinIVA(), this.calcIVA(), this.calcPrecio());
    }
}
