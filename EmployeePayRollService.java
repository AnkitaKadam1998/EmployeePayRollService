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
		service.readData(new Scanner(System.in));
		service.writeData();
	}
	public void writeData()
	{
		System.out.println("\nWrinting Employee payroll  : \n"+datas);
	}
	
	private void readData(Scanner scanner)
	{
		System.out.println("Enter id");
		int id = scanner.nextInt();
		
		System.out.println("Enter name");
		String name = scanner.next();
		
		System.out.println("Enter salary");
		double salary = scanner.nextDouble();
		this.datas.add(new EmployeePayrollData(id,salary,name));
		
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
