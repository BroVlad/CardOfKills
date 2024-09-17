package entities;

public class Card {

	private String name;
	private Integer life = 100;
	private Double power;
	
	public Card() {
	}
	
	public Card (String name) {
		setName(name);
	}
	
	public void setName(String newName) {
		this.name = newName;
	}
	
	public String getName() {
		return name;
	}
	
	public void setLife(int newDamage) {
		this.life -= newDamage;
	}
	
	public Integer getLife() {
		return life;
	}
	
	public void setPower(Double newPower) {
		this.power = (newPower / 100) * newPower;
	}
	
	public Double getPower() {
		return power;
	}
	
	
	
}
