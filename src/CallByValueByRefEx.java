public class CallByValueByRefEx {
	
	 int data=50;  
	  
	 void change(CallByValueByRefEx op){  
	 op.data=op.data+100;//changes will be in the instance variable  
	 }  
	     
	    
	 public static void main(String args[]){  
		 CallByValueByRefEx op=new CallByValueByRefEx();  
	  
	   System.out.println("before change "+op.data);  
	   op.change(op);//passing object  
	   System.out.println("after change "+op.data);  
	  
	 }  

}
