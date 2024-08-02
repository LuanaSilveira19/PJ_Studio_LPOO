
package br.edu.ifsul.cc.lpoo.pj_studio.pj_studio;

import br.edu.ifsul.cc.lpoo.pj_studio.pj_studio.dao.PercistenciaJPA;
import br.edu.ifsul.cc.lpoo.pj_studio.pj_studio.model.Alunos;
import br.edu.ifsul.cc.lpoo.pj_studio.pj_studio.model.Contratos;
import br.edu.ifsul.cc.lpoo.pj_studio.pj_studio.model.FolhaPagamento;
import br.edu.ifsul.cc.lpoo.pj_studio.pj_studio.model.FormaPgto;
import br.edu.ifsul.cc.lpoo.pj_studio.pj_studio.model.Modalidades;
import br.edu.ifsul.cc.lpoo.pj_studio.pj_studio.model.Pacotes;
import br.edu.ifsul.cc.lpoo.pj_studio.pj_studio.model.Pagamentos;
import br.edu.ifsul.cc.lpoo.pj_studio.pj_studio.model.Professores;
import java.util.Calendar;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author luana
 */
public class TestePersistenciaProfessor {
    
     PercistenciaJPA jpa = new PercistenciaJPA();
    
    public TestePersistenciaProfessor() {
    }
    
    @Before
    public void setUp() {
        jpa.conexaoAberta();
    }
    
    @After
    public void tearDown() {
        jpa.fecharConexao();
    }

    @Test
    public void test() throws Exception {
        // Criação das Entidades
       
        
        
        Alunos a1= new Alunos();
        a1.setNome("Luana");
        
        jpa.persist(a1); 
        
        Contratos c1 = new Contratos();
        c1.setAlunos(a1);
        c1.setDataInicio(Calendar.getInstance());
        c1.setForma_pgto(FormaPgto.PIX);
        c1.setValor(56);
        
        jpa.persist(c1); 
        
        Professores prof1 = new Professores();
        prof1.setNome("Joao da Silva");
        prof1.setFone("+55(54)90123-1233");
        prof1.setDataAdmissao(Calendar.getInstance());

        jpa.persist(prof1); 
        
        Professores prof2 = new Professores();
        prof2.setNome("Carla Monteiro");
        prof2.setFone("+55(54)87654-1233");
        prof2.setDataAdmissao(Calendar.getInstance());

        jpa.persist(prof2); 
        
        
        FolhaPagamento f1 = new FolhaPagamento();
        f1.setDataPgto(Calendar.getInstance());
        f1.setValorReceber(12999);
         jpa.persist(f1);
        // Persistência das Entidades em Ordem Correta
        // Aluno deve ser persistido antes de Contrato
        // Professor deve ser persistido antes de FolhaPagamento
       
    // FolhaPagamento deve ser persistida após Professor
    }
}
