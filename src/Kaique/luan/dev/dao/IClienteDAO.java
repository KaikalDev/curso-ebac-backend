package Kaique.luan.dev.dao;

import Kaique.luan.dev.domain.Cliente;

public interface IClienteDAO {
    Boolean salvar(Cliente cliente);

    Cliente buscarPorCpf(Long cpf);

    void excluir(Long cpf);
}
