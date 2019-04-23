package com.sai.factorypattern.simplefactory;

import com.sai.factorypattern.JavaCourse;
import com.sai.factorypattern.PythonCourse;

/**
 * @ClassName CourseFactoryTest
 * @Author sai
 * @Date 2019-04-23 08:01
 **/
public class CourseFactoryTest {

    public static void main(String[] args) {

        CourseFactory factory = new CourseFactory();
//        factory.create("com.sai.factorypattern.JavaCourse").record();
//        factory.create("com.sai.factorypattern.PythonCourse").record();
//        factory.create("...").record();
        factory.create(JavaCourse.class).record();
        factory.create(PythonCourse.class).record();

    }

}
