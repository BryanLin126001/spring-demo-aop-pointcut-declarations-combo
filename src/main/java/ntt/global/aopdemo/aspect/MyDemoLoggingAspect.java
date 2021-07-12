package ntt.global.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect
{
    @Pointcut("execution(public *  ntt.global.aopdemo.*.*.* (..))")
    private void forDaoPackage(){}

    @Pointcut("execution(public *  ntt.global.aopdemo.dao.AccountDAO.get*(..))")
    private void forGetter(){}

    @Pointcut("execution(public *  ntt.global.aopdemo.dao.AccountDAO.set*(..))")
    private void forSetter(){}

    @Pointcut("forDaoPackage() && !(forSetter() || forGetter())")
    private void forAllExcludeGetterAndSetter(){}


    @Before("forAllExcludeGetterAndSetter()")
    public void beforeAddAccountAdvice()
    {
        System.out.println("=====> logging before method running !!!");
    }

    @Before("forAllExcludeGetterAndSetter()")
    public void performApiAnalytics()
    {
        System.out.println("=====> logging Perform API Analytics !!!");
    }
}
