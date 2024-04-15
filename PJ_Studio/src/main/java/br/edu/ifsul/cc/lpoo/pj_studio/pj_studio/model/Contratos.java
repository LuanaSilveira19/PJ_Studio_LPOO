
package br.edu.ifsul.cc.lpoo.pj_studio.pj_studio.model;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

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
    @Temporal(TemporalType.TIMESTAMP) //ver se se encaixa no atualizar automaticamente, ou tem que fazer algo 
    private Calendar data_inicio;
   
    @Column(name = "Valor_desconto",precision = 10, scale = 2)//não está funcionando
    private Double valor_desconto;
    
    @Column(nullable = false,  name = "Forma_pagamento")
    @Enumerated(EnumType.STRING)//usado para vincular o enum 
    private  FormaPgto forma_pgto;

     //private Collection<ItensContrato> itensContrato;
    
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
