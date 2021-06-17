package forma1.main;

import forma1.modelo.Creador;
import forma1.modelo.CreadorConcreto;
import forma1.modelo.Producto;

public class FabricaDeObjetos {
    public static void main(String[] args) {

        Creador creador = new CreadorConcreto();
        Producto producto = creador.factoryMethod(1);
        producto.anOperation();


    }
}
