package pagos;
import java.util.Date;

public abstract class Pago {
    private float monto;
    private Date fecha;
    public float get_monto() {
        return monto;
    }
    protected void set_monto(float monto) {
        this.monto = monto;
    }
    public Date get_fecha() {
        return fecha;
    }
    protected void set_fecha(Date fecha) {
        this.fecha = fecha;
    }

}
