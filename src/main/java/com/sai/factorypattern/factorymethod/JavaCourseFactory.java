package com.sai.factorypattern.factorymethod;

import com.sai.factorypattern.ICourse;
import com.sai.factorypattern.JavaCourse;

/**
 * @ClassName JavaCourseFactory
 * @Author sai
 * @Date 2019-04-23 10:24
 **/
public class JavaCourseFactory implements CourseFactory {

    public ICourse create() {

        return new JavaCourse();

    }
}
