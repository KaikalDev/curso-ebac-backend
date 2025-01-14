package Kaique.luan.dev.dao;

import Kaique.luan.dev.domain.Cliente;
import Kaique.luan.dev.generic.GenericDAO;

public class ClienteDAO extends GenericDAO<Cliente> implements IClienteDAO{
    @Override
    public Class<Cliente> getTipoClasse() {
        return Cliente.class;
    }

    @Override
    public void atualiarDados(Cliente entity, Cliente entityCadastrado) {

    }
}
