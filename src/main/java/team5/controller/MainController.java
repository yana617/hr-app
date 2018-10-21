package team5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import team5.MavenVersion;
import team5.dao.DBConnector;

import java.sql.Connection;

@Controller
@ControllerAdvice
public class MainController {
    Connection connection;

    @RequestMapping(value = "/**", method = RequestMethod.GET)
    public ModelAndView initPath() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");

        try{
            connection = DBConnector.getConnection();
            connection.close();
        }
        catch (Exception e){}

        return modelAndView;
    }

    @ModelAttribute
    public void addAttributes(Model model) {
        model.addAttribute("version", MavenVersion.getVersion());
    }
}

