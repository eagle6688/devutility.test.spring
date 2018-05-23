package devutility.test.spring.dao.interfaces;

import com.devutility.test.entity.mongo.Student;

public interface StudentDao {
	int add(Student entity);

	boolean update(Student entity);

	boolean delete(int id);

	Student find(int id);
}