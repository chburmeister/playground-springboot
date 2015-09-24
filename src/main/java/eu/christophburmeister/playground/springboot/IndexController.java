package eu.christophburmeister.playground.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
 
@Controller
class IndexController {
 
    @RequestMapping("/")
    String index() {
        return "index";
    }
}