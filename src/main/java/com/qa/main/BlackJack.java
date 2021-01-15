package com.qa.main;

public class BlackJack {
	public static String play(int dealer, int player) {
		int winner;
		String Winner = null;
		if (dealer>0&&player>0) {
			if (dealer > 21 && player > 21) {
				winner=0;
				Winner="Nobody";
	        } else if (dealer > 21 && player <=21) {
	        	winner=player;
	        	Winner="Player";
	        } else if (player > 21 && dealer <=21) {
	        	winner=dealer;
	        	Winner="Dealer";
	        	
	        } else {
	        	winner=Math.max(dealer,player);
	        	if (winner==dealer) {
	        		Winner="Dealer";
	        	} else { Winner= "Player";}
	        }
		System.out.println(Winner + " wins: "+ winner);
		
		}
		else {
			System.out.println("Invalid: Inputs have to be > 0.");
			Winner=null;
		}
		return Winner;
	}
}
