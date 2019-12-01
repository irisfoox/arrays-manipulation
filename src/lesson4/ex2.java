package lesson4;

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
	    String arr[]= {"michael","daniel","sara"};
	    String names=String.format("%s ,"+"%s ,"+"%s" , arr[0],arr[1],arr[2]);
	    System.out.println(names);
	    
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
