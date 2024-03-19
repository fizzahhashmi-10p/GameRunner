package org.example.gamerunner.Context;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age, Address address){} // Automatically defines constructor, getter setter etc
record Address(String Street){}

@Configuration
public class MyConfiguration {
    @Bean
    public String name(){
        return "Fizzah";
    }

    @Bean
    public int age(){
        return 24;
    }

    @Bean
    public Person person(){
        return new Person("Ali", 28,  new Address("Example street"));
    }

    @Bean
    @Primary
    public Person PersonCallMethod(){
        return new Person(name(),age(),address());
    }

    @Bean
    public Person PersonQualifier(String name, int age,@Qualifier("AddressQual") Address address2){
        return new Person(name,age, address2);
    }


    @Bean
    public Address address(){
        return new Address("ABC street");
    }

    @Bean
    @Qualifier("AddressQual")
    public Address address2(){
        return new Address("XYZ Qualifier street");
    }

}
