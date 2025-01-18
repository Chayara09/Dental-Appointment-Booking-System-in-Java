import java.util.Scanner;

public class DentistAppointmentBookingSystem {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("==========================================");
        System.out.println("\tWelcome to Malayrfect dental clinic!");
        System.out.println("==========================================");
        System.out.println("We are open from 09.00 MYT until 18:00 MYT");
        System.out.println("**REMINDER! Tax charges is RM 5 per- \nappointment for administration purposes**\n");

        System.out.print("Please enter your name: ");
        String name = scan.nextLine();

        System.out.print("Enter the date of the appointment (YYYY-MM-DD): ");
        String date = scan.nextLine();

        System.out.print("Enter the time of the appointment (HH:MM): ");
        String time = scan.nextLine();

        String[] treatments = {"Teeth Cleaning", "Cavity Filling", "Root Canal", "Teeth Whitening", "Tooth Extraction"};
        double[] prices = {90, 80, 360, 250, 130};

        System.out.println("Select a treatment:");
        for (int i = 0; i < treatments.length; i++) {
            System.out.println((i + 1) + ". " + treatments[i] + "(RM " + prices[i] + ")");
        }

        System.out.print("Enter a number of your treatment choice: ");
        int treatmentChoice = scan.nextInt();
        scan.nextLine();

        if (treatmentChoice < 1 || treatmentChoice > treatments.length) {
            System.out.println("Invalid choice. Appointment not booked. Please try again");
        } else {
            double price = prices[treatmentChoice - 1] + 5;  
            displayAppointmentDetails(name, date, time, treatments[treatmentChoice - 1], price);
        }
    }

    public static void displayAppointmentDetails(String name, String date, String time, String treatment, double price) {
        System.out.println("================================");
        System.out.println("Appointment successfully booked");
        System.out.println("================================");
        System.out.println("Name       : " + name);
        System.out.println("Date       : " + date);
        System.out.println("Time       : " + time);
        System.out.println("Treatment  : " + treatment);
        System.out.println("Total price: RM " + price);
        System.out.println("=================================");
        System.out.println("\t \t \t Thank you" );
        System.out.println("=================================");

    }
}
