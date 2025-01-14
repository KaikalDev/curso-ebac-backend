package Kaique.luan.dev.dao;

import Kaique.luan.dev.domain.Cliente;

public interface IClienteDAO {
    void salvar(Cliente cliente);

    Cliente buscarPorCpf(Long cpf);
}
