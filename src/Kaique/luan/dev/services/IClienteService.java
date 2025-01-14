package Kaique.luan.dev.services;

import Kaique.luan.dev.domain.Cliente;

public interface IClienteService {
    Boolean salvar(Cliente cliente);

    Cliente buscarPorCpf(Long cpf);

    void excluir(Long cpf);
}
