# Student Grade Calculator (Java)

A robust, deterministic CLI-based Student Grade Calculator built as part of the **DecodeLabs Industrial Training Program (Project 2)**.

## 🚀 Key Architectural Highlights
- **Input Validation & Buffer Trap Mitigation:** Employs `Integer.parseInt(scanner.nextLine())` to prevent trapped newline characters and handle malformed numeric inputs.
- **Precision Arithmetic:** Uses explicit double precision casting `(double) totalMarks / numSubjects` to eliminate Java integer truncation.
- **Deterministic Logic Engine:** Ordered descending conditional ladder (`>= 90`, `>= 80`, etc.) ensuring reproducible grade assignments.
- **Clean Formatted Output:** Utilizes formatted print specifiers (`%.2f%%`) for clear visual reporting.

## 🛠️ Tech Stack
- **Language:** Java (JDK 8+)
- **Concepts:** Loops, Scanner parsing, Type Casting, Conditional Branching, Input Sanitization

## 📋 How to Run
1. Compile the program:
   ```bash
   javac StudentGradeCalculator.java
