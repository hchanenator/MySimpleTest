/**
 * 
 */
package org.herb.MySimpleTest.domain;

import java.time.LocalTime;

import org.springframework.format.datetime.DateFormatter;

/**
 * @author hchan
 *
 */
public class TimeSlot implements I_TimeSlot {

	private boolean desirable = false;
	private int duration = 0;
	private LocalTime time = LocalTime.now();
	
	public TimeSlot(String time, int duration, boolean desirable) {
		this.time = LocalTime.parse(time);
		this.duration = duration;
		this.desirable = desirable;
	}

	public boolean isDesirable() {
		return desirable;
	}

	public void setDesirable(boolean desirable) {
		this.desirable = desirable;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public LocalTime getTime() {
		return time;
	}

	public void setTime(LocalTime time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "TimeSlot [desirable=" + desirable + ", duration=" + duration + ", time=" + time + "]";
	}
	
	
}
