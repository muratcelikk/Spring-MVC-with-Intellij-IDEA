package murat.celik.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){
      //  return "/WEB-INF/jsp/home.jsp";
        return "home";
    }
}
