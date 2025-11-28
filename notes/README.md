# 🧠 Java Learning Log
> "I don't just write code; I understand how it works."

## 📅 Daily Entries

### [Day 01] - Nov 24, 2025
**Topic:** Java Syntax, Printing & Data Types
- **Key Concepts:**
    - **Structure:** Java is stricter than Python. Every program MUST be inside a `class`, and the entry point is always `public static void main`.
    - **Comments:** Same as C++ (`//` for single, `/* */` for multi) unlike Python's `#`.
    - **Printing:** `System.out.print()` leaves the cursor on the same line. `System.out.println()` moves it to the next line.
    - **Case Sensitivity:** `System` must be capitalized.
    - **Concatenation:** Using `+` to join strings and variables (must manually add spaces like `"Hi " + name`).

- **💡 "Aha!" Moments & Shortcuts:**
    - **The Quote Trap:** `char` uses single quotes `'A'` while Strings use double quotes `"A"`. Using double quotes for a char throws an error.
    - **IDE Power:** Typing `sout` + `Tab` auto-completes to `System.out.println()`.
    - **The Positioning:** Java feels like the "middle ground"—not as low-level/manual as C++, but not as loose/dynamic as Python.

- **💻 Code Snippet (Proof of Work):**
  ```java
  public class Main {
      public static void main(String[] args) {
          // My first JAVA Program
          System.out.println("My name is Mortoti");
          // Goal: To become the Mosh Hamedani of West Africa

          // Integer Variables
          int age = 19;
          System.out.println("age: " + age);

          // Double (Decimal) Variables
          double net_worth = 109.3;
          System.out.println("My net worth is: " + net_worth + " Ghana Cedis");

          // Character Variables (Must use single quotes!)
          char grade = 'A';
          System.out.println("I had grade " + grade + " in the exams");

          // Boolean Variables
          boolean isStudent = true;
          System.out.println("It is " + isStudent + " that he is a student");
      }
  }
  
### [Day 02] - Nov 25, 2025
**Topic:** Memory Management, Scanner Input & Reference Types
- **Key Concepts:**
    - **Memory Model:**
        - **Primitives (int, char):** Stored directly in the **Stack**. (Fast, lower case types).
        - **References (String, Scanner, Arrays):** The variable sits in the Stack, but it points to an Object in the **Heap**. (Slower, Capitalized types).
    - **Scanner Setup:** Unlike Python's `input()`, Java requires a full setup:
        1. Import it: `import java.util.Scanner;`
        2. Create Object: `Scanner scanner = new Scanner(System.in);`
        3. Close it: `scanner.close();` (To prevent memory leaks).
    - **Input Methods:**
        - `next()`: Reads a single word (stops at space).
        - `nextLine()`: Reads the entire line (like C++ `getline`).
        - `nextInt()`: Reads an integer.

- **💡 "Aha!" Moments:**
    - **Syntax Highlighting:** IntelliJ colors Primitives (orange/blue) differently from Classes (white/black) to show where they live in memory.
    - **Concatenation:** You can mix Strings and numbers in a print statement easily (`"Age: " + age`).
    - **Formatting:** Using `System.out.print` (no 'ln') keeps the user's input cursor on the same line as the question.

- **💻 Code Snippet:**
  ```java
  import java.util.Scanner;

  public class Main {
      public static void main(String[] args) {
          // 1. Reference Variable (Stored in Heap)
          // String starts with Capital 'S' because it is a Class
          String name = "Mosh of West Africa";
          System.out.println(name);

          // 2. Scanner Object for User Input
          Scanner scanner = new Scanner(System.in);

          // Taking String Input
          System.out.print("Enter your name: "); // print keeps cursor on same line
          String my_name = scanner.nextLine();   // nextLine() takes multiple words

          // Taking Integer Input
          System.out.print("How old are you? ");
          int my_age = scanner.nextInt();

          // Outputting the Logic
          System.out.println("My name is " + my_name);
          System.out.println("I am " + my_age + " years old");

          // Always close the scanner!
          scanner.close();
      }
  }

### [Day 03] - Nov 28, 2025
**Topic:** Scanner Input & Buffer Behavior (Scientific Test)

- **1. The Scanner "Token" Insight**
    - **The Experiment:** Running `scanner.next()` twice consecutively while providing a two-word input (e.g., "Jephthah Mortoti").
    - **The Observation:**
        - The first `scanner.next()` consumed "Jephthah" and stopped at the space.
        - The second `scanner.next()` **did not ask for new input**. It immediately consumed "Mortoti" which was waiting in the buffer.
    - **Conclusion:** `next()` reads one "token" (word) at a time. It does not read the whole line. The remaining words stay in the memory buffer until another Scanner method calls for them.

- **💻 Code Snippet (Buffer Proof):**
  ```java
  // Testing Scanner Buffer Behavior
  System.out.print("Enter your full name: ");
  // Input provided: "Jephthah Mortoti"
  
  String your_name = scanner.next(); // Reads "Jephthah"
  String sec_name = scanner.next();  // Automatically reads "Mortoti" from buffer
  
  System.out.println("your_name= "+ your_name + " and sec_name= " + sec_name);
  scanner.close();