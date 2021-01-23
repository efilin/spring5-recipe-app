package guru.springframework.services;

import guru.springframework.commands.IngredientCommand;

/**
 * Created by efilin on 23.01.2021.
 */
public interface IngredientService {

    IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long ingredientId);

    IngredientCommand saveIngredientCommand(IngredientCommand command);
}
