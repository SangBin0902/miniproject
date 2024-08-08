public class Todo {
    private String name;
    private boolean isCompleted;

    public Todo(String name, boolean isCompleted) {
        this.name = name;
        this.isCompleted = false;
    }

    public String getName() {
        return name;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void completed() {
        this.isCompleted = true;
    }

    @Override
    public String toString() {
        return "name='" + name + ", 진행여부=" + (isCompleted ? "완료" : "미완");
    }
}
