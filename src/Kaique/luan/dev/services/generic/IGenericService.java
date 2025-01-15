package Kaique.luan.dev.services.generic;

import Kaique.luan.dev.domain.Persistente;
import Kaique.luan.dev.exeptions.TipoChaveNaoEncontradaException;

import java.util.Collection;

public interface IGenericService <T extends Persistente> {

    public Boolean cadastrar(T entity) throws TipoChaveNaoEncontradaException;

    public void excluir(Long valor);

    public void alterar(T entity) throws TipoChaveNaoEncontradaException;

    public T consultar(Long valor);
}
