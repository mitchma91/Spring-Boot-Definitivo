package com.mitchma91.mitchManuel.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mitchma91.mitchManuel.entity.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long>{

	public Role findByName(String Role);
}
