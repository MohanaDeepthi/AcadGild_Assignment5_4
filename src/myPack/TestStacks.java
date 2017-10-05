package myPack;//package name

import java.util.Scanner;

public class TestStacks {//Test class
	
	public static void main(String args[]) throws StackException{//main method
		
		@SuppressWarnings("resource")//suppress scanner input warning
		Scanner inpScanner = new Scanner(System.in);//instantiating Scanner object
		System.out.println("Enter \n 1.For FixedStack \n 2.For VariableStack");
		String inpStack = inpScanner.next();
		System.out.println("Enter size of the stack");//Take the size of the stack from the user
		int size=inpScanner.nextInt();
		Stack f1 = null;//instantiate Stack object
		if(inpStack.equalsIgnoreCase("1")){
			
			f1=new FixedStack(size);//Instantiate FixedStack Object
		}
		else if(inpStack.equalsIgnoreCase("2")){
			
			f1=new VariableStack(size);//Instantiate variable stack object
			
		}
		
		System.out.println("Enter the element to push to Stack Type -1 to exit ");
		//logic to read the elements to the stack
		while(true)
		{        
			int num = inpScanner.nextInt();//read input from user
			if(num==-1){
				System.exit(0);//exit if user enters -1
			}
			else{
			f1.push(num);//push to stack
			
			}
			
            
        }//end of while loop
	
		
		
	}//end of main method

}//end of class
