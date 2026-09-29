package com.gulshan.SpringBootWeb1;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.HttpSessionActivationListener;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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

//    @RequestMapping("add")
//    public String add(@RequestParam("num1") int num1, @RequestParam("num2") int num2, HttpSession session){ //instead of using the HttpServletRequest req object  we can directly pass the variable as parameter as well this avoids us to get the data from the req object.
//
//        int result = num1+num2 + 1;
//
//        session.setAttribute("result",result);
//
//        return "result";
//    }

    @RequestMapping("add")
    public ModelAndView add(@RequestParam("num1") int num1, @RequestParam("num2") int num2, ModelAndView mv){
//        add(@RequestParam(num1) int num, int num2, Model model)//instead of using the HttpSession session  object  we can directly pass the Model model object  as parameter as well.

        int result = num1+ num2 + 1;
//        model.addAttribute("result",result); //we are using the model to add the data
        mv.addObject("result", result);
        mv.setViewName("result");

        return mv; // instead of returning the view "result"  the viewresolver will look at  the mv object which will have to things the data as well as the view
    }

}

