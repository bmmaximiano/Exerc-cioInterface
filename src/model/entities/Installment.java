package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Installment {
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private Date date;
	private Double amount;
	
	
	
	public Installment() {
		
	}

	public Installment(Date date, Double amount) {
		this.date = date;
		this.amount = amount;
	}
	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	public String toString() {
		return sdf.format(getDate()) + " - " + String.format("%.2f", getAmount());
	}
}
