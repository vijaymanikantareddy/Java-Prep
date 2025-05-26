# Java-Prep 🌟

A comprehensive guide to Java fundamentals, covering architecture, naming conventions, data types, operators, control structures, and more. Perfect for beginners and developers preparing for Java programming. 🚀

## Features of Java ✨

- ✅ **Platform Independent**: Write once, run anywhere.
- ✅ **Object Oriented**: Supports encapsulation, inheritance, and polymorphism.
- ✅ **Strictly Typed Language**: Requires explicit data type declarations.
- ✅ **Automatic Garbage Collection**: Manages memory automatically.
- ✅ **Robust**: Handles errors and exceptions effectively.
- ✅ **Secure**: Provides strong security features.

---

# Java Architecture: JDK, JRE, and JVM Explained 🛠️

## 📜 Java Program Flow

1. **Source Code**: Write `.java` files in a high-level language.
2. **Compilation**: Compile `.java` files using the Java Compiler (`javac`) to produce `.class` files.
3. **Bytecode Execution**: The `.class` file contains **Bytecode**, which the JVM converts into **machine code** for execution.

### 🔄 Flow Summary

`.java → compile (javac) → .class → JVM → Binary → Run` 🚀

---

## ☕ JDK - Java Development Kit

- **Target Audience**: Developers 👨‍💻
- **Includes**:
  - JDK = JRE + Development Tools:
    - **Java Compiler** (`javac`): Converts `.java` to `.class`.
    - **Java Debugger** (`jdb`): Debugs Java programs.
    - **Other Tools**: `javadoc` (documentation), `jar` (archiving), etc.

---

## 🧪 JRE - Java Runtime Environment

- **Target Audience**: End Users / Clients 👩‍💼
- **Includes**:
  - JRE = JVM + Runtime Libraries
    - Libraries: `java.util`, `java.io`, etc., for runtime support.

---

## ⚙️ JVM - Java Virtual Machine

- **Purpose**:
  - Executes Bytecode (`.class` files).
  - Ensures **Platform Independence** by abstracting hardware.

### 🔧 Components of JVM

#### 1. Class Loader Subsystem 📚

- **Class Loading**: Loads `.class` files into JVM memory.
- **Verification**: Ensures bytecode integrity and security.

#### 2. Memory Management in JVM 🧠

- **Method Area**: Stores static variables, methods, and class metadata.
- **Heap Area**: Stores objects and instance variables.
- **Stack Area**: Stores local variables and method call data (per thread).
- **Program Counter Register**: Tracks current and next instruction addresses.
- **Native Method Stack**: Executes native methods (e.g., C/C++ via JNI).

#### 3. Execution Engine 🏃‍♂️

- **Interpreter**: Executes bytecode line-by-line.
- **JIT Compiler (Just-In-Time)**: Converts frequently used bytecode to native code for speed.
- **Garbage Collector**: Frees memory by removing unused objects.

---

## 📊 Summary Table

| Component | Description                 |
| --------- | --------------------------- |
| **JDK**   | JRE + Development Tools     |
| **JRE**   | JVM + Libraries             |
| **JVM**   | Bytecode Runner and Manager |

### 🧠 Memory Components

- **Method Area**: Class metadata and static members 📋
- **Heap**: Objects and instance data 🗄️
- **Stack**: Method call stack per thread 📚
- **Program Counter (PC) Register**: Instruction pointer 📍
- **Native Stack**: Native method execution 🌐

### ⚙️ Execution Components

- **Interpreter**: Line-by-line execution 🕒
- **JIT Compiler**: On-the-fly optimization 🚀
- **Garbage Collector**: Memory management 🗑️

---

> 📝 **Note**: This overview highlights Java's core architecture, ensuring platform independence, performance, and efficient memory management through its modular components.

---

# Java Naming Conventions and Valid Identifiers 🌟

Naming conventions in Java ensure clean, readable, and maintainable code. Adhering to standards improves collaboration and consistency across projects. 🚀

## 1. Introduction 📖

Java identifiers must follow specific rules to be valid, and conventions provide guidelines for consistent naming.

## 2. Class Naming Conventions 🏛️

### Rules for Valid Identifiers

- ✅ Must begin with a letter (A–Z or a–z), underscore (\_), or dollar sign ($).
- ✅ Can include letters, digits (0–9), underscores (\_), and dollar signs ($).
- ❌ Cannot begin with a digit.
- ❌ Cannot be a reserved Java keyword (e.g., `class`, `void`, `int`).

### Conventions

- 📌 Use **PascalCase** (each word starts with a capital letter).
- 📌 Name should be a noun reflecting the class's purpose.

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

- ✅ Same as class identifiers.
- ❌ Cannot start with a digit or be a reserved keyword.

### Conventions

- 📌 Use **lowercase** with words separated by dots.
- 📌 Follow a reverse domain name structure (e.g., `com.company.app`).

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

- ✅ Same as class identifiers.
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

- ✅ Same as class identifiers.
- ❌ Cannot start with a digit or be a reserved keyword.

### Conventions

- 📌 Use **camelCase**.
- 📌 Name should be a verb reflecting the action performed.

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

Following Java naming conventions ensures code adheres to industry standards, improving collaboration and maintainability. Descriptive names enhance readability. 🙌

---

# Java Data Types - Detailed Notes 📚

Java is a strictly-typed language, requiring every variable to be declared with a data type. This guide covers **Primitive** and **Non-Primitive** data types with examples.

## 1. Introduction 🌟

Data types specify the size and type of values a variable can hold, categorized as:

- **Primitive Data Types**: Basic types like numbers, characters, and booleans.
- **Non-Primitive (Reference) Data Types**: Complex types like Strings, Arrays, and Classes.

## 2. Primitive Data Types 🔢

Java has 8 primitive data types, grouped into integer, floating-point, character, and boolean types.

### 2.1 Integer Types

Store whole numbers.

- **byte**: Smallest integer type, memory-efficient.
- **short**: Larger than byte, still memory-efficient.
- **int**: Default integer type, widely used.
- **long**: For large ranges, uses 'L' suffix.

#### Summary Table

| Data Type | Size    | Default Value | Range                            |
| --------- | ------- | ------------- | -------------------------------- |
| byte      | 1 byte  | 0             | -128 to 127                      |
| short     | 2 bytes | 0             | -32,768 to 32,767                |
| int       | 4 bytes | 0             | -2³¹ to 2³¹-1 (~ -2.1B to +2.1B) |
| long      | 8 bytes | 0L            | -2⁶³ to 2⁶³-1                    |

#### Example

```java
public class IntegerTypesExample {
    public static void main(String[] args) {
        byte b = 100;
        short s = 1000;
        int i = 100000;
        long l = 1000000L;
        System.out.println("Byte: " + b);
        System.out.println("Short: " + s);
        System.out.println("Int: " + i);
        System.out.println("Long: " + l);
    }
}
```

#### Output

```
Byte: 100
Short: 1000
Int: 100000
Long: 1000000
```

### 2.2 Floating-Point Types

Store decimal values.

- **float**: 32-bit, 7 decimal digits, 'f' suffix.
- **double**: 64-bit, 15 decimal digits, default for decimals.

#### Summary Table

| Data Type | Size    | Default Value | Range                  |
| --------- | ------- | ------------- | ---------------------- |
| float     | 4 bytes | 0.0f          | ±3.4e−038 to ±3.4e+038 |
| double    | 8 bytes | 0.0d          | ±1.7e−308 to ±1.7e+308 |

#### Example

```java
public class FloatingPointExample {
    public static void main(String[] args) {
        float f = 3.14f;
        double d = 3.14159;
        System.out.println("Float: " + f);
        System.out.println("Double: " + d);
    }
}
```

#### Output

```
Float: 3.14
Double: 3.14159
```

### 2.3 Character Type

- **char**: Stores a single 16-bit Unicode character.

#### Summary Table

| Data Type | Size    | Default Value | Range                            |
| --------- | ------- | ------------- | -------------------------------- |
| char      | 2 bytes | ''            | 0 to 65,535 (Unicode characters) |

#### Example

```java
public class CharExample {
    public static void main(String[] args) {
        char c1 = 'A';
        char c2 = '\u0041'; // Unicode for 'A'
        System.out.println("Char (literal): " + c1);
        System.out.println("Char (Unicode): " + c2);
    }
}
```

#### Output

```
Char (literal): A
Char (Unicode): A
```

### 2.4 Boolean Type

- **boolean**: Stores `true` or `false`.

#### Summary Table

| Data Type | Size   | Default Value | Values        |
| --------- | ------ | ------------- | ------------- |
| boolean   | ~1 bit | false         | true or false |

#### Example

```java
public class BooleanExample {
    public static void main(String[] args) {
        boolean isActive = true;
        System.out.println("Is Active: " + isActive);
    }
}
```

#### Output

```
Is Active: true
```

## 3. Non-Primitive Data Types 🗂️

Non-primitive types hold references to objects.

### Examples

- **Strings**: Sequence of characters.
- **Arrays**: Collection of similar elements.
- **Classes**: Blueprints for objects.
- **Interfaces**: Contracts for classes.

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

## 4. Summary Table 📊

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

## 5. Conclusion 🌈

Choosing the right data type is key to efficient Java programming, optimizing performance and memory usage.

---

# Java Operators with Code Examples 🎯

Operators perform operations on variables and values. This guide covers Java operators with examples and outputs.

## 1. Arithmetic Operators ➕

Perform basic mathematical operations.

- ✅ **+**: Addition
- ✅ **-**: Subtraction
- ✅ **\***: Multiplication
- ✅ **/**: Division
- ✅ **%**: Modulus

### Example Code

```java
int a = 10, b = 3;
System.out.println("Add: " + (a + b));
System.out.println("Sub: " + (a - b));
System.out.println("Mul: " + (a * b));
System.out.println("Div: " + (a / b));
System.out.println("Mod: " + (a % b));
```

### Output

```
Add: 13
Sub: 7
Mul: 30
Div: 3
Mod: 1
```

## 2. Assignment Operators 📝

Assign values to variables.

- ✅ **=**: Assign
- ✅ **+=**: Add and assign
- ✅ **-=**: Subtract and assign
- ✅ **\*=**: Multiply and assign
- ✅ **/=**: Divide and assign
- ✅ **%=**: Modulus and assign

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

### Output

```
Final a: 1
```

## 3. Relational Operators ⚖️

Compare values, returning a boolean.

- ✅ **==**: Equal to
- ✅ **!=**: Not equal to
- ✅ **>**: Greater than
- ✅ **<**: Less than
- ✅ **>=**: Greater than or equal to
- ✅ **<=**: Less than or equal to

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

### Output

```
false
true
false
true
false
true
```

## 4. Unary Operators 🔄

Operate on a single operand.

- ✅ **+**: Unary plus
- ✅ **-**: Unary minus
- ✅ **++**: Increment
- ✅ **--**: Decrement
- ✅ **!**: Logical NOT

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

### Output

```
5
-5
6
6
5
true
```

## 5. Logical Operators 🔗

Combine boolean conditions.

- ✅ **&&**: Logical AND
- ✅ **||**: Logical OR
- ✅ **!**: Logical NOT

### Example Code

```java
int a = 10, b = 5;
System.out.println((a > 5) && (b < 10));
System.out.println((a < 5) || (b < 10));
System.out.println(!(a < b));
```

### Output

```
true
true
true
```

---

# Java Conditional Statements 🛑

Conditional statements control program flow based on conditions. This guide covers their syntax and examples.

## 1. if Statement ✅

### Purpose

Executes code if a condition is true.

### Syntax

```java
if (condition) {
    // Code
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

## 2. if-else Statement 🔄

### Purpose

Executes one block if true, another if false.

### Syntax

```java
if (condition) {
    // True block
} else {
    // False block
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

## 3. if-else-if Ladder 📊

### Purpose

Tests multiple conditions sequentially.

### Syntax

```java
if (condition1) {
    // Block 1
} else if (condition2) {
    // Block 2
} else {
    // Default block
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

## 4. Nested if Statements 🪆

### Purpose

Places if statements inside others for multi-level checks.

### Syntax

```java
if (condition1) {
    if (condition2) {
        // Code
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

## 5. switch Statement 🔀

### Purpose

Checks a variable against multiple values.

### Syntax

```java
switch (expression) {
    case value1:
        // Code
        break;
    case value2:
        // Code
        break;
    default:
        // Default
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

## 6. Summary Table 📊

| Statement Type | Use Case                               |
| -------------- | -------------------------------------- |
| if             | Single condition                       |
| if-else        | Binary condition                       |
| if-else-if     | Multiple sequential conditions         |
| nested if      | Multi-level dependent conditions       |
| switch         | Equality check against multiple values |

---

# Java Loops - Comprehensive Notes 🔁

Loops execute code repeatedly based on a condition. This guide covers Java’s loop constructs.

## 1. for Loop 🔄

### Syntax

```java
for (initialization; condition; update) {
    // Code
}
```

### Terms Explained

- **Initialization**: Runs once to set up the loop.
- **Condition**: Checked before each iteration.
- **Update**: Runs after each iteration.

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

## 2. Nested for Loop 🪆

### Use Case

Ideal for patterns or multi-dimensional data.

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

## 3. while Loop ⏳

### Syntax

```java
while (condition) {
    // Code
}
```

### Explanation

Checks condition before each iteration.

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

## 4. do-while Loop 🔄

### Syntax

```java
do {
    // Code
} while (condition);
```

### Explanation

Executes at least once before checking the condition.

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

## 5. for-each Loop (Enhanced for Loop) 🗃️

### Use Case

Ideal for arrays or collections.

### Syntax

```java
for (type element : array) {
    // Code
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

## Summary Table 📊

| Loop Type  | Entry Condition | Guaranteed Execution | Best Use Case          |
| ---------- | --------------- | -------------------- | ---------------------- |
| for        | Yes             | No                   | Known iterations       |
| Nested for | Yes             | No                   | Patterns, matrices     |
| while      | Yes             | No                   | Unknown iterations     |
| do-while   | No              | Yes                  | At least one iteration |
| for-each   | Yes             | No                   | Arrays or collections  |

---

# Break and Continue in Java - Detailed Notes 🛑

`break` and `continue` control loop and switch execution flow.

## 1. Introduction 📖

- **break**: Terminates the innermost loop or switch.
- **continue**: Skips the current iteration, proceeding to the next.

## 2. break Statement 🚫

### Description

Terminates the innermost loop or switch.

### Syntax

```java
break;
```

### Example 1: break in for Loop

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

### Example 2: break in while Loop

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

## 3. continue Statement ⏭️

### Description

Skips the current iteration.

### Syntax

```java
continue;
```

### Example 1: continue in for Loop

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

### Example 2: continue in while Loop

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

## 4. break vs continue 📊

| Feature             | break              | continue                |
| ------------------- | ------------------ | ----------------------- |
| **Purpose**         | Exits loop/switch  | Skips current iteration |
| **After Execution** | Moves outside loop | Moves to next iteration |
| **Usage**           | Loops and switch   | Loops only              |

## 5. Using Labels with break and continue 🏷️

### Description

Labels control outer loops in nested structures.

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

---

# Type Casting in Java - Detailed Notes 🔄

Type casting converts a variable from one data type to another.

## 1. Introduction 📖

- **Implicit Casting (Widening)**: Automatic, smaller to larger type.
- **Explicit Casting (Narrowing)**: Manual, larger to smaller type.

## 2. Implicit Type Casting (Widening) 📈

### Description

- Automatic, no data loss.
- Order: `byte -> short -> int -> long -> float -> double`

### Syntax

No special syntax.

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

## 3. Explicit Type Casting (Narrowing) 📉

### Description

- Manual, may cause data loss.
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

### Example 2: int to byte

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

## 4. Data Loss During Casting ⚠️

### Description

Larger types cast to smaller types may lose data.

### Example: long to int

```java
public class DataLossExample {
    public static void main(String[] args) {
        long l = 2147483648L;
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

## 5. Implicit vs Explicit Casting 📊

| Aspect        | Implicit Casting  | Explicit Casting       |
| ------------- | ----------------- | ---------------------- |
| **Process**   | Automatic         | Manual                 |
| **Data Loss** | No                | Possible               |
| **Syntax**    | No cast operator  | Requires cast operator |
| **Direction** | Smaller -> Larger | Larger -> Smaller      |

## 6. Important Points 📝

- ✅ Implicit casting is safe.
- ⚠️ Explicit casting risks data loss.
- ❌ Non-compatible types (e.g., `int` to `boolean`) cannot be cast.

---

# Java Strings - Complete Notes 📜

Strings are immutable sequences of characters in Java.

## 1. Introduction 🌟

Strings use the `String` class in `java.lang` and are immutable.

## 2. String Constant Pool 🗄️

Strings are stored in the **String Constant Pool (SCP)** to save memory.

### Example

```java
String s1 = "Hello";
String s2 = "Hello"; // Same SCP object
String s3 = new String("Hello"); // Heap memory
```

## 3. Ways to Create Strings 🛠️

1. String literals (SCP).
2. `new` keyword (heap).
3. Character arrays: `new String(char[])`.
4. Byte arrays: `new String(byte[])`.

### Example: Character Array

```java
char[] chars = {'J', 'a', 'v', 'a'};
String s1 = new String(chars);
System.out.println(s1);
```

### Output

```
Java
```

## 4. Advantages of Strings ✅

- **Immutability**: Thread-safe and secure.
- **Memory Optimization**: SCP reduces duplication.
- **Built-in Methods**: Rich functionality.
- **Ease of Use**: API integration.
- **Versatility**: Used in file handling, networking, etc.

## 5. Important String Methods 📋

### Method: length()

```java
String str = "Hello";
System.out.println(str.length());
```

#### Output

```
5
```

### Method: charAt()

```java
String str = "Hello";
System.out.println(str.charAt(1));
```

#### Output

```
e
```

### Method: substring()

```java
String str = "HelloWorld";
System.out.println(str.substring(5));
```

#### Output

```
World
```

### Method: contains()

```java
String str = "OpenAI ChatGPT";
System.out.println(str.contains("Chat"));
```

#### Output

```
true
```

### Method: equals()

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

```java
String str = "HELLO";
System.out.println(str.toLowerCase());
```

#### Output

```
hello
```

### Method: toUpperCase()

```java
String str = "hello";
System.out.println(str.toUpperCase());
```

#### Output

```
HELLO
```

### Method: trim()

```java
String str = "  Hello  ";
System.out.println(str.trim());
```

#### Output

```
Hello
```

### Method: replace()

```java
String str = "banana";
System.out.println(str.replace('a', 'o'));
```

#### Output

```
bonono
```

### Method: split()

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

```java
String str = "programming";
System.out.println(str.indexOf('g'));
```

#### Output

```
3
```

### Method: lastIndexOf()

```java
String str = "programming";
System.out.println(str.lastIndexOf('g'));
```

#### Output

```
10
```

### Method: startsWith()

```java
String str = "Java";
System.out.println(str.startsWith("Ja"));
```

#### Output

```
true
```

### Method: endsWith()

```java
String str = "Java";
System.out.println(str.endsWith("va"));
```

#### Output

```
true
```

---

# Java Arrays - Detailed Notes 🗃️

Arrays store fixed-size collections of the same type.

## 1. Introduction 📖

Arrays have a fixed length once created.

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

## 2. Array Initialization and Access 🔄

Arrays can be initialized directly or via indices.

### Example

```java
int[] nums = {1, 2, 3, 4, 5};
System.out.println(nums[0]);
```

### Output

```
1
```

## 3. Looping through Arrays 🔁

Use `for` or `for-each` loops.

### Example: for Loop

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

### Example: for-each Loop

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

## 4. Advantages of Arrays ✅

- **Random Access**: Direct index access.
- **Ease of Traversal**: Simple looping.
- **Memory Efficiency**: Fixed size.
- **Reduced Complexity**: Single variable for multiple values.
- **Performance**: Fast access/modification.

## 5. Two-Dimensional Arrays 📊

Arrays of arrays, used for matrices.

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

---

# Types of Variables in Java 📋

Variables in Java are classified into three types based on scope and storage.

## 1. Instance Variables 🧑

### Definition

- Declared in a class, outside methods.
- Each object has its own copy.
- Stored in heap memory.

### When to Use

- For object-specific data.

### Example

```java
public class Student {
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

## 2. Static Variables (Class Variables) 🏛️

### Definition

- Declared with `static`, belongs to the class.
- Stored in method area.
- Accessed without objects.

### When to Use

- For shared data across objects.

### Example

```java
public class Counter {
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

## 3. Local Variables 📍

### Definition

- Declared in methods or blocks.
- Stored in stack memory.
- Must be initialized.

### When to Use

- For temporary data in a method.

### Example

```java
public class LocalVariableExample {
    public static void main(String[] args) {
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

---

# This, Super, and Constructor Chaining in Java 🔗

This guide covers `this`, `super`, and constructor chaining.

## 1. The `this` Keyword 📍

Refers to the current object.

### Uses

- ✅ Refer to instance variables.
- ✅ Invoke class methods.
- ✅ Invoke constructors (`this()`).
- ✅ Pass current object as an argument.

### Example 1: Instance Variables

```java
class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
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

### Example 2: Invoking Method

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

### Example 3: Invoking Constructor

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

## 2. The `super` Keyword 🦸

Refers to the parent class object.

### Uses

- ✅ Refer to parent variables.
- ✅ Invoke parent methods.
- ✅ Invoke parent constructors (`super()`).

### Example

```java
class Animal {
    Animal() {
        System.out.println("Animal constructor");
    }
}

class Dog extends Animal {
    Dog() {
        super();
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

## 3. Constructor Chaining 🔄

Calls constructors within the same or parent class.

### Rules

- `this()` or `super()` must be the first statement.
- `this()`: Same class constructor.
- `super()`: Parent class constructor.

### Example

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
        this(100);
        System.out.println("No-arg constructor");
    }

    Car(int speed) {
        super("Toyota");
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
