package pl.iamkonradkrakowiecki.spring5recipeapp.services;

import pl.iamkonradkrakowiecki.spring5recipeapp.commands.UnitOfMeasureCommand;

import java.util.Set;

public interface UnitOfMeasureService {
    Set<UnitOfMeasureCommand> listAllUoms();
}
