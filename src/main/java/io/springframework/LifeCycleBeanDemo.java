package io.springframework;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifeCycleBeanDemo implements InitializingBean, BeanNameAware,
        DisposableBean, BeanFactoryAware, ApplicationContextAware {

    public LifeCycleBeanDemo() {
        System.out.println("I am the LifeCycleBean constructor");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("## Bean factory has been set");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("## My bean name is: " + s);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("## The LifeCycle bean has been terminated");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("## The LifeCycle bean has it's properties set");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("## Application context has been set");

    }

    @PostConstruct
    public void postConstruct()
    {
        System.out.println("## The PostConstruct annotated method has been called");
    }

    @PreDestroy
    public void preDestroy()
    {
        System.out.println("## The PreDestroy annotated method has been called");
    }

    public void beforeInit()
    {
        System.out.println("## - Before Init - Called by Bean Post Processor");
    }

    public void afterInit()
    {
        System.out.println("## - After Init - Called by Bean Post Processor");
    }
}
