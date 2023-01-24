package lesson31.service;


import lesson31.dao.ClientDao;
import lesson31.dao.ClientDaoImpl;
import lesson31.entity.Client;
import lesson31.exception.WrongClientException;
import org.apache.log4j.Logger;

import java.util.List;

public class ClientService {
    private final ClientDao clientDao = new ClientDaoImpl();

    private final Logger logger = Logger.getLogger(ClientService.class);

    public void create(Client client) throws WrongClientException {
        logger.debug(String.format("create: %s", client));
        if (client.getName().length() > 20 || !client.getEmail().contains("@")) {
            throw new WrongClientException("client name or email is incorrect");
        }
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
