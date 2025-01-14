package Kaique.luan.dev.services;

import Kaique.luan.dev.domain.Cliente;

public interface IClienteService {
    void salvar(Cliente cliente);

    Cliente buscarPorCpf(Long cpf);
}
