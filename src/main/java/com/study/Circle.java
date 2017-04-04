package com.study;

//import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import java.net.SocketOptions;


/**
 * Created by Max on 28.03.2017.
 */

//@Controller
public class Circle implements Shape {

    private Point center;
    //private ApplicationEventPublisher publisher;

    /*public MessageSource getMessageSource() {
        return messageSource;
    }
    public void setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }*/
    //@Autowired
    //private MessageSource messageSource;
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
        System.out.println("Circle: Point is: (" + center.getX() + ", " + center.getY() + ")");
        //System.out.println(this.messageSource.getMessage("drawing.circle", null, "Default Drawing Message", null ));
        //System.out.println(this.messageSource.getMessage("drawing.point", new Object[] {center.getX(), center.getY()}, "Default Point Message", null));
        //DrawEvent drawEvent = new DrawEvent(this);
        //publisher.publishEvent(drawEvent);
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }
    /*//@Resource
    public void setCenter(Point center) {
        this.center = center;
    }
    //@PostConstruct
    public void initializeCircle() {
        System.out.println("Init of Circle");
    }
    //@PreDestroy
    public void destroyCircle() {
        System.out.println("Destroy of Circle");
    }
    //@Override
    public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }*/
}
