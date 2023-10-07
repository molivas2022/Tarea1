package otros;

public class Direccion {
    private String direccion;

    public Direccion(String direccion) {
        this.direccion = direccion;
    }
    public String get_direccion() {
        return direccion;
    }
    public void set_direccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return this.direccion;
    }
}
