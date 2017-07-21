package hello;
import org.springframework.data.repository.CrudRepository;

import hello.Person;

public interface UserRepository extends CrudRepository<Person, Long>{

}
