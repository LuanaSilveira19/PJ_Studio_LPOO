
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
public class FolhaPagamento  implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)//id sequencial
    private Integer id;
    
    @Column(name = "Data_Pgto")
    private Calendar data_pgto;
    
    @Column(name = "Valor_a_Receber")
    private Double valor_receber;
    
    //pra poder fazer o pagamento da folha do mes é necessário colocar mais coisas do que existem no diagrama
    public void calcularFolhames(){
       //vou aguardar pra ver oq pede 
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Calendar getData_pgto() {
        return data_pgto;
    }

    public void setData_pgto(Calendar data_pgto) {
        this.data_pgto = data_pgto;
    }

    public Double getValor_receber() {
        return valor_receber;
    }

    public void setValor_receber(Double valor_receber) {
        this.valor_receber = valor_receber;
    }
    
    
}
