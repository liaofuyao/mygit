package com.colin.dao;

import com.colin.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Colin on 2017/12/21.
 */
@Repository
public interface RoleReponsitory extends JpaRepository<Role,Long> {
}
