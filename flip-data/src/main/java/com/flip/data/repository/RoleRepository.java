package com.flip.data.repository;

import com.flip.data.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author just4 on 09/09/2021
 */
public interface RoleRepository extends JpaRepository<Role, Long> {

    List<Role> getRolesByIdIn(List<Long> roleIds);
}
