package veterinariatdd;

public class Gato extends Mascota {

    public Gato(String nombre) {
        super(nombre);
    }

    @Override
    public String identificarme() {
        return super.identificarme() + "del tipo gato y me llamo " + Nombre;
    }

    @Override
    public double precioBanho() {
        return 80.00;
    }

    @Override
    public double costoBanho() {
        return 80.00;
    }
}
