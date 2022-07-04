package part03;


import org.springframework.transaction.annotation.Transactional;


import model.MemDAO;
import model.MemDTO;

public class ServiceImp implements Service{

	
	private MemDAO dao;
	
	
	
	
	public ServiceImp() {
		// TODO Auto-generated constructor stub
	}
	
	
	public void setDao(MemDAO dao) {
		this.dao = dao;
	}
	
	
	@Transactional(rollbackFor = java.lang.Exception.class)
	@Override
	public void insertProcess() {
//		오류 처리를 위해 트랜스액션이 반드시 들어가야함
		
					dao.inserMethod(new MemDTO(70, "스티브 로져스", 35, "미국"));
					dao.inserMethod(new MemDTO(71, "엔서니 페리먼", 36, "미국"));
					
		}
		
	}

