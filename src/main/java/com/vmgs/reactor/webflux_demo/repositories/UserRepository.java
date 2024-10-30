package com.vmgs.reactor.webflux_demo.repositories;

import com.vmgs.reactor.webflux_demo.model.User;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends ReactiveCrudRepository<User, String> {
}
