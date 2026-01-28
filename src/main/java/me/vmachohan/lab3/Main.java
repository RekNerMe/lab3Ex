package me.vmachohan.lab3;

import me.vmachohan.lab3.pojo.Person;

import org.apache.fory.BaseFory;
import org.apache.fory.Fory;
import org.apache.fory.config.Language;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        BaseFory fory = Fory.builder().withLanguage(Language.JAVA).requireClassRegistration(true).build();

        fory.register(Person.class);

        Person person = new Person("Ivan", "123123123123", 12, LocalDate.now());
        var serPer = fory.serialize(person);

        Person p1 = new PersonGenerator().generateRandomPerson();

    }
}