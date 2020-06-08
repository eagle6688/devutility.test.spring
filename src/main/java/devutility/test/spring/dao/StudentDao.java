package devutility.test.spring.dao;

import devutility.test.model.Student;

public interface StudentDao {
	int add(Student entity);

	boolean update(Student entity);

	boolean delete(int id);

	Student find(int id);
}