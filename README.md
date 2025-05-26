# Java-Prep

### Features of Java

1. Platform Independent
2. Object Oriented
3. Strictly Typed Language
4. Automatic Garbage Collection
5. Robust
6. Secure

# Java Architecture: JDK, JRE, and JVM Explained

## 📜 Java Program Flow

1. `.java` files are written in a high-level language.
2. These `.java` files are compiled using the Java Compiler (`javac`), producing a `.class` file.
3. The `.class` file contains **Bytecode**, which is executed by the JVM to convert it into **machine code**.

### 🔄 Flow Summary

`.java → compile (javac) → .class → JVM → Binary → Run`

---

## ☕ JDK - Java Development Kit

- **Target Audience:** Developers
- **Includes:**
  - JDK = JRE + Development Tools:
    - Java Compiler (`javac`)
    - Java Debugger (`jdb`)
    - Other tools: `javadoc`, `jar`, etc.

---

## 🧪 JRE - Java Runtime Environment

- **Target Audience:** End Users / Clients
- **Includes:**
  - JRE = JVM + Runtime Libraries  
    (e.g., `java.util`, `java.io`)

---

## ⚙️ JVM - Java Virtual Machine

- **Purpose:**
  - Executes the Bytecode (`.class` file)
  - Provides Platform Independence

### 🔧 Components of JVM

#### 1. Class Loader Subsystem

- **Class Loading:** Loads `.class` files into JVM
- **Verification:** Ensures bytecode integrity and security

#### 2. Memory Management in JVM

- **Method Area:** Stores static variables, methods, class metadata
- **Heap Area:** Stores objects and instance variables
- **Stack Area:** Stores local variables, method call data (per thread)
- **Program Counter Register:** Holds current and next instruction addresses
- **Native Method Stack:** Executes native methods (e.g., C/C++ via JNI)

#### 3. Execution Engine

- **Interpreter:** Executes bytecode line-by-line
- **JIT Compiler (Just-In-Time):** Converts frequently used bytecode into native code for speed
- **Garbage Collector:** Frees memory by removing unused objects

---

## 📊 Summary Table

| Component | Description                 |
| --------- | --------------------------- |
| **JDK**   | JRE + Development Tools     |
| **JRE**   | JVM + Libraries             |
| **JVM**   | Bytecode Runner and Manager |

### 🧠 Memory Components

- **Method Area:** Class metadata and static members
- **Heap:** Objects and instance data
- **Stack:** Method call stack per thread
- **Program Counter (PC) Register:** Instruction pointer
- **Native Stack:** Native method execution

### ⚙️ Execution Components

- **Interpreter:** Line-by-line execution
- **JIT Compiler:** On-the-fly optimization
- **Garbage Collector:** Memory management

---

> 📝 This overview summarizes the core architecture of Java and how it ensures platform independence, performance, and memory management through its modular components.

# Java Naming Conventions and Valid Identifiers 🌟

Naming conventions in Java are crucial for writing clean, readable, and maintainable code. Following standard conventions ensures consistency across projects and improves collaboration. This guide covers valid identifiers and naming conventions for classes, packages, variables, and methods. 🚀

## 1. Introduction 📖

Java provides flexibility in naming identifiers, but adhering to conventions enhances code readability and maintainability. Identifiers must follow specific rules to be valid, and conventions provide guidelines for consistent naming.

## 2. Class Naming Conventions 🏛️

### Rules for Valid Identifiers

- ✅ Must begin with a letter (A–Z or a–z), underscore (\_), or dollar sign ($).
- ✅ Can include letters, digits (0–9), underscores (\_), and dollar signs ($).
- ❌ Cannot begin with a digit.
- ❌ Cannot be a reserved Java keyword (e.g., `class`, `void`, `int`).

### Conventions

- 📌 Use **PascalCase** (each word starts with a capital letter).
- 📌 Name should be a noun, reflecting the class's purpose.

### Examples

```java
class Student {}
class BankAccount {}
class MyClass123 {}
class $MainClass {}
```

### Invalid Examples

```java
class 123Class {}     // ❌ Starts with a digit
class class {}        // ❌ 'class' is a reserved keyword
class My-Class {}     // ❌ Hyphen is not allowed
void void() {}        // ❌ 'void' is a keyword
void print-message() {} // ❌ Hyphen not allowed
```

## 3. Package Naming Conventions 📦

### Rules for Valid Identifiers

- ✅ Same as class identifiers: must start with a letter, underscore, or dollar sign; can include letters, digits, underscores, and dollar signs.
- ❌ Cannot start with a digit or be a reserved keyword.

### Conventions

- 📌 Use **lowercase** with words separated by dots (e.g., `com.example.project`).
- 📌 Typically follow a reverse domain name structure (e.g., `com.company.app`).

### Examples

```java
package com.example;
package org.myapp.utils;
```

### Invalid Examples

```java
package MyPackage;     // ❌ Uppercase not allowed
package com.123app;    // ❌ Starts with a digit
package int.utils;     // ❌ 'int' is a keyword
```

## 4. Variable Naming Conventions 📋

### Rules for Valid Identifiers

- ✅ Same as class identifiers: must start with a letter, underscore, or dollar sign; can include letters, digits, underscores, and dollar signs.
- ❌ Cannot start with a digit or be a reserved keyword.

### Conventions

- 📌 Use **camelCase** (first word lowercase, subsequent words capitalized).
- 📌 Name should be descriptive, indicating the variable's purpose.

### Examples

```java
int studentAge;
String firstName;
double $totalAmount;
```

### Invalid Examples

```java
int 123age;       // ❌ Starts with a digit
String int;       // ❌ 'int' is a keyword
double total-amt; // ❌ Hyphen not allowed
```

## 5. Method Naming Conventions 🛠️

### Rules for Valid Identifiers

- ✅ Same as class identifiers: must start with a letter, underscore, or dollar sign; can include letters, digits, underscores, and dollar signs.
- ❌ Cannot start with a digit or be a reserved keyword.

### Conventions

- 📌 Use **camelCase** (first word lowercase, subsequent words capitalized).
- 📌 Name should be a verb, reflecting the action performed.

### Examples

```java
void calculateMarks() {}
int getStudentId() {}
boolean isActive() {}
```

### Invalid Examples

```java
void 123print() {}     // ❌ Starts with a digit
void class() {}        // ❌ 'class' is a keyword
void print-message() {} // ❌ Hyphen not allowed
```

## 6. Summary Table 📊

| Element  | Convention       | Example          | Invalid Example |
| -------- | ---------------- | ---------------- | --------------- |
| Class    | PascalCase       | StudentRecord    | 123Class        |
| Package  | lowercase.words  | com.example      | MyPackage       |
| Variable | camelCase        | studentAge       | int (keyword)   |
| Method   | camelCase (verb) | calculateMarks() | 123print()      |

## 7. Conclusion 🌈

Following Java naming conventions ensures that your code adheres to industry standards, improves collaboration, and enhances maintainability. Using descriptive and consistent names makes your code easier to read and understand. 🙌

# Java Data Types - Detailed Notes

Java is a strictly-typed language, meaning every variable must be declared with a data type that specifies the size and type of values it can store. This guide covers Java's data types, classified into **Primitive Data Types** and **Non-Primitive (Reference/Object) Data Types**, with examples and a summary table.

## 1. Introduction

Data types in Java define the kind of data a variable can hold. They are broadly categorized as:

- **Primitive Data Types**: Built-in types for basic data like numbers, characters, and booleans.
- **Non-Primitive (Reference) Data Types**: Complex types that hold references to objects, such as Strings, Arrays, Classes, and Interfaces.

## 2. Primitive Data Types

Java has 8 built-in primitive data types, categorized into integer, floating-point, character, and boolean types.

### 2.1 Integer Types

Integer types store whole numbers.

- **byte**: Smallest integer type, useful for saving memory.
- **short**: Larger than byte, saves memory compared to int.
- **int**: Default integer type, commonly used for integer values.
- **long**: Used for wider ranges, denoted with an 'L' suffix.

#### Summary Table

| Data Type | Size    | Default Value | Range                            |
| --------- | ------- | ------------- | -------------------------------- |
| byte      | 1 byte  | 0             | -128 to 127                      |
| short     | 2 bytes | 0             | -32,768 to 32,767                |
| int       | 4 bytes | 0             | -2³¹ to 2³¹-1 (~ -2.1B to +2.1B) |
| long      | 8 bytes | 0L            | -2⁶³ to 2⁶³-1                    |

### 2.2 Floating-Point Types

Floating-point types store decimal values.

- **float**: Single-precision 32-bit, holds up to 7 decimal digits, denoted with an 'f' suffix.
- **double**: Double-precision 64-bit, default for decimal values, holds up to 15 decimal digits.

#### Summary Table

| Data Type | Size    | Default Value | Range                                |
| --------- | ------- | ------------- | ------------------------------------ |
| float     | 4 bytes | 0.0f          | Approximately ±3.4e−038 to ±3.4e+038 |
| double    | 8 bytes | 0.0d          | Approximately ±1.7e−308 to ±1.7e+308 |

### 2.3 Character Type

- **char**: Stores a single 16-bit Unicode character, such as 'A', '9', or special symbols.

#### Summary Table

| Data Type | Size    | Default Value | Range                            |
| --------- | ------- | ------------- | -------------------------------- |
| char      | 2 bytes | ''            | 0 to 65,535 (Unicode characters) |

### 2.4 Boolean Type

- **boolean**: Stores `true` or `false`, used for conditional flags.

#### Summary Table

| Data Type | Size   | Default Value | Values        |
| --------- | ------ | ------------- | ------------- |
| boolean   | ~1 bit | false         | true or false |

## 3. Non-Primitive Data Types

Non-primitive types, also known as reference types, are created by the programmer and hold references to objects.

### Examples

- **Strings**: Sequence of characters.
- **Arrays**: Collection of similar types of elements.
- **Classes**: Blueprint for creating objects.
- **Interfaces**: A contract that classes implement.

### Example Code

```java
public class NonPrimitiveExample {
    public static void main(String[] args) {
        String name = "John";
        int[] marks = {90, 85, 78};
        System.out.println("String: " + name);
        System.out.println("Array element: " + marks[0]);
    }
}

class MyClass {
    // Class definition
}
```

#### Output

```
String: John
Array element: 90
```

## 4. Summary Table

| Type    | Category  | Size    | Default Value | Example Values           |
| ------- | --------- | ------- | ------------- | ------------------------ |
| byte    | Integer   | 1 byte  | 0             | -100, 0, 100             |
| short   | Integer   | 2 bytes | 0             | -30000, 0, 30000         |
| int     | Integer   | 4 bytes | 0             | -1,000,000 to +1,000,000 |
| long    | Integer   | 8 bytes | 0L            | 9999999999L              |
| float   | Floating  | 4 bytes | 0.0f          | 3.14f, -0.5f             |
| double  | Floating  | 8 bytes | 0.0d          | 3.14159265359            |
| char    | Character | 2 bytes | ''            | 'A', '9', '#'            |
| boolean | Logical   | ~1 bit  | false         | true, false              |

## 5. Conclusion

Understanding Java data types is fundamental to efficient and safe programming. Choosing the correct data type ensures better performance and memory management.

# Java Operators with Code Examples and Outputs

This guide covers different types of Java operators, including their descriptions, code examples, and expected outputs.

## 1. Arithmetic Operators

Arithmetic operators perform basic mathematical operations.

- **+**: Addition (a + b)
- **-**: Subtraction (a - b)
- **\***: Multiplication (a \* b)
- **/**: Division (a / b)
- **%**: Modulus (a % b)

### Example Code

```java
int a = 10, b = 3;
System.out.println("Add: " + (a + b));
System.out.println("Sub: " + (a - b));
System.out.println("Mul: " + (a * b));
System.out.println("Div: " + (a / b));
System.out.println("Mod: " + (a % b));
```

### Expected Output

```
Add: 13
Sub: 7
Mul: 30
Div: 3
Mod: 1
```

## 2. Assignment Operators

Assignment operators are used to assign values to variables.

- **=**: Assign (a = 10)
- **+=**: Add and assign (a += 5) → a = a + 5
- **-=**: Subtract and assign (a -= 5)
- **\*=**: Multiply and assign (a \*= 5)
- **/=**: Divide and assign (a /= 5)
- **%=**: Modulus and assign (a %= 5)

### Example Code

```java
int a = 10;
a += 5;
a -= 2;
a *= 3;
a /= 2;
a %= 4;
System.out.println("Final a: " + a);
```

### Expected Output

```
Final a: 1
```

## 3. Relational Operators

Relational operators compare two values and return a boolean result.

- **==**: Equal to (a == b)
- **!=**: Not equal to (a != b)
- **>**: Greater than (a > b)
- **<**: Less than (a < b)
- **>=**: Greater than or equal to (a >= b)
- **<=**: Less than or equal to (a <= b)

### Example Code

```java
int a = 10, b = 20;
System.out.println(a == b);
System.out.println(a != b);
System.out.println(a > b);
System.out.println(a < b);
System.out.println(a >= b);
System.out.println(a <= b);
```

### Expected Output

```
false
true
false
true
false
true
```

## 4. Unary Operators

Unary operators operate on a single operand.

- **+**: Unary plus (+a)
- **-**: Unary minus (-a)
- **++**: Increment (++a or a++)
- **--**: Decrement (--a or a--)
- **!**: Logical NOT (!true)

### Example Code

```java
int a = 5;
System.out.println(+a);
System.out.println(-a);
System.out.println(++a);
System.out.println(a--);
System.out.println(a);
boolean flag = false;
System.out.println(!flag);
```

### Expected Output

```
5
-5
6
6
5
true
```

## 5. Logical Operators

Logical operators combine multiple boolean conditions.

- **&&**: Logical AND (a > 5 && a < 10)
- **||**: Logical OR (a > 5 || b < 3)
- **!**: Logical NOT (!(a > 5))

### Example Code

```java
int a = 10, b = 5;
System.out.println((a > 5) && (b < 10));
System.out.println((a < 5) || (b < 10));
System.out.println(!(a < b));
```

### Expected Output

```
true
true
true
```

# Java Conditional Statements

This guide covers Java conditional statements, including their purpose, syntax, examples, and outputs.

## 1. if Statement

### Purpose

Executes a block of code only if a specified condition is true.

### Syntax

```java
if (condition) {
    // Code to execute if condition is true
}
```

### Example

```java
int age = 20;
if (age >= 18) {
    System.out.println("You are eligible to vote.");
}
```

### Output

```
You are eligible to vote.
```

## 2. if-else Statement

### Purpose

Executes one block if the condition is true, and another block if the condition is false.

### Syntax

```java
if (condition) {
    // Code if condition is true
} else {
    // Code if condition is false
}
```

### Example

```java
int number = 7;
if (number % 2 == 0) {
    System.out.println("Even number");
} else {
    System.out.println("Odd number");
}
```

### Output

```
Odd number
```

## 3. if-else-if Ladder

### Purpose

Tests multiple conditions sequentially. Executes the first block where the condition is true.

### Syntax

```java
if (condition1) {
    // Executes if condition1 is true
} else if (condition2) {
    // Executes if condition2 is true
} else {
    // Executes if none of the conditions are true
}
```

### Example

```java
int marks = 85;
if (marks >= 90) {
    System.out.println("Grade A");
} else if (marks >= 75) {
    System.out.println("Grade B");
} else if (marks >= 60) {
    System.out.println("Grade C");
} else {
    System.out.println("Fail");
}
```

### Output

```
Grade B
```

## 4. Nested if Statements

### Purpose

Allows an if or if-else statement inside another if or else block. Useful for multiple-level checks.

### Syntax

```java
if (condition1) {
    if (condition2) {
        // Code if both condition1 and condition2 are true
    }
}
```

### Example

```java
int age = 25;
boolean hasLicense = true;
if (age >= 18) {
    if (hasLicense) {
        System.out.println("You can drive.");
    } else {
        System.out.println("You need a license to drive.");
    }
} else {
    System.out.println("You are too young to drive.");
}
```

### Output

```
You can drive.
```

## 5. switch Statement

### Purpose

Used when checking a variable for equality against multiple fixed values (e.g., int, char, String).

### Syntax

```java
switch (expression) {
    case value1:
        // Code for value1
        break;
    case value2:
        // Code for value2
        break;
    ...
    default:
        // Default code if no match
}
```

### Example

```java
int day = 3;
switch (day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    case 3:
        System.out.println("Wednesday");
        break;
    default:
        System.out.println("Invalid day");
}
```

### Output

```
Wednesday
```

## 6. Summary Table

| Statement Type | Use Case                                               |
| -------------- | ------------------------------------------------------ |
| if             | Single condition                                       |
| if-else        | Binary condition (true/false)                          |
| if-else-if     | Multiple conditions in sequence                        |
| nested if      | Decision based on multiple dependent conditions        |
| switch         | Multiple specific values of an expression (e.g., menu) |

# Java Loops - Comprehensive Notes

Loops in Java are used to execute a block of code repeatedly as long as a given condition is true. Java provides several loop constructs:

- for loop
- while loop
- do-while loop
- for-each loop (enhanced for loop)
- Nested loops (any loop inside another loop)

## 1. for Loop

### Syntax

```java
for (initialization; condition; update) {
    // block of code
}
```

### Terms Explained

- **Initialization**: Executes once before the loop starts. Usually used to initialize a loop control variable.
- **Condition**: Boolean expression checked before each iteration. If true, the loop continues; if false, it stops.
- **Update**: Updates the loop control variable, executed after each iteration.

### Example

```java
for (int i = 1; i <= 5; i++) {
    System.out.println("i = " + i);
}
```

### Output

```
i = 1
i = 2
i = 3
i = 4
i = 5
```

## 2. Nested for Loop

### Use Case

Often used for printing patterns or working with multi-dimensional data.

### Example

```java
for (int i = 1; i <= 3; i++) {
    for (int j = 1; j <= 2; j++) {
        System.out.println("i = " + i + ", j = " + j);
    }
}
```

### Output

```
i = 1, j = 1
i = 1, j = 2
i = 2, j = 1
i = 2, j = 2
i = 3, j = 1
i = 3, j = 2
```

## 3. while Loop

### Syntax

```java
while (condition) {
    // block of code
}
```

### Explanation

The condition is checked before the loop executes. If it's false initially, the loop may never run.

### Example

```java
int i = 1;
while (i <= 3) {
    System.out.println("i = " + i);
    i++;
}
```

### Output

```
i = 1
i = 2
i = 3
```

## 4. do-while Loop

### Syntax

```java
do {
    // block of code
} while (condition);
```

### Explanation

Executes the block at least once, even if the condition is false initially.

### Example

```java
int i = 1;
do {
    System.out.println("i = " + i);
    i++;
} while (i <= 3);
```

### Output

```
i = 1
i = 2
i = 3
```

## 5. for-each Loop (Enhanced for Loop)

### Use Case

Best for iterating over arrays or collections when the index is not required.

### Syntax

```java
for (type element : array) {
    // block of code
}
```

### Example

```java
int[] numbers = {10, 20, 30};
for (int num : numbers) {
    System.out.println("num = " + num);
}
```

### Output

```
num = 10
num = 20
num = 30
```

## Summary Table

| Loop Type  | Entry Condition | Guaranteed Execution | Best Use Case                      |
| ---------- | --------------- | -------------------- | ---------------------------------- |
| for        | Yes             | No                   | Known number of iterations         |
| Nested for | Yes             | No                   | Patterns, matrices                 |
| while      | Yes             | No                   | Unknown iterations, sentinel loops |
| do-while   | No              | Yes                  | At least one iteration needed      |
| for-each   | Yes             | No                   | Arrays or collections              |

# Break and Continue in Java - Detailed Notes

This guide covers the `break` and `continue` control statements in Java, including their purpose, syntax, examples, and a comparison.

## 1. Introduction

In Java, `break` and `continue` are control statements used within loops and switch statements:

- **break**: Terminates the innermost loop or switch statement immediately.
- **continue**: Skips the current iteration and jumps to the next loop cycle.

## 2. break Statement

### Description

- Terminates the innermost loop (`for`, `while`, `do-while`) or `switch` statement immediately.
- Control moves to the statement following the loop or switch.

### Syntax

```java
break;
```

### Example 1: Using break in a for Loop

```java
public class BreakExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }
    }
}
```

### Output

```
1
2
3
4
```

### Example 2: Using break in a while Loop

```java
public class BreakWhileExample {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
            i++;
        }
    }
}
```

### Output

```
1
2
3
4
```

## 3. continue Statement

### Description

- Skips the current iteration of a loop and proceeds to the next iteration.
- Only used in loops (`for`, `while`, `do-while`), not in `switch` statements.

### Syntax

```java
continue;
```

### Example 1: Using continue in a for Loop

```java
public class ContinueExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 2) {
                continue;
            }
            System.out.println(i);
        }
    }
}
```

### Output

```
1
3
4
5
```

### Example 2: Using continue in a while Loop

```java
public class ContinueWhileExample {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            i++;
            if (i == 2) {
                continue;
            }
            System.out.println(i);
        }
    }
}
```

### Output

```
1
3
4
5
```

## 4. break vs continue

### Comparison Table

| Feature             | break                             | continue                        |
| ------------------- | --------------------------------- | ------------------------------- |
| **Purpose**         | Exits the loop or switch entirely | Skips current iteration         |
| **After Execution** | Moves control outside the loop    | Moves control to next iteration |
| **Usage**           | Loops and switch statements       | Only loops                      |

## 5. Using Labels with break and continue

### Description

- Labels allow `break` or `continue` to target an outer loop instead of the innermost one.
- Useful in nested loops to control flow beyond the immediate loop.

### Example: break with Label

```java
public class BreakLabelExample {
    public static void main(String[] args) {
        outerLoop:
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    break outerLoop;
                }
                System.out.println(i + " " + j);
            }
        }
    }
}
```

### Output

```
1 1
1 2
1 3
2 1
```

### Example: continue with Label

```java
public class ContinueLabelExample {
    public static void main(String[] args) {
        outer:
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= 3; j++) {
                if (j == 2) {
                    continue outer;
                }
                System.out.println(i + " " + j);
            }
        }
    }
}
```

### Output

```
1 1
2 1
```

# Type Casting in Java - Detailed Notes

Type casting in Java is the process of converting a variable from one data type to another. This guide covers the two types of type casting, their syntax, examples, and key considerations.

## 1. Introduction

There are two types of type casting in Java:

- **Implicit Casting (Widening)**: Automatic conversion from smaller to larger data types.
- **Explicit Casting (Narrowing)**: Manual conversion from larger to smaller data types.

## 2. Implicit Type Casting (Widening)

### Description

- Happens automatically.
- Smaller data types are promoted to larger data types.
- No data loss occurs.
- Order: `byte -> short -> int -> long -> float -> double`

### Syntax

No special syntax required.

### Example 1: byte to int

```java
public class ImplicitCastingExample1 {
    public static void main(String[] args) {
        byte b = 10;
        int i = b;
        System.out.println("Byte value: " + b);
        System.out.println("Int value after casting: " + i);
    }
}
```

### Output

```
Byte value: 10
Int value after casting: 10
```

### Example 2: int to double

```java
public class ImplicitCastingExample2 {
    public static void main(String[] args) {
        int num = 25;
        double d = num;
        System.out.println("Int value: " + num);
        System.out.println("Double value after casting: " + d);
    }
}
```

### Output

```
Int value: 25
Double value after casting: 25.0
```

## 3. Explicit Type Casting (Narrowing)

### Description

- Requires manual intervention by the programmer.
- Converts larger data types to smaller types.
- May cause data loss or truncation.
- Order: `double -> float -> long -> int -> short -> byte`

### Syntax

```java
(targetType) variableName;
```

### Example 1: double to int

```java
public class ExplicitCastingExample1 {
    public static void main(String[] args) {
        double d = 9.7;
        int i = (int) d;
        System.out.println("Double value: " + d);
        System.out.println("Int value after casting: " + i);
    }
}
```

### Output

```
Double value: 9.7
Int value after casting: 9
```

### Example 2: int to byte with Data Loss

```java
public class ExplicitCastingExample2 {
    public static void main(String[] args) {
        int i = 130;
        byte b = (byte) i;
        System.out.println("Int value: " + i);
        System.out.println("Byte value after casting: " + b);
    }
}
```

### Output

```
Int value: 130
Byte value after casting: -126 (Data Loss)
```

## 4. Data Loss During Casting

### Description

When a larger value is cast into a smaller type, data may be lost or altered due to overflow or truncation.

### Example: long to int

```java
public class DataLossExample {
    public static void main(String[] args) {
        long l = 2147483648L; // Beyond int range
        int i = (int) l;
        System.out.println("Long value: " + l);
        System.out.println("Int value after casting: " + i);
    }
}
```

### Output

```
Long value: 2147483648
Int value after casting: -2147483648 (Overflow)
```

## 5. Implicit vs Explicit Casting

### Comparison Table

| Aspect        | Implicit Casting  | Explicit Casting       |
| ------------- | ----------------- | ---------------------- |
| **Process**   | Automatic         | Manual                 |
| **Data Loss** | No                | Possible               |
| **Syntax**    | No cast operator  | Requires cast operator |
| **Direction** | Smaller -> Larger | Larger -> Smaller      |

## 6. Important Points to Remember

- **Implicit casting** is safe and does not require special syntax.
- **Explicit casting** should be handled carefully due to potential data loss.
- Casting between non-compatible types (e.g., `int` to `boolean`) is not allowed.

# Java Strings - Complete Notes

Strings in Java are objects that represent sequences of characters. This guide covers their creation, storage, advantages, and key methods with examples.

## 1. Introduction to Strings

Strings in Java are immutable, meaning once created, they cannot be changed. They are implemented using the `String` class in the `java.lang` package.

## 2. String Constant Pool and Memory Storage

Strings are stored in a special memory area called the **String Constant Pool (SCP)** to optimize memory usage. When a string is created using a string literal, it is stored in the SCP to avoid duplication.

### Example

```java
String s1 = "Hello";
String s2 = "Hello"; // s1 and s2 refer to the same object in SCP
String s3 = new String("Hello"); // Stored in heap memory outside SCP
```

## 3. Ways to Create Strings

Strings can be created in the following ways:

1. **Using string literals**: Stored in the String Constant Pool.
2. **Using `new` keyword**: Stored in heap memory.
3. **From character arrays**: Using `new String(char[])`.
4. **From byte arrays**: Using `new String(byte[])`.

### Example: From Character Array

```java
char[] chars = {'J', 'a', 'v', 'a'};
String s1 = new String(chars);
System.out.println(s1);
```

### Output

```
Java
```

## 4. Advantages of Strings in Java

- **Immutability**: Makes strings thread-safe and secure.
- **Memory Optimization**: The String Constant Pool reduces memory duplication.
- **Built-in Methods**: The `String` class provides many useful methods.
- **Ease of Use**: Integrates seamlessly with APIs and libraries.
- **Versatility**: Widely used in file handling, networking, and user input.

## 5. Important String Methods with Examples

### Method: length()

Returns the length of the string.

```java
String str = "Hello";
System.out.println(str.length());
```

#### Output

```
5
```

### Method: charAt()

Returns the character at the specified index.

```java
String str = "Hello";
System.out.println(str.charAt(1));
```

#### Output

```
e
```

### Method: substring()

Returns a substring starting from the specified index.

```java
String str = "HelloWorld";
System.out.println(str.substring(5));
```

#### Output

```
World
```

### Method: contains()

Checks if the string contains a specified sequence of characters.

```java
String str = "OpenAI ChatGPT";
System.out.println(str.contains("Chat"));
```

#### Output

```
true
```

### Method: equals()

Compares two strings for equality.

```java
String a = "Java";
String b = "Java";
System.out.println(a.equals(b));
```

#### Output

```
true
```

### Method: equalsIgnoreCase()

Compares two strings for equality, ignoring case.

```java
String a = "Java";
String b = "java";
System.out.println(a.equalsIgnoreCase(b));
```

#### Output

```
true
```

### Method: toLowerCase()

Converts the string to lowercase.

```java
String str = "HELLO";
System.out.println(str.toLowerCase());
```

#### Output

```
hello
```

### Method: toUpperCase()

Converts the string to uppercase.

```java
String str = "hello";
System.out.println(str.toUpperCase());
```

#### Output

```
HELLO
```

### Method: trim()

Removes leading and trailing whitespace.

```java
String str = "  Hello  ";
System.out.println(str.trim());
```

#### Output

```
Hello
```

### Method: replace()

Replaces all occurrences of a specified character with another.

```java
String str = "banana";
System.out.println(str.replace('a', 'o'));
```

#### Output

```
bonono
```

### Method: split()

Splits the string into an array based on a delimiter.

```java
String str = "a,b,c";
String[] parts = str.split(",");
System.out.println(parts[1]);
```

#### Output

```
b
```

### Method: indexOf()

Returns the index of the first occurrence of a specified character.

```java
String str = "programming";
System.out.println(str.indexOf('g'));
```

#### Output

```
3
```

### Method: lastIndexOf()

Returns the index of the last occurrence of a specified character.

```java
String str = "programming";
System.out.println(str.lastIndexOf('g'));
```

#### Output

```
10
```

### Method: startsWith()

Checks if the string starts with a specified prefix.

```java
String str = "Java";
System.out.println(str.startsWith("Ja"));
```

#### Output

```
true
```

### Method: endsWith()

Checks if the string ends with a specified suffix.

```java
String str = "Java";
System.out.println(str.endsWith("va"));
```

#### Output

```
true
```

# Java Arrays - Detailed Notes

Arrays in Java are data structures that hold a fixed number of values of a single type. This guide covers their creation, initialization, traversal, advantages, and multi-dimensional arrays.

## 1. Introduction to Arrays in Java

An array is a fixed-size data structure that stores elements of the same type. Once created, its length cannot be changed.

### Syntax

```java
dataType[] arrayName = new dataType[size];
```

### Example

```java
int[] numbers = new int[5];
numbers[0] = 10;
numbers[1] = 20;
numbers[2] = 30;
numbers[3] = 40;
numbers[4] = 50;
System.out.println(numbers[2]);
```

### Output

```
30
```

## 2. Array Initialization and Access

Arrays can be initialized directly with values or by assigning values to specific indices. Elements are accessed using zero-based indices.

### Example

```java
int[] nums = {1, 2, 3, 4, 5};
System.out.println(nums[0]);
```

### Output

```
1
```

## 3. Looping through Arrays

Arrays can be traversed using traditional `for` loops or enhanced `for` loops (for-each).

### Example: Using for Loop

```java
int[] arr = {10, 20, 30};
for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}
```

### Output

```
10
20
30
```

### Example: Using Enhanced for Loop

```java
int[] arr = {10, 20, 30};
for (int num : arr) {
    System.out.println(num);
}
```

### Output

```
10
20
30
```

## 4. Advantages of Arrays

- **Random Access**: Elements can be accessed directly using indices.
- **Ease of Traversal**: Loops make it simple to iterate over elements.
- **Memory Efficiency**: Fixed size ensures efficient memory allocation when size is known.
- **Reduced Complexity**: Stores multiple values in a single variable.
- **Performance**: Faster for accessing and modifying data compared to some other data structures.

## 5. Two-Dimensional Arrays

Two-dimensional (2D) arrays are arrays of arrays, commonly used to represent matrix-like data.

### Syntax

```java
dataType[][] arrayName = new dataType[rows][columns];
```

### Example

```java
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
for (int i = 0; i < matrix.length; i++) {
    for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
    }
    System.out.println();
}
```

### Output

```
1 2 3
4 5 6
7 8 9
```

# Types of Variables in Java

In Java, variables are classified into three main types: **Instance Variables**, **Static Variables (Class Variables)**, and **Local Variables**. Each type has distinct scope, lifetime, and storage behavior. This guide explores each type with code examples and outputs.

## 1. Instance Variables

### Definition

- Declared inside a class but outside any method or constructor.
- Each object of the class has its own copy.
- Stored in heap memory.
- Accessible only through an object reference.

### When to Use

- When each object needs to maintain its own state or data.

### Example

```java
public class Student {
    // Instance variables
    String name;
    int age;

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Alice";
        s1.age = 20;
        s1.display();

        Student s2 = new Student();
        s2.name = "Bob";
        s2.age = 22;
        s2.display();
    }
}
```

### Output

```
Name: Alice
Age: 20
Name: Bob
Age: 22
```

## 2. Static Variables (Class Variables)

### Definition

- Declared with the `static` keyword inside a class but outside any method or constructor.
- Belongs to the class, not individual objects.
- Stored in the method area.
- Loaded when the class is loaded.
- Can be accessed without creating an object.

### When to Use

- When a property is shared among all objects (e.g., a constant or counter).

### Example

```java
public class Counter {
    // Static variable
    static int count = 0;

    public Counter() {
        count++;
    }

    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        System.out.println("Total objects created: " + Counter.count);
    }
}
```

### Output

```
Total objects created: 3
```

## 3. Local Variables

### Definition

- Declared inside a method, constructor, or block.
- Scope is limited to the block where they are declared.
- Stored in the stack memory.
- Must be initialized before use, as they do not have a default value.

### When to Use

- When a variable is needed only within a specific method or block.

### Example

```java
public class LocalVariableExample {
    public static void main(String[] args) {
        // Local variable
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers 1 to 5: " + sum);
    }
}
```

### Output

```
Sum of numbers 1 to 5: 15
```

# This, Super, and Constructor Chaining in Java

This guide covers the `this` keyword, `super` keyword, and constructor chaining in Java, including their uses, syntax, and examples.

## 1. The `this` Keyword in Java

The `this` keyword is a reference variable that refers to the current object. It is used to avoid naming conflicts, invoke methods or constructors of the current class, and pass the current object as an argument.

### Uses of `this`

1. Refer to current class instance variables.
2. Invoke current class methods.
3. Invoke current class constructors using `this()`.
4. Pass the current object as an argument.

### Example 1: Referring to Instance Variables

```java
class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id; // Refers to instance variable
        this.name = name;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        Student s = new Student(1, "John");
        s.display();
    }
}
```

#### Output

```
1 John
```

### Example 2: Invoking Current Class Method

```java
class Example {
    void show() {
        System.out.println("Show method");
    }

    void display() {
        this.show();
    }

    public static void main(String[] args) {
        Example e = new Example();
        e.display();
    }
}
```

#### Output

```
Show method
```

### Example 3: Invoking Constructor with `this()`

```java
class Person {
    Person() {
        this("Default Name");
        System.out.println("No-arg constructor");
    }

    Person(String name) {
        System.out.println("Parameterized constructor: " + name);
    }

    public static void main(String[] args) {
        new Person();
    }
}
```

#### Output

```
Parameterized constructor: Default Name
No-arg constructor
```

## 2. The `super` Keyword in Java

The `super` keyword is a reference variable that refers to the immediate parent class object. It is used to access parent class members (fields, methods, or constructors) when they are overridden or hidden in the subclass.

### Uses of `super`

1. Refer to parent class instance variables.
2. Invoke parent class methods.
3. Invoke parent class constructors using `super()`.

### Example: Using `super` for Parent Class Constructor

```java
class Animal {
    Animal() {
        System.out.println("Animal constructor");
    }
}

class Dog extends Animal {
    Dog() {
        super(); // Calls parent class constructor
        System.out.println("Dog constructor");
    }

    public static void main(String[] args) {
        new Dog();
    }
}
```

#### Output

```
Animal constructor
Dog constructor
```

## 3. Constructor Chaining

Constructor chaining occurs when one constructor calls another constructor in the same class (using `this()`) or in the parent class (using `super()`). This allows reuse of initialization code and ensures proper construction of objects.

### Rules for Constructor Chaining

- The `this()` or `super()` call must be the first statement in a constructor.
- `this()` is used to call another constructor in the same class.
- `super()` is used to call a constructor in the parent class.

### Example: Constructor Chaining with `this()` and `super()`

```java
class Vehicle {
    String brand;

    Vehicle(String brand) {
        this.brand = brand;
        System.out.println("Vehicle constructor: " + brand);
    }
}

class Car extends Vehicle {
    int speed;

    Car() {
        this(100); // Calls parameterized constructor in the same class
        System.out.println("No-arg constructor");
    }

    Car(int speed) {
        super("Toyota"); // Calls parent class constructor
        this.speed = speed;
        System.out.println("Car constructor with speed: " + speed);
    }

    public static void main(String[] args) {
        new Car();
    }
}
```

#### Output

```
Vehicle constructor: Toyota
Car constructor with speed: 100
No-arg constructor
```
