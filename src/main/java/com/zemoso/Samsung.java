package com.zemoso;


import org.springframework.beans.factory.annotation.Autowired;


public class Samsung{

    @Autowired
    MobileProcessor mobileProcessor;

    @Autowired
    Speaker speaker;


    public void getConfig(){
        System.out.println("speaker "+ speaker.getProperty()+" CPU "+ mobileProcessor.getProperty());
    }
}
