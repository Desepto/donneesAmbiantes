package donneesAmbiantes;

public class Time {

	public int year;
	public int month;
	public int dayOfMonth;
	public int hourOfDay;
	public int minute;
	public int second;

	public Time() {

		this.year = 0;
		this.month = 0;
		this.dayOfMonth = 0;
		this.hourOfDay = 0;
		this.minute = 0;
		this.second = 0;
	}

	public Time(int y, int m, int d, int h, int min, int s) {

		this.year = y;
		this.month = m;
		this.dayOfMonth = d;
		this.hourOfDay = h;
		this.minute = min;
		this.second = s;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDayOfMonth() {
		return dayOfMonth;
	}

	public void setDayOfMonth(int dayOfMonth) {
		this.dayOfMonth = dayOfMonth;
	}

	public int getHourOfDay() {
		return hourOfDay;
	}

	public void setHourOfDay(int hourOfDay) {
		this.hourOfDay = hourOfDay;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	@Override
	public String toString() {
		return "Time [year=" + year + ", month=" + month + ", dayOfMonth=" + dayOfMonth + ", hourOfDay=" + hourOfDay
				+ ", minute=" + minute + ", second=" + second + "]";
	}

}
