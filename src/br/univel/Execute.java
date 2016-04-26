package br.univel;

import java.sql.SQLException;

public class Execute {

	public static void main(String[] args) throws SQLException {
		Dao<Cliente, Cliente> d = new Daoimpl<Cliente, Cliente>();
		Cliente c = new Cliente(1,"Pontin","0001","Rua 10", EstadoCivil.SOLTEIRO);
		Cliente c2 = new Cliente(1,"Gibimba","0002","Rua 05", EstadoCivil.CASADO);
		Cliente c3 = new Cliente(1,"Alakart","0003","Rua 02", EstadoCivil.VIUVO);
		
		d.excluir(c);
		d.create(c);
		d.salvar(c);
		d.salvar(c2);
		d.salvar(c3);
		d.listarTodos();
		d.buscar(c);
		d.atualizar(c);
		d.delete(c);
		d.listarTodos();		
	}
	
}
