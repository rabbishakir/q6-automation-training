# Q6 Automation Training

This repository is the shared homework space for our Java and automation training.

Each student has:

- one permanent personal folder under `students/`
- one personal Git branch ending in `-dev` (except Sayed, whose personal branch still needs to be created)
- a separate folder for every assignment

## Students

| Student | Personal folder | Branch |
|---|---|---|
| Afia | [students/afia](students/afia) | `afia-dev` |
| Azim | [students/azim](students/azim) | `azim-dev` |
| Farhad | [students/farhad](students/farhad) | `farhad-dev` |
| Fekir | [students/fekir](students/fekir) | `fekir-dev` |
| Hasan | [students/hasan](students/hasan) | `hasan-dev` |
| Irfan | [students/irfan](students/irfan) | `irfan-dev` |
| Leila | [students/leila](students/leila) | `leila-dev` |
| Mahmud | [students/mahmud](students/mahmud) | `mahmud-dev` |
| Muntasir | [students/muntasir](students/muntasir) | `muntasir-dev` |
| Rabia | [students/rabia](students/rabia) | `rabia-dev` |
| Raisul | [students/raisul](students/raisul) | `raisul-dev` |
| Sabrina | [students/sabrina](students/sabrina) | `sabrina-dev` |
| Sayed Azad | [students/sayed-azad](students/sayed-azad) | Personal branch not created yet |
| Shishir | [students/shishir](students/shishir) | `shishir-dev` |
| Zeny | [students/zeny](students/zeny) | `zeny-dev` |

## Folder structure

```text
students/
└── your-name/
    └── assignments/
        ├── 01-java-basics/
        ├── 02-q6-bank/
        ├── 03-email-sorter/
        └── 04-movie-ticket-booking/
```

Always put homework inside your own folder. Do not edit another student's folder.

## First time only: clone the repository

Replace `YOUR-BRANCH` with your branch name from the table above.

```bash
git clone https://github.com/rabbishakir/q6-automation-training.git
cd q6-automation-training
git switch YOUR-BRANCH
```

Example for Afia:

```bash
git switch afia-dev
```

## Before starting homework: update your branch

Run these commands every time before you begin:

```bash
git switch YOUR-BRANCH
git pull origin YOUR-BRANCH
git fetch origin
git merge origin/main
```

If Git reports a merge conflict, stop and ask the instructor for help. Do not delete files to fix it.

## Add homework

1. Open your folder: `students/your-name/assignments/`
2. Open the correct assignment folder.
3. Add your Java, Python, or other homework files there.
4. Check what changed:

```bash
git status
```

## Commit and push homework

Replace the example message with a short description of your work.

```bash
git add students/your-name/
git commit -m "Complete email sorter homework"
git push origin YOUR-BRANCH
```

If Git says there is nothing to commit, use `git status` and confirm that the file is inside your personal folder.

## Open a pull request (merge request)

GitHub calls a merge request a **pull request**.

1. Open [this repository on GitHub](https://github.com/rabbishakir/q6-automation-training).
2. Click **Pull requests**.
3. Click **New pull request**.
4. Set **base** to `main`.
5. Set **compare** to your `-dev` branch.
6. Click **Create pull request**.
7. Use a clear title, such as `Afia - Email Sorter Homework`.
8. Click **Create pull request** again.

Do not merge it yourself unless the instructor asks you to.

## Quick copy-and-paste checklist

```bash
git switch YOUR-BRANCH
git pull origin YOUR-BRANCH
git fetch origin
git merge origin/main
git status
git add students/your-name/
git commit -m "Describe your homework"
git push origin YOUR-BRANCH
```
