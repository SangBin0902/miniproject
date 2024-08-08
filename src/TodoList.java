import java.util.*;

public class TodoList {
    private List<Todo> todos;
    Map<String, TodoList> participantTodoLists = new HashMap<>();
    TodoList todoList;
    Scanner sc = new Scanner(System.in);
    private int processNum = 1;
    boolean isRunning=true;

    public TodoList() {
        this.todos = new ArrayList<>();
    }

    public void addTodo() {
        todos.add(new Todo("주간 보고서 작성", false));
        todos.add(new Todo("이메일 확인 및 응답", false));
        todos.add(new Todo("회의 준비", false));
        todos.add(new Todo("프로젝트 계획서 수정", false));
        todos.add(new Todo("팀 멤버와의 1:1 면담", false));
    }

    public Todo getTodo() {
        for (Todo todo : todos) {
            return todo;
        }
        return null;
    }

    public void complete(int index) {
        if (index >= 1) {
            Todo todo = todos.get(index - 1);
            todo.completed();
            System.out.println("Status: 완료");
        }
    }

    public void printTodos() {
        for (Todo todo : todos) {
            System.out.println(todo);
        }
    }

    private void process1() {
        System.out.print("이름을 입력하세요 : ");
        String name = sc.next();
        todoList = participantTodoLists.get(name);
        if (todoList == null) {
            todoList = new TodoList();
            participantTodoLists.put(name, todoList);
            todoList.addTodo();
        }
        processNum++;
    }

    private void process2() {
        System.out.println("1. 주간 보고서 작성, 2. 이메일 확인 및 응답, 3. 회의 준비, 4. 프로젝트 계획서 수정, 5. 팀 멤버와의 1:1 면담");
        System.out.print("Title 번호: ");
        int titleNum = sc.nextInt();
        todoList.complete(titleNum);
        processNum++;
    }

    private void process3() {
        System.out.println("종료여부 : ");
        String next = sc.next();
        if (next.equals("c")) {
            processNum = 2;
        } else if (next.equals("q")) {
            processNum = 1;
        } else if (next.equals("x")) {
            processNum = 4;
        }
    }
    private void process4(){
        for(int i =0; i<participantTodoLists.size(); i++){
            System.out.println("값");
        }
        isRunning=false;
    }
    public void run() {
        while(isRunning) {
            if(processNum==1){
                process1();
            }else if(processNum==2){
                process2();
            }else if(processNum==3){
                process3();
            }else if(processNum==4){
                process4();
            }
        }
    }
}
