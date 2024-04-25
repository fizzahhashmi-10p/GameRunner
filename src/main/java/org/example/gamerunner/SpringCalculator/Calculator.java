package org.example.gamerunner.SpringCalculator;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.Arrays;

interface DataServices{
    int[] retrievedData();
}

@Component @Primary
class MongoDBServices implements DataServices{
    @Override
    public int[] retrievedData() {
        return new int[] {1,1,3,55,6,8};
    }
}

@Component
class SQLDBServices implements DataServices{
    @Override
    public int[] retrievedData() {
        return new int[] {16,23,55,6,8,99};
    }
}


@Component
class BusinessCalculator{
    DataServices dataServices;
    public BusinessCalculator(DataServices dataServices){
        super();
        this.dataServices = dataServices;
    }
    public int findMax(){
        return Arrays.stream(dataServices.retrievedData()).max().orElse(0);
    }
}

@Configuration
@ComponentScan
public class Calculator {
    public static void main(String[] args){
        var context = new AnnotationConfigApplicationContext(Calculator.class);
        System.out.println(context.getBean(BusinessCalculator.class).findMax());
    }
}
