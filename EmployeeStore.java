import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EmployeeStore {
	
	public static void main(String args[]) throws IOException
	{
		Employee E1= new Employee (10,20000,"Manish");
		Employee E2= new Employee (12,25000,"raj");
		Employee E3= new Employee (13,22000,"shubham");
		
		
		Employee[] employee = new Employee[3];
		employee[0]=E1;
		employee[1]=E2;
		employee[2]=E3;
		
		
		for (int i=0;i<employee.length;i++)
		{
			String outputText=employee[i].getId() + "|" + employee[i].getName() + "|" + employee[i].getSalary();
			saveTofile("employeeList.txt",outputText, true);
		}
		
		
		
	}

	private static void saveTofile(String fileName,String text, boolean append)throws IOException
	{
		File file1= new File(fileName);
		FileWriter fw = new FileWriter(file1,append);
		PrintWriter pw = new PrintWriter(fw);
		
		pw.println(text);
		pw.close();
		
	}

}
