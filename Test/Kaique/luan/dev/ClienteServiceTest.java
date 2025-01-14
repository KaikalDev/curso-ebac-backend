package Kaique.luan.dev;

import Kaique.luan.dev.dao.ClienteDAOMock;
import Kaique.luan.dev.dao.IClienteDAO;
import Kaique.luan.dev.domain.Cliente;
import Kaique.luan.dev.services.ClienteService;
import Kaique.luan.dev.services.IClienteService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ClienteServiceTest {

    private IClienteService clienteService;

    private Cliente cliente;

    public ClienteServiceTest() {
        IClienteDAO dao = new ClienteDAOMock();
        clienteService = new ClienteService(dao);
    }

    @Before
    public void init() {
        cliente = new Cliente();
        cliente.setCpf(12312312312L);
        cliente.setNome("Kaique");
        cliente.setCidade("Teixeira");
        cliente.setEnd("End");
        cliente.setEstado("PB");
        cliente.setNumero(10);
        cliente.setTel(99999999999L);
        clienteService.salvar(cliente);
    }

    @Test
    public void pesquisarCliente() {
        Cliente clienteConsulta = clienteService.buscarPorCpf(cliente.getCpf());

        Assert.assertNotNull(clienteConsulta);
    }

    @Test
    public void salvarCliente() {
        Boolean retorno = clienteService.salvar(cliente);

        Assert.assertTrue(retorno);
    }

    @Test
    public void excluirCliente() {
        clienteService.excluir(cliente.getCpf());
    }
}
