package in.ashokittech.repository;

import org.springframework.data.repository.CrudRepository;

import in.ashokittech.entity.User;

public interface UserRepository extends CrudRepository<User, Integer>{

}
