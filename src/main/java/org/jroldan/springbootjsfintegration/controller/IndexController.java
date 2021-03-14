package org.jroldan.springbootjsfintegration.controller;

import org.springframework.stereotype.Component;

import javax.faces.view.ViewScoped;

@Component
@ViewScoped
public class IndexController {

    private String greeting;

    public void helloWorld(){
        setGreeting("helloWorld");
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
}
