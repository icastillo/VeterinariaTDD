package veterinariatdd;

public class VeterinariaTDD {

    public static void main(String[] args) {

        Perro perro = new Perro("Fifi");
        perro.setRaza("labrador");
        System.out.print(perro.getNombre() + "\n");
        System.out.print(perro.getRaza() + "\n");
        System.out.print(perro.identificarme()+ "\n\n");

        Gato gato = new Gato("Garfield");
        gato.setRaza("Persian");
        System.out.print(gato.getNombre() + "\n");
        System.out.print(gato.getRaza() + "\n");
        System.out.print(gato.identificarme()+ "\n\n");
    }
}
