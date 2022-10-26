package aufgabe9;

import java.util.Scanner;

public class App {
    private final static Scanner scanner = new Scanner(System.in);
    private final ToDoManagement management = new ToDoManagement();
    private final ToDo myToDo = new ToDo();
    private final String MENU = "1: Aufgabe erstellen\n" +
            "2: Aufgaben auflisten\n" +
            "3: Aufgaben bearbeiten\n" +
            "4: Hilfe\n" +
            "5: Programmende\n";

    public static void main(String[] args) {

        new App().run();


    }

    private void run() {

        System.out.println(MENU);


        app:
        while (true) {
            System.out.print("Bitte Menüpunkt wählen: ");
            String input = scanner.nextLine().trim().toLowerCase();

            switch (input) {

                case "1":
                    createToDo();
                    break;
                case "2":
                    management.showTodoList();
                    break;
                case "3": management.aufgabeErledigt();
                    break;
                case "4":
                    System.out.println(MENU);
                    break;
                case "5":
                    System.out.println("Programm beendet.");
                    break app;
                default:
                    System.out.println("Falsche Eingabe. Bitte wähle erneut aus dem Menu aus.\n\n" + MENU);
            }
        }

    }

    private void createToDo() {

        String eingabeTitel = scanner.nextLine();
        ToDo t = new ToDo(eingabeTitel);
        System.out.println(t);
        management.addTodo(t);
    }



    }




