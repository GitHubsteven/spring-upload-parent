package pers.asa.springuploadparent.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import pers.asa.springuploadparent.support.Loggable;

import java.lang.reflect.Method;
import java.util.Date;

/**
 * @version 1.0.0
 * @author: rongbin.xie
 * @date: 2020/3/19
 * @CopyRight: COPYRIGHT © 2001 - 2019 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 **/
@Aspect
@Component
public class LogAspect implements Loggable {
    @Pointcut(value = "execution(* pers.asa.springuploadparent.controller.*.*(*))")
    private void business() {
    }

    @Around("business()")
    public Object log(ProceedingJoinPoint pjp) throws Throwable {
        MethodSignature methodSignature = (MethodSignature) pjp.getSignature();
        Object target = pjp.getTarget();
        Method method = target.getClass().getMethod(methodSignature.getName(), methodSignature.getParameterTypes());

        logger.info("method:{} start at:{}", method.getName(), new Date());
        Object result = pjp.proceed();
        logger.info("method:{} end at:{}", method.getName(), new Date());
        return result;
    }
}
