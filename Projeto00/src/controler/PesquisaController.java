


package controler;

import java.util.List;
import PA.Pesquisa;
import dao.PesquisaDao;

public class PesquisaController {
	
	public void salvar(Pesquisa pesquisa) throws Exception {
		if(pesquisa.getLocal() == null) {
			throw new Exception("pesquisa sem local");
		}
	}
	public void atualizar(Pesquisa pesquisa) throws Exception {
		if(pesquisa.getLocal() == null) {
			throw new Exception("pesquisa sem local");
		}
	}
	public void excluir(int idPesquisa) throws Exception {
		if(idPesquisa == 0) {
			throw new Exception("nenhuma pesquisa selecionada");
		}
	}
	public List<Pesquisa> listar(){
		return PesquisaDao.getInstance().listar();
	}
}
