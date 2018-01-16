package entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Type;

@Entity(name="Tous_commandes ")
public class Commande implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column
	private int codeTousCmd;
	
	@Column
	private int codeCmd;
	
	@Column(length=20)
	private String client;
	
	@Column
	private int codePdt;
	
	@Column
	private int qteCmd;
	
	@Column
	@Type(type="date")
	private Date dateCmd;
	
	public Commande() {}

	public Commande(int codeCmd, String client, int codePdt, int qteCmd, Date dateCmd) {
		super();
		this.codeCmd = codeCmd;
		this.client = client;
		this.codePdt = codePdt;
		this.qteCmd = qteCmd;
		this.dateCmd = dateCmd;
	}

	public int getCodeTousCmd() {
		return codeTousCmd;
	}

	public void setCodeTousCmd(int codeTousCmd) {
		this.codeTousCmd = codeTousCmd;
	}

	public int getCodeCmd() {
		return codeCmd;
	}

	public void setCodeCmd(int codeCmd) {
		this.codeCmd = codeCmd;
	}

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	public int getCodePdt() {
		return codePdt;
	}

	public void setCodePdt(int codePdt) {
		this.codePdt = codePdt;
	}

	public int getQteCmd() {
		return qteCmd;
	}

	public void setQteCmd(int qteCmd) {
		this.qteCmd = qteCmd;
	}

	public Date getDateCmd() {
		return dateCmd;
	}

	public void setDateCmd(Date dateCmd) {
		this.dateCmd = dateCmd;
	}
	
	
}
