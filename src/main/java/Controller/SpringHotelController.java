package Controller;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.support.SessionStatus;

import dao.service.HotelServiceImpl;
import model.Hotel;

@Controller
public class SpringHotelController {

	
	@RequestMapping(path = "/ShowNewForm",method = RequestMethod.POST)
		public String ShowNewForm(@RequestParam("showNewForm")String showNewForm,Model m ,SessionStatus status,HotelServiceImpl impl){
		
		System.out.println("This is success transfer to new form");
		return "/user-form.jsp";
//		Map<String, String> errors =new HashMap<String,String>();
//		m.addAttribute("errors", errors);  //=request.setAttribute("errors", errors);
//	
//		if (userName==null || userName.length()==0) {
//			errors.put("name", "name is required");
//		}
//	
//		if (errors !=null && !errors.isEmpty()) {
////		return new  ModelAndView("/form.jsp");
//			return "/form.jsp";
//		}
//		m.addAttribute("userName", userName);
//			return "/final.jsp";
//			
//		}
		
		
		
	}
}