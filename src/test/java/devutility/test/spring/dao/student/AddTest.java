package devutility.test.spring.dao.student;

import devutility.internal.test.TestExecutor;
import devutility.internal.test.data.model.Student;
import devutility.test.spring.BaseTest;
import devutility.test.spring.dao.interfaces.StudentDao;

public class AddTest extends BaseTest {
	@Override
	public void run() {
		StudentDao studentDao = applicationContext.getBean(StudentDao.class);

		if (studentDao == null) {
			return;
		}

		Student student = Student.students(1).get(0);
		studentDao.add(student);

		System.out.println("=====================Next test case==========================");

		studentDao.add(student);
	}

	public static void main(String[] args) {
		TestExecutor.run(AddTest.class);
	}
}