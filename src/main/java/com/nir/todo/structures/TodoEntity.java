package com.nir.todo.structures;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class TodoEntity {
  @Id
  @GeneratedValue
  private Long id;

  private String content;
  private String date;

  public void setContent(String content) {
    this.content = content;
  }

  public String getContent() {
    return this.content;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public String getDate() {
    return this.date;
  }
}
