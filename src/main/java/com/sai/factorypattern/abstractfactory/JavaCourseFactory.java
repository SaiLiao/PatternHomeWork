package com.sai.factorypattern.abstractfactory;

import com.sai.factorypattern.ICourse;
import com.sai.factorypattern.JavaCourse;

/**
 * @ClassName JavaCourseFactory
 * @Author sai
 * @Date 2019-04-23 10:35
 **/
public class JavaCourseFactory implements ICourseFactory {

    public ICourse createCourse() {
        return new JavaCourse();
    }

    public INote createNote() {
        return new JavaNote();
    }

    public IVideo createVideo() {
        return new JavaVideo();
    }
}
