


package dao;

import java.util.ArrayList;
import java.util.List;

import PA.Pesquisa;

public class PesquisaDao {
	
	private static PesquisaDao instance;
	private List<Pesquisa> listaPesquisa = new ArrayList<>();
	
	public static PesquisaDao getInstance() {
		if(instance == null) {
			instance = new PesquisaDao();
		}return instance;
	}
	public void salvar(Pesquisa pesquisa) {
		listaPesquisa.add(pesquisa);
	}
	public void atualizar(Pesquisa pesquisa) {
		listaPesquisa.set(pesquisa.getIdPesquisa(), pesquisa);
	}
	public void excluir(int idPesuisa) {
		listaPesquisa.remove(idPesuisa);
	}
	public List<Pesquisa> listar(){
		return listaPesquisa;
	}
}
