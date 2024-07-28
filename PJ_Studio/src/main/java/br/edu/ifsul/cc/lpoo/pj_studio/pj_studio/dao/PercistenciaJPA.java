package br.edu.ifsul.cc.lpoo.pj_studio.pj_studio.dao;

import br.edu.ifsul.cc.lpoo.pj_studio.pj_studio.model.Modalidades;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 *
 * @author luana
 */
public class PercistenciaJPA implements InterfacePersistencia {

     EntityManagerFactory factory; //fabrica de gerenciadores de entidades
     EntityManager entity; //gerenciador de entidades JPA

    public PercistenciaJPA() {
        //parametro: é o nome da unidade de persistencia (Persistence Unit)
        factory = Persistence.createEntityManagerFactory("pu_studio_danca");
        //conecta no bd e executa a estratégia de geração.
        entity = factory.createEntityManager();
    }

    @Override
    public Boolean conexaoAberta() {
        return entity.isOpen();
    }

    @Override
    public void fecharConexao() {
        entity.close();
    }

    @Override
    public Object find(Class c, Object id) throws Exception {
        return entity.find(c, id);
    }

    @Override
    public void persist(Object o) throws Exception {
        entity.getTransaction().begin();
        entity.persist(o);
        entity.getTransaction().commit();
    }

    @Override
    public void remover(Object o) throws Exception {
        entity.getTransaction().begin();
        entity.remove(o);
        entity.getTransaction().commit();
    }
    
     @Override
    public void update(Object o) throws Exception {
         entity.getTransaction().begin();
        entity.merge(o);
        entity.getTransaction().commit();
       
    }
       public void adicionarModalidade(String descricao) {
        entity.getTransaction().begin();
        Modalidades modalidade = new Modalidades();
        modalidade.setDescricao(descricao);
        entity.persist(modalidade);
        entity.getTransaction().commit();
    }
       
      public List<Modalidades> getModalidades() {
        TypedQuery<Modalidades> query = entity.createQuery("SELECT m FROM Modalidades m", Modalidades.class);
        return query.getResultList();
    }
     
    

}
