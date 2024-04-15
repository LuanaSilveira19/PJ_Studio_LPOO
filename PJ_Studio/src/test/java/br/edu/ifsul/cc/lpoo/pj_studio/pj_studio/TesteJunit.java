package br.edu.ifsul.cc.lpoo.pj_studio.pj_studio;

import br.edu.ifsul.cc.lpoo.pj_studio.pj_studio.dao.PercistenciaJPA;
import br.edu.ifsul.cc.lpoo.pj_studio.pj_studio.model.Contratos;
import br.edu.ifsul.cc.lpoo.pj_studio.pj_studio.model.FormaPgto;
import br.edu.ifsul.cc.lpoo.pj_studio.pj_studio.model.Modalidades;
import br.edu.ifsul.cc.lpoo.pj_studio.pj_studio.model.Pacotes;
import br.edu.ifsul.cc.lpoo.pj_studio.pj_studio.model.Pagamentos;
import static java.lang.Double.parseDouble;
import java.text.DecimalFormat;
import java.util.Calendar;
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

    @Test
    public void testePersistenciaModalidade() throws Exception {

        // criar meu obj Produto
        Modalidades m = new Modalidades();
        m.setDescricao("Dança Livre");

        Modalidades m2 = new Modalidades();
        m2.setDescricao("FitDance");

        Modalidades m3 = new Modalidades();
        m3.setDescricao("Gluteos");

        jpa.persist(m);
        jpa.persist(m2);
        jpa.persist(m3);
        
        Contratos c = new Contratos();
        c.setData_inicio(Calendar.getInstance());
        c.setForma_pgto(FormaPgto.PIX);
        jpa.persist(c);

        Pagamentos p1 = new Pagamentos();
        p1.setData_Pgto(Calendar.getInstance());
        p1.setData_Vcto(Calendar.getInstance());
        p1.setValor(200.463728);
        p1.setValor_Pgto(240.985346);
        p1.setContratos(c);
        jpa.persist(p1);

        //VER SOBRE O ID, EM CADA TABELA ELE CONTINUA A SEQUENCIA, NÃO INICIA NOVAMENTE DO 1
        //DecimalFormat formato = new DecimalFormat("###.##");
        //double resultadoFormatado = parseDouble(formato.format(540.94767));   //NÃO FUNCIONOU DESSA MANEIRA
        Pacotes pc = new Pacotes();
        pc.setDescricao("testando pacotes");
        //pc.setValor(resultadoFormatado);
        pc.setModalidade(m3);
        pc.setValor(540.94767);
        jpa.persist(pc);

        // buscar objeto persistido
        Modalidades persistidoModalidade = (Modalidades) jpa.find(Modalidades.class, m.getId());//ver se tem necessidade de fazer o mesmo pro m2 e m3

        // verificar se objeto persistido é igual ao criado
        Assert.assertEquals(m.getDescricao(), persistidoModalidade.getDescricao());

    }

}
