package service;

import java.util.Date;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import dao.CommandeDAO;
import dao.ProduitDAO;
import entity.Commande;
import entity.Produit;

@WebService(name="GC_WS")
public class GestionCommercialService {
	
	@WebMethod	
	public List<Produit> getProduits() {
		
		return ProduitDAO.getAll();		
	}
	
	@WebMethod
	public boolean ajouterCommande(@WebParam(name="codeCmd")int codeCmd, @WebParam(name="client")String client,
								@WebParam(name="codePdt")int codePdt, @WebParam(name="qteCmd")int qteCmd,
								@WebParam(name="dateCmd")Date dateCmd) {
		
		Commande cmd = new Commande(codeCmd, client, codePdt, qteCmd, dateCmd);
		return CommandeDAO.save(cmd);
	}
}
