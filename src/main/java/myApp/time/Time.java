package myApp.time;

import org.joda.time.LocalTime;

public class Time {
	
	private final long id;
    private LocalTime currentTime = null;

    public Time(long id, LocalTime currentTime) {
		this.id = id;
        this.currentTime = currentTime;
    }
    
    public long getId() {
        return id;
    }
    
    public LocalTime getCurrentTime() {
        return new LocalTime();
    }
}
