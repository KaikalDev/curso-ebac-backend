package Kaique.luan.dev.services.generic;

import Kaique.luan.dev.dao.ClienteDAO;
import Kaique.luan.dev.dao.IClienteDAO;
import Kaique.luan.dev.dao.generic.GenericDAO;
import Kaique.luan.dev.dao.generic.IGenericDAO;
import Kaique.luan.dev.domain.Cliente;
import Kaique.luan.dev.domain.Persistente;
import Kaique.luan.dev.exeptions.TipoChaveNaoEncontradaException;

import java.util.Collection;
import java.util.List;

public abstract class GenericSevice<T extends Persistente> implements IGenericService<T> {

    private IGenericDAO clienteDAO;

    public abstract Class<T> getTipoClasse();

    public abstract void atualiarDados(T entity, T entityCadastrado);

    public GenericSevice(IGenericDAO dao) {
        this.clienteDAO = dao;
    }

    @Override
    public Boolean cadastrar(T entity) throws TipoChaveNaoEncontradaException {
        return clienteDAO.cadastrar(entity);
    }

    @Override
    public void excluir(Long valor) {
        clienteDAO.excluir(valor);
    }

    @Override
    public void alterar(T entity) throws TipoChaveNaoEncontradaException {
        clienteDAO.alterar(entity);
    }

    @Override
    public T consultar(Long valor) {
        T entity = (T) clienteDAO.consultar(valor);
        return entity;
    }
}
