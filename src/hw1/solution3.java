package hw1;

public class solution3 {
	/*public static void main(String[] args) {
	int second = 256559,minute = 60,day = 24;
	System.out.println(second % minute + "秒");
    }*/
		public static void main(String[] args) {
	        int totalSeconds = 256559;
	        
	        int days = totalSeconds / (24 * 60 * 60);
	        int remainingSeconds = totalSeconds % (24 * 60 * 60);
	        
	        int hours = remainingSeconds / (60 * 60);
	        remainingSeconds %= (60 * 60);
	        
	        int minutes = remainingSeconds / 60;
	        int seconds = remainingSeconds % 60;
	        
	        System.out.println("Days: " + days);
	        System.out.println("Hours: " + hours);
	        System.out.println("Minutes: " + minutes);
	        System.out.println("Seconds: " + seconds);
	    }	

}

