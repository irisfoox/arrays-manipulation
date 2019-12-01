package lesson4;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int[] arr=new int[120];
         int i;
         int sum=0;
         for(i=0;i<120;i++) {
        	 arr[i]=i+1;
        	 sum=sum+arr[i];
         }
        
         System.out.println("array's sum is: "+ sum);
         
         sum=0;
         for(i=1;i<120;i=+2) {
        	 sum=sum+arr[i];
         }
         System.out.println("array's pairs sum is: "+ sum);
		
         int max=0;
         for(i=0;i<120;i=+2) {
        	 if (max<arr[i]) {
        		 max=arr[i];
        	 }
         }
         System.out.println("array's maximun number is: "+ max);
	}

}
