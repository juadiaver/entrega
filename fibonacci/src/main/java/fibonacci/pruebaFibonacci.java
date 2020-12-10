package fibonacci;

public class pruebaFibonacci {

    public static void main(String[] args) {

        fibonacci f1 = new fibonacci("fibonacci 1", 10);
        f1.mostrarSerie();

        fibonacci f2 = new fibonacci();
        f2.setNombre("fibonacci 2");
        f2.setTamaño(10);
        f2.mostrarSerie();
    }
}