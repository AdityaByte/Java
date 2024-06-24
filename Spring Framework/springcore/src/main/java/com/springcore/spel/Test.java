package com.springcore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.Expression;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/spel/spelconfig.xml");
        Demo demo = context.getBean("demo" , Demo.class);
        System.out.println(demo);

        // You can create expression with the help of api but this method is not so convinient
        SpelExpressionParser spelExpressionParser = new SpelExpressionParser();
        Expression temp = (Expression) spelExpressionParser.parseExpression("8>6?88:66");
        System.out.println(temp.getValue()); // return 88

    }
}
