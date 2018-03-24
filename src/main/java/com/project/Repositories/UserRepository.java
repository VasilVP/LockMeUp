package com.project.Repositories;

import com.project.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by VasilVp on 3/24/2018.
 */

@Repository
public interface UserRepository extends JpaRepository<User, Long> {


}
