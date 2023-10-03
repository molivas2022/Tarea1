package pagos;

public class Transferencia extends Pago {
    private String banco;
    private String numCuenta;
    public Transferencia(float monto, String banco, String numCuenta) {
        super();
        super.set_monto(monto);
        this.banco = banco;
        this.numCuenta = numCuenta;
    }
    public String get_banco() {
        return banco;
    }
    public String get_numCuenta() {
        return numCuenta;
    }
}
