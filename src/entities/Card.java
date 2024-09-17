package entities;

public class Card {

	private String name;
	private Integer life = 100;
	private Integer shield = 20;
	private Integer power = 5;

	public Card() {
	}

	public Card(String name) {
		setName(name);
	}

	// definir nome da carta
	public void setName(String newName) {
		this.name = newName;
	}

	// consultar nome da carta atual
	public String getName() {
		return name;
	}


	// recebe dano de atack
	
	public Integer setPower() {
		return power;
	}
	
	public void getLife(int receiveDamage) {
		this.life -= receiveDamage;
	}
	
	
	// skills
	// 1
	public void shield () {
		this.shield += 200;
	}
	
	//2
	// cura
	public void cure () {
		this.life += 10;

	}
	
	//3
	public Boolean skipTurn () {
		return false;
	}
	
	
	
	
}
