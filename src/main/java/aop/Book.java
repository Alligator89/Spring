package aop;

import org.springframework.stereotype.Component;

@Component
public class Book {
    public void editArticle() {
        System.out.println("Статья редактируется...");
    }

    public void publishArticle() {
        System.out.println("Статья публикуется...");
    }

    public String releaseBook() {
        return "Oscar Wilde : " + "The Old Man And The Sea";
    }
}


