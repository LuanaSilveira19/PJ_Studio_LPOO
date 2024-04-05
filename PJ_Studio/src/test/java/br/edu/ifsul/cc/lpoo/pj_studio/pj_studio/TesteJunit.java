
package br.edu.ifsul.cc.lpoo.pj_studio.pj_studio;

import br.edu.ifsul.cc.lpoo.pj_studio.pj_studio.model.Modalidades;
import org.eclipse.persistence.jpa.jpql.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author luana
 */
public class TesteJunit {
    
   PersistenciaJPA jpa = new PersistenciaJPA();
    
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
         Modalidades persistidoModalidade = (Modalidades)jpa.find(Modalidades.class, m.getId());//mudar pra M2 M3
         
         // verificar se objeto persistido é igual ao criado
         
         Assert.assertEquals(m.getDescricao(),persistidoModalidade.getDescricao());
         
         
         
     }
}
