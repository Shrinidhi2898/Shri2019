package Employee;

import java.awt.List;
import java.util.ArrayList;

public class Employee {
	int eid;
	String ename;
	ArrayList<Layers> li = new ArrayList<Layers>();
	
	public Employee(int eid, String ename, ArrayList<Layers> li) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.li = li;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public ArrayList<Layers> getLi() {
		return li;
	}

	public void setLi(ArrayList<Layers> li) {
		this.li = li;
	}
	
	
	

}
