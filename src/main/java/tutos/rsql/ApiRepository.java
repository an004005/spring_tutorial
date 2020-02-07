package tutos.rsql;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ApiRepository extends JpaRepository<ApiTable, String> {
    Optional<ApiTable> findByUserNo(Integer userNo);
}
