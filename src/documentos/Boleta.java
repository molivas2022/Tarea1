package documentos;

import otros.Direccion;

public class Boleta extends DocTributario {

    @Override
    public String getDocName() {
        return "Boleta";
    }

    @Override
    public String toString() {
        return "Boleta " + super.toString();
    }

    public Boleta(String rut, Direccion direccion) {
        super(rut, direccion);
    }
}
