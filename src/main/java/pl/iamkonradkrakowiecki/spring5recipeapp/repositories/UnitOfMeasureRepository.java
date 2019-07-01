package pl.iamkonradkrakowiecki.spring5recipeapp.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.iamkonradkrakowiecki.spring5recipeapp.domain.UnitOfMeasure;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
}
