package lesson29.service;

import lesson29.dao.StatusDao;
import lesson29.dao.StatusDaoImpl;
import lesson29.entity.Status;
import org.apache.log4j.Logger;

public class StatusService {

    private final StatusDao statusDao = new StatusDaoImpl();

    private final Logger logger = Logger.getLogger(StatusService.class);

    public void create(Status status) {
        logger.debug(String.format("create: %s", status));
        statusDao.create(status);
    }

    public void update(Status status) {
        logger.debug(String.format("update: %s", status));
        statusDao.update(status);
    }

    public Status getById(int id) {
        logger.debug(String.format("getById: %d", id));
        return statusDao.getById(id);
    }

    public void delete(Status status) {
        logger.debug(String.format("delete: %s", status));
        statusDao.delete(status);
    }
}
