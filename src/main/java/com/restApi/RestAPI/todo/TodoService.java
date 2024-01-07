package com.restApi.RestAPI.todo;

import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {
    private static List<Todo> todos=new ArrayList<>();

    static {
        todos.add(new Todo(1, "yassine lamouadden","Learn AWS",
                LocalDate.now().plusYears(1), false ));
        todos.add(new Todo(2, "in28minutes","Learn DevOps",
                LocalDate.now().plusYears(2), false ));
        todos.add(new Todo(3, "in28minutes","Learn Full Stack Development",
                LocalDate.now().plusYears(3), false ));
    }

    public List<Todo> findByUsername(String username){
        List<Todo> todosOftheLoggedUser= new ArrayList<>();
        for (Todo todo: todos){
            if (username.equals(todo.getUsername())){
                todosOftheLoggedUser.add(todo);
            }
        }
        return todosOftheLoggedUser;
    }


    public void addNewTodo(String username,String description,LocalDate date,boolean done){
        int randomId = (int) (Math.random() * (100000 - 1) + 1); // Generate a random integer between 1 and 100000
        todos.add(new Todo(randomId, username, description, date, done));
    }

    public void deleteTodo(int id){
        todos.removeIf(todo -> todo.getId() == id);
    }

    public Todo findTodoByID(int id) {
        for (Todo todo : todos) {
            if (todo.getId() == id) {
                return todo;
            }
        }
        return null; // If the todo with the given ID is not found, return null
    }


        public void updateTodo(@Valid Todo todo) {
            deleteTodo(todo.getId());
            todos.add(todo);
        }

}
