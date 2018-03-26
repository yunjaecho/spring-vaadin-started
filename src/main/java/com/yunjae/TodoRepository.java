package com.yunjae;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

/**
 * Created by USER on 2018-03-26.
 */
public interface TodoRepository extends JpaRepository<Todo, Long> {
    @Transactional
    void deleteByDone(boolean done);
}
