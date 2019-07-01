package com.zen.service;

import com.zen.domain.Role;

import java.util.List;

public interface IRoleService {
    public List<Role> findAll() throws Exception;

    public void save(Role role) throws Exception;

    public List<Role> findOtherRole(String userId) throws Exception;


    public Role findById(String id) throws Exception;

    public void addPermissionToRole(String roleId, String[] ids);
}
