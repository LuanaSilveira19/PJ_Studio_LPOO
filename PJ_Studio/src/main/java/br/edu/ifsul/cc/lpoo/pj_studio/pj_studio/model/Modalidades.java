
package br.edu.ifsul.cc.lpoo.pj_studio.pj_studio.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author luana
 */
@Entity //mapeia uma tabela no BD com o mesmo nome da classe
        //caso precise mudar usar o @Table (name="outro_nome"), isso fara com que mude o nome do BD
public class Modalidades implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)//id sequencial
    public Integer id;
    
    @Column(name = "Descrição")//Modifica o nome da coluna do BD
    public String descricao;

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
    
    
}
