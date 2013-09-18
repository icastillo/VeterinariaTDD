package veterinariatdd;

/**
 *
 * @author isaias
 */
public abstract class Mascota {

    protected String Nombre;
    protected String Raza;
    protected boolean Vacuna = false;

    public Mascota(String nombre) {
        this.Nombre = nombre;

    }

    public String identificarme() {
        return "Soy una mascota ";
    }

    public abstract double precioBanho();
    public abstract double costoBanho();

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String Raza) {
        this.Raza = Raza;
    }

    public boolean isVacuna() {
        return Vacuna;
    }

    public void setVacuna(boolean Vacuna) {
        this.Vacuna = Vacuna;
    }
}
