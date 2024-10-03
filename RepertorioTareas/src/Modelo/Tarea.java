
package Modelo;
    
public class Tarea {
    int completed;
    String tareas;
    
    public Tarea(){
    
    }
    public Tarea(String tareas, int completed){
        this.tareas = tareas;
        this.completed = completed;
    }

    public int getCompleted() {
        return completed;
    }

    public void setCompleted(int completed) {
        this.completed = completed;
    }
    
    public String getTareas() {
        return tareas;
    }

    public void setTareas(String tareas) {
        this.tareas = tareas;
    }
    
}
