package school.management.system;


public class Student {
	
	private int id;
	private String name;
	private int grade;
	private int feesPaid;
	private int feesTotal;
	
	/**
	 * To create a new student by initializing.
	 * Fees for every student is rs 50000.
	 * Fees paid initially is 0.
	 * @param id --- unique.
	 * @param name
	 * @param grade
	 */

	public Student(int id, String name, int grade) {

		this.id = id;
		this.name = name;
		this.grade = grade;
		this.feesPaid = 0;
		this.feesTotal = 50000;
	}
	
	//Not going to alter student's name, student's id.

	
	/**
	 * Used to update the student's grade.
	 * @param grade new grade of the student.
	 */
	

	public void setGrade(int grade) {
		this.grade = grade;
	}



	/**
	 * Keep adding the fees to feespaid field.
	 * Add the fees to the fees paid.
	 * The school is going receive the funds.
	 * 
	 * @param fees the fees that the student pays.
	 */
	

	public void payFees(int fees) {
		feesPaid = feesPaid + fees;
		School.updateTotalMoneyEarned(feesPaid);
	}


	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}
	
	public int getGrade() {
		return grade;
	}

	public int getFeesPaid() {
		return feesPaid;
	}



	public int getFeesTotal() {
		return feesTotal;
	}
	
	public int getRemainingFees() {
		return feesTotal - feesPaid;
	}
	
	@Override
	public String toString() {
		return "Student's name :" + name + 
				"Total fees paid so far RS " + feesPaid;
	}



	
	
	

	
	
	
	
	
}
