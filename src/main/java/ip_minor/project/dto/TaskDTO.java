package ip_minor.project.dto;

import ip_minor.project.domain.SubTask;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.List;


public class TaskDTO {
    private Long id;
    @NotNull
    private String title;
    private String description;
    private LocalDateTime dueDate;
    private List<SubTask> subtasks;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDateTime dueDate) {
        this.dueDate = dueDate;
    }

    public List<SubTask> getSubtasks() {
        return subtasks;
    }

    public void setSubtasks(List<SubTask> subtasks) {
        this.subtasks = subtasks;
    }

    public void addSubTask(SubTask subTask) {
        this.subtasks.add(subTask);
    }

    public void removeSubTask(SubTask subTask) {
        this.subtasks.remove(subTask);
    }
}
