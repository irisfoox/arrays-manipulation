package lesson4;

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //נתון מערך יכול להכיל שמות של אנשים . תוכן - משה , יוסף , יוסי . יש להדפיס כל השמות בשורה אחת שבין כל שם יהיה רווח וגם פסיק 
	    String arr[]= {"moshe","yosef","yosi"};
	    String names=String.format("%s ,"+"%s ,"+"%s" , arr[0],arr[1],arr[2]);
	    System.out.println(names);
	    
	    //יש ליצור מערך כולל שמות של מדינות - ישראל ,אוסטריה , ספרד , יש לעשות חיפוש של שם מדינת ישראל , במידה ונמצא יש להדפיס ״המדינה נמצאת במערך״
	    String states[]= {"israel","austria","spain"};
	    int i=0;
	    String n="israel";
	    boolean x=false;
	    for (i=0;i<=2;i++) {
	    	String s=states[i];
	    	x=(s.equals(n)); 
	    	if (x==true) {
	    		System.out.println("state is in array");
	    	}
	    }
	}

}
