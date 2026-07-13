# Java Practice Programs

A curated Java practice repository organized by programming topic. The project contains small console programs for Java fundamentals, string handling, arrays, object-oriented programming, data structures, exception handling, and miscellaneous exercises.

## Topics Covered

- Basics
- Strings
- Arrays
- Object-Oriented Programming
- Data Structures
- Exception Handling
- Miscellaneous Java exercises

## Folder Structure

```text
java-practice/
+-- Arrays/
¦   +-- DistinctElements.java
¦   +-- EquilibriumSum.java
¦   +-- Hikers.java
¦   +-- MergeArrays.java
¦   +-- MissingNumbers.java
+-- Basics/
¦   +-- HelloWorld.java
¦   +-- SumABCD.java
+-- Data-Structures/
¦   +-- SingleLinkedList.java
+-- Exception-Handling/
¦   +-- ExceptionHandlingDemo.java
+-- Miscellaneous/
¦   +-- CountNumbers.java
¦   +-- EmptyProgram.java
¦   +-- PasswordValidator.java
+-- Object-Oriented-Programming/
¦   +-- ConstructorDemo.java
¦   +-- ObjectCreationDemo.java
+-- Strings/
¦   +-- ChangeCase.java
¦   +-- CharacterOccurrence.java
¦   +-- CompareStrings.java
¦   +-- CountCharacters.java
¦   +-- CountWords.java
¦   +-- LongestWord.java
¦   +-- PangramChecker.java
¦   +-- RemoveSpaces.java
¦   +-- StringPalindrome.java
¦   +-- UppercaseCounter.java
¦   +-- VowelCounter.java
+-- .gitignore
+-- README.md
```

## Compile and Run

Compile a single program:

```bash
javac Strings/VowelCounter.java
```

Run the compiled program from its folder:

```bash
cd Strings
java VowelCounter
```

Compile all programs into a separate output folder:

```bash
mkdir -p out
javac -d out $(find . -name "*.java")
```

On Windows PowerShell:

```powershell
New-Item -ItemType Directory -Force out
javac -d out (Get-ChildItem -Recurse -Filter *.java).FullName
```

Some files may still contain original exercise-level syntax errors. See the repository organization summary or compiler output for remaining issues.