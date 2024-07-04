
package br.edu.ifsul.cc.lpoo.pj_studio.pj_studio.model;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


/**
 *
 * @author luana
 */

@Entity
public class Pacotes implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)//id sequencial
    private Integer id;
    
    @Column(nullable=false,length =120 ,name = "Descrição")//Modifica o nome da coluna do BD
    private String descricao;
    
    @Column(nullable=false,name = "Valor_", columnDefinition = "decimal(12,2)")
    private Double valor;

    @ManyToOne
    @JoinColumn(name="modalidade_id", referencedColumnName = "id", nullable = false)
    private Modalidades modalidade; //qual modalidade pertence a esse pacote

    public Modalidades getModalidade() {
        return modalidade;
    }

    public void setModalidade(Modalidades modalidade) {
        this.modalidade = modalidade;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
     
     
    
    
}
