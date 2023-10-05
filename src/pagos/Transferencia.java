package pagos;
import java.util.Date;

public class Transferencia extends Pago {
    private String banco;
    private String numCuenta;
    public Transferencia(float monto, Date fecha, String banco, String numCuenta) {
        super();
        super.set_monto(monto);
        super.set_fecha(fecha);
        this.banco = banco;
        this.numCuenta = numCuenta;
    }
    public String get_banco() {
        return banco;
    }
    public void set_banco(String banco) {
        this.banco = banco;
    }
    public String get_numCuenta() {
        return numCuenta;
    }
    public void set_numCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }
}
