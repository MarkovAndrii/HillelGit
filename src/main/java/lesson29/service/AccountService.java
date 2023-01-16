package lesson29.service;

import lesson29.dao.AccountDao;
import lesson29.dao.AccountDaoImpl;
import lesson29.entity.Account;
import org.apache.log4j.Logger;

public class AccountService {
    private final AccountDao accountDao = new AccountDaoImpl();
    private final Logger logger = Logger.getLogger(AccountService.class);

    public void create(Account account) {
        logger.debug(String.format("create: %s", account));
        accountDao.create(account);
    }

    public void update(Account account) {
        logger.debug(String.format("update: %s", account));
        accountDao.update(account);
    }

    public Account getById(int id) {
        logger.debug(String.format("getById: %d", id));
        return accountDao.getById(id);
    }

    public void delete(Account account) {
        logger.debug(String.format("delete: %s", account));
        accountDao.delete(account);
    }
}