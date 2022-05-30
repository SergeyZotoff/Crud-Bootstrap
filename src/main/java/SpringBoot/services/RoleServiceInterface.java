package SpringBoot.services;

import SpringBoot.models.Role;

import java.util.List;

public interface RoleServiceInterface {
    List<Role> findAll();
}
