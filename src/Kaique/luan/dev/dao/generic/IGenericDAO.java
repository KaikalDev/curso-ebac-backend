package Kaique.luan.dev.dao.generic;

import Kaique.luan.dev.domain.Persistente;
import Kaique.luan.dev.exeptions.TipoChaveNaoEncontradaException;

import java.util.Collection;

public interface IGenericDAO <T extends Persistente> {

    public Boolean cadastrar(T entity) throws TipoChaveNaoEncontradaException;

    public void excluir(Long valor);

    public void alterar(T entity) throws TipoChaveNaoEncontradaException;

    public T consultar(Long valor);

    public Collection<T> buscarTodos();
}
