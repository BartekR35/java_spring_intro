package pl.edu.vistula.java_spring_intro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.Model;

@Controller
//@RestController
public class HelloController {

    @GetMapping(value = "/")
    @ResponseBody
    public String hello() {
        return "Hello Vistula. This is my first Spring Controller.";
    }

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required = false, defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        return "greetings.html";
    }
    //http://localhost:8080/greeting?name=Vistula

}
