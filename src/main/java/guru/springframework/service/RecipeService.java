package guru.springframework.service;

import guru.springframework.domain.Recipe;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by efilin on 14.01.2021.
 */
public interface RecipeService {

    Set<Recipe> getRecipes();
}
