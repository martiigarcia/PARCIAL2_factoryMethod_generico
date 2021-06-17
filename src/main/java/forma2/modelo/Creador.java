package forma2.modelo;

public abstract class Creador {

    public abstract Producto factoryMethod(int numeroIdentificador);

    public void anOperation(int numeroIdentificador){
        factoryMethod(numeroIdentificador).anOperation();
    }

}
