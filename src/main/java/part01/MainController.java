package part01;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// http://localhost:8090/myapp/firstmain.st
@Controller
public class MainController {

	
	
	private Service svc;
	
	
	public MainController() {
		// TODO Auto-generated constructor stub
	}
	

	
	public void setSvc(Service svc) {
		this.svc = svc;
	}
	
@RequestMapping("/firstmain.st")
	public void execute() {
		System.out.println("execute");
		svc.insertProcess();
	}
}
