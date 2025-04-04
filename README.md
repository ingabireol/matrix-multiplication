# Matrix Multiplication

## Description
This Java application performs matrix multiplication between two matrices. Matrix multiplication is a fundamental operation in linear algebra with applications in computer graphics, machine learning, signal processing, and more.

When multiplying a matrix `A` of dimensions `(n, m)` with a matrix `B` of dimensions `(m, p)`, we obtain a matrix `C` of dimensions `(n, p)`: `A(n,m) * B(m,p) = C(n,p)`

Matrix multiplication is performed by multiplying the components of the two matrices row by column:

Example:
```
/       \     /     \      /                                     \
| a b c |     | p q |      | a*p + b*r + c*t     a*q + b*s + c*u |
| e f g |  *  | r s |  =   | e*p + f*r + g*t     e*q + f*s + g*u |
| h i j |     | t u |      | h*p + i*r + j*t     h*q + i*s + j*u |
| k l m |     \     /      | k*p + l*r + m*t     k*q + l*s + m*u |
\       /                  \                                     /
```

## Features
- Input validation to ensure that only valid numeric values are accepted
- Ability to handle matrices of different dimensions
- Validation to ensure that matrix dimensions are compatible for multiplication
- User-friendly command-line interface for matrix input
- Clear display of the multiplication result

## Time Complexity
The matrix multiplication algorithm has a time complexity of O(n³), where n is the dimension of the matrices. This is because for each element in the result matrix, we perform a dot product operation that requires m multiplications, where m is the inner dimension.

## Implementation Details

### Classes
1. **Main**: Entry point of the application that handles user input and orchestrates the matrix multiplication process.
2. **MatrixMultiplication**: Contains the core functionality for matrix operations:
   - `multiplyArrays`: Multiplies two matrices if their dimensions are compatible
   - `populateArray`: Handles user input for populating matrices
   - `isInputValid`: Validates that input is numeric
   - `printArray`: Displays matrices in a formatted way

### Usage
1. Run the application
2. Enter dimensions for the first matrix (rows and columns)
3. Enter dimensions for the second matrix (columns)
4. Input the values for each matrix
5. View the multiplication result

## Potential Optimizations
For large matrices, the following optimizations could be implemented:
- Block matrix multiplication for better cache efficiency
- Strassen's algorithm to reduce complexity to approximately O(n^2.8)
- Parallel processing using multiple threads
- Loop unrolling and memory access optimizations

## Requirements
- Java Development Kit (JDK) 21 or higher
