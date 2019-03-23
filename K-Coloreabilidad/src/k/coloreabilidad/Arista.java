package k.coloreabilidad;
import java.io.Serializable;

public class Arista implements Serializable{
    private Node nodoInicial;
    private Node nodoFinal;

    public Arista() {
    }

    public Arista(Node nodoInicial, Node nodoFinal)  {
        this.nodoInicial = nodoInicial;
        this.nodoFinal = nodoFinal;
    }

    public Node getNodoInicial() {
        return nodoInicial;
    }

    public void setNodoInicial(Node nodoInicial) {
        this.nodoInicial = nodoInicial;
    }

    public Node getNodoFinal() {
        return nodoFinal;
    }

    public void setNodoFinal(Node nodoFinal) {
        this.nodoFinal = nodoFinal;
    }

    @Override
    public String toString() {
        return nodoInicial + " hacia " + nodoFinal;
    }
}
