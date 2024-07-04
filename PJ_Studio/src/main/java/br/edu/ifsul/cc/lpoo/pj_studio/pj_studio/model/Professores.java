
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author luana
 */

@Entity
public class Professores extends Pessoas implements Serializable{
    
    @Column(name = "Data_Admissão")
    @Temporal(TemporalType.DATE)//dia, mes e ano
    private Calendar data_adm;
    
    @OneToMany
    private List<FolhaPagamento> f_pagamento= new ArrayList();
    
    @OneToMany
    private List<Modalidades> modalidade= new ArrayList();
  
    public Calendar getData_adm() {
        return data_adm;
    }

    public void setData_adm(Calendar data_adm) {
        this.data_adm = data_adm;
    }
    
    
}
