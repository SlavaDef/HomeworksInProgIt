package org.homework.collections;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

//  Список завдань. Створіть програму для створення списку завдань, які
// користувач може додавати, видаляти та відзначати як виконані. Використайте
//стандартні колекції.
class Task {

    private String date;

    private final String title;

    private final String context;

    private String isMade;


    public Task(String date, String title, String context, String isMade) {
        this.date = date;
        this.isMade = isMade;
        this.title = title;
        this.context = context;
    }

    public Task(String title, String context, String isMade) {
        this.title = title;
        this.context = context;
        this.isMade = isMade;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setIsMade(String isMade) {
        this.isMade = isMade;
    }

    @Override
    public String toString() {
        return "Task{" +
                "date='" + date + '\'' +
                ", title='" + title + '\'' +
                ", context='" + context + '\'' +
                ", isMade='" + isMade + '\'' +
                '}';
    }
}

class TaskService {

    private final Map<Long, Task> tasksMap;

    String data;

    public String utcCreator() {
        int max = 15;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("UTC+");
        int temp = (int) (Math.random() * ++max);
        stringBuilder.append(temp);

        return stringBuilder.toString();
    }

    public String dataCreator() {
        return data = DateTimeFormatter.ofPattern(" yyyy-MM-dd HH:mm:ss ")
                .format(LocalDateTime.now(ZoneId.of(utcCreator()))) + " " + utcCreator();
    }

    public TaskService() {
        this.tasksMap = new HashMap<>();
        tasksMap.put(1L, new Task(dataCreator(), "HomeWork", "Cleanning Comp", "not done"));
        tasksMap.put(2L, new Task(dataCreator(), "Run", "run 15 miles", "not done"));
        tasksMap.put(3L, new Task(dataCreator(), "Sport", "go to sport room", "done"));
    }

    public void findAll() {
        for (Map.Entry<Long, Task> stringStringEntry : tasksMap.entrySet()) {
            System.out.println(stringStringEntry);
        }
    }

    public void addTask(Task task) {
        task.setDate(dataCreator());
        tasksMap.put(tasksMap.size() + 1L, task);
    }

    public void deleteTask(Long id) {
        if (!tasksMap.containsKey(id)) {
            System.out.println("No such id");
        }
        tasksMap.remove(id);
    }

    public void isMadeTask(Long id) {
        if (!tasksMap.containsKey(id)) {
            System.out.println("No such id");
        }
        tasksMap.get(id).setIsMade("done");

    }
}

class TestTasks {

    public static void main(String[] args) {

        TaskService taskService = new TaskService();

        taskService.findAll();
        System.out.println("------------------------------------");
        taskService.addTask(new Task("Brecfast", "to buy somethin for  breakfast", "not done"));
        taskService.findAll();
        System.out.println("------------------------------------");
        taskService.deleteTask(5L);
        taskService.findAll();
        System.out.println("------------------------------------");
        taskService.isMadeTask(1L);
        taskService.findAll();
    }
}