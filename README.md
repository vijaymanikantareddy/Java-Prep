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

```.java → compile (javac) → .class → JVM → Binary → Run```


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

| Component | Description |
|----------|-------------|
| **JDK** | JRE + Development Tools |
| **JRE** | JVM + Libraries |
| **JVM** | Bytecode Runner and Manager |

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

# Java Naming Conventions and Valid  
# Identifiers  

## 1. Introduction  
Naming conventions in Java are essential for writing clean, readable, and maintainable code. Java provides flexibility in naming identifiers, but following standard conventions helps  
in maintaining consistency across projects.  

## 2. Class Naming Conventions  
**Allowed:**  
- Must begin with a letter (A–Z or a–z), underscore (_), or dollar sign ($)  
- Can include letters, digits (0–9), underscores (_), and dollar signs ($)  
- Cannot begin with a digit  
- Cannot be a reserved Java keyword  

**Conventions:**  
- Use PascalCase (Each word starts with a capital letter)  
- Name should be a noun  

**Examples:**  
- class Student {}
- class BankAccount {}
- class MyClass123 {}
- class $MainClass {}

**Invalid Examples:**  
- class 123Class {} // Starts with a digit
- class class {}    // 'class' is a reserved keyword
- class My-Class {} // Hyphen is not allowed


## 3. Package Naming Conventions  
**Allowed:**  
- Must start with a letter  
- Can contain letters, digits, and periods (.)  
- No underscores, dollar signs, or special characters  
- Use only lowercase letters  

**Conventions:**  
- Use lowercase, domain-style format (e.g., com.example.app)  

**Examples:**  
- package com.myapp;
- package org.example.utils;

**Invalid Examples:**  
- package MyPackage; // Uppercase not standard
- package 123utils; // Cannot start with digit
- package my-package; // Hyphens not allowed


## 4. Variable Naming Conventions  
**Allowed:**  
- Must begin with a letter, underscore (_), or dollar sign ($)  
- Can include letters, digits, underscores, and dollar signs  
- Cannot be a Java keyword  

**Conventions:**  
- Use camelCase  
- Name should be descriptive nouns  

**Examples:**  


## 4. Variable Naming Conventions  
**Allowed:**  
- Must begin with a letter, underscore (_), or dollar sign ($)  
- Can include letters, digits, underscores, and dollar signs  
- Cannot be a Java keyword  

**Conventions:**  
- Use camelCase  
- Name should be descriptive nouns  

**Examples:**  
- int age;
- String studentName;
- double _balance;
- boolean $isValid;


**Invalid Examples:**  
- int 2marks; // Starts with a digit
- int class; // 'class' is a keyword
- int student-name; // Hyphens not allowed


## 5. Method Naming Conventions  
**Allowed:**  
- Follows same rules as variable naming  
- Must begin with a letter, _ or $  
- Cannot be a reserved keyword  

**Conventions:**  
- Use camelCase  
- Method names should be verbs or verb phrases  

**Examples:**  
- void calculateTotal() {}
- int getMarks() {}
- boolean isAvailable() {}


**Invalid Examples:**  
- void 123print() {} // Starts with digit
- void void() {} // 'void' is a keyword
- void print-message() {} // Hyphen not allowed


## 6. Summary Table  
| Element | Convention       | Example         | Invalid Example |
|---------|------------------|-----------------|-----------------|
| Class   | PascalCase       | StudentRecord   | 123Class        |
| Package | lowercase.words  | com.example     | MyPackage       |
| Variable| camelCase        | studentAge      | int (keyword)   |
| Method  | camelCase (verb) | calculateMarks()| 123print()      |

Following these conventions ensures that your code adheres to industry standards,  
improves collaboration, and enhances maintainability.

# Java Data Types - Detailed Notes  

## 1. Introduction  
Java is a strictly-typed language, which means every variable must be declared with a data  
type. Data types specify the size and type of values that can be stored in variables.  
Java data types are broadly classified into:  
●  Primitive Data Types  
●  Non-Primitive (Reference/Object) Data Types  

## 2. Primitive Data Types  
●  Java has 8 built-in primitive data types:  

### 2.1 Integer Types  
These are used to store whole numbers.  
●  **byte**: The smallest integer type, useful for saving memory.  
●  **short**: Larger than byte, but still saves memory compared to int when memory is a  
constraint.  
●  **int**: Default integer type, most commonly used for integer values.  
●  **long**: Used when a wider range than int is needed, often denoted with an 'L' at the  
end.  

| Data Type | Size     | Default Value | Range                                 |
|-----------|----------|----------------|----------------------------------------|
| byte      | 1 byte   | 0              | -128 to 127                            |
| short     | 2 bytes  | 0              | -32,768 to 32,767                      |
| int       | 4 bytes  | 0              | -2^31 to 2^31-1 (~ -2.1B to +2.1B)     |
| long      | 8 bytes  | 0L             | -2^63 to 2^63-1                        |

### 2.2 Floating Point Types  
Used to store decimal values.  
●  float: Single-precision 32-bit floating point. Can hold up to 7 values after decimal  
point.  
●  double: Double-precision 64-bit floating point. Can hold up to 7 values after decimal  
point. Default choice for decimal values.  

| Data Type | Size     | Default Value | Range                                        |
|-----------|----------|----------------|-----------------------------------------------|
| float     | 4 bytes  | 0.0f           | Approximately ±3.4e−038 to ±3.4e+038          |
| double    | 8 bytes  | 0.0d           | Approximately ±1.7e−308 to ±1.7e+308          |

### 2.3 Character Type  
●  char: Used to store a single 16-bit Unicode character. Useful for storing characters like 'A', '9', or special symbols.  

| Data Type | Size     | Default Value | Range                            |
|-----------|----------|----------------|-----------------------------------|
| char      | 2 bytes  | '\u0000'       | 0 to 65,535 (Unicode characters) |

### 2.4 Boolean Type  
●  boolean: Only two possible values: true and false. Used for simple flags that track true/false conditions.  

| Data Type | Size   | Default Value | Values        |
|-----------|--------|----------------|---------------|
| boolean   | ~1 bit | false          | true or false |

## 3. Non-Primitive Data Types  
Non-primitive types are created by the programmer and are also known as reference types.  
These types hold references to objects.  

Examples:  
●  Strings: Sequence of characters.  
●  Arrays: Collection of similar types of elements.  
●  Classes: Blueprint for creating objects.  
●  Interfaces: A contract that classes implement.  

**Example:**  
```java
String name = "John";  
int[] marks = {90, 85, 78};  
MyClass obj = new MyClass();  
```

## 4. Summary Table

| Type    | Category  | Size     | Default Value | Example Values              |
|---------|-----------|----------|----------------|-----------------------------|
| byte    | Integer   | 1 byte   | 0              | -100, 0, 100                |
| short   | Integer   | 2 bytes  | 0              | -30000, 0, 30000            |
| int     | Integer   | 4 bytes  | 0              | -1,000,000 to +1,000,000    |
| long    | Integer   | 8 bytes  | 0L             | 9999999999L                 |
| float   | Floating  | 4 bytes  | 0.0f           | 3.14f, -0.5f                |
| double  | Floating  | 8 bytes  | 0.0d           | 3.14159265359               |
| char    | Character | 2 bytes  | '\u0000'       | 'A', '9', '#'               |
| boolean | Logical   | 1 bit    | false          | true, false                 |
