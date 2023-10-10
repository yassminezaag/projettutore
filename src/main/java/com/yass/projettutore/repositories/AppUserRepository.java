package com.yass.projettutore.repositories;

import com.yass.projettutore.entities.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser,String> {
}
