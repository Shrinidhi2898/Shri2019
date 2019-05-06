package MainActivity;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

import com.google.gson.Gson;

import Employee.Employee;
import Employee.Layers;

public class Activity {
	
	public static void main(String[] args) throws FileNotFoundException
	{
		Gson gson = new Gson();
		String path = "D:\\JAVA_Files\\JSONS\\sample.json";
		BufferedReader br = new BufferedReader(new FileReader(path));
		Employee emp = gson.fromJson(br, Employee.class);
		
		System.out.println(emp.getEname());
		System.out.println(emp.getEid());
		//System.out.println(emp.getLi());
	}

}
