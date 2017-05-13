package excercise2;

public class PartTimeStudent extends Student{

	int credit_hour;
	public PartTimeStudent(String s_name,int credit_hour){
		this.studentName=s_name;
		this.isFullTime=false;
		this.credit_hour=credit_hour;
	}
	@Override
	public int getTotalTutionFee() {
		return 100*credit_hour;
	}

}
