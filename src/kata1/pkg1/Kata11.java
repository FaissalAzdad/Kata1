package kata1.pkg1;

import java.util.Date;

public class Kata11 {

    public static void main(String[] args) {
        Person person = new Person("Rubén", new Date(49, 9, 4));
        System.out.println(person.getName() + " tiene " + person.getAge()+ " años");
    }
}
