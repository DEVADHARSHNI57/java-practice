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
