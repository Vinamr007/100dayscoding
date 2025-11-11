# 100 Days Coding Challenge 🚀

Welcome to the 100 Days Coding Challenge repository! This repository contains daily coding exercises and learning materials.

## How to Push Code to This Repository

Follow these simple steps to push your code changes to GitHub:

### Step 1: Check Your Current Status
```bash
git status
```
This shows which files have been modified or are untracked.

### Step 2: Add Files to Staging Area
```bash
# Add a specific file
git add filename.java

# Add all files in current directory
git add .

# Add all Java files
git add *.java
```

### Step 3: Commit Your Changes
```bash
git commit -m "Your descriptive commit message"
```
**Example:**
```bash
git commit -m "Add Day 5: Array manipulation exercises"
```

### Step 4: Push to GitHub
```bash
git push origin main
```
Or if you're working on a different branch:
```bash
git push origin branch-name
```

## Complete Workflow Example

Here's a complete example of adding a new day's work:

```bash
# 1. Check what's changed
git status

# 2. Add your new files
git add src/day5/ArrayDemo.java

# 3. Commit with a meaningful message
git commit -m "Add Day 5: Array manipulation and sorting"

# 4. Push to GitHub
git push origin main
```

## First Time Setup

If this is your first time using Git with this repository:

1. **Configure Git** (one-time setup):
```bash
git config --global user.name "Your Name"
git config --global user.email "your.email@example.com"
```

2. **Clone the repository** (if not already done):
```bash
git clone https://github.com/Vinamr007/100dayscoding.git
cd 100dayscoding
```

## Repository Structure

```
100dayscoding/
├── src/
│   ├── main/java/
│   │   ├── day1/      # Day 1 exercises
│   │   ├── day2/      # Day 2 exercises
│   │   └── ...
│   └── day3/          # Day 3 exercises
├── day2/              # Compiled classes (not tracked)
└── README.md          # This file
```

## Best Practices

1. **Commit Often**: Make small, frequent commits rather than large ones
2. **Write Clear Messages**: Use descriptive commit messages that explain what changed
3. **Pull Before Push**: Always pull latest changes before pushing
   ```bash
   git pull origin main
   git push origin main
   ```
4. **Check Status**: Use `git status` frequently to know what's happening

## Common Issues and Solutions

### Issue: "Updates were rejected"
**Solution:** Pull the latest changes first
```bash
git pull origin main
git push origin main
```

### Issue: "Permission denied"
**Solution:** Make sure you're authenticated with GitHub
- Use HTTPS with a Personal Access Token, or
- Set up SSH keys

### Issue: "Untracked files"
**Solution:** Add them with `git add` or add to `.gitignore` if they shouldn't be tracked

## Useful Git Commands

| Command | Description |
|---------|-------------|
| `git status` | Check current status of files |
| `git log` | View commit history |
| `git diff` | See changes in files |
| `git branch` | List all branches |
| `git checkout -b branch-name` | Create and switch to new branch |
| `git pull` | Fetch and merge changes from remote |
| `git clone <url>` | Clone a repository |

## Quick Reference Card

```bash
# Daily workflow
git status                          # Check status
git add .                           # Stage all changes
git commit -m "message"             # Commit changes
git push origin main                # Push to GitHub

# When starting work
git pull origin main                # Get latest changes

# View history
git log --oneline                   # See commit history
```

## Need Help?

- Check [Git Documentation](https://git-scm.com/doc)
- Visit [GitHub Guides](https://guides.github.com/)
- Use `git --help` or `git <command> --help` for command help

Happy Coding! 💻✨
