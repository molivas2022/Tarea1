package documentos;

import java.util.Date;
import java.util.Random;
import java.util.Stack;
import java.util.random.RandomGenerator;

public abstract class DocTributario {
    private String numero;
    private String rut;
    private Date fecha;

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

    @Override
    public String toString() {
        return String.format("(N°%s) || RUT: %s || Fecha: %s", this.numero, this.rut, String.valueOf(this.fecha.toString().toCharArray(), 4, 15));
    }

    public DocTributario(String rut) {
        this.fecha = new Date();
        this.rut = rut;
        this.numero = String.format("%d", Math.round(Math.random() * 1000000));
    }
}
