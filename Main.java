import java.awt.geom.Arc2D;
import java.util.Scanner;
  
class Main {
  public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
        System.out.print("Wprowadź tekst: ");
        String tekst = scanner.nextLine();
        int z = 0;
        String wynik = "";
          for (int i = 0; i<tekst.length(); i++)
          {
            char c = tekst.charAt(i);

            if (Character.isLowerCase(c))
                {
                  c = Character.toUpperCase(c);
                  z++;
                }
            wynik+=c;
          }
         
        
          System.out.println("Tekst po zmianie: "+wynik);
          System.out.println(""+z);
        }
        }
  