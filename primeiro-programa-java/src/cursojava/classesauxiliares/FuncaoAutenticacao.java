package cursojava.classesauxiliares;

import cursojava.interfaces.PermitirAcesso;

/*Realmente e somente receber algu�m que tem o contrato da interface de PermitirAcesso e chamar o autenticar*/
public class FuncaoAutenticacao {
	
	private PermitirAcesso permitirAcesso;
	
	public FuncaoAutenticacao(PermitirAcesso acesso) {
		this.permitirAcesso = acesso;
	}
	
	public boolean autenticar() {
		return permitirAcesso.autenticar();
	}
}
