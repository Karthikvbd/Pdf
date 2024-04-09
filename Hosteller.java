package feescollegestudent;

public class Hosteller extends Student{

	private int roomNo;
	private char bloName;
	private String roomType;
	
	
	
	public Hosteller() {
		super();
	}

	public Hosteller(int stdId, String stdName, String dept, String gender, String category, double clgFee, int roomNo,
			char bloName, String roomType) {
		super(stdId, stdName, dept, gender, category, clgFee);
		this.roomNo = roomNo;
		this.bloName = bloName;
		this.roomType = roomType;
	}

	public int getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}

	public char getBloName() {
		return bloName;
	}

	public void setBloName(char bloName) {
		this.bloName = bloName;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	@Override
	public double calculateTotalFee() {
		double fee= super.getClgFee();
		double hostelFee;
		
		if(bloName == 'A')
		{
			hostelFee=60000.0;
			
		}
		
		else if(bloName == 'B')
		{
			hostelFee=55000.0;
		}
		else
		{
			hostelFee=50000.0;
		}
		
		if (roomType.equals("AC"))
		{
			return fee+hostelFee+5000;
		}
		else
		{
			return fee+hostelFee;
		}
	}

	@Override
	public String toString() {
		return "Hosteller [roomNo=" + roomNo + ", bloName=" + bloName + ", roomType=" + roomType + ", calcTotalFee()="
				+ calculateTotalFee() + "]";
	}
	
	
	
	
	
	
	
}
