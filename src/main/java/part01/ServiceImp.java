package part01;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

import model.MemDAO;
import model.MemDTO;

public class ServiceImp implements Service{

	
	private MemDAO dao;
	
	private TransactionTemplate transactionTemplate;
	
	
	public ServiceImp() {
		// TODO Auto-generated constructor stub
	}
	
	
	public void setDao(MemDAO dao) {
		this.dao = dao;
	}
	
	public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
		this.transactionTemplate = transactionTemplate;
	}
	
	@Override
	public void insertProcess() {
//		오류 처리를 위해 트랜스액션이 반드시 들어가야함
		String result = transactionTemplate.execute(new TransactionCallback<String>() {
			@Override
			public String doInTransaction(TransactionStatus status) {
				
				try {
					dao.inserMethod(new MemDTO(55, "사이먼 라일리", 35, "스코틀랜드"));
					dao.inserMethod(new MemDTO(56, "존 맥티비시", 36, "스코틀랜드"));
					return "ok";
				}catch(Exception ex) {
					status.setRollbackOnly();
					return ex.toString();
				}
				
				
			}
		});
		System.out.println("result:" + result);
	}
}
