public class CallByValueExByValue {
	
	int data=50;  
    void change(int data){  
	  data=data+100;
	  System.out.println("Change method value:"+data);
	}  
		     
	 public static void main(String args[]){  
		 CallByValueExByValue op=new CallByValueExByValue();  
	  
	   System.out.println("before change "+op.data);  
	   op.change(500);  
	   System.out.println("after change "+op.data);  
	  
	 }  
	  
	

}
