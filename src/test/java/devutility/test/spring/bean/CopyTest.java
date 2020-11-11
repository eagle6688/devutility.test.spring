package devutility.test.spring.bean;

import org.springframework.beans.BeanUtils;

import devutility.internal.test.BaseTest;
import devutility.internal.test.TestExecutor;
import devutility.test.model.Member;

public class CopyTest extends BaseTest {
	@Override
	public void run() {
		Member member = new Member();
		member.setId(1001);
		member.setName("Tester 10001");

		Member member1 = new Member();
		BeanUtils.copyProperties(member, member1);
		member1.setId(10002);
		member1.setName("Tester 10002");

		Member member2 = new Member();
		BeanUtils.copyProperties(member, member2);
		member2.setId(10003);
		member2.setName("Tester 10003");

		println(member.toString());
		println(member1.toString());
		println(member2.toString());
	}

	public static void main(String[] args) {
		TestExecutor.run(CopyTest.class);
	}
}