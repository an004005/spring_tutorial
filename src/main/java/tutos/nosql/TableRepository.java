package tutos.nosql;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


public interface TableRepository extends MongoRepository<Table, String> {

}
