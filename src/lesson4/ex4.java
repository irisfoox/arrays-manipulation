package lesson4;

public class ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//כתוב תכנית מדפיסה משכורת של : בודק תוכנה , מפתח אוטומציה , איש תמיכה תכנית . במידה ומוגדרים בודק תוכנה מודפסת המשכורת שלו , במידה ומגדירים מקצוע אחר יידפס מקצוע לא מוכר.
	   
	    printsalary("Qa");
	}
	public static void printsalary(String ocupation) {
	        
		    String [] worker= {"Qa","automatiom developer","help desk"};
		    int[] salary= {7000,8000,10000};
		    
	    	switch (ocupation) {
	    	case "Qa":
	    		System.out.format("%s worker's salary:  %d",worker[0],salary[0]);
	    		break;
	    	case "automation developer":
	    		System.out.format("%s worker's salary:  %d",worker[1],salary[1]);
	    		break;
	    	case "help desk":
	    		System.out.format("%s worker's salary:  %d",worker[2],salary[2]);
	    		break;
	    		
	    	default: 
	    	    System.out.println("unfamiliar worker");
	    	}
	    }
	}


