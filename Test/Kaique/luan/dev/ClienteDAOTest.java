package Kaique.luan.dev;

import Kaique.luan.dev.dao.ClienteDAOMock;
import Kaique.luan.dev.dao.IClienteDAO;
import Kaique.luan.dev.domain.Cliente;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ClienteDAOTest {
    private IClienteDAO clienteDAO;

    private Cliente cliente;

    public ClienteDAOTest() {
        clienteDAO = new ClienteDAOMock();
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
        clienteDAO.salvar(cliente);
    }

    @Test
    public void pesquisarCliente() {
        Cliente clienteConsulta = clienteDAO.buscarPorCpf(cliente.getCpf());

        Assert.assertNotNull(clienteConsulta);
    }

    @Test
    public void excluirCliente() {
        clienteDAO.excluir(cliente.getCpf());
    }
}
