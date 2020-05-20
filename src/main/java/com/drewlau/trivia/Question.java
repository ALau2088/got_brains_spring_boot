package com.drewlau.trivia;

//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;

import java.io.Serializable;

//@Entity
public class Question implements Serializable {
  // private @Id @GeneratedValue Long id;
  public int index;
  public String num;
  // public String problem;
  // public String[] answers;
  // public String correctAnswer;

  // Question(int index, String num, String problem, String[] answers, String
  // correctAnswer) {
  // this.index = index;
  // this.num = num;
  // this.problem = problem;
  // this.answers = answers;
  // this.correctAnswer = correctAnswer;
  // }
  Question(int index, String num) {
    this.index = index;
    this.num = num;
  }
}