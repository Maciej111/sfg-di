package guru.springframework.sfgdi.controllers;

import org.springframework.stereotype.Controller;

/**
 * Created by MP on 2021-04-11
 */
@Controller
public class FirstController {

    public String sayHello(){
        System.out.println("Hello");
        return "Hi this is me the controller";
    }
}
