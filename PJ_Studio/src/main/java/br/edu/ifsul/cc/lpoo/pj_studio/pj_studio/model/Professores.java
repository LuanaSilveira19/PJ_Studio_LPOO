
package br.edu.ifsul.cc.lpoo.pj_studio.pj_studio.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author luana
 */

@Entity
@Table(name = "tb_professor")
public class Professores extends Pessoas implements Serializable{
    
    public Professores() {
//         inicialização das listas holerites e modalidades no construtor para evitar NullPointerException
        holerites = new ArrayList<>();
//        modalidades = new ArrayList<>();

    }

    @Column(name = "professor_data_admissao")
    private Calendar dataAdmissao;

    
//    Validação do Mapeamento Bidirecional: Garantir que o mapeamento @OneToMany em Professor 
//    e @ManyToOne em FolhaPagamento estejam corretamente configurados para refletir o relacionamento bidirecional.
    @OneToMany(mappedBy = "professores")
    private List<FolhaPagamento> holerites= new ArrayList<>();
    
    
    //    Validação do Mapeamento Bidirecional: Garantir que o mapeamento @OneToMany em Professor 
//    e @ManyToOne em Modalidade estejam corretamente configurados para refletir o relacionamento bidirecional.
    @OneToMany(mappedBy = "professores")
    private List<Modalidades> modalidades = new ArrayList<>();

    public Calendar getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Calendar dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public List<FolhaPagamento> getHolerites() {
        return holerites;
    }

    public void addFolhaPagamentoMes(FolhaPagamento f) {
        holerites.add(f);
    }
    
    
    public List<Modalidades> getModalidades() {
        return modalidades;
    }

    public void addModalidade(Modalidades m) {
        modalidades.add(m);
        m.setProfessores(this);
       
    }
    
   
}
