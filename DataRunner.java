import java.util.Scanner;

public class DataRunner {
  public static void main(String[] args) {
    // Initializes a new UserStory object named player 
    UserStory player = new UserStory("Year.txt", "Winner.txt");
    
    // Creates a variable to the likings of user's which sets it to "new"
    String choice = "new";
    Scanner input = new Scanner(System.in);

      // Prompts user to choose which information to retrieve
      System.out.print("Enter an option (1-48): ");



    // Ensure the input is a valid integer between 1 and 48
      int option = input.nextInt();
  


    // Check if the input option is valid
      if (option < 1 || option > 48) {
        System.out.println("Invalid option. Please select a number between 1 and 48.");
      } else {
        // Show the past winners of COPA AMERICA
        if (option == 1) {
          System.out.println("Uruguay 1916.");
        } else if (option == 2) {
          System.out.println("Uruguay 1917.");
        } else if (option == 3) {
          System.out.println("Brazil 1919.");
        } else if (option == 4) {
          System.out.println("Uruguay 1920.");
        } else if (option == 5) {
          System.out.println("Argentina 1921.");
        } else if (option == 6) {
          System.out.println("Brazil 1922.");
        } else if (option == 7) {
          System.out.println("Uruguay 1923.");
        } else if (option == 8) {
          System.out.println("Uruguay 1924.");
        } else if (option == 9) {
          System.out.println("Argentina 1925.");
        } else if (option == 10) {
          System.out.println("Uruguay 1926.");
        } else if (option == 11) {
          System.out.println("Argentina 1927.");
        } else if (option == 12) {
          System.out.println("Argentina 1929.");
        } else if (option == 13) {
          System.out.println("Uruguay 1935.");
        } else if (option == 14) {
          System.out.println("Argentina 1937.");
        } else if (option == 15) {
          System.out.println("Peru 1939.");
        } else if (option == 16) {
          System.out.println("Argentina 1941.");
        } else if (option == 17) {
          System.out.println("Uruguay 1942.");
        } else if (option == 18) {
          System.out.println("Argentina 1945.");
        } else if (option == 19) {
          System.out.println("Argentina 1946.");
        } else if (option == 20) {
          System.out.println("Argentina 1947.");
        } else if (option == 21) {
          System.out.println("Brazil 1949.");
        } else if (option == 22) {
          System.out.println("Paraguay 1953.");
        } else if (option == 23) {
          System.out.println("Argentina 1955.");
        } else if (option == 24) {
          System.out.println("Uruguay 1956.");
        } else if (option == 25) {
          System.out.println("Argentina 1957.");
        } else if (option == 26) {
          System.out.println("Brazil 1922.");
        } else if (option == 27) {
          System.out.println("Uruguay 1959.");
        } else if (option == 28) {
          System.out.println("Bolivia 1963.");
        } else if (option == 29) {
          System.out.println("Uruguay 1967.");
        } else if (option == 30) {
          System.out.println("Peru 1975.");
        } else if (option == 31) {
          System.out.println("Paraguay 1979.");
        } else if (option == 32) {
          System.out.println("Uruguay 1983.");
        } else if (option == 33) {
          System.out.println("Uruguay 1987.");
        } else if (option == 34) {
          System.out.println("Brazil 1989.");
        } else if (option == 35) {
          System.out.println("Argentina 1991.");
        } else if (option == 36) {
          System.out.println("Argentina 1993.");
        } else if (option == 37) {
          System.out.println("Uruguay 1995.");
        } else if (option == 38) {
          System.out.println("Brazil 1997.");
        } else if (option == 39) {
          System.out.println("Brazil 1999.");
        } else if (option == 40) {
          System.out.println("Colombia 2001.");
        } else if (option == 41) {
          System.out.println("Brazil 2004.");
        } else if (option == 42) {
          System.out.println("Brazil 2007.");
        } else if (option == 43) {
          System.out.println("Uruguay 2011.");
        } else if (option == 44) {
          System.out.println("Chile 2015.");
        } else if (option == 45) {
          System.out.println("Chile 2016.");
        } else if (option == 46) {
          System.out.println("Brazil 2019.");
        } else if (option == 47) {
          System.out.println("Argentina 2021.");
        } else if (option == 48) {
          System.out.println("Chile 2015.");
        }
      }
  }
}