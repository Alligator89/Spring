package springhomework;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@ComponentScan("springhomework")
public class TestPerson {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-homework.xml");
        Person person = context.getBean("person",Person.class);
        person.setName("Dima");
        person.setAge(45);
        person.setSurname("Petrov");
        person.setGender("male");
        System.out.println(" Имя: " + person.getName() + "\n" + " Возраст: " + person.getAge() + "\n" + " Фамилия: " + person.getSurname() + "\n" + " Пол: " + person.getGender());
    }
}
