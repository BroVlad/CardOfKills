package main;

import entities.Card;
import java.util.Scanner;
import java.util.Random;

public class Game {

	// round basico
	public static void main(String[] args) {

		Random randomNumber = new Random();
		Scanner sc = new Scanner(System.in);
		Card cardUser = new Card();
		Card cardPc = new Card();

		System.out.println("Defina o nome da carta: ");
		String UserCardName = sc.nextLine();
		cardUser.setName(UserCardName);

		String pcCardName = "PC";
		cardPc.setName(pcCardName);

		boolean roundStart = true; // looping acaba quando a vida de alguem acaba
		while (roundStart) {

			// USER GAMING
			System.out.printf("Você recebeu: ");
			int selectSkillNumber = randomNumber.nextInt(2);
			if (selectSkillNumber == 0) {
				System.out.print("Escudo");
				cardUser.shield();
			} else if (selectSkillNumber == 1) {
				System.out.print("Cura");
				cardUser.cure();
			} else if (selectSkillNumber == 2) {
				System.out.print("Pulou o turno do adversário, ataca novamente");
				cardPc.getLife(cardUser.setPower());
			}
			// usuario atack
			cardPc.getLife(cardUser.setPower());

			// depois vem o sistema de ataque do pc
			// ...

		}

		sc.close();

	} // fim do metodo main

} // fim da classe principal
