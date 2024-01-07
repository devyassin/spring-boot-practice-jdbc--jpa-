package com.restApi.RestAPI.todo;


import com.restApi.RestAPI.security.AuthenticationService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.time.LocalDate;
import java.util.List;

//@Controller
@SessionAttributes("name")
public class TodoController {

    @Autowired
    private TodoService todoService;

    @Autowired
    private AuthenticationService authenticationService;

    @RequestMapping("todos-list")
    public String listAlltodos(ModelMap model){
        String userName= getUserName();
        List<Todo> todos= todoService.findByUsername(userName);
        model.addAttribute("todos",todos);
        return "listTodos";
    }

    private String getUserName() {
        return authenticationService.getLoggedinUsername();
    }

    @RequestMapping(value = "add-todo",method = RequestMethod.GET)
    public String showNewTodoPage(ModelMap model){
        String username = getUserName();

        Todo todo = new Todo(0, username, "Default Desc",
                LocalDate.now().plusYears(1), false);
        model.put("todo", todo);
        return "todo";
    }

    @RequestMapping(value = "add-todo",method = RequestMethod.POST)
    public String AddNewTodo(@Valid  Todo todo,BindingResult result, ModelMap model){
        if(result.hasErrors()) {
            return "todo";
        }
        todoService.addNewTodo(getUserName(),todo.getDescription(), todo.getTargetDate(),false);
        return "redirect:todos-list";
    }

    @RequestMapping(value = "delete-todo",method = RequestMethod.GET)
    public String deleteTodo(@RequestParam int id){
        todoService.deleteTodo(id);
        return "redirect:todos-list";
    }

    @RequestMapping(value = "update-todo",method = RequestMethod.GET)
    public String showUpdateTodoPage(@RequestParam int id,ModelMap model){
        Todo todo=todoService.findTodoByID(id);
        model.put("todo",todo);
        return "todo";
    }

    @RequestMapping(value = "update-todo",method = RequestMethod.POST)
    public String updateTodo(@RequestParam int id,@Valid  Todo todo){
        System.out.println(id +"------------");
        System.out.println(todo);
        todoService.updateTodo(todo);
        return "redirect:todos-list";
    }
}
