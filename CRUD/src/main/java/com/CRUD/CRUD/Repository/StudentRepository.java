package com.CRUD.CRUD.Repository;

import com.CRUD.CRUD.Model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository  extends CrudRepository<Student, Integer> {
}
