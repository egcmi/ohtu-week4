package ohtu;

import java.util.ArrayList;

public class Submission {
    private String student_number;
    private int week, hours;
    private ArrayList<Boolean> tasks;
    private Boolean a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21;

    public void addAToArrayList(){
        tasks = new ArrayList<Boolean>();
        tasks.add(a1);
        tasks.add(a2);
        tasks.add(a3);
        tasks.add(a4);
        tasks.add(a5);
        tasks.add(a6);
        tasks.add(a7);
        tasks.add(a8);
        tasks.add(a9);
        tasks.add(a10);
        tasks.add(a11);
        tasks.add(a12);
        tasks.add(a13);
        tasks.add(a14);
        tasks.add(a15);
        tasks.add(a16);
        tasks.add(a17);
        tasks.add(a18);
        tasks.add(a19);
        tasks.add(a20);
        tasks.add(a21);
    }
    
    public int getWeek() {
        return week;
    }

    public void setWeek(int week) {
        this.week = week;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public ArrayList<Boolean> getTasks() {
        return tasks;
    }

    public void setTasks(ArrayList<Boolean> tasks) {
        this.tasks = tasks;
    }

    public String getStudent_number() {
        return student_number;
    }

    public void setStudent_number(String student_number) {
        this.student_number = student_number;
    }

    public String getCompletedTasks() {
        String completed = "";
        for (int i = 0; i<tasks.size(); i++){
            if (tasks.get(i) != null && tasks.get(i)){
                completed += (i + 1) + " ";
            }
        }
        return completed;
    }

    public int getTotalCompleted() {
        int completed = 0;
        for (Boolean task : tasks){
            if (task != null && task)
                completed++;
        }
        return completed;
    }
 
    public int getTotalTasks() {
        int total = 0;
        for (Boolean task : tasks){
            if (task != null)
        total++;
        }
        return total;
    }
    
    @Override
    public String toString() {
        addAToArrayList();
        return "week " + week + ": total completed: " + getTotalCompleted() + " (out of " + getTotalTasks()
                + "), hours taken: " + hours + ", tasks completed: " + getCompletedTasks();
    }
    
}