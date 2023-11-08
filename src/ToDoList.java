import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int opcja;
        ArrayList<Zadanie> lista = new ArrayList<Zadanie>();
        do{
            System.out.println("1. Dodaj nowe zadanie");
            System.out.println("2. Oznacz zadanie jako zakończone");
            System.out.println("3. Usuń zadanie");
            System.out.println("4. Wyświelt listę zadań");
            System.out.println("5. Wyjście");
            System.out.println("Wybierz opcję (1/2/3/4/5)");

            opcja = scan.nextInt();
            int num;
            switch (opcja){
                case 1:
                    Scanner userInput = new Scanner(System.in);
                    System.out.println("Podaj nazwę zadania: ");
                    String temat = userInput.nextLine();
                    System.out.println("Podaj treść zadania: ");
                    String tresc = userInput.nextLine();
                    num = lista.size()+1;
                    lista.add(new Zadanie(num,temat,tresc));
                    System.out.println("Zadanie "+temat+" zostało dodane");
                    break;
                case 2:
                    System.out.print("Podaj numer zadania do oznaczenia jako zakończone: ");
                    num = scan.nextInt();
                    lista.get(num-1).zrobienie();
                    System.out.println("Zadanie "+lista.get(num-1).getTemat()+" zostało oznaczone jako zrobione");
                    break;
                case 3:
                    System.out.print("Podaj numer zadania do usunięcia: ");
                    num = scan.nextInt();
                    System.out.println("Zadanie "+lista.get(num-1).getTemat()+" zostało usunięte");
                    lista.remove(num-1);
                    break;
                case 4:
                    System.out.println("Lista zadań: ");
                    lista.forEach((n)-> n.wyswietl());
                    break;
                default:
                    System.out.println("Błędny numer");

            }

        }while(opcja!=5);
    }
}
