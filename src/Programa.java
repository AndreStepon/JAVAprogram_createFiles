import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Programa {

	public static void main(String[] args) throws FileNotFoundException{
		
		Vairuotojas driver1 = new Vairuotojas("Jonas", "Volvo", "ABS123", 124000);
		Vairuotojas driver2 = new Vairuotojas("Vilius", "Audi", "MBM665", 230000);
		Vairuotojas driver3 = new Vairuotojas("Kolinas", "BMW", "KBS123", 98000);
		
		ArrayList <Vairuotojas> drivers = new ArrayList<>();
		
		File csvFile = new File("src/drivers.csv");
		PrintWriter out = new PrintWriter(csvFile);
		
		drivers.add(driver1);
		drivers.add(driver2);
		drivers.add(driver3);
		
		for (Vairuotojas driver : drivers) {
			{
			
		}
			out.print(driver.getName() + ", " + driver.getAutomobilis() +", "+ driver.getValstNr() + ", "+ driver.rida + " ");
		}
			out.close();

	}

}
