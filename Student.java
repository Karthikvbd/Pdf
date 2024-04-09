package feescollegestudent;

public abstract class Student {
	private int stdId;
	private String stdName;
	private String dept;
	private String gender;
	private String category;
	private double clgFee;
	
		public Student() {
		super();
	}
	
	public Student(int stdId, String stdName, String dept, String gender, String category, double clgFee) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.dept = dept;
		this.gender = gender;
		this.category = category;
		this.clgFee = clgFee;
	}

	public int getStdId() {
		return stdId;
	}

	public void setStdId(int stdId) {
		this.stdId = stdId;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getClgFee() {
		return clgFee;
	}

	public void setClgFee(double clgFee) {
		this.clgFee = clgFee;
	}

	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdName=" + stdName + ", dept=" + dept + ", gender=" + gender
				+ ", category=" + category + ", clgFee=" + clgFee + "]";
	}
	
	public abstract double calculateTotalFee();
	

}
