# Java Sorting Algorithms Analysis

This project implements and evaluates sorting algorithms as part of a university coursework assignment. The focus is on understanding algorithm design, performance, and optimisation using Java.

## 📌 Overview

The project simulates a factory generating items with unique IDs and applies sorting algorithms to organise these datasets efficiently. It includes:

- Implementation of the **Quicksort algorithm**
- Development of a **Hybrid Sorting Algorithm** (Quicksort + Insertion Sort)
- Performance testing and comparison across different input types

## ⚙️ Features

- Sorts datasets ranging from 1,000 to 500,000 elements
- Tests performance on:
  - Random data
  - Sorted data
  - Reverse-sorted data
- Measures execution time and calculates averages
- Implements optimisations to reduce worst-case behaviour

## 🧠 Algorithms Implemented

### Quicksort
- Divide-and-conquer algorithm
- Uses a **random pivot** to reduce worst-case scenarios
- In-place sorting for improved space efficiency

### Hybrid Algorithm
- Combines Quicksort with **Insertion Sort**
- Switches to Insertion Sort for subarrays smaller than 50 elements
- Reduces recursion overhead and improves performance

## 📊 Performance Analysis

- Quicksort performs best on random datasets due to balanced partitions
- Sorted and reverse-sorted inputs can degrade performance depending on pivot selection
- The hybrid algorithm improves efficiency by optimising small subarray handling

## 🗂️ Project Structure