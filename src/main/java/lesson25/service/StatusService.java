package lesson25.service;

import lesson25.dao.StatusDao;
import lesson25.dao.StatusDaoImpl;
import lesson25.model.Status;

public class StatusService {

    private StatusDao statusDao = new StatusDaoImpl();

    public void create(Status status) {
        statusDao.create(status);
    }

    public void update(Status status) {
        statusDao.update(status);
    }

    public Status getById(int id) {
        Status status = statusDao.getById(id);
        return status;
    }

    public void delete(Status status) {
        statusDao.delete(status);
    }

}
