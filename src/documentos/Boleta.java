package documentos;

public class Boleta extends DocTributario {
    @Override
    public String toString() {
        return "Boleta " + super.toString();
    }

    public Boleta(String rut) {
        super(rut);
    }
}
