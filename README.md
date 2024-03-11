# TodoList

In this application a user can view, add, update and delete their todos. It is the starting point for an exploration of Event Sourcing.

### To note: 
This is a learning project, with some comments left in for personal reference. 

This project was built without the use of TDD, for reasons of speed, and no testing has been done. This is not best practise but for the focus of this exercise is deemed acceptable. 


### TODO: 
I will be using this project as the base for exploring Event Sourcing

### Getting started  
 To run this project and run from your IDE:

```git clone https://github.com/leah-massey/Kotlin-Todo-List.git```


To start the server, run the main function located here: 
```src/main/kotlin/Main.kt```

When the server is running, the endpoints can be called from Postman. 
For example, to get all todos, run a GET request of the following:
```http://localhost:3000/todos```

## Package
```
./gradlew distZip
```


