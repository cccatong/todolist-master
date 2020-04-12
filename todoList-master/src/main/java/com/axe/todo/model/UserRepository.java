package com.axe.todo.model;
//模型

import com.axe.todo.entity.Todo;
import com.axe.todo.entity.User;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.util.List;


public interface UserRepository extends CrudRepository<User, Long> {

    @Override
    List<User> findAll();



}
