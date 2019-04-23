package com.sai.factorypattern.abstractfactory;

import com.sai.factorypattern.ICourse;

/**
 * @InterfaceName ICourseFactory
 * @Author sai
 * @Date 2019-04-23 10:32
 **/
public interface ICourseFactory {

    ICourse createCourse();

    INote   createNote();

    IVideo  createVideo();

}
