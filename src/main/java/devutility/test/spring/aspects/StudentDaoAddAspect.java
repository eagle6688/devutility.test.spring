package devutility.test.spring.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class StudentDaoAddAspect {
	private final String messageFormat = "\"%s\" advice when executing add method in StudentDao.";

	@Pointcut("execution(* devutility.test.spring.dao.interfaces.StudentDao.add(..))")
	private void thisPointcut() {
	}

	@Before("thisPointcut()")
	public void before() {
		System.out.println(String.format(messageFormat, "@Before"));
	}

	@org.aspectj.lang.annotation.AfterReturning(value = "thisPointcut()", returning = "result")
	public void AfterReturning(Object result) {
		System.out.println(String.format(messageFormat, "@AfterReturning"));
		System.out.println(String.format("From @AfterReturning, Method result: %d", result));
	}

	@Around("thisPointcut()")
	public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println(String.format(messageFormat, "@Around"));
		System.out.println("before around advice.");
		Object result = (Object) joinPoint.proceed();
		System.out.println(String.format("From @Around, method result: %s", String.valueOf(result)));
		System.out.println("after around advice.");
		return result;
	}

	@AfterThrowing(value = "thisPointcut()", throwing = "e")
	public void afterThrowable(Throwable e) {
		System.out.println(String.format(messageFormat, "@AfterThrowing"));
		System.out.println(String.format("An exception occurred: %s", e.getMessage()));
	}

	@After(value = "thisPointcut()")
	public void after() {
		System.out.println(String.format(messageFormat, "@After"));
	}
}