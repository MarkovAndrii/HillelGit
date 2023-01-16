package lesson29.dao;


import lesson29.entity.Status;

public interface StatusDao {
    void create(Status status);

    void update(Status status);

    void delete(Status status);

    Status getById(int id);
}
