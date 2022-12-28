package lesson25.service;

import lesson25.dao.ClientDao;
import lesson25.dao.ClientDaoImpl;
import lesson25.model.Client;

import java.util.List;

public class ClientService {    // logic execution
    private ClientDao clientDao = new ClientDaoImpl();

    public void create(Client client) {
        //some logic...
        clientDao.create(client);
    }

    public void update(Client client) {
        clientDao.update(client);
    }

    public Client getById(int id) {
        Client client = clientDao.getById(id);
        //some logic...
        return client;
    }

    public void delete(Client client) {
        clientDao.delete(client);
    }


    public List<Client> getAll() {   // interlayer method
        return clientDao.getAll();
    }

    public Client getByPhone(Long phone) {
        Client client = clientDao.getByPhone(phone);
        return client;
    }
}
