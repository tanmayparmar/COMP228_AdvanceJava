package week4;

public class Time2 {
	private int hour;
	private int minute;
	private int second;
	
	public Time2() {
		this(0,0,0);
	}
	
	public Time2(int hour) {
		this(hour, 0, 0);
	}
	
	public Time2(int hour, int minute) {
		this(hour, minute, 0);
	}
	
	public Time2(int hour, int minute, int second) {
		if(hour < 0 || hour >= 24) {
			throw new IllegalArgumentException("Hour must be 0-23");
		}
		
		if(minute < 0 || minute >= 60) {
			throw new IllegalArgumentException("Minute must be 0-59");
		}
		
		if(second < 0 || second >= 60) {
			throw new IllegalArgumentException("Second must be 0-59");
		}
		
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	// Copy constructor
	public Time2(Time2 time) {
		this(time.getHour(), time.getMinute(), time.getSecond());
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		if(hour < 0 || hour >= 24) {
			throw new IllegalArgumentException("Hour must be between 0 - 23");
		}
		
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		if(minute < 0 || minute >= 60) {
			throw new IllegalArgumentException("Minute must be between 0 - 59");
		}
		
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		if(second < 0 || second >= 60) {
			throw new IllegalArgumentException("Second must be between 0 - 59");
		}
		
		this.second = second;
	}

	
	public String toUniversalString() {
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}
	
	// Convert to String in standard time format (H:MM:SS AM or PM)
	public String toString() {
		return String.format("%d:%02d:%02d %s", 
				((hour == 0 || hour == 12) ? 12 : hour % 12), 
				minute, 
				second,
				(hour < 12 ? "AM" : "PM"));
	}
}










