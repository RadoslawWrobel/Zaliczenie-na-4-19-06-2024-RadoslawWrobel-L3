/* Napisz program, który wypisze znak o podanym indeksie z ciągu znaków:
- Program przyjmuje łańcuch znaków i indeks wprowadzony przez użytkownika.
- Wypisuje znak znajdujący się na podanym indeksie w łańcuchu.
  */
import java.util.Scanner;

public class Main 
{
  public static void main(String[] args) 
  {
    Scanner SkanerDoKolokwium = new Scanner(System.in);
    System.out.println("Podaj Twój łańcuch: ");
    String Tekst = SkanerDoKolokwium.nextLine();

    System.out.println("Podaj numer indeksu: ");
    int Indeks = SkanerDoKolokwium.nextInt();
    char IndeksLitery = Tekst.charAt(Indeks);
    System.out.println("Znak o podanym indeksie to: " + IndeksLitery);
  }

}