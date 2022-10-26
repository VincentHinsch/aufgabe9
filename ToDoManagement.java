package aufgabe9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ToDoManagement {

    private List<ToDo> todoList = new ArrayList<>();


    public void addTodo(ToDo t) {
        todoList.add(t);

    }

    public void showTodoList() {
        Collections.sort(todoList);
        for (ToDo t : todoList) {
            System.out.println(t);

        }
    }

    public List<ToDo> getTodoList() {
        return todoList;
    }

    public void setTodoList(List<ToDo> todoList) {
        this.todoList = todoList;
    }

    public void aufgabeErledigt() {

        for (int i = 0; i < todoList.size(); i++) {
            ;
            System.out.println("[" + "[" + i + "] " + todoList.get(i) + "]");
        }
        Scanner scan = new Scanner(System.in);
        System.out.println("Welche Aufgabe ist erledigt?");
        int indexAuswahl = scan.nextInt();
        todoList.get(indexAuswahl).setState(true);
        showTodoList();


    }

}
