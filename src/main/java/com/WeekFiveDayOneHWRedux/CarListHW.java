package com.WeekFiveDayOneHWRedux;

import java.util.Scanner;

public class CarListHW {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		boolean loopTheMenu = false;

		System.out.println("Welcome to the Von Car Database Program!");

		do {
			System.out.println("Press 1 to View the DB" 
					+ "\nPress 2 to Add to the database" 
					+ "\nPress 3 to Delete from the database"
					+ "\nPress 4 to Update an existing selection in the database" );
			String userMenuInput = sc.nextLine();

			switch (userMenuInput) {
			case "1":
				DAOWeekFourHW.readFromDB();
				break;
			case "2":
				//DAOWeekFourHW.addToDB();
				break;
			case "3":
				DAOWeekFourHW.deleteFromDB();
				break;	
			case "4":
				DAOWeekFourHW.updatedToDB();
				break;
			default:
				System.out.println("That is not a valid option, please try again.");
				loopTheMenu = true;
				break;
			}
		} while (loopTheMenu);

	}

}