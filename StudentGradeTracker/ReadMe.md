# Student Grade Tracker

## Overview

Student Grade Tracker is a console-based Java application that helps manage student records and grades efficiently. The application allows users to add, search, update, and delete student records while also generating summary statistics such as average, highest, and lowest scores.

## Features

* Add new students and their grades
* Prevent duplicate student entries
* Search for a student by name
* Update student grades
* Delete student records
* View all student records
* Calculate average score
* Find highest and lowest scores
* Display the top-performing student
* Input validation for grades (0–100)

## Technologies Used

* Java
* HashMap Collection Framework
* Object-Oriented Programming Concepts
* VS Code / IntelliJ IDEA

## Project Structure

StudentGradeTracker/

├── GradeTracker.java

├── README.md

└── screenshots/

    ├── output1.png

    └── output2.png

## How to Run

### Compile

```bash
javac GradeTracker.java
```

### Execute

```bash
java GradeTracker
```

## Menu Options

1. Add Student
2. View Report
3. Search Student
4. Update Grade
5. Delete Student
6. Top Performer
7. Exit

## Sample Output

===== Student Grade Tracker =====

1. Add Student
2. View Report
3. Search Student
4. Update Grade
5. Delete Student
6. Top Performer
7. Exit

Enter Choice: 1

Enter Student Name: Sathish

Enter Grade (0-100): 90

Student Added Successfully!

## Time Complexity

| Operation            | Complexity |
| -------------------- | ---------- |
| Add Student          | O(1)       |
| Search Student       | O(1)       |
| Update Grade         | O(1)       |
| Delete Student       | O(1)       |
| View Report          | O(n)       |
| Average Score        | O(n)       |
| Highest/Lowest Score | O(n)       |

## Learning Outcomes

* Working with Java Collections (HashMap)
* Implementing CRUD Operations
* Method-based Program Design
* Input Validation
* Time Complexity Analysis
* Building Console-Based Applications

## Author

Sathish Chekuri
