package co.samir.myprogram;

public class Clock {
	
	private int hour;
	private int minutes;
	private int seconds;
	
	
	public Clock() {
		hour=12;
		
	}
	public Clock(int seconds)  {
		int hr,min,sec;
		hr=seconds/3600;
		min=(seconds-(hr*3600))/60;
		sec=seconds-((hr*3600)+(min*60));
		this.hour=hr;
		this.minutes=min;
		this.seconds=sec;
				
		
				
	}
	
	public Clock(int hour,int minutes,int seconds) {
		if(hour==0 || hour<=23) {
			this.hour=hour;
		}
		if(minutes==0 || minutes<60) {
		this.minutes=minutes;
		}
		if(seconds==0 || seconds<60) {
		this.seconds=seconds;
		}
		
	}


	public int getHour() {
		return hour;
	}


	public void setHour(int hour) {
		if(hour==0 || hour<24 ) {
		this.hour = hour;
		}
		else {
			System.out.println("hour should be in between 0-23");
		}
	}


	public int getMinute() {
		return minutes;
	}


	public void setMinute(int minutes) {
		if(minutes==0 || minutes<60 ) {
		this.minutes = minutes;
		}
		else {
			System.out.println("Minute should be in between 0-59");
		}
	}


	public int getSeconds() {
		return seconds;
	}


	public void setSec(int seconds) { 
		if(seconds==0 || seconds<60)
		this.seconds = seconds;
		
		else
			System.out.println("Seconds should be in between 0-59");
	}
	
	public void setClock(int second) {
		int hr,min,sec;
		hr= second/3600;
		min=second-(hr*3600);
		sec=second-((hr*3600)+(min*60));
		System.out.println(hr  + " Hours");
		System.out.println(min + " Minutes");
		System.out.println(sec + " Seconds");
		
	}
	
	public void tick() {
		if (seconds==59 && minutes==59) {
			hour++;
			minutes=0;
			seconds=0;
		}
		else if(seconds==59) {
			minutes++;
			seconds=0;
		}
		else {
			seconds++;
		}
	}
	
	public void addClock(Clock clock1,Clock clock2) {
		int hr= clock1.hour+clock2.hour;
		int min;
		if(clock1.minutes+clock2.minutes<60) {
			min=clock1.minutes+clock2.minutes;
		}
		else {
			min=((clock1.minutes+clock2.minutes)-60);
			hr++;
		}
		int sec;
		if((clock1.seconds+clock2.seconds)<60) {
			sec=clock1.seconds+clock2.seconds;
		}
		else {
			sec=((clock1.seconds+clock2.seconds)-60);
			min++;
			
		}
		System.out.println("Addition valu is - "+hr+" : "+min+" : "+sec);
	}
	
	public String toString() {
		return String.format("Clock time is - %s : %s : %s",this.getHour(),this.getMinute(),this.getSeconds());
	}
	
	public void tickDown() {
		if(seconds==0 && minutes==0) {
			hour--;
			minutes=59;
			seconds=59;
		}
		else if(seconds==0) {
			minutes--;
			seconds=59;
		}
		else
			seconds--;
	}
	
	public void substractClock(Clock clock1,Clock clock2) {
		int hr=clock1.hour-clock2.hour;
		int min;
		if((clock1.minutes-clock2.minutes)>=0) 
			min=clock1.minutes-clock2.minutes;
		else {
			min=((clock1.minutes-clock2.minutes)+60);
			hr--;
		}
		int sec;
		if((clock1.seconds-clock2.seconds)>=0)
			sec=clock1.seconds-clock2.seconds;
		else {
			sec=((clock1.seconds-clock2.seconds)+60);
			min--;
		}
		
		System.out.println("substract value is - "+hr+" : "+min+" : "+sec);
			
			
		
	}
	

}
