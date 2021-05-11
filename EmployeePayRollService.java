import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {

	private List<EmployeePayrollData> datas;
	public EmployeePayrollService()
	{
		
	}
	public EmployeePayrollService(List<EmployeePayrollData> datas)
	{
		this.datas=datas;
	}
	public static void main(String arggs[])
	{
		List<EmployeePayrollData> datas = new ArrayList<EmployeePayrollData>();
		EmployeePayrollService service = new EmployeePayrollService(datas);
		FileOptUtils utils = new FileOptUtils();
		
		utils.isFileExits("Data");
		utils.createFolder("Data");
		utils.createFile("Data/data1.txt");
		utils.writeFile("Data/data1.txt");
		utils.readFile("Data/data1.txt");
		utils.listOfFilesandFolder("Data");
		utils.deleteFloder("Data/data1.txt");
		utils.deleteFloder("Data");
		
	}
}
	
			
	

class EmployeePayrollData
{
	private int id;
	private String name;
	private double salary;
	
	public EmployeePayrollData(int id,double salary,String name)
	{
	this.id=id;
	this.name=name;
	this.salary=salary;
}
	@Override
	public String toString()
	{
		return "id="+ id + " ,name =' "+name + '\'' + ",salary="+salary;
	}
}
