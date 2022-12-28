package lesson25.dao;

import lesson25.model.Client;

import java.util.List;

public interface ClientDao {
    void create(Client client);

    void update(Client client);

    void delete(Client client);

    Client getById(int id);

    List<Client> getAll();

    Client getByPhone(Long phone);
}
