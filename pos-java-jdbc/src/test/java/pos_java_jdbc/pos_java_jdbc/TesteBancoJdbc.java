package pos_java_jdbc.pos_java_jdbc;

import java.util.List;

import org.junit.Test;

import dao.UserPosDAO;
import model.Userposjava;

public class TesteBancoJdbc {
	
	@org.junit.Test
	public void initBanco() {
		UserPosDAO userPosDAO = new UserPosDAO();
		Userposjava userposjava = new Userposjava();
		
		userposjava.setNome("Maria");
		userposjava.setEmail("maria@gmail.com");
		
		userPosDAO.salvar(userposjava);
	}
	

	@Test
	public void initListar() {
		UserPosDAO dao = new UserPosDAO();
		try {
			List<Userposjava> list = dao.listar();
			
			for (Userposjava userposjava : list) {
				System.out.println(userposjava);
				System.out.println("--------------------------->------------------------<");
			
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void initBuscar() {
		
		UserPosDAO dao = new UserPosDAO();
		
		try {
			Userposjava userposjava = dao.buscar(6L);
			System.out.println(userposjava);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void initAtualizar() {
		try {
			
		UserPosDAO dao = new UserPosDAO();
		
		Userposjava objBanco = dao.buscar(8L);
		
		objBanco.setNome("nome Atualizado com metodo");
		
		dao.atualizar(objBanco);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void initDelete() {
		try {
			UserPosDAO dao = new UserPosDAO();
			dao.deletar(8L);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
