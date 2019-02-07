package pe.oh29oh29.album.repository;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

@Repository
@Profile("!dev")
public interface CategoryJpaRepository extends CategoryRepository {
}
