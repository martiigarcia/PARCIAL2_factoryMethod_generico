package forma1.modelo;

public class ProductoConcreto implements Producto {

    private int numeroIdentificador;

    public ProductoConcreto(int numeroIdentificador) {
        this.numeroIdentificador = numeroIdentificador;
    }

    @Override
    public void anOperation() {
        System.out.println("Se realizo una operacion FORMA (1)...");
    }

}
