package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int n=1;
		 int count=0;
		 
		 if(n>1)
		 {
			 
			 for(int i=1; i<=n; i++)
			 {
				 if(n%i==0)
			     count ++;
			}
			 if(count ==2) 
			 {
				 
				 System.out.println("Prime Number");
				 
			 }
			 else
			 {
				 System.out.println("Not Prime Number");
			 } 
			}
		 else
			 System.out.println("Enter the value which is greater than 1");
		 
		}    
		}   