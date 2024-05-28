
# My Sample Project

This is a sample Java project demonstrating various design patterns and unit tests using Ant and JUnit.

## Project Structure

```
my-sample-project/
├── build.xml
├── src/
│   └── com/
│       └── example/
│           ├── App.java
│           ├── Singleton.java
│           ├── Factory.java
│           ├── Product.java
│           ├── Observer.java
│           ├── Subject.java
│           ├── ConcreteObserver.java
│           ├── ConcreteSubject.java
├── test/
│   └── com/
│       └── example/
│           ├── AppTest.java
│           ├── SingletonTest.java
│           ├── FactoryTest.java
│           ├── ObserverTest.java
└── lib/
    ├── junit-4.13.2.jar
    └── hamcrest-core-1.3.jar
```

## Setup

### Prerequisites

- Java Development Kit (JDK) installed
- Apache Ant installed

### Directory Structure

- `src/`: Contains the source code for the project.
- `test/`: Contains the unit test code.
- `lib/`: Contains the JUnit and Hamcrest libraries.
- `build.xml`: Ant build file to compile and run tests.

## Build and Test

### Clean the Project

To clean the project (remove `build` directory):

```sh
ant clean
```

### Compile the Project

To compile the source code:

```sh
ant compile
```

### Run the Tests

To compile the tests and run them:

```sh
ant test
```

## Design Patterns Demonstrated

### Singleton

The `Singleton` class ensures that only one instance of the class is created.

### Factory

The `Factory` class creates different types of `Product` objects based on the input.

### Observer

The `Observer` pattern is demonstrated with `ConcreteSubject` and `ConcreteObserver` classes. Observers are notified when the subject's state changes.

## Unit Tests

Unit tests are written using JUnit. The tests cover the functionality of each design pattern.

- `AppTest`: Basic test for the `App` class.
- `SingletonTest`: Tests for the `Singleton` class.
- `FactoryTest`: Tests for the `Factory` class.
- `ObserverTest`: Tests for the `Observer` pattern.

## License

This project is licensed under the MIT License.
