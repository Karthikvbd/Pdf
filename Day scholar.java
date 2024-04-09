package feescollegestudent;

public class DayScholar extends Student {
	
		private int busNo;
		private float dist;
		
		
		
		public DayScholar() {
			super();
		}



		public DayScholar(int stdId, String stdName, String dept, String gender, String category, double clgFee,
				int busNo, float dist) {
			super(stdId, stdName, dept, gender, category, clgFee);
			this.busNo = busNo;
			this.dist = dist;
		}



		public int getBusNo() {
			return busNo;
		}



		public void setBusNo(int busNo) {
			this.busNo = busNo;
		}



		public float getDist() {
			return dist;
		}



		public void setDist(float dist) {
			this.dist = dist;
		}



		@Override
		public double calculateTotalFee() {
			
			double fee=super.getClgFee();
			
			if(dist>=30 && dist<=50)
			{
				return fee+15000.0;
			}
			else if(dist>=20 && dist<=10 )
			{
				return fee+8000.0;
			}
			else
			{
				return fee+5000;
			}
		}



		@Override
		public String toString() {
			return "DayScholar [busNo=" + busNo + ", dist=" + dist + ", calculateTotalFee()=" + calculateTotalFee() + "]";
		}
		
		
		
	

}
