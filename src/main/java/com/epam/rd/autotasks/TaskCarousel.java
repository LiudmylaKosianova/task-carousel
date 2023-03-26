package com.epam.rd.autotasks;

/**
 *  A task carousel has a capacity provided as a constructor parameter.
 * - The `TaskCarousel` has `isEmpty` method.
 *   It returns `true` if there is no task in the carousel for execution.
 *   Returns `false` otherwise.
 * - The `TaskCarousel` has `isFull` method.
 *   It returns `true` if there is no more room in the carousel to add another task.
 *   Returns `false` otherwise.
 * - You may add tasks to the carousel via `addTask` method. It returns `true` if the task
 * is accepted and `false` otherwise.
 *   Task may be not accepted due to following reasons:
 *   - Task argument is null.
 *   - Task is already finished.
 *   - Carousel is full.
 * - You may execute tasks in the carousel via `execute` method.
 *   - Each time when this method is invoked, carousel must switch to the next task within and execute it.
 *   - Iteration is in circular manner.
 *     If there are 4 tasks inside a carousel,
 *     then if we call `execute` method on the carousel 4 times in a row,
 *     each task must be executed once.
 *   - If the task is finished after execution, remove it from the carousel.
 *   - The method returns `true` if any task was executed. Returns `false` otherwise.
 */

public class TaskCarousel {

    public TaskCarousel(int capacity) {
        throw new UnsupportedOperationException();
    }

    public boolean addTask(Task task) {
        throw new UnsupportedOperationException();
    }

    public boolean execute() {
        throw new UnsupportedOperationException();
    }

    public boolean isFull() {
        throw new UnsupportedOperationException();
    }

    public boolean isEmpty() {
        throw new UnsupportedOperationException();
    }

}
