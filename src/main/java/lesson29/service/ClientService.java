package lesson29.service;

import lesson29.dao.ClientDao;
import lesson29.dao.ClientDaoImpl;
import lesson29.entity.Client;
import org.apache.log4j.Logger;

import java.util.List;

public class ClientService {
    private final ClientDao clientDao = new ClientDaoImpl();

    private final Logger logger = Logger.getLogger(ClientService.class);

    public void create(Client client) {
        logger.debug(String.format("create: %s", client));
        clientDao.create(client);
    }

    public void update(Client client) {
        logger.debug(String.format("update: %s", client));
        clientDao.update(client);
    }

    public Client getById(int id) {
        logger.debug(String.format("getById: %d", id));
        return clientDao.getById(id);
    }

    public void delete(Client client) {
        logger.debug(String.format("delete: %s", client));
        clientDao.delete(client);
    }

    public List<Client> getAll() {   // interlayer method
        logger.debug("getAll");
        return clientDao.getAll();
    }

    public Client getByPhone(Long phone) {
        logger.debug(String.format("getByPhone: %d", phone));
        return clientDao.getByPhone(phone);
    }
}
