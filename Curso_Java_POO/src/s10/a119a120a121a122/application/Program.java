package s10.a119a120a121a122.application;

//Terceira solução - boa

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import s10.a119a120a121a122.model.entities.Reservation;
import s10.a119a120a121a122.model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		try {
			System.out.print("Room number: ");
			int number = sc.nextInt();
			System.out.print("Check-in date (dd/MMM/yyy): ");
			Date checkIn = sdf.parse(sc.next());
			System.out.print("Check-out date (dd/MMM/yyy): ");
			Date checkOut = sdf.parse(sc.next());

			Reservation reservation = new Reservation(number, checkIn, checkOut);
			System.out.println("Reservation: " + reservation);

			System.out.println("\nEnter data to update the reservation:");
			System.out.print("Check-in date (dd/MMM/yyy): ");
			checkIn = sdf.parse(sc.next());
			System.out.print("Check-out date (dd/MMM/yyy): ");
			checkOut = sdf.parse(sc.next());

			reservation.updateDates(checkIn, checkOut);
			System.out.println("Reservation: " + reservation);
		} catch (ParseException e) {
			System.out.println("Invalid date format.");
		} catch (DomainException e) {
			System.out.println("Error in reservation: " + e.getMessage());
		} catch(RuntimeException e) {
			System.out.println("Unexpected error.");
		}

		sc.close();
	}

}