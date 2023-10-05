package documentos;

public class Factura extends DocTributario {
    @Override
    public String toString() {
        return "Factura " + super.toString();
    }

    public Factura(String rut) {
        super(rut);
    }
}
