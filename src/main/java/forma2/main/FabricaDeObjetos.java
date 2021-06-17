package forma2.main;

import forma2.modelo.Creador;
import forma2.modelo.CreadorConcreto;

public class FabricaDeObjetos {
    public static void main(String[] args) {

        Creador creador = new CreadorConcreto();
        creador.anOperation(1);


    }
}
