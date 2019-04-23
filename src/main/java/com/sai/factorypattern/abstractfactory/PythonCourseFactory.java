package com.sai.factorypattern.abstractfactory;

import com.sai.factorypattern.ICourse;
import com.sai.factorypattern.PythonCourse;

/**
 * @ClassName PythonCourseFactory
 * @Author sai
 * @Date 2019-04-23 10:38
 **/
public class PythonCourseFactory implements ICourseFactory {

    public ICourse createCourse() {
        return new PythonCourse();
    }

    public INote createNote() {
        return new PythonNote();
    }

    public IVideo createVideo() {
        return new PythonVideo();
    }
}
