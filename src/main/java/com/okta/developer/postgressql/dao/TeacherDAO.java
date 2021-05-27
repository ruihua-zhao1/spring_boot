package com.okta.developer.postgressql.dao;

import com.okta.developer.postgresql.entities.Teacher;
import org.springframework.data.repository.CrudRepository;
import java.util.UUID;

public interface TeacherDAO extends CrudRepository<Teacher, UUID> {}