package devutility.test.spring.dao.impls;

import java.security.InvalidParameterException;

import org.springframework.stereotype.Repository;

import com.devutility.test.entity.mongo.Student;

import devutility.internal.util.RandomHelper;
import devutility.test.spring.dao.interfaces.StudentDao;

@Repository
public class StudentDaoImpl implements StudentDao {
	@Override
	public int add(Student entity) {
		System.out.println("Add user ......");

		if (entity.getId() == 0) {
			throw new InvalidParameterException("Id for Student entity cannot be 0!");
		}

		return RandomHelper.getNumber(100);
	}

	@Override
	public boolean update(Student entity) {
		System.out.println("Update user ......");

		if (entity.getId() == 0) {
			throw new InvalidParameterException("Id for Student entity cannot be 0!");
		}

		return true;
	}

	@Override
	public boolean delete(int id) {
		System.out.println(String.format("Delete user with id: %d ......", id));
		return false;
	}

	@Override
	public Student find(int id) {
		Student entity = Student.list(0).get(0);
		entity.setId(id);
		return entity;
	}
}