package com.yunjae;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by USER on 2018-03-26.
 */
@Entity
@Data
@NoArgsConstructor
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String text;

    private boolean done;

    public Todo(String text) {
        this.text = text;
    }

    public Todo(String text, boolean done) {
        this.text = text;
        this.done = done;
    }

    public void toggleDone() {
        setDone(!isDone());
    }
}
