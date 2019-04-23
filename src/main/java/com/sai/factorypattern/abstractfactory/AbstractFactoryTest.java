package com.sai.factorypattern.abstractfactory;

/**
 * @ClassName AbstractFactoryTest
 * @Author sai
 * @Date 2019-04-23 10:41
 **/
public class AbstractFactoryTest {

    public static void main(String[] args) {

        ICourseFactory factory = new JavaCourseFactory();
        factory.createCourse().record();
        factory.createNote().note();
        factory.createVideo().video();

        factory = new PythonCourseFactory();
        factory.createCourse().record();
        factory.createNote().note();
        factory.createVideo().video();
    }

}
