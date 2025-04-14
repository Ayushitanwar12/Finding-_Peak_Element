# Finding-_Peak_Element
This Java program implements a binary search-based solution to find a peak element in a 2D matrix (Leetcode Problem 1901 - Find a Peak Element II).

A peak element is defined as an element that is greater than or equal to its four neighbors (up, down, left, and right). The solution optimizes the search using binary search on columns, selecting the maximum in the current column and checking neighboring columns to narrow the search space.

Time Complexity: O(n * log m), where n = number of rows, m = number of columns.

Input: A 2D matrix of integers
Output: The row and column index of a peak element

Includes a sample test case in the main method.
