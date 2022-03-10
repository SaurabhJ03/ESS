/******************************************************************************

                            Online Java Debugger.
                Code, Run and Debug Java program online.
Write your code in this editor and press "Debug" button to debug program.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
   
     int x = 001, y=010, z=100;
        System.out.println("x="+x);//1
        System.out.println("y="+y);//8
        System.out.println("z="+z);//100
        
        int i = --x + y++ - z-- - --z + ++y - --x + y-- - --x;
        //      0   + 8   - 100 - 98  + 10  - -1  + 10  - -2  
      
         
        System.out.println("x="+x);
        System.out.println("y="+y);
        System.out.println("z="+z);
        System.out.println("i="+i);
                                       
	}
}

hiiiiHello
