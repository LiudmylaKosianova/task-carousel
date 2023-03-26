package com.epam.rd.autotasks;

import java.util.ArrayList;


public class TaskCarousel {
    public int capacity, countExecuteCalls;
    ArrayList <Task> tasks = new ArrayList<>();

    public TaskCarousel(int capacity) {
        //throw new UnsupportedOperationException();
        this.capacity = capacity;
    }

    /**
     * You may add tasks to the carousel via `addTask` method.
     * It returns `true` if the task is accepted and `false` otherwise.
     * Task may be not accepted due to following reasons:
     *  *   - Task argument is null.
     *  *   - Task is already finished.
     *  *   - Carousel is full.
     * @param task
     * @return `true` if the task is accepted and `false` otherwise.
     */
    public boolean addTask(Task task) {
        //throw new UnsupportedOperationException();
        if(task == null || task.isFinished() || isFull()){return false;}

        if(tasks.size()<capacity){
            tasks.add(task);
            return true;
        }else{return false;}

    }

    /**
     * You may execute tasks in the carousel via `execute` method.
     * - Each time when this method is invoked, carousel must switch to the next task within and execute it.
     * - Iteration is in circular manner.
     *  *     If there are 4 tasks inside a carousel,
     *  *     then if we call `execute` method on the carousel 4 times in a row,
     *  *     each task must be executed once.
     *  *   - If the task is finished after execution, remove it from the carousel.
     *  *   - The method returns `true` if any task was executed. Returns `false` otherwise.
     * @return
     */
    public boolean execute() {

        if(isEmpty()){return false;}

        tasks.get(countExecuteCalls).execute();

        if(tasks.get(countExecuteCalls).isFinished()){
            tasks.remove(countExecuteCalls);
            countExecuteCalls--;
        }

        countExecuteCalls++;
        if(countExecuteCalls == tasks.size()){
            countExecuteCalls=0;
        }
        return true;
    }

    /**
     * @return `true` if there is no more room in the carousel to add another task.
     * Returns `false` otherwise.
     */
    public boolean isFull() {
        //throw new UnsupportedOperationException();
        return tasks.size()==capacity;

    }

    /**
     * @return `true` if there is no task in the carousel for execution.
     * Returns `false` otherwise.
     */
    public boolean isEmpty() {
        //throw new UnsupportedOperationException();
        return tasks.size()==0;
    }

}
