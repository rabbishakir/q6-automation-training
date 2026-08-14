# Contributing to Q6 Automation Framework

Thank you for your interest in improving the automation framework! This guide explains how to contribute.

## What Can You Contribute?

- Bug fixes in the framework code
- Improvements to existing classes and methods
- Better test cases
- Documentation and comments
- Configuration improvements

## How to Contribute to the Framework

### Option 1: Direct Commits to Your Branch (Recommended for Students)

**Best for:** Quick bug fixes and improvements while learning

1. **Update your development branch:**
   ```bash
   git switch your-name-dev
   git pull origin your-name-dev
   git fetch origin
   git merge origin/main
   ```

2. **Make changes to the framework:**
   ```bash
   cd framework/
   # Edit files in framework/src/
   ```

3. **Commit and push:**
   ```bash
   git add framework/
   git commit -m "Fix: [describe what you fixed]"
   git push origin your-name-dev
   ```

4. **Create a pull request to main:**
   - Go to [GitHub repository](https://github.com/rabbishakir/q6-automation-training)
   - Click **Pull requests**
   - Click **New pull request**
   - Set **base** to `main`, **compare** to your `-dev` branch
   - Add title: `[Your Name] - Framework: [Brief description]`
   - Click **Create pull request**

### Option 2: Feature Branch Workflow (Advanced)

**Best for:** Major changes or collaborative work

1. **Create a feature branch:**
   ```bash
   git fetch origin
   git switch main
   git pull origin main
   git switch -c feature/your-feature-name
   ```

2. **Make your changes:**
   ```bash
   git add framework/
   git commit -m "Add: new feature description"
   ```

3. **Push your feature branch:**
   ```bash
   git push origin feature/your-feature-name
   ```

4. **Create a pull request on GitHub**

## How to Submit Homework

See the main [README.md](README.md#add-homework) for homework submission instructions.

## Important Guidelines

### For Framework Changes
- ✅ **DO** add comments explaining complex logic
- ✅ **DO** test your changes before pushing
- ✅ **DO** write clear commit messages
- ✅ **DO** reference any issues or bugs you're fixing
- ❌ **DON'T** modify other students' homework folders
- ❌ **DON'T** delete or remove existing framework functionality without discussion

### For Homework Changes
- ✅ **DO** only work in your personal `homework/your-name/` folder
- ✅ **DO** organize assignments in numbered folders (01-, 02-, etc.)
- ✅ **DO** commit frequently with descriptive messages
- ❌ **DON'T** edit other students' homework
- ❌ **DON'T** commit build artifacts (target/, bin/, *.class files)

## Commit Message Format

Use clear, descriptive commit messages:

```
Fix: Corrected null pointer exception in BaseClass
Add: New method for page wait utility
Improve: Enhanced error handling in ConfigReader
Update: Framework documentation
```

## Pull Request Process

1. Ensure your changes follow the guidelines above
2. Create a clear, descriptive pull request title
3. Include a brief description of what you changed and why
4. Request review from the instructor
5. Address any feedback or requested changes
6. Don't merge it yourself - wait for instructor approval

## Getting Help

If you have questions about:
- **Framework code**: Review existing code in `framework/src/` and ask the instructor
- **Git workflow**: Check the main [README.md](README.md)
- **Assignments**: See your homework folder instructions

## Questions?

Ask your instructor! Contributing is a learning process, and we're here to help.

---

Happy coding! 🚀
