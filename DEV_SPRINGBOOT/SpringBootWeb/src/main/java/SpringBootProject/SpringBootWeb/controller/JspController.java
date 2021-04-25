package SpringBootProject.SpringBootWeb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JspController {
	
	@RequestMapping(value="/")
	public String jsp() throws Exception{
		return "main";
	}

}
