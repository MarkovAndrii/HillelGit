package lesson25Practice.service;

import lesson25Practice.dao.OwnerDao;
import lesson25Practice.entity.Owner;

public class OwnerService {
    private OwnerDao ownerDao = new OwnerDao();

    public void save(Owner owner) {
        System.out.println("Owner for save: " + owner);
        ownerDao.save(owner);

    }
}
