# ChainOfResponsibilityMiddleware

ChainOfResponsibilityMiddleware is a Java-based project demonstrating the implementation of the Chain of Responsibility design pattern applied to middleware development. This approach is particularly useful for creating flexible and decoupled systems where requests pass through a sequence of handlers or middleware components.

## Description

The Chain of Responsibility pattern allows an object to send a command without knowing which object will handle the request. This project translates this concept into a middleware context, where each piece of middleware can process the request or pass it to the next component in the chain.

This pattern is widely used in web server frameworks and applications, allowing for dynamic request handling and preprocessing. In this project, we demonstrate how to implement a scalable and maintainable middleware pipeline in Java.

## Features

- Implementation of the Chain of Responsibility pattern in Java.
- Example middleware components for logging, authorization, and caching.
- Extensible framework for adding additional middleware components.
- Simple demonstration of middleware in action with a mock request object.

## Getting Started

### Prerequisites

- Java JDK 21 or later.
- Maven or Gradle for dependency management (optional).

### Installing

Clone the repository to your local machine:

```bash
git clone https://github.com/atillatan/ChainOfResponsibilityMiddleware.git
```

Navigate to the project directory:

```bash
cd ChainOfResponsibilityMiddleware
```

Build the project using Maven:

```bash
mvn clean install
```

Or using Gradle:

```bash
gradle build
```

### Running the Demo

Execute the main class to run the demo application:

```bash
java -cp target/ChainOfResponsibilityMiddleware-1.0-SNAPSHOT.jar cr.middleware.MiddlewareApplication
```

## Usage

To use this pattern in your project, create new middleware components by extending the `Middleware` abstract class and implementing the `handle` method. Chain them together using the `.setNext()` method.

Example:

```java
 app.use(new LogManager())
    .use(new AuthorizationManager())
    .use(new CacheManager()); 

    // Run 1
    app.run("Example data");
```

## Contributing

Contributions are welcome! Please feel free to submit pull requests, create issues, or suggest improvements.

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE) file for details.

## Acknowledgments

- Thanks to the GoF for the Chain of Responsibility design pattern.
- Inspired by middleware implementations in various web frameworks.

