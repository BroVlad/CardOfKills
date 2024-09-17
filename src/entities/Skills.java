package entities;

public class Skills {

	Card card = new Card();
	
	public void getShield () {
		card.setLife(200);
	}
	
	public void getCure () {
		card.setLife(10);
	}
	
}
