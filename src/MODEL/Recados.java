/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

/**
 *
 * @author Roberto Junior Akira
 */
public class Recados {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRecados() {
        return Recados;
    }

    public void setRecados(String Recados) {
        this.Recados = Recados;
    }
    private int id;
    private String Recados;

    public Recados() {
        id = 0;
        Recados = new String();
    }

    public Recados(int id, String Recados) {
        this.id = id;
        this.Recados = Recados;
    }

}
