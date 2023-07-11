package wy.springeventdemo.context;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @Author:王艺
 * @Project:learn
 * @File:ApplicationContextHolder
 * @Date:2023/7/11 16:14
 */
@Component
public class ApplicationContextHolder implements ApplicationContextAware {
    private ApplicationContext applicationContext;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext=applicationContext;
    }
    public ApplicationContext getApplicationContext(){
        return applicationContext;
    }
}
