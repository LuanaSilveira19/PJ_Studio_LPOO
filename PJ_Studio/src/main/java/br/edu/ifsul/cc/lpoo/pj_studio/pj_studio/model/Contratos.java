
package br.edu.ifsul.cc.lpoo.pj_studio.pj_studio.model;

import java.io.Serializable;
import java.util.ArrayList;

import java.util.Calendar;
import java.util.List;
import javax.persistence.CascadeType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;


/**
 *
 * @author luana
 */
@Entity
public class Contratos implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)//id sequencial
    private Integer id;
    
    @Column(nullable = false)//por ser obrigatorio ele precisa ser persistido
    private Calendar data_inicio;

    public Contratos() {
        
        data_inicio=Calendar.getInstance(); //atualiza a data automaticamente sem precisar setar no test
    }
    
   
    @Column(name = "Valor_desconto",columnDefinition = "decimal(12,2)")
    private Double valor_desconto;
    
    @Column(nullable = false,  name = "Forma_pagamento")
    @Enumerated(EnumType.STRING)//usado para vincular o enum 
    private FormaPgto forma_pgto;
    
   
   @OneToMany(mappedBy = "contratos", cascade = CascadeType.ALL, orphanRemoval = false, fetch = FetchType.LAZY)
    private List<ItensContrato> itensContrato= new ArrayList();
   
   private void adiciona_itens(ItensContrato obj){
                 itensContrato.add(obj);
   }
    private void remove_itens(ItensContrato obj){
                 itensContrato.remove(obj);
   }
    public Double getValor_desconto() {
        return valor_desconto;
    }

    public void setValor_desconto(Double valor_desconto) {
        this.valor_desconto = valor_desconto;
    }

    public FormaPgto getForma_pgto() {
        return forma_pgto;
    }

    public void setForma_pgto(FormaPgto forma_pgto) {
        this.forma_pgto = forma_pgto;
    }
    
     public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
      public Calendar getData_inicio() {
        return data_inicio;
    }

    public void setData_inicio(Calendar data_inicio) {
        this.data_inicio = data_inicio;
    }

}
