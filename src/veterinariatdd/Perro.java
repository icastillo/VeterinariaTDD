package veterinariatdd;

public class Perro extends Mascota {

    private int tamanho;

    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public String identificarme() {
        return super.identificarme() + "del tipo perro y me llamo " + Nombre;
    }

    /**
     * @return the tamanho
     */
    public int getTamanho() {
        return tamanho;
    }

    /**
     * @param tamanho the tamanho to set
     */
    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public double precioBanho() {
        return 15.00;
    }

    @Override
    public double costoBanho() {
        return 15.00 * tamanho;
    }
}
