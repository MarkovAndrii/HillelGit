package lesson29.dao;

import lesson29.entity.Account;

public interface AccountDao {
    void create(Account account);

    void update(Account account);

    void delete(Account account);

    Account getById(int id);
}
