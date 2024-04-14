
package br.edu.ifsul.cc.lpoo.pj_studio.pj_studio.model;

import java.util.Calendar;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;

/**
 *
 * @author luana
 */

//@Entity
public class Professores extends Pessoas {
    
    @Column(name = "Data_Admissão")
    private Calendar data_adm;
    
    private Collection<FolhaPagamento> folha_pagamento;
    
    private Collection<Modalidades> modalidade;

    public Collection<Modalidades> getModalidade() {
        return modalidade;
    }

    public void setModalidade(Collection<Modalidades> modalidade) {
        this.modalidade = modalidade;
    }
    
    

    public Collection<FolhaPagamento> getFolha_pagamento() {
        return folha_pagamento;
    }

    public void setFolha_pagamento(Collection<FolhaPagamento> folha_pagamento) {
        this.folha_pagamento = folha_pagamento;
    }
    
    public Calendar getData_adm() {
        return data_adm;
    }

    public void setData_adm(Calendar data_adm) {
        this.data_adm = data_adm;
    }
    
    
}
