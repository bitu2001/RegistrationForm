package com.registration.form.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.registration.form.UserRegistration;

@Component
@Repository

public interface User extends CrudRepository<UserRegistration, Long>{

}
