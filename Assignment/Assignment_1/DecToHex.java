public class DecToHex{    
  
    
public static void main(String args[]){      
 int rem=0,decimal=15;  
     String hex="";   
     char hexchars[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};  
  

 while(decimal>0)  
     {  
        	  
       rem=decimal%16;
       hex=hexchars[rem]+hex; 
	   decimal=decimal/16;
	   
     }  
     System.out.println("Hexadecimal  is: "+hex);  
       
}}  
