package donneesAmbiantes;

public class CrowedSourcedValue {

	public String comment;
	public int interest;
	public Time t;

	public CrowedSourcedValue() {

		comment = "";
		interest = 0;
		t = new Time();
	}

	public CrowedSourcedValue(String c, int i, Time t) {
		comment = c;
		interest = i;
		this.t = t;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public int getInterest() {
		return interest;
	}

	public void setInterest(int interest) {
		this.interest = interest;
	}

	public Time getT() {
		return t;
	}

	public void setT(Time t) {
		this.t = t;
	}

	@Override
	public String toString() {
		return "CrowedSourcedValue [comment=" + comment + ", interest=" + interest + ", t=" + t + "]";
	}

}
