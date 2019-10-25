package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;




@Controller
public class HomeController {





    @RequestMapping("/Homepage")
    public String Homepage() {
        return "Homepage";
    }

    @RequestMapping("/lipsum")
    public String lipsum() {
        return "lipsum";
    }

    @RequestMapping("/MyProfile")
    public String MyProfile() {
        return "MyProfile";
    }

    @RequestMapping("/AboutTheBootcamp")
    public String AboutTheBootcamp() {
        return "AboutTheBootcamp";

    }

    @RequestMapping("/github1")
    public String github1() {
        return "github1";

    }

    @RequestMapping("/github2")
    public String github2() {
        return "github2";
    }

    @RequestMapping("/")
    public String Start() {
        return "Homepage";

    }
}

