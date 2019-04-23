package com.sai.factorypattern.factorymethod;

import com.sai.factorypattern.ICourse;
import com.sai.factorypattern.PythonCourse;

/**
 * @ClassName PythonCourseFactory
 * @Author sai
 * @Date 2019-04-23 10:25
 **/
public class PythonCourseFactory implements CourseFactory {

    public ICourse create() {

        return new PythonCourse();

    }
}
