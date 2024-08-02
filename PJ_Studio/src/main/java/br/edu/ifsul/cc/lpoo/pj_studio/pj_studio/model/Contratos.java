
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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;


/**
 *
 * @author luana
 */
@Entity
public class Contratos implements Serializable{
     @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
 
    private Integer id;

    @Column(name = "contrato_data_inicio", nullable = false)
    private Calendar dataInicio;

    @Column(name = "contrato_valor", precision = 2)
    private double valor;

    @Column(name = "contrato_forma_pgto")
    @Enumerated(EnumType.STRING)
    //não incluindo anotação o JPA assume como padrão que será mapeado no BD
    // como inteiro referente ao índice do valor informado no Enum
    // outra opção que podemos usar é o tipo EnumType.STRING
    private FormaPgto forma_pgto;

    @OneToOne
    @JoinColumn(name = "alunos_id")
    private Alunos alunos;

    public Alunos getAlunos() {
        return alunos;
    }

    public void setAlunos(Alunos alunos) {
        this.alunos = alunos;
    }

    @ManyToMany
    @JoinTable(name = "tb_itens_contrato", joinColumns = @JoinColumn(name = "contratos_id"),
            inverseJoinColumns = @JoinColumn(name = "pacotes_id"))
    private List<Pacotes> pacotes = new ArrayList<>();


    public Contratos() {
        dataInicio = Calendar.getInstance();
        
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Calendar getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Calendar dataInicio) {
        this.dataInicio = dataInicio;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public FormaPgto getForma_pgto() {
        return forma_pgto;
    }

    public void setForma_pgto(FormaPgto forma_pgto) {
        this.forma_pgto = forma_pgto;
    }

 

    public List<Pacotes> getPacotes() {
        return pacotes;
    }

    public void addPacote(Pacotes p) {
        pacotes.add(p);
        p.addContrato(this);
    }


}
