package myPack;

public class VariableStack implements Stack {
	
	 private int stackArray[ ];
     private int topOfStack;
     
     public VariableStack(int size){
    	 stackArray=new int[size];//stack Array
         this.topOfStack=-1;// initialize top of the stack
     }

	@Override
	public void push(int I) {
		//logic to implement push method for the dynamic stack
		if(topOfStack==stackArray.length-1)//if stack is full
        {
			 
			 int t[ ]=new int[stackArray.length * 2];//initialize an array with double the size
            for(int i=0;i<stackArray.length;i++)
                    t[i]=stackArray[i];
            stackArray=t;
            stackArray[++topOfStack]=I;//push the element to stack
            
            
        }
		 else
			 stackArray[++topOfStack]=I;
        

	}

	@Override
	public int pop() {
		if(topOfStack<0)
        {
                System.out.println("Stack Underflows.");
                return 0;
        }
        else
                return stackArray[topOfStack--];//remove element from the stack

	}

}
