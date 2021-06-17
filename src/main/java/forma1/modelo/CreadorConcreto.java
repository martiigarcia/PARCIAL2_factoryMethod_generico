package forma1.modelo;

public class CreadorConcreto extends Creador {

    public Producto factoryMethod(int numeroIdentificador){
        return new ProductoConcreto(numeroIdentificador);
    }


}
