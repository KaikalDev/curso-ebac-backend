package Kaique.luan.dev;

import Kaique.luan.dev.dao.ClienteDAO;
import Kaique.luan.dev.dao.ClienteDAOMock;
import Kaique.luan.dev.dao.IClienteDAO;
import Kaique.luan.dev.domain.Cliente;
import Kaique.luan.dev.services.ClienteService;
import Kaique.luan.dev.services.IClienteService;
import org.junit.Assert;
import org.junit.Test;

public class ClienteTest {

    private IClienteService clienteService;

    public ClienteTest() {
        IClienteDAO dao = new ClienteDAOMock();
        clienteService = new ClienteService(dao);
    }

    @Test
    public void pesquisarCliente() {
        Cliente cliente = new Cliente();
        cliente.setCpf(12312312312L);
        cliente.setNome("Kaique");
        cliente.setCidade("Teixeira");
        cliente.setEnd("End");
        cliente.setEstado("PB");
        cliente.setNumero(10);
        cliente.setTel(99999999999L);

        clienteService.salvar(cliente);

        Cliente clienteConsulta = clienteService.buscarPorCpf(cliente.getCpf());

        Assert.assertNotNull(clienteConsulta);
    }
}
