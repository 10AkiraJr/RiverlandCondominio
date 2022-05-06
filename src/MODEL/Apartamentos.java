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
public class Apartamentos {

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the apartamento
     */
    public String getApartamento() {
        return apartamento;
    }

    /**
     * @param apartamento the apartamento to set
     */
    public void setApartamento(String apartamento) {
        this.apartamento = apartamento;
    }

    /**
     * @return the situacao
     */
    public int getSituacao() {
        return situacao;
    }

    /**
     * @param situacao the situacao to set
     */
    public void setSituacao(int situacao) {
        this.situacao = situacao;
    }
    private int id;
    private String apartamento;
    private int situacao;

    public Apartamentos() {
        id = 0;
        apartamento = new String();
        situacao = 0;
    }

    public Apartamentos(int id, String apartamento, int situacao) {
        this.id = id;
        this.apartamento = apartamento;
        this.situacao = situacao;
    }
    
}
