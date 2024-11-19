package UsingJson.UsingJson;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Transaction {
	@JsonProperty("to")
	private int CardNum;
	private int amount;
	private String description;
	public int getCardNum() {
		return CardNum;
	}
	public void setCardNum(int cardNum) {
		CardNum = cardNum;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Transaction [CardNum=" + CardNum + ", amount=" + amount + ", description=" + description + "]";
	}

}
