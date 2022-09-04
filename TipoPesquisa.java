


package PA;

public class TipoPesquisa {
	
	private int idtipo;
	private Pesquisa tipo;
	private Pesquisa formato;
	private String descricao;
	
	public Pesquisa getTipo() {
		return tipo;
	}
	public void setTipo(Pesquisa tipo) {
		this.tipo = tipo;
	}
	public int getIdtipo() {
		return idtipo;
	}
	public void setIdtipo(int idtipo) {
		this.idtipo = idtipo;
	}
	public Pesquisa getFormato() {
		return formato;
	}
	public void setFormato(Pesquisa formato) {
		this.formato = formato;
	}	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
