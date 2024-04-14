
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author luana
 */
@Entity
public class Pagamentos implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)//id sequencial
    private Integer id;
    
    @Column(nullable=false,name = "Data_Vencimento")
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar data_Vcto;
    
    @Column(name = "Valor")
    private Double valor;
    
    @Column(name = "Data_Pagamento")
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar data_Pgto;
    
    @Column(name = "Valor_Pagamento")
    private Double valor_Pgto;
    
    @ManyToOne//relacionamento muitos para um
    @JoinColumn(name="contratos",referencedColumnName = "id", nullable=false)//diz qual o nome na tabela pagamentos que guarda a coluna contratos 
    private Contratos contratos;

    public Contratos getContratos() {
        return contratos;
    }

    public void setContratos(Contratos contratos) {
        this.contratos = contratos;
    }
     
    
   public void GerarPagamento(Integer mes_ref){
       
   }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Calendar getData_Vcto() {
        return data_Vcto;
    }

    public void setData_Vcto(Calendar data_Vcto) {
        this.data_Vcto = data_Vcto;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Calendar getData_Pgto() {
        return data_Pgto;
    }

    public void setData_Pgto(Calendar data_Pgto) {
        this.data_Pgto = data_Pgto;
    }

    public Double getValor_Pgto() {
        return valor_Pgto;
    }

    public void setValor_Pgto(Double valor_Pgto) {
        this.valor_Pgto = valor_Pgto;
    }
   
     
}
