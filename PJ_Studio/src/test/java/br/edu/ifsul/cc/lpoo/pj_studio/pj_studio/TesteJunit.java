
package br.edu.ifsul.cc.lpoo.pj_studio.pj_studio;

import br.edu.ifsul.cc.lpoo.pj_studio.pj_studio.dao.PercistenciaJPA;
import br.edu.ifsul.cc.lpoo.pj_studio.pj_studio.model.Modalidades;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author luana
 */
public class TesteJunit {
    
   PercistenciaJPA jpa = new PercistenciaJPA();
    
    public TesteJunit() { 
    }
    
    @Before // o que fazer antes da persistencia
    public void setUp() {
        jpa.conexaoAberta();
    }
    
    @After
    public void tearDown() {
        jpa.fecharConexao();
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void testePersistenciaModalidade() throws Exception {
         // criar meu obj Produto
         Modalidades m = new Modalidades();
         m.setDescricao("Dança Livre");
         
         Modalidades m2 = new Modalidades();
         m2.setDescricao("FitDance");
         
         Modalidades m3 = new Modalidades();
         m3.setDescricao("Gluteos");
         // persistir objeto 
         jpa.persist(m);
         jpa.persist(m2);
         jpa.persist(m3);
         
         // buscar objeto persistido
         Modalidades persistidoModalidade = (Modalidades)jpa.find(Modalidades.class, m.getId());//ver se tem necessidade de fazer o mesmo pro m2 e m3
         
         // verificar se objeto persistido é igual ao criado
        Assert.assertEquals(m.getDescricao(),persistidoModalidade.getDescricao());
         
         
         
     }
}
