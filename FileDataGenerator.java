package HomeWork2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner; 

public class FileDataGenerator {
	
	static Random rn = new Random();
	static int i=0;
	static File file = new File("c://temp//File"+ i + ".txt" );
	
	public static void main(String[] args) throws IOException {
		
		FilesGenerator();
		FilesGenerator();
		FilesGenerator();
		FilesGenerator();
		FilesGenerator();
		FilesGenerator();
		FilesGenerator();
		FilesGenerator();
		csvFilesGenerator();
	 
	
	}
	
	public static void FilesGenerator() throws IOException{
		
		
	
		file.createNewFile();
		System.out.println("File is created!");
		
		//Write Content
		FileWriter writer = new FileWriter(file);
		writer.write(nameGenerator() + " " + surnameGenerator() + " " + ageGenerator() + " " + salaryGenerator() + "\n" );
		for(int j = 0; j< 5; j++)
		{
			writer.append(nameGenerator() + " " + surnameGenerator() + " " + ageGenerator() + " " + salaryGenerator() + "\n");
		}
		writer.close();
		i++;
	}
	
public static String nameGenerator() {
		
		String[] nameArr = new String[]{"Mert","Ekin","Deniz","Can","Esat","Bahadýr","Buse","Neslihan","Mihriye","Erdinç" };
		
		return nameArr[rn.nextInt(10)];
			
		}
	public static String surnameGenerator() {
		
		String[] surnameArr = new String[]{"Çetin","Darendeli","Köktekin","Uður","Kýnay","Erol","Kýlýc","Esen"};
		
		return surnameArr[rn.nextInt(7)];
		}
		
	public static int ageGenerator() {
		
		return rn.nextInt(60)+18;
	}
	
	public static int salaryGenerator() {
		
		return rn.nextInt(1000)+101;
	}
	
	public static void csvFilesGenerator() throws IOException{
		FileWriter writer = new FileWriter("test2.csv");
		System.out.println("Csv File is created!");
		File f;
		String Oldest = "";
		String Oldestest = "";
		String data = "";
		int maxAge = 0;
		int maxMaxAge = 0;
		int currentAge = 0;
		int avgSal =0;
		int avgAvgSal = 0;
		int counter;
		Scanner myReader;
		String[] splitData;
		//Write Content
		writer.append("Oldest" + "," + "Avg Salary" + "\n");

		for(int j = 0; j< i; j++)
		{
			counter = 0;
			f = new File("c://temp//File"+ String.valueOf(j) + ".txt");

			myReader = new Scanner(f);

			while (myReader.hasNextLine()) {
				counter++;
		        data = myReader.nextLine();
		        System.out.println();
				System.out.println(data);

		        splitData = data.split(" ");
		        currentAge = Integer.parseInt(splitData[2]);
		        if(currentAge > maxAge)
		        {
		        	maxAge = currentAge;
		        	Oldest = splitData[0] + " " + splitData[1];
		        	avgSal += Integer.parseInt(splitData[3]);
		        	
		        }
		        System.out.println("Oldest Person is: " + Oldest);
		      }
				
				if(maxAge > maxMaxAge)
				{
					maxMaxAge = maxAge;
					Oldestest = Oldest;
				}
				avgAvgSal += avgSal;
				avgSal /= counter;
				writer.append(Oldest + "," + String.valueOf(avgSal) + "\n");
		      myReader.close();
		}
		
		avgAvgSal /= i;
		writer.append("Oldestest" + "," + "Avg Avg Salary" + "\n");

		writer.append(Oldestest + "," + String.valueOf(avgAvgSal) + "\n");
		
		writer.flush();
		writer.close();

		
		
	} 
			
	
}
