---

## 📂 Readme for Binary Search Tree Project

Create a file named **`README.md`** at the root of your `BinarySearchTree/` project.

```markdown
# Custom Binary Search Tree (BST) Implementation

A clean, self-contained Java data structure implementation of a generic Binary Search Tree from the ground up. The design enforces type safety by requiring keys to extend the `Comparable<K>` interface, allowing precise binary split mapping.

## Features & Core Architecture
* **`MyBinaryNode<K>`**: A node setup where each element securely holds a key along with separate reference pointers for its `left` (smaller keys) and `right` (larger keys) child components.
* **Recursive Operations**: Leverages clean algorithmic recursion for node additions, tree sizing, and multi-tier traversing.
* **In-Order Traversal**: Includes a built-in helper method to visually verify that elements are processed in sequential, sorted order.

---

## Use Cases Covered

### UC 1 - Baseline BST Structural Creation
* Validates the core routing rules of a Binary Search Tree by initializing a root node (`56`), then verifying that a smaller key (`30`) cascades to the left and a larger key (`70`) branches to the right.

### UC 2 - Size Determination for Multi-Tier Trees
* Constructs a deep, 13-node hierarchical binary tree structure from a complex layout.
* Implements a recursive sizing function to accurately map and assert that the total tree scale matches exactly `13`.

### UC 3 - Binary Node Search Logic
* Establishes a highly efficient search operation utilizing recursive comparisons down deep branching paths.
* Validates that searching for an existing leaf node element like `63` returns `true`, while an unlisted value like `100` correctly evaluates via JUnit to `assertFalse`.

---

## Running the Unit Tests
Execute the test files inside your IDE or run the following Maven command at your project root:
```bash
mvn test
