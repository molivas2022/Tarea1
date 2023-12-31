package pagos;
import java.util.Date;

public class Efectivo extends Pago {
    private float ingreso;
    public Efectivo(float monto, Date fecha, float ingreso_total) {
        super();
        super.set_monto(monto);
        super.set_fecha(fecha);
        this.ingreso = ingreso_total;

        if (ingreso_total < monto) {
            //Pago insuficiente
            super.set_monto(0);
        }
    }
    public float calcDevolucion() {
        return this.ingreso - super.get_monto();
    }

    @Override
    public String toString() {
        return String.format(super.toString() + " || Dinero pagado: %.2f", "Efectivo", this.ingreso);
    }
}
