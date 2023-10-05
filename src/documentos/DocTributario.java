package documentos;

import otros.Direccion;

import java.util.Date;

public abstract class DocTributario {
    private String numero;
    private String rut;
    private Date fecha;
    private Direccion direccion;
    private OrdenCompra orden;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public abstract String getDocName();

    @Override
    public String toString() {
        return String.format("(N°%s) || RUT: %s || Fecha: %s", this.numero, this.rut, String.valueOf(this.fecha.toString().toCharArray(), 4, 15));
    }

    public DocTributario(String rut, Direccion direccion) {
        this.fecha = new Date();
        this.rut = rut;
        this.numero = String.format("%d", Math.round(Math.random() * 1000000));
        this.direccion = direccion;
    }
}
