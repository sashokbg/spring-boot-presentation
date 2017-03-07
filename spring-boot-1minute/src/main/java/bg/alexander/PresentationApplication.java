package bg.alexander;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@SpringBootApplication
@Controller
public class PresentationApplication {

	@RequestMapping(value = "/hi", method = RequestMethod.GET)
	public String hi(Model model){
		model.addAttribute("name","Alex");
		return "hi-template";
	}

	public static void main(String[] args) {
		SpringApplication.run(PresentationApplication.class, args);
	}
}
