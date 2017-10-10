package deepshikha.springframework.recipe.Repositories;

import deepshikha.springframework.recipe.Domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * @author Deepshikha chaudhary on 10/9/2017
 */
public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {

    Optional<UnitOfMeasure> findByDescription(String description);
}
