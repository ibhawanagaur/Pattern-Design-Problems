package Patterns;
import java.util.Scanner;
public class SumPattern {
	public static void main(String[] args) {
		System.out.print("Enter the number of rows n = ");

        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int i =1;
        int sum = i;
		while(i<=n) {
			int t= 1;
			for(int j=1;j<=i;j++) {
				if(t<i){
					System.out.print(t+"+");            
			  		t++;  
				}
				else {
					System.out.print(t+"="+sum);   
					}
			}
			System.out.println();  
            i=i+1;
		    sum=sum+i;
		}
	}
}
/*
        Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		int sum=i;    
 		 while(i<=n){
		int t=1;    //starting number    
        int j=1;
		while(j<=i){                    
         	if(t<i){
			System.out.print(t+"+");            
  			 t++;                                          
   			j++;
 }              

else{            
       System.out.print(t+"="+sum);            
        j++;
                      }
          }        
   System.out.println();    
      i++;      
     sum=sum+i;
        }
    }
    
}*/