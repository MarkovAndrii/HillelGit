package lesson25.dao;

import lesson25.model.Status;

public interface StatusDao {
    void create(Status status);

    void update(Status status);

    void delete(Status status);

    Status getById(int id);
}
