package me.vmachohan.lab3;

import me.vmachohan.lab3.pojo.Person;
import net.datafaker.Faker;

import java.util.Locale;

public class PersonGenerator {

    public Person generateRandomPerson(){
        Faker faker = new Faker(Locale.of("uk"));
        String fullName = faker.name().fullName();

        System.out.println(fullName);


        return null;
    }
}
