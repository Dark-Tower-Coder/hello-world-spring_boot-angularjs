package de.towersweb.helloworld.helloworldspring_bootangularjs.repository;

import de.towersweb.helloworld.helloworldspring_bootangularjs.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}

