package com.qst.logger;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @Author: XiPeng
 * @Description:
 * @Date: Create in 16:04 2020/9/16
 * @Modified by:
 */
@Aspect
@Component
public class UserServiceLogger {
    Logger logger = Logger.getLogger(UserServiceLogger.class);
//    前置增强
    @Before(value = "execution(* com.qst..*.*(..))")
    public void before(JoinPoint joinPoint){
        logger.info("调用"+joinPoint.getTarget()+"的"+joinPoint.getSignature().getName()
                +"方法。方法入参："+ Arrays.toString(joinPoint.getArgs()));
    }
//    后置增强
    @AfterReturning(value = "execution(* com.qst..*.*(..))",returning = "result")
    public void after(JoinPoint joinPoint,Object result){
        logger.info("调用"+joinPoint.getTarget()+"的"+joinPoint.getSignature().getName()
                +"方法。返回："+ result);
    }
//    异常增强
    @AfterThrowing(value = "execution(* com.qst..*.*(..))",throwing = "exception")
    public void afterThrowing(JoinPoint joinPoint,RuntimeException exception){
        logger.info("调用"+joinPoint.getTarget()+"的"+
                joinPoint.getSignature().getName()
                +"方法。异常："+ exception);
    }
//    最终增强
    @After(value = "execution(* com.qst..*.*(..))")
    public void afterout(){
        logger.info("程序结束");
    }
//    环绕增强
    @Around(value = "execution(* com.qst..*.*(..))")
    public Object around(ProceedingJoinPoint joinPoint){
        logger.info("环绕调用"+joinPoint.getTarget()+"的"+joinPoint.getSignature().getName()
                +"方法。方法入参："+ Arrays.toString(joinPoint.getArgs()));
        Object result = null;
        try {
            result = joinPoint.proceed();
            logger.info("环绕调用"+joinPoint.getTarget()+"的"+joinPoint.getSignature().getName()
                    +"方法。返回："+ result);
        }catch (RuntimeException e){
            logger.info("环绕调用"+joinPoint.getTarget()+"的"+
                    joinPoint.getSignature().getName()
                    +"方法。异常："+ e);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }finally {
            logger.info("环绕程序结束");
        }
        return result;
    }
}
