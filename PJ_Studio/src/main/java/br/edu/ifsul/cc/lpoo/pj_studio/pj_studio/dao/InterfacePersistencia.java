
package br.edu.ifsul.cc.lpoo.pj_studio.pj_studio.dao;

/**
 *
 * @author luana
 */
public interface InterfacePersistencia {
    public Boolean conexaoAberta();
    public void fecharConexao();
    public Object find(Class c, Object id) throws Exception;
    public void persist(Object o) throws Exception;
    public void remover(Object o) throws Exception;
    public void update(Object o) throws Exception;
}
