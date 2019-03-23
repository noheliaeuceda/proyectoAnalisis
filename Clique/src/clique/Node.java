package clique;

import java.util.ArrayList;
import java.io.Serializable;

public class Node implements Serializable{
    private int value;
    private int ID;
    private int idColor;
    private ArrayList<Arista> aristas = new ArrayList();

    public Node(int id, int value) {
        this.ID = id;
        this.value = value;
    }

    public Node() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public ArrayList<Arista> getAristas() {
        return aristas;
    }

    public void setAristas(ArrayList<Arista> relations) {
        this.aristas = relations;
    }

    public int getValue() {
        return value;
    }

    public int getIdColor() {
        return idColor;
    }

    public void setIdColor(int idColor) {
        this.idColor = idColor;
    }
    

    @Override
    public String toString() {
        return value+"";
    }

}
