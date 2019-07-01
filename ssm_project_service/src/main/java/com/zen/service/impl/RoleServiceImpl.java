package com.zen.service.impl;

import com.zen.dao.IRoleDao;
import com.zen.domain.Role;
import com.zen.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("roleService")
@Transactional
public class RoleServiceImpl implements IRoleService {

    @Autowired
    private IRoleDao roleDao;


    @Override
    public List<Role> findOtherRole(String userId) throws Exception {

        return roleDao.findOtherRole(userId);
    }

    @Override
    public Role findById(String id) throws Exception {
        return roleDao.findById(id);
    }


    @Override
    public List<Role> findAll() throws Exception {
        return roleDao.findAll();
    }

    @Override
    public void save(Role role) throws Exception {
        roleDao.save(role);
    }

    @Override
    public void addPermissionToRole(String roleId, String[] ids) {
        for (String id : ids) {
            roleDao.addPermissionToRole(id, roleId);
        }
    }
}
