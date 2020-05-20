package com.drewlau.trivia;

import org.springframework.data.repository.CrudRepository;

public interface TriviaRepository extends CrudRepository<Trivia, Long> {
}