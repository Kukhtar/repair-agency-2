package com.kukhtar.repairagency2.repo;

import com.kukhtar.repairagency2.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
}
