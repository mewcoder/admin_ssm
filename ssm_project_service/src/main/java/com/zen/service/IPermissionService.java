package com.zen.service;

import com.zen.domain.Permission;

import java.util.List;

public interface IPermissionService {


    public List<Permission> findAll() throws Exception;

    public void save(Permission permission) throws Exception;

    public List<Permission> findOtherPermission(String roleId) throws Exception;


}
