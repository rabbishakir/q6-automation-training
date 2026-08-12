# Student Workflow — Quick Start

This file gives the exact sequence students should follow when they first work with this repository, plus concise one-line explanations and PowerShell commands.

---

## Checklist (first actions, in order)

- Clone repository (once)
- Change to project folder
- Switch to your personal dev branch
- Pull latest changes for your branch
- Merge `main` into your branch
- Verify status
- Work in your `homework/your-name/` folder
- Stage, commit and push
- Open a Pull Request to merge into `main` (if submitting homework or framework changes)

---

## Commands (PowerShell) with one-line explainer

Replace placeholders like `YOUR-BRANCH` and `your-name` with your actual branch and folder names.

1) Clone the repository (do this once per machine)

```powershell
git clone https://github.com/rabbishakir/q6-automation-training.git
```
- Copies the remote repository to your local machine.

2) Move into the project folder

```powershell
cd q6-automation-training
```
- Changes your working directory to the project root.

3) Switch to your personal development branch (replace `YOUR-BRANCH`)

```powershell
git switch YOUR-BRANCH
```
- Moves you to the branch where you will commit homework and framework changes.

4) If your branch doesn't exist yet locally (first-time only), create it and set upstream

```powershell
git switch -c YOUR-BRANCH
git push -u origin YOUR-BRANCH
```
- Creates the branch locally and publishes it to GitHub, setting the upstream for future pushes.

5) Pull the latest changes for your branch

```powershell
git pull origin YOUR-BRANCH
```
- Updates your local branch with any remote commits on the same branch.

6) Fetch remote refs and merge the latest `main` into your branch

```powershell
git fetch origin
git merge origin/main
```
- Brings your branch up to date with the latest `main` (framework/homework updates).

7) Check current working tree status

```powershell
git status
```
- Shows changed/untracked files so you know what will be committed.

8) Add your homework changes (stage), commit, and push

```powershell
# Stage only your homework folder
git add homework/your-name/
# Commit with a short descriptive message
git commit -m "Homework: <short description>"
# Push to your branch
git push origin YOUR-BRANCH
```
- Saves your work locally and uploads it to your branch on GitHub.

9) Create a Pull Request on GitHub (to merge your branch into `main`)

- On GitHub: Repository → Pull requests → New pull request
- Set **base** to `main` and **compare** to `YOUR-BRANCH`
- Add a clear title and description, request instructor review, and create the PR

---

## Quick examples

Example for student Afia (branch `afia-dev`):

```powershell
git clone https://github.com/rabbishakir/q6-automation-training.git
cd q6-automation-training
git switch afia-dev
git pull origin afia-dev
git fetch origin
git merge origin/main
git status
```

Example commit & push for homework:

```powershell
git add homework/afia/
git commit -m "Add: Email sorter assignment"
git push origin afia-dev
```

---

## Notes and troubleshooting

- If `git merge origin/main` shows conflicts: do not delete files to resolve; open the conflicting files, fix the conflicts, `git add` the resolved files, then `git commit` and `git push`.
- If prompted for credentials when pushing via HTTPS, use your GitHub username and a Personal Access Token (PAT) as the password, or configure SSH keys for passwordless pushes.
- Do not edit other students' folders inside `homework/`.
- For framework changes, follow `CONTRIBUTING.md` and create a pull request so the instructor can review changes.

---

If you want, I can also add this quick start as a short section in the `README.md` or create a printable one-page checklist PDF. Which would you prefer?