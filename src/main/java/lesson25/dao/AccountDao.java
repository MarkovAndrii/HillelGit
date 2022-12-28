package lesson25.dao;

import lesson25.model.Account;

public interface AccountDao {
    void create(Account account);

    void update(Account account);

    void delete(Account account);

    Account getById(int id);
}
