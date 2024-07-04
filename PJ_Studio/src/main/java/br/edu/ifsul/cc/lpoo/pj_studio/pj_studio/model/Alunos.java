
package br.edu.ifsul.cc.lpoo.pj_studio.pj_studio.model;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author luana
 */

@Entity
public class Alunos extends Pessoas implements Serializable{
    @Column(name = "Data_inicio")
    @Temporal(TemporalType.DATE)//dia, mes e ano
    private Calendar data_inicio;
    
    @Column(name = "Data_Pgto")
    
    private Integer data_Pgto;

    public Calendar getData_inicio() {
        return data_inicio;
    }

    public void setData_inicio(Calendar data_inicio) {
        this.data_inicio = data_inicio;
    }

    public Integer getData_Pgto() {
        return data_Pgto;
    }

    public void setData_Pgto(Integer data_Pgto) {
        this.data_Pgto = data_Pgto;
    }
    
    
    
}
