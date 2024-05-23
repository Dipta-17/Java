//Write a Java program that prints the season name corresponding to its month number using If-else and switch - case statements

import java.util.*;

public class season_9{
     public static void main(String ages[]){
     
     String season=" ";
     System.out.println("Enter any month from 1 to 12:");
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     if(n<=12)
    {

      switch(n)
      {     
        case 12:
        case 1:
	
	season = "Winter";
        break;
	case 2:
	case 3:
	
        season = "Spring";
	break;
	case 4:
        case 5:
        case 6:
       
	season = "summer";
        break;
	case 7:
      	case 8:
        case 9:
        season = "Monsoon";
	break;

	case 10:
 	case 11:
      	season = "Autumn";
	break;
        default:
        season = "invalid month";
	break;
        
        }
      }
      
     else{
        
	season = "Bogus Month";
     }
    
    System.out.println("The entered month is in the " + season + ".");
     

    }

}

