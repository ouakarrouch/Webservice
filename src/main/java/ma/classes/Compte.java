package ma.classes;

import java.sql.Date;



import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement
public class Compte {
public Compte(Object object, double d, java.util.Date date, TypeCompte epargne) {
		
	}
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id; 
private double solde; 
@Temporal(TemporalType.DATE)
private Date dateCreation;
@Enumerated(EnumType.ORDINAL)
private TypeCompte type;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public double getSolde() {
	return solde;
}
public void setSolde(double solde) {
	this.solde = solde;
}
public Date getDateCreation() {
	return dateCreation;
}
public void setDateCreation(Date dateCreation) {
	this.dateCreation = dateCreation;
}
public TypeCompte getType() {
	return type;
}
public void setType(TypeCompte type) {
	this.type = type;
} 


	public Compte() {}
	
	
}
