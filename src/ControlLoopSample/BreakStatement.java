package ControlLoopSample;

public class BreakStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] arrayOfInts = { 32, 87, 3, 589, 12, 1076, 2000, 0, 622, 127, };
       int searchfor = 12;
       
       int i = 0;
       boolean foundIt =false;
       
       for( ; i<arrayOfInts.length; i++) {
    	   if(arrayOfInts[i] == searchfor) {
    		   foundIt = true;
    		   break;
    	   
    	   }
       }
       
       if (foundIt) {
    	   System.out.println("Found" + searchfor +" at index " + i);
    	   
       }else {
    	   System.out.println(searchfor + " not in the array ");
       }
	}

}
