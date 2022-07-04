package part03;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// http://localhost:8090/myapp/threemain.sm
@Controller
public class MainController {

	
	
	private Service svc;
	
	
	public MainController() {
		// TODO Auto-generated constructor stub
	}
	

	
	public void setSvc(Service svc) {
		this.svc = svc;
	}
	
@RequestMapping("/threemain.sm")
	public void execute() {
	try {
//		선언적 트랜잭션이ㅣ 설정된 메소드에서 오류 잡기를 하면 안된다
//		호출하는 곳에서 해야함
		svc.insertProcess();
		System.out.println("result OK");
	}catch(Exception ex) {
//		System.out.println("result:" + ex.toString());
		System.out.println("중복되는 넘버입니다.");
	}
	}
}
