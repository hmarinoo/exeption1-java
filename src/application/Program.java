package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;
import model.excetinos.DomainException;

public class Program {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Room number: ");
			Integer roomNumber = sc.nextInt();
			sc.nextLine();
			System.out.print("check-in date (dd/MM/yyyy): ");
			Date checkIn = sdf.parse(sc.nextLine());
			System.out.print("check-out date (dd/MM/yyyy): ");
			Date checkOut = sdf.parse(sc.nextLine());

			Reservation reservation = new Reservation(roomNumber, checkIn, checkOut);
			System.out.println(reservation);

			System.out.println();

			System.out.println("Enter data to update the reservation: ");
			System.out.print("check-in date (dd/MM/yyyy): ");
			checkIn = sdf.parse(sc.nextLine());
			System.out.print("check-out date (dd/MM/yyyy): ");
			checkOut = sdf.parse(sc.nextLine());
			reservation.updateDates(checkIn, checkOut);

			System.out.println(reservation);
		} catch (ParseException e) {
			System.out.println("Invalid date formate.");
		}catch (DomainException e) {
			System.out.println("Error in reservation: " + e.getMessage());
		}
		 catch (RuntimeException e) {
				System.out.println("Unexpected error.");
			}
		sc.close();
	}

}
