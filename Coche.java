public class Main {

    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.SumarPuerta();
        miCoche.SumarPuerta();
        miCoche.SumarPuerta();
        System.out.println(miCoche.puertas);
    }

    public static int suma(int a, int b) {
        return a + b;
    }
}
class Coche {
    public int puertas = 2;

    public void SumarPuerta() {
        this.puertas++;
    }
}