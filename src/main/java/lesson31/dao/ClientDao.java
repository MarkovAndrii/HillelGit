package lesson31.dao;


import lesson31.entity.Client;

import java.util.List;

public interface ClientDao {
    void create(Client client);

    void update(Client client);

    void delete(Client client);

    Client getById(int id);

    List<Client> getAll();

    Client getByPhone(Long phone);
}
