package lesson26.service;

import lesson26.dao.RoleDao;
import lesson26.entity.Role;

public class RoleService {
    private RoleDao roleDao = new RoleDao();

    public void save(Role role){
        roleDao.save(role);
    }
}
