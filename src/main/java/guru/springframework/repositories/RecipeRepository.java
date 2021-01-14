package guru.springframework.repositories;

import guru.springframework.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by efilin on 14.01.2021.
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
