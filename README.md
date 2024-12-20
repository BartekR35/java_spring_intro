Basic project on Spring:

1. Created controller which is mapping methods.
     a. hello() - This method handles the HTTP request to the "/" address (the main page of the application).
        Annotation @GetMapping(“/”) means that this is a method that handles GET requests to the "/" address.
        IT returns a simple text: “Hello Vistula. This is my first Spring Controller.”, but it is not an HTML view.
     b. greeting() - This method handles GET requests on the /greeting address. With the @RequestParam annotation, you can dynamically pass the name parameter in the URL, such as:
        http://localhost:8080/greeting?name=Vistula
        If the name parameter is not passed, the default value is “World” (defined by defaultValue = “World”).
        Adding the value of the name parameter to the model (model.addAttribute(“name”, name)). The model is the mechanism that allows you to pass data to the HTML view.
        Returning the name of the greeting.html view (a file in the templates directory).

2. Created the View "greeting.html" - it is an HTML file that uses Thymeleaf as a template engine. Thymeleaf allows you to dynamically insert data from the controller into the HTML file.
3. How it works?
     a. When you open http://localhost:8080/, Spring will run the hello() method. You will get a response in plain text (if you add @ResponseBody).
     b. When you open http://localhost:8080/greeting, Spring will run the greeting() method.If you add a name parameter in the URL, such as http://localhost:8080/greeting?name=Vistula, the parameter will be added to the model (name = Vistula).
         Spring will pass the model to the greeting.html view, and Thymeleaf will insert the value of the name variable into the HTML tag.
