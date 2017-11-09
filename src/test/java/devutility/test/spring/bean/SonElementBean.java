package devutility.test.spring.bean;

public class SonElementBean extends ElementBean {
	private ElementBean elementBean;

	public SonElementBean(ElementBean elementBean) {
		this.elementBean = elementBean;
	}

	public void doSomething() {
		System.out.println("Execute SonElementBean doSomething.");
		elementBean.doSomething();
	}
}