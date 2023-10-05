package pagos;
import java.util.Date;

public abstract class Pago {
    private float monto;
    private Date fecha;
    public float get_monto() {
        return monto;
    }
    public void set_monto(float monto) {
        this.monto = monto;
    } //¿Quizas seria mas adecuado un metodo protected?
    public Date get_fecha() {
        return fecha;
    }
    public void set_fecha(Date fecha) {
        this.fecha = fecha;
    } //¿Quizas seria mas adecuado un metodo protected?

}
