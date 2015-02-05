package com.leonardoz.cditech.math;

import java.lang.reflect.Method;
import java.util.Arrays;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

import com.leonardoz.cditech.identifiers.Audit;

@Interceptor
@Audit
public class OperationsInterceptor {

	@AroundInvoke
	public Object auditExecutedOperations(InvocationContext ctx)
			throws Exception {
		Method method = ctx.getMethod();
		System.out.println("Método: " + method.getName());
		System.out.println("Parâmetros: ");
		Arrays.stream(method.getParameters()).forEach(
				p -> System.out.print(p.getName()));
		System.out.println("Ok");
		return ctx.proceed();
	}

}
