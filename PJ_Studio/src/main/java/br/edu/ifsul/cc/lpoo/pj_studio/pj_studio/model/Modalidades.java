package br.edu.ifsul.cc.lpoo.pj_studio.pj_studio.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.swing.JComboBox;

/**
 *
 * @author luana
 */
@Entity //mapeia uma tabela no BD com o mesmo nome da classe
@Table(name="tb_modalidade")
public class Modalidades implements Serializable {//implements Serializable diz que o dado vai ser jogado linha a linha pro BD

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    
    @Column(nullable = false, length = 155, name = "modalidade_descricao")
    private String descricao;

    //    Validação do Mapeamento Bidirecional: Garantir que o mapeamento @OneToMany em Professor 
//    e @ManyToOne em Modalidade estejam corretamente configurados para refletir o relacionamento bidirecional.
    @ManyToOne
    @JoinColumn(name="modalidades_professores")
    private Professores professores;
    
    //@OneToMany(mappedBy = "modalidades")
    //private List<Pacotes> pacotes = new ArrayList<>();

   /* public List<Pacotes> getPacotes() {
        return pacotes;
    }

    public void setPacotes(List<Pacotes> pacotes) {
        this.pacotes = pacotes;
    }*/

    
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

    public Professores getProfessores() {
        return professores;
    }

    public void setProfessores(Professores professores) {
        this.professores = professores;
    }

    @Override
    public String toString() {
        return descricao;
    }

    

   
}
