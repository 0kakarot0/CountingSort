# Counting Sort

This repository contains a Java implementation of the Counting Sort algorithm for a list of strings. The algorithm sorts the strings lexicographically.

## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Installation](#installation)
- [Usage](#usage)
- [Algorithm Steps](#algorithm-steps)
- [Contributing](#contributing)
- [License](#license)

## Introduction

Counting Sort is an efficient algorithm for sorting a collection of items, particularly when the range of possible values is known. This implementation demonstrates how to use Counting Sort to sort a list of strings based on their lexicographic order.

## Features

- Sorts a list of strings in lexicographic order.
- Handles strings of varying lengths.
- Demonstrates the Counting Sort algorithm.

## Installation

1. Clone the repository:
    ```bash
    git clone https://github.com/yourusername/CountingSort_ListOfStrings.git
    ```
2. Navigate to the project directory:
    ```bash
    cd CountingSort_ListOfStrings
    ```

## Usage

1. Compile the Java program:
    ```bash
    javac -d . CountingSort_ListOfStrings.java
    ```
2. Run the program:
    ```bash
    java counting_sort.CountingSort_ListOfStrings
    ```

## Algorithm Steps

The Counting Sort algorithm for a list of strings involves the following steps:

1. **Initialize**: 
    - Create an empty list of strings.
    - Add some example strings to the list.

2. **Determine Maximum Length and Character Value**:
    - Calculate the maximum length of the strings in the list.
    - Determine the highest ASCII value of any character in the strings.

3. **Sort by Each Character Position**:
    - For each character position from the end of the string to the beginning:
        - Call the `countingSortOfListOfString` function to sort the strings based on the current character position.

4. **Counting Sort for Strings**:
    - Initialize a count array to store the frequency of each character.
    - Create an output array to store the sorted strings.
    - Fill the count array with the occurrences of each character at the current position.
    - Convert the count array to a cumulative count array.
    - Build the output array by placing strings at their correct positions.
    - Copy the output array back to the original list of strings.

5. **Output the Sorted List**:
    - Print the original and sorted lists of strings.

## Example

Here's an example to illustrate the sorting process:

Original list:
```bash
["zen", "apple", "ape", "bat", "ball"]
```


Sorted list:
```bash
["ape", "apple", "ball", "bat", "zen"]
```

## Contributing

Contributions are welcome! Please open an issue or submit a pull request if you have any improvements or suggestions.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
