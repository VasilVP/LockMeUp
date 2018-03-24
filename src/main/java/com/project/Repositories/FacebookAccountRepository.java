package com.project.Repositories;

import com.project.entities.FacebookAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacebookAccountRepository extends JpaRepository<FacebookAccount, Long>{


}
