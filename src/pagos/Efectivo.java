package pagos;

public class Efectivo extends Pago {
    private float ingreso;
    public Efectivo(float con_cuanto_se_paga, float cuanto_se_quiere_pagar) {
        super();
        super.set_monto(cuanto_se_quiere_pagar);
        this.ingreso = con_cuanto_se_paga;

        //FALTA CONSIDERAR CASO INGRESO < MONTO
    }
    public float calcDevolucion() {
        return super.get_monto() - ingreso;
    }
}
