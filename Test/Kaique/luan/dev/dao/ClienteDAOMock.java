package Kaique.luan.dev.dao;

import Kaique.luan.dev.domain.Cliente;

public class ClienteDAOMock implements IClienteDAO{
    @Override
    public Boolean salvar(Cliente cliente) {
        return true;
    }

    @Override
    public Cliente buscarPorCpf(Long cpf) {
        Cliente cliente = new Cliente();
        cliente.setCpf(cpf);
        return cliente;
    }

    @Override
    public void excluir(Long cpf) {

    }
}
