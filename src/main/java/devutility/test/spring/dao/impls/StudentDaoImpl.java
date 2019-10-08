package devutility.test.spring.dao.impls;

import java.security.InvalidParameterException;

import org.springframework.stereotype.Repository;

import devutility.internal.lang.StringUtils;
import devutility.internal.test.data.model.Student;
import devutility.internal.util.RandomUtils;
import devutility.test.spring.dao.interfaces.StudentDao;

@Repository
public class StudentDaoImpl implements StudentDao {
	@Override
	public int add(Student entity) {
		System.out.println("Add user ......");

		if (StringUtils.isNullOrEmpty(entity.getNumber())) {
			throw new InvalidParameterException("Number for Student entity cannot be null!");
		}

		return RandomUtils.getNumber(100);
	}

	@Override
	public boolean update(Student entity) {
		System.out.println("Update user ......");

		if (StringUtils.isNullOrEmpty(entity.getNumber())) {
			throw new InvalidParameterException("Number for Student entity cannot be null!");
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
		Student entity = Student.students(0).get(0);
		entity.setNumber(String.valueOf(id));
		return entity;
	}
}