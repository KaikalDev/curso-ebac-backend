package Kaique.luan.dev.services;

import Kaique.luan.dev.dao.ClienteDAO;
import Kaique.luan.dev.dao.IClienteDAO;
import Kaique.luan.dev.dao.generic.IGenericDAO;
import Kaique.luan.dev.domain.Cliente;
import Kaique.luan.dev.exeptions.TipoChaveNaoEncontradaException;
import Kaique.luan.dev.services.generic.GenericSevice;

import java.util.Collection;
import java.util.List;

public class ClienteService extends GenericSevice<Cliente> implements IClienteService {

    public ClienteService(IGenericDAO dao) {
        super(dao);
    }

    @Override
    public Class<Cliente> getTipoClasse() {
        return Cliente.class;
    }

    @Override
    public void atualiarDados(Cliente entity, Cliente entityCadastrado) {

    }
}
