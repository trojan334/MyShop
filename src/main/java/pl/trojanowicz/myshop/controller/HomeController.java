package pl.trojanowicz.myshop.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    //Endpoint na jakim wywołuje się metoda
    @GetMapping("/")
    //napis zwrócony przez metodę zostanie wyświetlony w przeglądarce
    @ResponseBody
    public String home(){
        return """
                <html>
                <body>
                <h2 style="color:red;">MyShop</h2>
                </body>
                </html>
                """;
    }
}
