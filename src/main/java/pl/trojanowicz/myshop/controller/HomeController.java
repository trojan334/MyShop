package pl.trojanowicz.myshop.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.trojanowicz.myshop.model.Item;

import java.math.BigDecimal;

@Controller
public class HomeController {

    //Endpoint na jakim wywołuje się metoda
    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("item", new Item("Ołówek", BigDecimal.valueOf(4.5),"https://proxer.com.pl/gfx/big/1543225907.31.jpg"));
        return "home";
    }
}
