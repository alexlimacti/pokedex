package com.indeas.reactiveweb.repository;

import com.indeas.reactiveweb.model.Pokemon;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

@Configuration
public interface PokemonRepository extends ReactiveMongoRepository<Pokemon, String> {
}
