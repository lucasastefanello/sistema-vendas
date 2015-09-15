/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 *
 * @author Lucas
 */
public class Produto {
    
        private int codigo;

    public static final String PROP_CODIGO = "codigo";

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        int oldCodigo = this.codigo;
        this.codigo = codigo;
        propertyChangeSupport.firePropertyChange(PROP_CODIGO, oldCodigo, codigo);
    }

    private transient final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }

        private String nome;

    public static final String PROP_NOME = "nome";

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        propertyChangeSupport.firePropertyChange(PROP_NOME, oldNome, nome);
    }

        private double valor;

    public static final String PROP_VALOR = "valor";

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        double oldValor = this.valor;
        this.valor = valor;
        propertyChangeSupport.firePropertyChange(PROP_VALOR, oldValor, valor);
    }

        private int unidades;

    public static final String PROP_UNIDADES = "unidades";

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        int oldUnidades = this.unidades;
        this.unidades = unidades;
        propertyChangeSupport.firePropertyChange(PROP_UNIDADES, oldUnidades, unidades);
    }

    public void getUnidades(int novoEstoque) {
        
    }

    
}
