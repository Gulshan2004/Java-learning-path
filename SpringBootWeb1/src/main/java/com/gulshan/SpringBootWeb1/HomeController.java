package com.gulshan.SpringBootWeb1;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.HttpSessionActivationListener;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller //this is my controller
public class HomeController {

    @ModelAttribute("course")
    public String courseName(){
        return "java";
    }

    @RequestMapping("/") // to map this home method with the url we use the requestmapping annotation
    public String home() {
        System.out.println("Home method called");
        return "index";
    }

/*   @RequestMapping("add")
    public String add(HttpServletRequest req , HttpSession session){ // Here the object is assigned by the spring framework automatically
        System.out.println("In add");

        int num1=Integer.parseInt(req.getParameter("num1")); //getParameter() method is used to get the values from the req object
        int num2=Integer.parseInt(req.getParameter("num2"));
        int result = num1+num2;

        session.setAttribute("result",result);
        System.out.println(result);
        return "result";
      } */

/*    @RequestMapping("add")
    public String add(@RequestParam("num1") int num, @RequestParam("num2") int num2, HttpSession session){ //instead of using the HttpServletRequest req object  we can directly pass the variable as parameter as well this avoids us to get the data from the req object.
    // NOTE:-@RequestParam("num1") int num ,  it means whtever data I am getting in num1 will be assigned to num also  it is optional when the variable name is same
        int result = num+num2 + 1;
        session.setAttribute("result",result);
        return "result";
    } */

//NOTE:- TILL NOW WE WERE ABLE TO GET RID OF THE HttpServletRequest Parameter now we will get rid of HttpSession

//TO  Transfer data between the controller and view we use an object which is called modelObject



    @RequestMapping("add")
    public ModelAndView add(@RequestParam("num1") int num1, @RequestParam("num2") int num2, ModelAndView mv){//instead of using the Model Object we can use  ModelView mv object
//  public String add(@RequestParam(num1) int num, int num2, Model model)//instead of using the HttpSession session  object  we can directly pass the Model model object  as parameter as well which can pass data between Pages.
        int result = num1+ num2 + 1;
//      model.addAttribute("result",result); //we are using the model to add the data
        mv.addObject("result", result); //adding the data to modelview object
        mv.setViewName("result"); //setting the view name
        return mv; // instead of returning the view "result"  the viewresolver will look at  the mv object which will have to things the data as well as the view
    }

    @RequestMapping("addAlien")
    public String addAlien(Alien alien){ //@RequestParam("aid") int aid, @RequestParam("aname") String aname
        //ModelAttribute is Optional it works behind the scene
//      @RequestParam("aid") int aid, @RequestParam("aname") String aname , instead of passing mutliple parameters we can directly use the ModelAttribute
//        Alien alien = new Alien();
//        alien.setAid(aid);
//        alien.setAname(aname);
//
//        mv.addObject("alien", alien);
//        mv.setViewName("result");

        return "result";
    }
}

