package myPack;//package name

//class Fixed Stack extends Stack
public class FixedStack implements Stack {
	
	 private int stackArray[ ];//declare stackArray of type integer
     private int topOfStack;//Top of the stack 
	
	 public FixedStack(int size)//constructor
     {
		 	stackArray=new int[size];//stack Array
             this.topOfStack=-1;//top of the stack
     }//end of constructor

	@Override
	public void push(int I) throws StackException {//push method implementation logic
		
		 	if(topOfStack==stackArray.length-1)//check if size of the stack is full
		 		throw new StackException("Stack Overflows");//throw exception if stack is full
		 	else
		 		stackArray[++topOfStack]=I;//push the element to stack and increment top variable
         
	}//end of method

	@Override
	public int pop() throws StackException{//pop method implementation logic
		 if(topOfStack<0)//check if the size of the stack is less than 0
			 throw new StackException("Stack Underflows");
         else
        	 return stackArray[topOfStack--];//pop the element from the stack
	}//end of the method
	
	
}//end of the class

