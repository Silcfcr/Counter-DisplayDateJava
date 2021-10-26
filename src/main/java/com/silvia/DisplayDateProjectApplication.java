package com.silvia;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.ui.Model;

@SpringBootApplication
@Controller
public class DisplayDateProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(DisplayDateProjectApplication.class, args);
		
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(HttpSession session, Model model) {
		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
			Integer currentCount = (Integer) session.getAttribute("count");
	        model.addAttribute("countToShow", currentCount);
	        System.out.println("I'm the count 1" + currentCount);
        }
        else {
            // increment the count by 1 using getAttribute and setAttribute
        	Integer currentCount = (Integer) session.getAttribute("count");
        	currentCount = currentCount + 1;
        	session.setAttribute("count", currentCount);
        	session.setAttribute("countToShow", currentCount);
        	System.out.println("I'm the count 2" + currentCount);
        }
        return "index.jsp";
		
	}
	
	@RequestMapping(value = "/addTwo", method = RequestMethod.GET)
	public String addTwo(HttpSession session, Model model, RedirectAttributes redirectAttributes) {
		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
			Integer currentCount = (Integer) session.getAttribute("count");
	        model.addAttribute("countToShow", currentCount);
	        System.out.println("I'm the count 1" + currentCount);
        }
        else {
            // increment the count by 1 using getAttribute and setAttribute
        	Integer currentCount = (Integer) session.getAttribute("count");
        	currentCount = currentCount + 1;
        	session.setAttribute("count", currentCount);
        	session.setAttribute("countToShow", currentCount);
        	System.out.println("I'm the count 2" + currentCount);
        }
        return "redirect:/";
		
	}
	
	@RequestMapping(value = "/reset", method = RequestMethod.GET)
	public String reset(HttpSession session, RedirectAttributes redirectAttributes) {
		session.setAttribute("count", null);
		return "redirect:/";
        }
	
	
	
	
	

	@RequestMapping(value = "/dateTemplate", method = RequestMethod.GET)
	public String dateTemplate(Model model) {
		Date date = new Date();
		SimpleDateFormat formattedAsDate = new SimpleDateFormat("EEEE, 'the' dd 'of' MMMM, YYYY");
		model.addAttribute("date", formattedAsDate.format(date));
		return "date.jsp";
	}
	@RequestMapping(value = "/timeTemplate", method = RequestMethod.GET)
	public String timeTemplate(Model model) {
		Date date = new Date();
		SimpleDateFormat formattedAsTime = new SimpleDateFormat("h:mm a");
		model.addAttribute("time", formattedAsTime.format(date));
		return "time.jsp";
	}
}
