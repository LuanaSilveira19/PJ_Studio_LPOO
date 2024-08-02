
package br.edu.ifsul.cc.lpoo.pj_studio.pj_studio.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 *
 * @author luana
 */

@Entity
@Table(name="tb_pacote")
public class Pacotes implements Serializable{

    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Id
    @Column(name = "pacotes_id")
    private Integer id;
    
    @Column(name = "pacotes_descricao", nullable = false, length = 120)
    private String descricao;
    
    @Column(name = "pacote_valor", nullable = false, precision = 2)
    private double valor;
    
    @ManyToOne
    @JoinColumn(name = "modalidades_id")
    private Modalidades modalidade;
    
    @ManyToMany(mappedBy = "pacotes")
    private List<Contratos> contratos = new ArrayList<>();

    public Pacotes() {
        
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

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Modalidades getModalidade() {
        return modalidade;
    }

    public void setModalidade(Modalidades modalidade) {
        this.modalidade = modalidade;
    }

    public List<Contratos> getContratos() {
        return contratos;
    }
    
    public void addContrato(Contratos c) {
        contratos.add(c);
    }
    
    
}