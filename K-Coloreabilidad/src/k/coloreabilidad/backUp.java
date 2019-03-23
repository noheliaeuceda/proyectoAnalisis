package k.coloreabilidad;

import java.io.Serializable;
import java.util.ArrayList;

public class backUp implements Serializable{
    ArrayList<Node> grafo = new ArrayList();
    
    public void llenar(ArrayList<Node> grafo_guardado){
        for (int i = 0; i < grafo_guardado.size(); i++) {
            grafo.add(grafo_guardado.get(i));
        }
    }
}
