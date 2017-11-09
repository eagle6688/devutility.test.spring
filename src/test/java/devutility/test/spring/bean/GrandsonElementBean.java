package devutility.test.spring.bean;

public class GrandsonElementBean extends SonElementBean {
	public GrandsonElementBean(ElementBean elementBean) {
		super(elementBean);
	}

	public void doSomething() {
		System.out.println("Execute GrandsonElementBean doSomething.");
		super.doSomething();
	}
}