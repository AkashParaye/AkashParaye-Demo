
public class Pattern9
{
  public static void main(String[] args) {
	
	  System.out.println("Program Started");
	  
	  int lines = 5 ;
	  int starCount = 9 ;
	  int spaceCount = 0 ;
	  
	  for(int i = 1 ; i <=lines ; i++)
	  {
		  for(int j = 1 ; j <=spaceCount ; j++)
		  {
			  System.out.print(" ");
		  }
		  for(int k = 1 ; k<=starCount ; k++)
		  {
			  System.out.print("*");
		  }
		  System.out.println();
		  starCount = starCount - 2 ;
		  spaceCount++;
	  }
	  System.out.println("Progrom Ended");
	  
}
}
