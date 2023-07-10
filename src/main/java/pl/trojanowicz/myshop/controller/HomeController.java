package pl.trojanowicz.myshop.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    //Endpoint na jakim wywołuje się metoda
    @GetMapping("/")
    public String home(){
        return "home";
    }
}
