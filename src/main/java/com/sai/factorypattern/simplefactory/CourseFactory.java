package com.sai.factorypattern.simplefactory;

import com.sai.factorypattern.ICourse;

/**
 * @ClassName CourseFactory
 * @Author sai
 * @Date 2019-04-23 07:59
 **/
public class CourseFactory {

//    public ICourse create(String name) {
//
//        if ("java".equals(name)) {
//            return new JavaCourse();
//        } else if ("python".equals(name)) {
//            return new PythonCourse();
//        } else {
//            return null;
//        }
//
//    }

//    public ICourse create(String className) {
//
//        ICourse course = null;
//
//        try {
//
//            course = (ICourse) Class.forName(className).newInstance();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        return course;
//    }


    public ICourse create(Class claz) {

        ICourse course = null;

        try {

            course = (ICourse) claz.newInstance();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return course;
    }

}
