package entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="produits_prix")
public class Produit implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column
	private int codePdt;
	
	@Column(length=20)
	private String nomPdt;
	
	@Column(length=200)
	private String descPdt;
	
	@Column(length=11)
	private int prixPdt;
	
	public Produit() {}
	
	public Produit(int codePdt, String nomPdt, String descPdt, int prixPdt) {
		super();
		this.codePdt = codePdt;
		this.nomPdt = nomPdt;
		this.descPdt = descPdt;
		this.prixPdt = prixPdt;
	}

	public int getCodePdt() {
		return codePdt;
	}

	public void setCodePdt(int codePdt) {
		this.codePdt = codePdt;
	}

	public String getNomPdt() {
		return nomPdt;
	}

	public void setNomPdt(String nomPdt) {
		this.nomPdt = nomPdt;
	}

	public String getDescPdt() {
		return descPdt;
	}

	public void setDescPdt(String descPdt) {
		this.descPdt = descPdt;
	}

	public int getPrixPdt() {
		return prixPdt;
	}

	public void setPrixPdt(int prixPdt) {
		this.prixPdt = prixPdt;
	}
	
	

}
