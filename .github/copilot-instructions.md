# Java Programming Learning Repository - AI Agent Instructions

## Repository Purpose
This is a **Java learning/practice repository** containing standalone programs for mastering core Java concepts. It is **not** a production application - each file demonstrates specific Java features independently.

## Project Organization

### Structure
- **Root directory**: Individual Java practice files organized by concept
  - Basic I/O: `Input_Output.java`, `input.java`
  - Control flow: `forloop.java`, `whileloop.java`, `dowhile.java`, `switchcase.java`
  - Arrays: `array.java`, `array1.java`, `array2d.java`, `matrix_add.java`
  - Sorting algorithms: `BubbleSort.java`, `InsertionSort.java`, `SelectionSort.java`
  - OOP concepts: `Student.java`, `inheritance.java`, `object.java`, `Function_overloading.java`
  - String manipulation: `String1.java`, `StringBuilder1.java`, `ReverseStringBuilder1.java`
  - Algorithms: `Fibonacci.java`, `Factorial.java`, `BitManupulation1.java`
  
- **`College/` subdirectory**: Packaged classes demonstrating package usage (`st1udent.java` uses `package College;`)

- **`GroceryMangementSystem.java`**: Most complex example using interfaces, abstract classes, inheritance, and polymorphism

### Naming Conventions
- **Class names**: PascalCase (`Student.java`, `BubbleSort.java`)
- **Main method files**: Match class name exactly (`class Fibonacci` in `Fibonacci.java`)
- **Some files have non-standard naming** (e.g., `function1.java` contains `public class function1` - lowercase), reflecting beginner-level practice code

## Code Patterns & Conventions

### Standard Entry Pattern
Most programs follow this pattern:
```java
import java.util.Scanner;

public class ProgramName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Program logic
    }
}
```

### Scanner Input Pattern
User input is consistently handled via Scanner:
- Input prompts using `System.out.print()` (no newline)
- Single values: `sc.nextInt()`, `sc.nextFloat()`, `sc.next()`
- Full lines: `sc.nextLine()`

Example from `BubbleSort.java`:
```java
System.out.println("Enter the number of elements");
n = sc.nextInt();
```

### Array Handling
- Primitive arrays used exclusively (no ArrayList in learning section)
- Input loop pattern: `for(int i=0; i<n; i++) arr[i] = sc.nextInt();`
- Output loop: `for(int i=0; i<n; i++) System.out.print(arr[i] + " ");`

### OOP Implementation Pattern
Classes with constructor receiving Scanner:
```java
public class Student {
    int roll;
    String name;
    Scanner sc = new Scanner(System.in);
    
    public Student() {
        roll = sc.nextInt();
        name = sc.next();
    }
    
    public void display() { /* output */ }
}
```

### Complex Patterns
`GroceryMangementSystem.java` demonstrates production-like OOP:
- **Abstract base class**: `GroceryItem` with protected fields and getter methods
- **Interface implementation**: `Discountable` interface for polymorphism
- **Inheritance hierarchy**: `Fruit` and `Vegetable` extending `GroceryItem`
- **Method overriding**: `@Override` annotations on display methods

## Compilation & Execution

### Standard Workflow
```powershell
# Compile single file
javac HelloWorld.java

# Run compiled class
java HelloWorld

# For packaged classes (e.g., College/st1udent.java)
javac College\st1udent.java
java College.st1udent
```

### Key Points
- No build system (Maven/Gradle) - raw Java compilation
- Generated `.class` files are committed to repo (artifacts exist)
- No automated tests - programs tested via manual I/O
- Windows environment (backslash in paths for packaged files)

## Common Anti-Patterns to Watch
1. **Inconsistent access modifiers**: Mix of public/default/private
2. **Unused imports**: Files import `java.util.*` but only use `Scanner`
3. **Implicit main class naming**: File name doesn't always match public class (e.g., `function1.java`)
4. **No package organization**: Most files in root except College subdirectory
5. **Scanner not closed**: Resource leak pattern (not intended for production)

## When Adding New Programs
1. Create individual `.java` file (one concept per file ideally)
2. Use PascalCase class name matching filename
3. Include Scanner for interactive input (if needed)
4. Add simple `main()` method as entry point
5. Avoid complex dependencies - demonstrate single concept clearly
6. Add comments for complex algorithms (Fibonacci, sorting)

## References for Pattern Examples
- **Basic I/O**: `Input_Output.java`
- **Arrays & loops**: `BubbleSort.java`, `InsertionSort.java`
- **OOP (simple)**: `Student.java`, `inheritance.java`
- **OOP (complex)**: `GroceryMangementSystem.java`
- **String operations**: `StringBuilder1.java`, `ReverseStringBuilder1.java`
