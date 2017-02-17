
package edu.infsci2560.repositories;

import edu.infsci2560.models.Recipe;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author xinyi
 */
public interface RecipeRepository extends PagingAndSortingRepository<Recipe, Long> {}