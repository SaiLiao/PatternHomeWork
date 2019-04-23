package com.sai.factorypattern.factorymethod;

/**
 * @ClassName FactoryMethodTest
 * @Author sai
 * @Date 2019-04-23 10:27
 **/
public class FactoryMethodTest {

    public static void main(String[] args) {

        CourseFactory factory = new JavaCourseFactory();
        factory.create().record();
        factory = new PythonCourseFactory();
        factory.create().record();

    }

}
