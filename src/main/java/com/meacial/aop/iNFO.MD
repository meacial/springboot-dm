# SpringFramework开启AOP的方式
> 方法一(通过配置文件开启)
```
    <aop:aspectj-autoproxy/>
```
> 方法二(通过注解@EnableAspectJAutoProxy)

# SpringBoot中开启AOP的方式
> SpringBoot中，只需要引入spring-boot-starter-aop依赖就OK了，在application.properties中加入配置spring.aop.auto=true，默认是开启的
>

# 引用
> EnableAspectJAutoProxy
> https://segmentfault.com/a/1190000007469982
> 
