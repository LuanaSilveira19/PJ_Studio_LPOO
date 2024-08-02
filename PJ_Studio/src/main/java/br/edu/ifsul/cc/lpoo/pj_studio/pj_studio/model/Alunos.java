
package br.edu.ifsul.cc.lpoo.pj_studio.pj_studio.model;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author luana
 */


@Entity
@Table(name = "tb_aluno")
public class Alunos extends Pessoas implements Serializable{
    
    @Column(name = "aluno_data_inicio")
    private Calendar dataInicio;
    
    @Column(name = "aluno_dia_pgto")
    private Integer dataPgto;

    public Alunos() {
        dataInicio = Calendar.getInstance();
    }

    public Calendar getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Calendar dataInicio) {
        this.dataInicio = dataInicio;
    }

    public int getDataPgto() {
        return dataPgto;
    }

    public void setDataPgto(Integer dataPgto) {
        this.dataPgto = dataPgto;
    }
    
   

    
    
}
    