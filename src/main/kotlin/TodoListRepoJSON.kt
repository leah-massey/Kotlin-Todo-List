import interfaces.TodoListRepo
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import java.io.File

class TodoListRepoJSON: TodoListRepo {

    val todoListFile = File("./src/resources/todo_list.json") // pass this value in as a parameter?
    val mapper: ObjectMapper = jacksonObjectMapper()
    override fun getTodos(): TodoList {
        val todoList: TodoList = mapper.readValue(todoListFile) // turn to a list of todoItems
        return todoList
    }

    override fun updateTodos(updatedTodoList: TodoList) = mapper.writeValue(todoListFile, updatedTodoList)

}
