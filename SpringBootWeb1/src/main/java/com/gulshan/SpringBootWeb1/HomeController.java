package com.gulshan.SpringBootWeb1;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.HttpSessionActivationListener;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){
        System.out.println("Home method called");
         return "index";
    }

//    @RequestMapping("add")
//    public String add(HttpServletRequest req , HttpSession session){ // Here the object is assigned by the spring framework automatically
//        System.out.println("In add");
//
//        int num1=Integer.parseInt(req.getParameter("num1")); //getParameter() method is used to get the values from the req object
//        int num2=Integer.parseInt(req.getParameter("num2"));
//        int result = num1+num2;
//
//        session.setAttribute("result",result);
//        System.out.println(result);
//        return "result";

    @RequestMapping("add")
    public String add(@RequestParam("num1") int num1, @RequestParam("num2") int num2, HttpSession session){ //instead of using the HttpServletRequest req object  we can directly pass the variable as parameter as well this avoids us to get the data from the req object.

        int result = num1+num2 + 1;

        session.setAttribute("result",result);

        return "result";
    }

}

