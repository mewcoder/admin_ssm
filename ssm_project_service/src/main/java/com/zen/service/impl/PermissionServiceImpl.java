package com.zen.service.impl;

import com.zen.dao.IPermissionDao;
import com.zen.domain.Permission;
import com.zen.service.IPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("permissionService")
@Transactional
public class PermissionServiceImpl implements IPermissionService {

    @Autowired
    private IPermissionDao permissionDao;


    @Override
    public List<Permission> findAll() throws Exception {

        return permissionDao.findAll();
    }


    @Override
    public void save(Permission permission) throws Exception {
        permissionDao.save(permission);
    }

    @Override
    public List<Permission> findOtherPermission(String roleId) throws Exception {
        return permissionDao.findOtherPermission(roleId);
    }


}
