package passwordProject;
import java.util.Arrays;

public class BruteForce {
  public static void main(String[] args) {
    bruteForce(4);
  }

  public static String bruteForce(int size) {
    int[] password = new int[size];
    String[] finalPassword = new String[size];
    for (int i = 0; i < size; i++) {
      password[i] = 0;
      finalPassword[i] = "";
    }
    String pass = "8535" ;
    return computePermutations(size, password, 0, pass);
  }

  private static String computePermutations(int size, int[] password, int position, String pass) {
    String testString = "";
    String assemble = "";
    for (int i = 0; i < 36; i++) {
      password[position] = i;

      if (position != size - 1) {
        testString = computePermutations(size, password, position + 1, pass);
        if (testString != "") {
          return testString;
        }
      } else if (position == size - 1) {
        for (int j = 0; j < size; j++) {

          switch (password[j] + 1) {
            case 1:
              assemble = assemble + "A";
              System.out.println("Password is: " + assemble);
              break;
            case 2:
              assemble = assemble + "B";
              System.out.println("Password is: " + assemble);
              break;
            case 3:
              assemble = assemble + "C";
              System.out.println("Password is: " + assemble);
              break;
            case 4:
              assemble = assemble + "D";
              System.out.println("Password is: " + assemble);
              break;
            case 5:
              assemble = assemble + "E";
              System.out.println("Password is: " + assemble);
              break;
            case 6:
              assemble = assemble + "F";
              System.out.println("Password is: " + assemble);
              break;
            case 7:
              assemble = assemble + "G";
              System.out.println("Password is: " + assemble);
              break;
            case 8:
              assemble = assemble + "H";
              System.out.println("Password is: " + assemble);
              break;
            case 9:
              assemble = assemble + "I";
              System.out.println("Password is: " + assemble);
              break;
            case 10:
              assemble = assemble + "J";
              System.out.println("Password is: " + assemble);
              break;
            case 11:
              assemble = assemble + "K";
              System.out.println("Password is: " + assemble);
              break;
            case 12:
              assemble = assemble + "L";
              System.out.println("Password is: " + assemble);
              break;
            case 13:
              assemble = assemble + "M";
              System.out.println("Password is: " + assemble);
              break;
            case 14:
              assemble = assemble + "N";
              System.out.println("Password is: " + assemble);
              break;
            case 15:
              assemble = assemble + "O";
              System.out.println("Password is: " + assemble);
              break;
            case 16:
              assemble = assemble + "P";
              System.out.println("Password is: " + assemble);
              break;
            case 17:
              assemble = assemble + "Q";
              System.out.println("Password is: " + assemble);
              break;
            case 18:
              assemble = assemble + "R";
              System.out.println("Password is: " + assemble);
              break;
            case 19:
              assemble = assemble + "S";
              System.out.println("Password is: " + assemble);
              break;
            case 20:
              assemble = assemble + "T";
              System.out.println("Password is: " + assemble);
              break;
            case 21:
              assemble = assemble + "U";
              System.out.println("Password is: " + assemble);
              break;
            case 22:
              assemble = assemble + "V";
              System.out.println("Password is: " + assemble);
              break;
            case 23:
              assemble = assemble + "W";
              System.out.println("Password is: " + assemble);
              break;
            case 24:
              assemble = assemble + "X";
              System.out.println("Password is: " + assemble);
              break;
            case 25:
              assemble = assemble + "Y";
              System.out.println("Password is: " + assemble);
              break;
            case 26:
              assemble = assemble + "Z";
              System.out.println("Password is: " + assemble);
              break;
            case 27:
              assemble = assemble + "0";
              System.out.println("Password is: " + assemble);
              break;
            case 28:
              assemble = assemble + "1";
              System.out.println("Password is: " + assemble);
              break;
            case 29:
              assemble = assemble + "2";
              System.out.println("Password is: " + assemble);
              break;
            case 30:
              assemble = assemble + "3";
              System.out.println("Password is: " + assemble);
              break;
            case 31:
              assemble = assemble + "4";
              System.out.println("Password is: " + assemble);
              break;
            case 32:
              assemble = assemble + "5";
              System.out.println("Password is: " + assemble);
              break;
            case 33:
              assemble = assemble + "6";
              System.out.println("Password is: " + assemble);
              break;
            case 34:
              assemble = assemble + "7";
              System.out.println("Password is: " + assemble);
              break;
            case 35:
              assemble = assemble + "8";
              System.out.println("Password is: " + assemble);
              break;
            case 36:
              assemble = assemble + "9";
              System.out.println("Password is: " + assemble);
              break;
          }

        }
        if (assemble.equalsIgnoreCase(pass)) {
            System.out.println("Password is: " + assemble);
            return assemble; // This is missing
        }
        if (assemble.equalsIgnoreCase(pass)) {
          System.out.println("Password is: " + assemble);
          break; //replace this with: return assemble;
        } else {
          assemble = "";
        }
      }


    }
    return "";
  }
}