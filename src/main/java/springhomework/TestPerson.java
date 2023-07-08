package springhomework;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPerson {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-homework.xml");
        Person person = context.getBean(Person.class,"Dima", 45, "Petrov", "male");
        System.out.println(" Имя: " + person.getName() + "\n" + " Возраст: " + person.getAge() + "\n" + " Фамилия: " + person.getSurname() + "\n" + " Пол: " + person.getGender());
    }
}
