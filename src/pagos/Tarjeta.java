package pagos;

public class Tarjeta extends Pago {
    private String tipo;
    private String numTransaccion; //No le coloqué la tilde
    public Tarjeta(float monto, String numTransaccion, String tipo) {
        super();
        super.set_monto(monto);
        this.numTransaccion = numTransaccion;
        this.tipo = tipo;
    }
    public String get_tipo() {
        return tipo;
    }
    public String get_numTransaccion() {
        return numTransaccion;
    }
}
