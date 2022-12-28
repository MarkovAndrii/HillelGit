package lesson25.service;

import lesson25.dao.AccountDao;
import lesson25.dao.AccountDaoImpl;
import lesson25.model.Account;

public class AccountService {
    private AccountDao accountDao = new AccountDaoImpl();

    public void create(Account account) {
        accountDao.create(account);
    }

    public void update(Account account) {
        accountDao.update(account);
    }

    public Account getById(int id) {
        Account account = accountDao.getById(id);
        return account;
    }

    public void delete(Account account) {
        accountDao.delete(account);
    }
}
