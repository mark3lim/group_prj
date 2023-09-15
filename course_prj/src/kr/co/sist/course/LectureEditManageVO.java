package kr.co.sist.course;

public class LectureEditManageVO {
	private String dptName;
	private String majorName;
	private String lectureName;
	private String profName;
	private String empno;
	private int credit;
	private char subType;
	
	public LectureEditManageVO() {
		super();
	}

	public LectureEditManageVO(String dptName, String majorName, String lectureName, 
			String profName, String empno, int credit, char subType) {
		super();
		this.dptName = dptName;
		this.majorName = majorName;
		this.lectureName = lectureName;
		this.profName = profName;
		this.empno = empno;
		this.credit = credit;
		this.subType = subType;
	}

	public String getDptName() {
		return dptName;
	}

	public void setDptName(String dptName) {
		this.dptName = dptName;
	}

	public String getMajorName() {
		return majorName;
	}

	public void setMajorName(String majorName) {
		this.majorName = majorName;
	}

	public String getLectureName() {
		return lectureName;
	}

	public void setLectureName(String lectureName) {
		this.lectureName = lectureName;
	}

	public String getProfName() {
		return profName;
	}

	public void setProfName(String profName) {
		this.profName = profName;
	}

	public String getEmpno() {
		return empno;
	}

	public void setEmpno(String empno) {
		this.empno = empno;
	}

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

	public char getSubType() {
		return subType;
	}

	public void setSubType(char subType) {
		this.subType = subType;
	}

	@Override
	public String toString() {
		return "LectureEditManageVO [dptName=" + dptName + ", majorName=" + majorName + ", lectureName=" + lectureName
				+ ", profName=" + profName + ", empno=" + empno + ", credit=" + credit + ", subType=" + subType + "]";
	}
	
}//LectureEditManageVO

