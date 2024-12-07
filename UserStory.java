import java.util.Scanner;

public class UserStory {
  //Instance variables
    private int[] Year;
    private String[] Winner;

// Constructor: initializes Year and Winner arrays
    public UserStory(String YearFile, String WinnerFile) {
        Year = FileReader.toIntArray(YearFile);    
        Winner = FileReader.toStringArray(WinnerFile);  }
  
  
 // Method to get the winners based of the number entered
    public int getWinner() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number to look up the winner:");
        int option = input.nextInt();
        input.nextLine();
        input.close();
        return option;
    }




  
}