package tbf.sample;

import java.util.ArrayList;
import java.util.List;

import tbf.formatter.TColumn;
import tbf.formatter.TTable;

public class Client {

	public static void main(String[] args) {
		EmployeeBean bean = new EmployeeBean();
		bean.setId(101);
		bean.setName("Akshay Dongare");
		bean.setSalary(2000);
		List<EmployeeBean> list = new ArrayList<EmployeeBean>();
		list.add(bean);
		
		bean = new EmployeeBean();
		bean.setId(102);
		bean.setName("Shubham Gandhi");
		bean.setSalary(234500);
		list.add(bean);
		
		TTable<EmployeeBean> table = new TTable<EmployeeBean>();
		table.addColumn(new TColumn(" Id ","id",10));
		table.addColumn(new TColumn(" Name ","name",30));
		table.addColumn(new TColumn(" Salary ","salary",15));
		table.printHeader();
		table.printBeans(list);
		
	}
}
