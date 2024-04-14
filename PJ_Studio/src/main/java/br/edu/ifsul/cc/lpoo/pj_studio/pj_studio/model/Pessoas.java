
package br.edu.ifsul.cc.lpoo.pj_studio.pj_studio.model;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author luana
 */
//@Entity 
public abstract class Pessoas implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)//id sequencial
    private Integer id;
    
    @Column(name = "Nome")
    private String nome;
    
    @Column(name = "Telefone")
    private String telefone;
    
    @Column(name = "Aniversario")
    private Calendar data_aniversario;
    
    @Column(name = "E-mail")
    private String email;
    
    @Column(name = "Endereço")
    private String endereco;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Calendar getData_aniversario() {
        return data_aniversario;
    }

    public void setData_aniversario(Calendar data_aniversario) {
        this.data_aniversario = data_aniversario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    
}
