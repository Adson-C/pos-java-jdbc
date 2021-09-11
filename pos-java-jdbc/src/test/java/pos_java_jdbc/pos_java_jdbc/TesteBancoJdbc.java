package pos_java_jdbc.pos_java_jdbc;

import org.junit.jupiter.api.Test;

import dao.UserPosDAO;
import model.Userposjava;

public class TesteBancoJdbc {
	
	@Test
	public void initBanco() {
		UserPosDAO userPosDAO = new UserPosDAO();
		Userposjava userposjava = new Userposjava();
		
		userposjava.setId(7L);
		userposjava.setNome("Laura");
		userposjava.setEmail("laura@gmail.com");
		
		userPosDAO.salvar(userposjava);
	}

}