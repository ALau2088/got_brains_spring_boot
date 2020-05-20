package com.drewlau.trivia;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Trivia {
  private @Id @GeneratedValue Long id;
  private String genre;
  private Object[] questions;

  private Trivia() {
  }

  public Trivia(String genre, Object[] questions) {
    this.genre = genre;
    this.questions = questions;
  }

  @Override
  public int hashCode() {
    return Objects.hash(genre);
  }

  public void setId(Long id) {
    this.id = id;
  }
}