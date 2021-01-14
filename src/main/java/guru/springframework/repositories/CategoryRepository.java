package guru.springframework.repositories;

import guru.springframework.domain.Category;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by efilin on 14.01.2021.
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {
}
