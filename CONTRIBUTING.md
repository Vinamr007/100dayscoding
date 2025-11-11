# Contributing to 100 Days of Coding Challenge

Thank you for your interest in contributing to this repository! This guide will help you understand how to push code to this repository.

## 📋 Table of Contents

- [Getting Started](#getting-started)
- [How to Push Code](#how-to-push-code)
- [Code Organization](#code-organization)
- [Naming Conventions](#naming-conventions)
- [Best Practices](#best-practices)

## 🚀 Getting Started

### Prerequisites

Before you start, make sure you have:

1. **Git installed**: Download from [git-scm.com](https://git-scm.com/)
2. **GitHub account**: Sign up at [github.com](https://github.com/)
3. **Java JDK**: Install Java Development Kit (JDK 8 or higher)

### Initial Setup

1. **Fork the repository** (if you don't have write access):
   ```bash
   # Click the "Fork" button on GitHub to create your own copy
   ```

2. **Clone the repository**:
   ```bash
   git clone https://github.com/Vinamr007/100dayscoding.git
   cd 100dayscoding
   ```

3. **Configure Git** (first time only):
   ```bash
   git config --global user.name "Your Name"
   git config --global user.email "your.email@example.com"
   ```

## 📤 How to Push Code

### Step 1: Create Your Daily Code

Create your Java file in the appropriate directory structure:

```bash
# For example, for Day 5
mkdir -p src/main/java/day5
cd src/main/java/day5

# Create your Java file
# (Use your favorite editor to write your code)
```

### Step 2: Check Your Changes

```bash
# Go to the repository root
cd /path/to/100dayscoding

# Check which files have changed
git status

# View the changes you made
git diff
```

### Step 3: Stage Your Changes

```bash
# Add specific files
git add src/main/java/day5/YourFile.java

# Or add all Java files
git add *.java

# Or add all changes
git add .
```

### Step 4: Commit Your Changes

```bash
# Commit with a descriptive message
git commit -m "Add Day 5: Exception handling examples"
```

#### Good Commit Message Examples:
- `Add Day 3: Exception handling demo`
- `Update Day 2: Add method examples`
- `Fix Day 1: Correct syntax error in hello.java`
- `Add Day 4: Array and list operations`

### Step 5: Push to GitHub

```bash
# If you cloned the original repository and have write access:
git push origin main

# If you forked the repository:
git push origin main
# Then create a Pull Request on GitHub
```

### Step 6: Create a Pull Request (if forked)

1. Go to your fork on GitHub
2. Click "Pull Request"
3. Select the base repository and branch
4. Add a description of your changes
5. Click "Create Pull Request"

## 📁 Code Organization

Follow this structure for organizing your code:

```
src/
└── main/java/
    └── dayX/           # Where X is the day number
        ├── Topic1.java
        ├── Topic2.java
        └── ...
```

Or alternatively:

```
src/
└── dayX/               # Alternative structure
    └── YourFile.java
```

## 📝 Naming Conventions

### File Naming
- Use PascalCase for class names: `ExceptionDemo.java`, `ListDemo.java`
- File name should match the class name
- Use descriptive names that indicate the topic

### Package Naming
- Use lowercase for package names: `package day5;`
- Follow the day structure: `day1`, `day2`, etc.

## ✅ Best Practices

### 1. Write Clean Code
```java
// Good: Well-formatted and clear
public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
    }
}
```

### 2. Add Comments
```java
// Demonstrate exception handling with try-catch-finally
public class ExceptionDemo {
    // Main method - entry point
    public static void main(String[] args) {
        // Your code here
    }
}
```

### 3. Test Your Code
Before pushing, make sure your code:
- Compiles without errors
- Runs successfully
- Produces expected output

```bash
# Compile
javac src/main/java/day5/ExceptionDemo.java

# Run
java -cp src/main/java day5.ExceptionDemo
```

### 4. Exclude Compiled Files
The `.gitignore` file already excludes `.class` files, but make sure you're not committing:
- `*.class` files
- IDE-specific files (`.idea/`, `*.iml`)
- Build artifacts (`/target/`, `/out/`, `/bin/`)

### 5. Keep Commits Focused
- One logical change per commit
- Commit related changes together
- Use meaningful commit messages

## 🔄 Common Git Workflows

### Updating Your Local Repository

```bash
# Fetch latest changes from remote
git fetch origin

# Merge changes into your branch
git pull origin main
```

### Undoing Changes

```bash
# Discard changes in working directory
git checkout -- filename.java

# Unstage a file
git reset HEAD filename.java

# Undo last commit (keep changes)
git reset --soft HEAD~1
```

### Creating a New Branch

```bash
# Create and switch to a new branch
git checkout -b day5-exercises

# Push the branch to remote
git push -u origin day5-exercises
```

## 🆘 Common Issues

### Issue: "Permission denied (publickey)"
**Solution**: Set up SSH keys or use HTTPS authentication
```bash
# Use HTTPS URL
git remote set-url origin https://github.com/Vinamr007/100dayscoding.git
```

### Issue: "Updates were rejected"
**Solution**: Pull the latest changes first
```bash
git pull origin main --rebase
git push origin main
```

### Issue: "Merge conflict"
**Solution**: Resolve conflicts manually
```bash
# After resolving conflicts in files
git add .
git commit -m "Resolve merge conflicts"
git push origin main
```

## 📞 Need Help?

If you encounter any issues:
1. Check the [Git documentation](https://git-scm.com/doc)
2. Review [GitHub's guides](https://guides.github.com/)
3. Open an issue in this repository

## 🎓 Learning Resources

- [Git Basics](https://git-scm.com/book/en/v2/Getting-Started-Git-Basics)
- [GitHub Flow](https://guides.github.com/introduction/flow/)
- [Java Documentation](https://docs.oracle.com/en/java/)

---

Happy coding! 🚀
