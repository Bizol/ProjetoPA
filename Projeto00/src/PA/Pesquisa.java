


package PA;

import java.util.Date;

public class Pesquisa {
	
	private int idPesquisa;
	private String instituto;
	private Date data;
	private String local;
	private int mediaIdade;
	private TipoPesquisa tipo;
	private FormatoPesquisa formato;
	
	public int getIdPesquisa() {
		return idPesquisa;
	}
	public void setIdPesquisa(int idPesquisa) {
		this.idPesquisa = idPesquisa;
	}
	public String getInstituto() {
		return instituto;
	}
	public void setInstituto(String instituto) {
		this.instituto = instituto;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public int getMediaIdade() {
		return mediaIdade;
	}
	public void setMediaIdade(int mediaIdade) {
		this.mediaIdade = mediaIdade;
	}
	public TipoPesquisa getTipo() {
		return tipo;
	}
	public void setTipo(TipoPesquisa tipo) {
		this.tipo = tipo;
	}
	public FormatoPesquisa getFormato() {
		return formato;
	}
	public void setFormato(FormatoPesquisa formato) {
		this.formato = formato;
	}
	public void setTipo(String string) {
		// TODO Auto-generated method stub
		
	}
}
