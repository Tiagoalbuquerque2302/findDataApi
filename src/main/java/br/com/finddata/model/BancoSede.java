/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.finddata.model;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 *
 * @author Tiago
 */
@Entity
public class BancoSede extends InstituicaoFinanceira {
    @Column(length = 100)
    private String segmento;
    
    private boolean cart_comercial;

    public String getSegmento() {
        return segmento;
    }

    public void setSegmento(String segmento) {
        this.segmento = segmento.trim();
    }

    public boolean isCart_comercial() {
        return cart_comercial;
    }

    public void setCart_comercial(boolean cart_comercial) {
        this.cart_comercial = cart_comercial;
    }
}
