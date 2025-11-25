# 🧠 Java Learning Log
> "I don't just write code; I understand how it works."

## 📅 Daily Entries

### [Day 01] - Nov 25, 2025
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