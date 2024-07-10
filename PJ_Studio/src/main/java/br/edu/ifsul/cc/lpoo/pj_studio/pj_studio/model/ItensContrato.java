
package br.edu.ifsul.cc.lpoo.pj_studio.pj_studio.model;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


/**
 *
 * @author luana
 */
@Entity
public class ItensContrato implements Serializable{
    
    //tem como chave estrangeira contrato e pacote, ver como fazer 
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)//id sequencial
    private Integer id;
    
    @ManyToOne
    @JoinColumn(name = "pacotes_id")
    private Pacotes pacotes;
    
    @ManyToOne
    @JoinColumn(name = "contratos_id")
    private Contratos contratos;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Contratos getContratos() {
        return contratos;
    }

    public void setContratos(Contratos contratos) {
        this.contratos = contratos;
    }
    
    
}
