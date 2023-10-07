package pagos;
import java.util.Date;

public class Tarjeta extends Pago {
    private String tipo;
    private String numTransaccion; //No le coloqué la tilde
    public Tarjeta(float monto, Date fecha, String numTransaccion, String tipo) {
        super();
        super.set_monto(monto);
        super.set_fecha(fecha);
        this.numTransaccion = numTransaccion;
        this.tipo = tipo;
    }
    public String get_tipo() {
        return tipo;
    }
    public void set_tipo(String tipo) {
        this.tipo = tipo;
    }
    public String get_numTransaccion() {
        return numTransaccion;
    }
    public void set_numTransaccion(String numTransaccion) {
        this.numTransaccion = numTransaccion;
    }

    @Override
    public String toString() {
        return String.format(super.toString() + " || N° Transacción: %s", String.format("Tarjeta (%s)", this.tipo), this.numTransaccion);
    }
}
