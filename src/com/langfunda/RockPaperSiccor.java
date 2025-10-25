package com.langfunda;

import java.util.Scanner;

public class RockPaperSiccor {


		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Please select your choice:"+"\n"+"1.Rock"+"\n"+"2.Paper"+"\n"+"3.Scissors");
			int ch=sc.nextInt();
			int cch;
			while(true) {
				cch=(int)(Math.random()*10);
				//System.out.println(cch);
				if(cch>=1 && cch<=3)
					break;
			}
			//System.out.println(cch);
			switch(ch) {
			case 1: System.out.println("Your choice: Rock");
					break;
			case 2: System.out.println("Your choice: Paper");
					break;
			case 3: System.out.println("Your choice: Scissor");
					break;
			default:System.out.println("Please select valid choice");
					break;
			}
			switch(cch) {
			case 1: System.out.println("Computer's choice: Rock");
					break;
			case 2: System.out.println("Computer's choice: Paper");
					break;
			case 3: System.out.println("Computer's choice: Scissor");
					break;
			}
			if(ch==1 && cch==3||ch==2 && cch==1||ch==3 && cch==2) {
				System.out.println("You Win!!!");
			}
			else if(cch==1 && ch==3||cch==2 && ch==1||cch==3 && ch==2) {
				System.out.println("Computer Wins!!!");
			}
			else {
				System.out.println("Draw");
			}
			sc.close();			}

	}

