


package controler;

import java.util.List;
import PA.Pesquisa;
import dao.PesquisaDao;

public class PesquisaController {
	
	public void salvar(Pesquisa pesquisa) throws Exception {
		if (pesquisa.getInstituto() == null|| pesquisa.getInstituto().trim().equals("")) {
			throw new Exception("");
		}
		PesquisaDao.getInstance().salvar(pesquisa);
	}
	
	public void atualizar(Pesquisa pesquisa) throws Exception {
		if (pesquisa.getInstituto() == null || pesquisa.getFormato().trim().equals("")) {
			throw new Exception("");
		}
		PesquisaDao.getInstance().atualizar(pesquisa);
	}
	
	public void excluir(int idPesquisa) throws Exception {
		if (idPesquisa == 0) {
			throw new Exception("");
		}
		PesquisaDao.getInstance().excluir(idPesquisa);
	}
	
	public List<Pesquisa> listar(){
		return PesquisaDao.getInstance().listar();
	}

}
