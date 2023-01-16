package lesson29.dao;

import lesson29.entity.Client;

import java.util.List;

public interface ClientDao {
    void create(Client client);

    void update(Client client);

    void delete(Client client);

    Client getById(int id);

    List<Client> getAll();

    Client getByPhone(Long phone);
}
