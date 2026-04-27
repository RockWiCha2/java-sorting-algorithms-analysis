# Java Data Structures and Algorithms Coursework

This repository contains solutions for a university coursework assignment focused on sorting algorithms and data structures using Java.

---

## 📌 Overview

The project explores algorithm design, implementation, and performance analysis. It is divided into two main parts:

- **Q1:** Sorting Algorithms (Quicksort and Hybrid Sort)
- **Q2:** Stack-based Text Editor (to be implemented)

---

# 🧩 Q1 – Sorting Algorithms

## Description
This section implements and evaluates sorting algorithms using datasets of varying sizes (1,000 to 500,000 elements). The goal is to analyse performance and optimise sorting behaviour.

## ⚙️ Features
- Implementation of **Quicksort**
- Implementation of a **Hybrid Sorting Algorithm** (Quicksort + Insertion Sort)
- Performance testing on:
  - Random datasets
  - Sorted datasets
  - Reverse-sorted datasets
- Execution time measurement and averaging

## 🧠 Algorithms

### Quicksort
- Divide-and-conquer algorithm
- Uses a **random pivot** to reduce worst-case scenarios
- In-place sorting for improved space efficiency

### Hybrid Sort
- Combines Quicksort with **Insertion Sort**
- Switches to Insertion Sort for subarrays smaller than 50 elements
- Reduces recursion overhead and improves performance

## 📊 Performance Insights
- Best performance observed on random datasets due to balanced partitions
- Sorted and reverse-sorted inputs can degrade performance
- Hybrid approach improves efficiency on smaller subarrays

## 🗂️ Structure
```
Q1/
├── QuickSort.java
├── HybridSort.java
├── TestSorting.java
```

## ▶️ How to Run
1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/java-data-structures-coursework.git
   ```
2. Open in an IDE (IntelliJ / Eclipse / VS Code)
3. Run:
   ```
   TestSorting.java
   ```

---

# 🧱 Q2 – Stack-Based Text Editor (Coming Soon)

## Description
This section will implement a simple text editor using custom stack data structures.

## Planned Features
- TYPE <text> – Add text
- DELETE <n> – Remove characters
- DELETEWORD – Remove last word
- UNDO – Undo last action
- REDO – Redo last undone action
- SHOW – Display current content

## 🧠 Concepts
- Custom implementation of a **generic stack**
- Use of two stacks for **undo/redo functionality**
- Event-driven command handling

## 🗂️ Planned Structure
```
Q2/
├── TextEditor.java
├── Stack.java
├── EditAction.java
├── EditorApp.java
```

---

## 📚 Key Concepts Covered
- Divide and conquer algorithms
- Algorithm optimisation
- Time complexity analysis
- Stack data structures
- Undo/redo system design

---

## 👤 Author
- James Harvey 
- Cardiff University – CM1210 Object Oriented Java Programming