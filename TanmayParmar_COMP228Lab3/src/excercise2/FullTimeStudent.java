package excercise2;

public class FullTimeStudent extends Student {

	public FullTimeStudent(String s_name) {
		this.studentName=s_name;
		this.isFullTime=true;
	}
	
	@Override
	public int getTotalTutionFee() {
		return 2000;
	}

}
