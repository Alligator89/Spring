package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class TestAspect {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TestAspect.class);
        Book book = context.getBean("book", Book.class);
        book.editArticle();
        book.publishArticle();
        book.releaseBook();
    }
}
