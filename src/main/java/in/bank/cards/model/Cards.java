package in.bank.cards.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@ToString
public class Cards {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "card_id")
	private int cardId;	
	
	@Column(name = "customer_id")
	private int customerId;
	
	@Column(name = "card_number")
	private int cardNumber;	
	
	@Column(name = "card_type")
	private String cardType;	
	
	@Column(name = "expir_date")
	private Date expirDate;	
	
	

}
