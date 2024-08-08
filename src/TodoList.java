import java.util.ArrayList;
import java.util.List;

public class TodoList {
    private List<Todo> todos;

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
        for(Todo todo : todos) {
            return todo;
        }
        return null;
    }

    public void complete(int index) {
        if(index >=1 ) {
            Todo todo = todos.get(index - 1);
            todo.completed();
            System.out.println("Status: 완료");
        }
    }

    public void printTodos() {
        for(Todo todo : todos) {
            System.out.println(todo);
        }
    }
}
