import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, TodoList> participantTodoLists = new HashMap<>();
        boolean isRunning = true;

        while(isRunning) {
            System.out.print("이름을 입력하세요 : ");
            String name = scanner.nextLine();

            TodoList todoList = participantTodoLists.get(name);
            if (todoList == null) {
                todoList = new TodoList();
                participantTodoLists.put(name, todoList);
                todoList.addTodo();
            }

            //todoList.printTodos();
            System.out.println("1. 주간 보고서 작성, 2. 이메일 확인 및 응답, 3. 회의 준비, 4. 프로젝트 계획서 수정, 5. 팀 멤버와의 1:1 면담");
            System.out.print("Title 번호: ");
            int titleNum = scanner.nextInt();
            scanner.nextLine();
            todoList.complete(titleNum);
            System.out.println("종료여부 : ");

            isRunning = false;
        }
    }
}