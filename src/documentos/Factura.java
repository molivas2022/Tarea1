package documentos;

import otros.Direccion;

public class Factura extends DocTributario {

    @Override
    public String getDocName() {
        return "Factura";
    }
    @Override
    public String toString() {
        return "Factura " + super.toString();
    }

    public Factura(String rut, Direccion direccion) {
        super(rut, direccion);
    }
}
