package entities;

public class Skills {

	Card card = new Card();
	
	public Skills(Integer randomSelectSkills) {
		if (randomSelectSkills == 0) {
			shield();
		} else if (randomSelectSkills == 1) {
			cure();
		} else if(randomSelectSkills == 2) {
			skipTurn();
		}
	}
	
	// 1
	public void shield () {
		card.setLife(200);
	}
	
	//2
	public void cure () {
		card.setLife(10);
	}
	
	//3
	public Boolean skipTurn () {
		return false;
	}
	
}
