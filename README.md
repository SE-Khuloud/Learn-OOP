# Learn-OOP

A reference repository for my Object-Oriented Programming course, where I keep my Java code and notes.
Anyone is welcome to use it, and I hope it helps!

## How to run a Java program

```
javac Hello.java
java Hello
```

The file name must match the public class name (`Hello.java` contains `public class Hello`).

## Contents

| Module | Topic |
| --- | --- |
| [1](#module-1--introduction-to-computers-and-java) | Introduction to computers and Java |
| [2](#module-2--introduction-to-java-applications-i) | Introduction to Java applications I |
| [3](#module-3--introduction-to-java-applications-ii) | Introduction to Java applications II |
| [4](#module-4--control-statements-i) | Control statements I |
| [5](#module-5--control-statements-ii) | Control statements II |
| [6](#module-6--methods-part-1) | Methods (Part 1) |
| [7](#module-7--methods-part-2) | Methods (Part 2) |

---

## Module 1 – Introduction to Computers and Java

**Hardware vs software**
- Hardware: the physical parts (keyboard, mouse, CPU, monitor).
- Software: the programs that run on the computer and control the hardware.

**Logical units of a computer**
- Input unit: accepts data and instructions
- Output unit: displays results
- Memory unit (RAM): stores data temporarily
- ALU: performs arithmetic and logical operations
- CPU: controls all operations
- Secondary storage: stores data permanently

**Programming languages**
- Machine language: binary, the only language the computer understands directly (hardware-dependent).
- Assembly language: symbolic instructions, translated by an assembler.
- High-level languages: close to human language, translated by a compiler or interpreter.

**Compiler vs interpreter**
- Compiler: translates the whole program before execution.
- Interpreter: translates and runs the program line by line.

**Operating system:** system software that manages hardware resources and provides services to applications. The kernel is its core.

**Why Java is portable:** Java code is compiled to bytecode, which runs on any system that has a JVM ("Write once, run anywhere").

**Java development phases**
1. Write source code (`.java`)
2. Compile into bytecode (`.class`)
3. Load classes into memory
4. Verify the bytecode
5. Execute with the JVM (interpreter + JIT)

---

## Module 2 – Introduction to Java Applications I

**Program structure**

```java
public class Hello
{
    public static void main(String[] args)
    {
        System.out.println("Hello, World!");
    }
}
```

- Execution starts from the `main` method.
- Every statement ends with a semicolon `;`.

**Output methods**
- `print`: stays on the same line
- `println`: moves to the next line
- `printf`: formatted output

**Escape sequences:** `\n` new line, `\t` tab.

**printf format specifiers**

| Specifier | Meaning |
| --- | --- |
| `%s` / `%S` | String (`%S` prints in uppercase) |
| `%d` | Integer |
| `%f` | Floating-point number |
| `%b` / `%B` | Boolean |
| `%n` | New line |
| `%,d` | Integer with thousands separator |
| `%tH` `%tM` `%tS` | Hours, minutes, seconds of a date/time |

```java
System.out.printf("%s%n", "Welcome to");
System.out.printf("%b%n", 5.3 > 0);   // true
System.out.printf("%,d%n", 10000);    // 10,000
```

**Reading input with Scanner**

```java
import java.util.Scanner;

Scanner input = new Scanner(System.in);
int number = input.nextInt();
```

Methods: `nextInt()`, `nextDouble()`, `next()`, `nextLine()`.

**Comments:** `// single line`, `/* multi-line */`, `/** Javadoc */`.

**Debugging tools:** breakpoints, exception breakpoints, watchpoints.

---

## Module 3 – Introduction to Java Applications II

### Variables
- A variable is a location in memory that stores a value.
- It must be declared with a name and a type before use.
- Names can contain letters, digits, `_` and `$`, cannot start with a digit, and have no spaces. Java is case sensitive (`a1` and `A1` are different).

```java
int number1, number2;   // several variables of the same type
int myNum = 15;         // declare and assign
myNum = 20;             // change the value
```

**Primitive types:** `byte`, `short`, `int`, `long`, `float`, `double`, `char`, `boolean`.

```java
int myNum = 5;           // whole number
float myFloatNum = 5.99f; // decimal number
double y = 5.5;
char myLetter = 'D';
boolean myBool = true;
String myText = "Hello"; // String is not a primitive type
```

**Final variables (constants)**

```java
final int MAX = 100;
// MAX = 50;  // Error: cannot assign a value to a final variable
```

### Memory concepts
- A variable name corresponds to a location in memory.
- Reading a variable does not change it.
- Assigning a new value replaces the old one.

```java
int number1 = 45;
number1 = 72;   // 72 replaces 45
```

### Arithmetic operators

| Operator | Meaning |
| --- | --- |
| `+` `-` `*` | Add, subtract, multiply |
| `/` | Divide (integer division drops the decimals) |
| `%` | Remainder |

```java
7 / 5   // 1
7 % 5   // 2
((3 + 2) * 4)   // 20, the innermost parentheses are evaluated first
```

**Precedence:** `*`, `/`, `%` first (left to right), then `+`, `-` (left to right).

### Equality and relational operators
`==`, `!=`, `>`, `<`, `>=`, `<=` give `true` or `false`.

```java
int x = 5, y = 3;
System.out.println(x == y);   // false
System.out.println(x > y);    // true
System.out.println(x <= y);   // false
```

### Increment / decrement operators
- Pre (`++b`): changes the value first, then uses it.
- Post (`b++`): uses the value first, then changes it.

```java
int b = 15;
int a = ++b;   // a = 16, b = 16

int c = 15;
int d = c++;   // d = 15, c = 16

int x = 10;
int y = --x;   // y = 9
```

### Assignment operators

```java
int x = 10;
x += 5;   // 15
x -= 3;   // 12
```

### Types of errors

| Error | When it happens | Example |
| --- | --- | --- |
| Syntax | Detected by the compiler | `int x = 10` (missing `;`) |
| Runtime | While the program runs | `int a = 5 / 0;` |
| Logic | Program runs but gives a wrong result | `double avg = a + b / 2;` (should be `(a + b) / 2`) |

---

## Module 4 – Control Statements I

### Algorithms and pseudocode
- **Algorithm:** a step-by-step procedure that solves a problem (the actions and the order they execute).
- **Pseudocode:** an informal way to write algorithms without Java syntax. It does not execute on a computer.

```
If student's grade is greater than or equal to 60
    Print "Passed"
else
    Print "Failed"
```

### Control structures
- **Sequence:** statements run one after another (built into Java).
- **Selection:** `if`, `if...else`, `switch`.
- **Repetition:** `while`, `do...while`, `for`.

### if statement
Runs the action only when the condition is true.

```java
if (grade >= 60)
    System.out.println("Passed");
```

### if...else statement

```java
if (number % 2 == 0)
    System.out.println("even number");
else
    System.out.println("odd number");
```

### Nested if...else

```java
if (studentGrade >= 90)
    System.out.println("A");
else if (studentGrade >= 80)
    System.out.println("B");
else if (studentGrade >= 70)
    System.out.println("C");
else if (studentGrade >= 60)
    System.out.println("D");
else
    System.out.println("F");
```

### Dangling else
An `else` always belongs to the nearest preceding `if`, unless braces say otherwise.

```java
if (x > 5)
{
    if (y > 5)
        System.out.println("x and y are > 5");
}
else
    System.out.println("x is <= 5");
```

### Blocks
To put several statements in an `if` or `else`, wrap them in braces.

```java
if (grade >= 60)
    System.out.println("Passed");
else
{
    System.out.println("Failed");
    System.out.println("You must take this course again.");
}
```

### switch...case
- Chooses an action based on the value of an expression.
- The expression can be `byte`, `short`, `char`, `int`, an `enum` or a `String`. It cannot be `long`, `float`, `double` or `boolean`.
- Case values must be unique.
- `break` is optional, but without it execution **falls through** to the next case.
- `default` is optional and runs when no case matches.

```java
int number = 20;
switch (number)
{
    case 10:
        System.out.println("10");
        break;
    case 20:
        System.out.println("20");
        break;
    default:
        System.out.println("Not 10 or 20");
}
```

Fall-through example (no `break` after case `'B'`, so it continues into `'C'`):

```java
char grade = 'B';
switch (grade)
{
    case 'A':
        System.out.println("Excellent!");
        break;
    case 'B':
    case 'C':
        System.out.println("Well done");
        break;
    default:
        System.out.println("Invalid grade");
}
```

### Conditional operator `?:`
Java's only ternary operator, a short form of `if...else`.

```java
String result = (a > b) ? "Yes" : "No";
```

---

## Module 5 – Control Statements II

### Repetition (loops)
A loop repeats a block of code while a condition stays true. Loops save time, reduce errors and make code more readable.

A counter-controlled loop needs four things:
1. A control variable (loop counter)
2. Its initial value
3. The increment applied each iteration
4. The loop-continuation condition

### while loop
Checks the condition **before** the body. If the condition is false at the start, the body never runs (it can run zero times).

```java
int counter = 1;                  // initialize control variable
while (counter <= 10)             // loop-continuation condition
{
    System.out.printf("%d ", counter);
    ++counter;                    // increment control variable
}
System.out.println();
```

### for loop
Puts the initialization, condition and increment in one line. Best when the number of iterations is known.

```java
for (int counter = 1; counter <= 10; counter++)
    System.out.printf("%d ", counter);
```

Summing the even integers from 2 to 20:

```java
int total = 0;
for (int number = 2; number <= 20; number += 2)
    total += number;
System.out.println(total);   // 110
```

### do...while loop
Checks the condition **after** the body, so the body always runs **at least once**.

```java
int counter = 1;
do
{
    System.out.printf("%d ", counter);
    ++counter;
} while (counter <= 10);
```

### Loop comparison

| Loop | Condition checked | Minimum runs | Best for |
| --- | --- | --- | --- |
| `while` | Before the body | 0 | Unknown number of iterations |
| `do...while` | After the body | 1 | Body must run at least once |
| `for` | Before the body | 0 | Known number of iterations |

### Nested loops
A loop inside another loop. The inner loop runs **completely** for every iteration of the outer loop.

```java
for (int i = 1; i <= 3; i++)
{
    for (int j = 1; j <= 2; j++)
        System.out.println("i=" + i + ", j=" + j);
}
```

### break and continue
- `break`: exits the loop (or `switch`) immediately. Execution continues with the first statement after it.
- `continue`: skips the rest of the loop body and goes to the next iteration. In a `for` loop the increment runs first, then the condition is tested.

```java
for (int i = 1; i <= 10; i++)
{
    if (i == 5)
        break;                    // prints 1 2 3 4
    System.out.print(i + " ");
}

for (int i = 1; i <= 10; i++)
{
    if (i == 5)
        continue;                 // prints 1 2 3 4 6 7 8 9 10
    System.out.print(i + " ");
}
```

### Logical operators
They combine simple conditions into more complex ones.

| Operator | Name | Result |
| --- | --- | --- |
| `&&` | Conditional AND | `true` only if both conditions are true |
| `\|\|` | Conditional OR | `true` if at least one condition is true |
| `&` | Boolean logical AND | Same as `&&`, but always evaluates both operands |
| `\|` | Boolean logical inclusive OR | Same as `\|\|`, but always evaluates both operands |
| `^` | Boolean logical exclusive OR | `true` only if exactly one operand is true |
| `!` | Logical NOT | Reverses the condition |

`&&` and `||` use **short-circuit evaluation**: the second condition is skipped if the first one already decides the result.

```java
if (age >= 18 && age <= 60)
    System.out.println("Allowed");
```

---

## Module 6 – Methods (Part 1)

### Why use methods (modules approach)
Without a method, the same loop is repeated for each range:

```java
int sum = 0;
for (int i = 1; i <= 10; i++)
    sum += i;
System.out.println("Sum from 1 to 10 is " + sum);
// ...the same code again for 20 to 30, and 35 to 45
```

With a method, the code is written once and reused:

```java
public static int sum(int i1, int i2)
{
    int sum = 0;
    for (int i = i1; i <= i2; i++)
        sum += i;
    return sum;
}

public static void main(String[] args)
{
    System.out.println("Sum from 1 to 10 is " + sum(1, 10));
    System.out.println("Sum from 20 to 30 is " + sum(20, 30));
    System.out.println("Sum from 35 to 45 is " + sum(35, 45));
}
```

Benefits:
- **Divide and conquer:** build programs from small, simple pieces.
- **Software reusability:** use existing methods as building blocks.
- A method is invoked by a **method call**. When it finishes, it returns control (and possibly a result) to the caller.

### Declaring a method

```java
public static int methodName(int a, int b)
{
    // body
}
```

| Part | Meaning |
| --- | --- |
| `public static` | Modifiers |
| `int` | Return type |
| `methodName` | Name of the method |
| `int a, int b` | List of parameters |

**Naming rules:** the name should be a verb, start with a lowercase letter, and use camelCase for several words (`sum()`, `areaOfCircle()`).

### Types of methods
- **Predefined:** already in the Java class libraries, for example `Math.max(9, 7)`.
- **User-defined:** written by the programmer.

```java
public static void findEvenOdd(int num)
{
    if (num % 2 == 0)
        System.out.println(num + " is even");
    else
        System.out.println(num + " is odd");
}
```

### Return values and void
- `void`: the method returns nothing.
- Any other type: the method returns a value using `return`.

```java
static int myMethod(int x)
{
    return 5 + x;
}
// System.out.println(myMethod(3));  // 8
```

### Parameters and arguments
- **Parameters** are the variables in the method declaration (`n1`, `n2`).
- **Arguments** are the actual values passed when calling it (`a`, `b`).

```java
int c = add(a, b);                          // a and b are arguments

public static int add(int n1, int n2)       // n1 and n2 are parameters
{
    return n1 + n2;
}
```

### Pass-by-value
Java passes a **copy** of the variable's value, so the original does not change.

```java
public static void main(String[] args)
{
    int number = 1;
    tryToChangeNumber(number);
    System.out.println(number);   // still 1
}

public static void tryToChangeNumber(int i)
{
    i = 2;
}
```

### Argument promotion and casting
- **Argument promotion:** Java automatically converts an argument to a larger type without data loss, for example `Math.sqrt(4)` receives `4` as a `double`.
- **Casting:** an explicit conversion, which may lose data.

```java
// square needs an int, so a double must be cast
square((int) doubleValue);   // if doubleValue is 4.5, square receives 4 and returns 16, not 20.25
```

---

## Module 7 – Methods (Part 2)

### Java API packages
- A package is a group of related classes.
- Packages promote software reuse.
- `import` statements specify which classes a program uses.

```java
import java.util.Scanner;
import javax.swing.JOptionPane;
```

### Scope of a declaration
The scope of a declaration is the part of the program that can refer to the declared name.

Basic scope rules:
- Scope of a **parameter**: the body of its method
- Scope of a **local variable**: from its declaration to the end of its block
- Scope of a variable declared in a **for header**: the for statement only
- Scope of a **method or field** of a class: the whole class

```java
public static void main(String[] args)
{
    int x = 10;                 // scope starts here
    if (x > 5)
    {
        int y = 20;             // scope: inside this if block only
        System.out.println(y);
    }
    // System.out.println(y);   // Error: y is out of scope
}

for (int i = 0; i < 5; i++)
    System.out.println(i);
// i cannot be used here
```

### Method overloading
Several methods can have the **same name** if their parameter lists are different (different number of parameters or different types). The return type alone is **not** enough to tell them apart.

By parameter type:

```java
static int add(int a, int b)
{
    return a + b;
}

static double add(double a, double b)
{
    return a + b;
}

// add(11, 11)      -> 22
// add(12.3, 12.6)  -> 24.9
```

By number of parameters:

```java
static int add(int a, int b)
{
    return a + b;
}

static int add(int a, int b, int c)
{
    return a + b + c;
}
```

### Overloading with type promotion
If no exact match exists, Java promotes the arguments to a larger type to find a matching method.

```java
static void sum(int a, long b)
{
    System.out.println(a + b);
}

static void sum(int a, int b, int c)
{
    System.out.println(a + b + c);
}

sum(20, 20);       // the second int is promoted to long -> 40
sum(20, 20, 20);   // 60
```
