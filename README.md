# Java Grade Calculator

A console-based Java application that calculates the average of multiple grades and converts the result to a standard letter grade (A-F).

## Features

- Input validation for all user inputs
- Handles any number of grades
- Calculates average and converts to letter grade
- Replay functionality to perform multiple calculations
- Clear error messages for invalid inputs

## Grading Scale

- A: ≥90%
- B: ≥80%
- C: ≥70%
- D: ≥60%
- F: <60%

## How to Run

1. Ensure you have Java installed on your system
2. Compile the Java file: `javac Main.java`
3. Run the compiled program: `java Main`


## Usage

1. Enter how many grades you want to average
2. Input each grade one by one
3. The program will calculate the average and display the corresponding letter grade
4. Choose whether to perform another calculation or exit

## Code Structure

The program consists of two main methods:
- `main()`: Handles the program loop and replay functionality
- `CalculateAvg()`: Contains the core logic for grade input, averaging, and conversion

## Example
    > How many grades?
    3
    > Enter your grades: 85
    90
    95
    > Your grade is B
    > Do you want to calculate again? y/n
    n

## Technologies Used

- Java
- Java Scanner class for input handling
- Array data structure for storing grades