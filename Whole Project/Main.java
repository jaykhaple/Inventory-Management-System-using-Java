import java.util.*;
import java.io.*;

//army show -1
		// army update-2
		// navy show-3
		// navy update-4
		// airforce show-5
		// airforce update-6
class Main
{
	public static void main(String[] args)
	{
		Scanner in= new Scanner(System.in);
		Army army = new Army();
		Navy navy = new Navy();
		Airforce airforce = new Airforce();
		// System.out.println(army.guns+"first");


		System.out.println("Number of inputs");
		int input=in.nextInt();

		for(int i=0;i<input;i++){
			System.out.println("Show:- ");
			System.out.println("1-Army\n2-Navy\n3-Airforce\n4-Army update\n5-Navy update\n6-Airforce update");

			int j=in.nextInt();
			// System.out.println(i);
			switch(j)
			{
				case(1):
						army.read();
						break;
				case(2):
						navy.read();
						break;
				case(3):
						airforce.read();
						break;
				case(4):
						System.out.println("Number of guns");
						int gun=in.nextInt();
						System.out.println("Number of vest");
						int vest=in.nextInt();
						army.update(gun, vest);
						break;
				case(5):
						System.out.println("Number of guns");
						 gun=in.nextInt();
						System.out.println("Number of vest");
						vest=in.nextInt();
						navy.update(gun, vest);
						break;
				case(6):
						System.out.println("Number of guns");
						gun=in.nextInt();
						System.out.println("Number of vest");
						vest=in.nextInt();
						airforce.update(gun, vest);
						break;					

				default:System.out.println("Selected option is invalid");
						break;
			}

			System.out.println("Command Finished \n");
		}


	}
	
}

class Inventory
{
	public
	int guns=0;
	int vest=0; 

protected
	void read(String filename){
		try
	    {
	        File file_a = new File(filename);
	        FileReader reader_a = new FileReader(file_a);
	        BufferedReader buffer_a = new BufferedReader(reader_a);
	            String line;
	            while((line = buffer_a.readLine())!=null)
	            {
	                System.out.println(line);
	            }
	        buffer_a.close();
	        reader_a.close();
	    }
	    catch(IOException e)
	    {
	        System.out.println("Error: " + e.getMessage());
	    }
	}

	void update(String filename, int guns, int vest){
		try{
			File file_a = new File(filename);
			FileWriter writer = new FileWriter(file_a);
			writer.write("Gun ->"+ guns+'\n' + "Vests ->" + vest);
			writer.close();
		}
		catch(IOException e){
	        System.out.println("Error: " + e.getMessage());
		}
	}


}

class Army extends Inventory
{	
	void read(){
		super.read("Army.txt");
	}
	void update(int gun, int vest){
		super.update("Army.txt",gun, vest);
	}


}

class Navy extends Inventory
{
	void read(){
		super.read("Navy.txt");
	}
	void update(int gun, int vest){
		super.update("Navy.txt",gun, vest);
	}

}

class Airforce extends Inventory
{
	void read(){
		super.read("Airforce.txt");
	}
	void update(int gun, int vest){
		super.update("Airforce.txt",gun, vest);
	}
}
