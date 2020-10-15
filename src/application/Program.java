package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PaypalService;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter contract data:");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Date (dd/MM/yyyy): ");
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sc.nextLine();
		Date date = sdf.parse(sc.nextLine());
		System.out.print("Contract value: ");
		double totalValue = sc.nextDouble();
		
		Contract contract = new Contract (number, date, totalValue);
		
		ContractService cs = new ContractService(new PaypalService());
		
		System.out.print("Enter number of installs: ");
		int nInstalls = sc.nextInt();		
		
		cs.processContract(contract, nInstalls);
		
		for (Installment it : contract.getInstallments()) {
			System.out.println(it);
		}
		sc.close();
	}

}
