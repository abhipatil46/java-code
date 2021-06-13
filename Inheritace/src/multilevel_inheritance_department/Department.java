package multilevel_inheritance_department;

public class Department {

	private String depName;
	private int depCode;
	
	public Department() {
		this.depName="-";
		this.depCode=-1;
	}

	public Department(String depName, int depCode) {
		super();
		this.depName = depName;
		this.depCode = depCode;
	}
	
}
