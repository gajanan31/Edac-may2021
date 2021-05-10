public class DecToOctal{    
  
    
public static void main(String args[]){      
 int rem=0,decimal=15;  
     String octalStr="";   
     char octal[]={'0','1','2','3','4','5','6','7'};  
  

 while(decimal>0)  
     {  
        	  
       rem=decimal%8;
	   octalStr=octal[rem]+octalStr;	   
       decimal=decimal/8;

     }  
     System.out.println("Octal  is: "+octalStr);  
       
}}  
