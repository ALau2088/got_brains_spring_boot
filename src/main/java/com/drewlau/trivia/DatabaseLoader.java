package com.drewlau.trivia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {
  private final TriviaRepository repository;

  @Autowired
  public DatabaseLoader(final TriviaRepository repository) {
    this.repository = repository;
  }

  @Override
  public void run(final String... strings) throws Exception {
    final Question[] addition;
    addition = new Question[1];
    // addition[0] = new Question(0, "Question 1", "1 + 1 = ?", new String[] { "2", "3", "4", "5" }, "2");
    addition[0] = new Question(0, "Question 1");
    this.repository.save(new Trivia("Addition", addition));
    System.out.println(new Trivia("Addition", addition));
  }
}