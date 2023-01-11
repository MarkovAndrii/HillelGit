package lesson26.service;

import lesson26.dao.ClientDao;
import lesson26.entity.Client;
import lesson26.entity.House;

public class ClientService {

    private ClientDao clientDao = new ClientDao();

    public void save(Client client, House house) {
        clientDao.save(client, house);
    }
}
