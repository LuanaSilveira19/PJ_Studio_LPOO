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
import javax.persistence.OneToMany;

/**
 *
 * @author luana
 */
@Entity //mapeia uma tabela no BD com o mesmo nome da classe
//caso precise mudar usar o @Table (name="outro_nome"), isso fara com que mude o nome do BD
public class Modalidades implements Serializable {//implements Serializable diz que o dado vai ser jogado linha a linha pro BD

    @Id// notação que define a chave primaria na tabela
    @GeneratedValue(strategy = GenerationType.SEQUENCE)//id sequencial
    private Integer id;

    //nullable=false diz que é obrigatorio
    @Column(nullable = false, length = 155, name = "Descrição")//Modifica o nome da coluna do BD, por padrão o valor não é not null
    private String descricao;
    
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
