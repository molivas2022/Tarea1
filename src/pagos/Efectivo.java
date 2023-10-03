package pagos;
import java.util.Date;

public class Efectivo extends Pago {
    private float ingreso;
    public Efectivo(float monto, Date fecha, float ingreso_total) {
        super();
        super.set_monto(monto);
        super.set_fecha(fecha);
        this.ingreso = ingreso_total;

        //FALTA CONSIDERAR CASO INGRESO < MONTO
    }
    public float calcDevolucion() {
        return super.get_monto() - ingreso;
    }
}
