package forma2.modelo;

public class CreadorConcreto extends Creador {

    public Producto factoryMethod(int numeroIdentificador){
        return new ProductoConcreto(numeroIdentificador);
    }

}
