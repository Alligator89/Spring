package aop;

import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import java.time.LocalTime;

@EnableAspectJAutoProxy
@Component
@Aspect
public class MyAspect {
    @Before("execution(public void editArticle())")
    public void editStartLogger() {
        System.out.println("Редактирование статьи началось...");
        System.out.println(LocalTime.now());
    }

    @Before("execution(public void publishArticle())")
    public void finishEditLogger() {
        System.out.println("Редактирование завершилось...");
        System.out.println(LocalTime.now());
    }

    @Before("execution(public void publishArticle())")
    public void publishStartLogger() {
        System.out.println("Публикация статьи началась...");
        System.out.println(LocalTime.now());
    }

    @Before("execution(public String releaseBook())")
    public void releaseStartLogger() {
        System.out.println("Публикация завершилась...");
        System.out.println(LocalTime.now());
    }

    @AfterReturning(value = "execution(public String releaseBook())", returning = "book")
    public void releaseLogger(Object book) {
        System.out.println(LocalTime.now() + " Книга выпущена..." + book.toString());
    }
}

