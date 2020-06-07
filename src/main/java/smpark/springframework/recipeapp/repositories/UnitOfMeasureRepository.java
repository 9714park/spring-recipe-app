package smpark.springframework.recipeapp.repositories;

import org.springframework.data.repository.CrudRepository;
import smpark.springframework.recipeapp.domain.Category;
import smpark.springframework.recipeapp.domain.UnitOfMeasure;

import java.util.Optional;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
        Optional<UnitOfMeasure> findByDescription(String description);
}
