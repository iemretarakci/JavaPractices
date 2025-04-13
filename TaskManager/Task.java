package DataStructure.TaskManager;

public class Task {
    String taskName;
    String taskDescription;

    public Task(String taskName, String taskDescription){
        this.taskName = taskName;
        this.taskDescription = taskDescription;
    }
    @Override
    public String toString(){
        return "Görev: " + taskName + " - Açıklama: " + taskDescription;
    }
}
