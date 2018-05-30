package devutility.test.spring.bean;

import devutility.internal.test.TestExecutor;
import devutility.test.spring.BaseTest;

public class BeanConfigOverrideTest extends BaseTest {
	@Override
	public void run() {
		TestBean testBean = applicationContext.getBean(TestBean.class);
		println(testBean.getId());
	}

	public static void main(String[] args) {
		TestExecutor.run(BeanConfigOverrideTest.class);
	}
}