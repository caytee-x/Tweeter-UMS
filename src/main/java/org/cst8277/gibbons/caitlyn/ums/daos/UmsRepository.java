package org.cst8277.gibbons.caitlyn.ums.daos;

import org.cst8277.gibbons.caitlyn.ums.dtos.Roles;
import org.cst8277.gibbons.caitlyn.ums.dtos.User;

import java.util.Map;
import java.util.UUID;
public interface UmsRepository {

    Map<UUID, User> findAllUsers();

    Map<String, Roles> findAllRoles();

    User findUserByID(UUID userId);

    UUID createUser(User user);

    int deleteUser(UUID userId);
}
