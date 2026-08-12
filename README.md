# Q6 Automation Training

This repository is the shared homework and framework space for our Java and automation training.

The repository root structure:

- `framework/` - The shared Selenium automation framework (for all to use and improve)
- `homework/` - Every student's personal assignment folders
- Each student has their own personal folder under `homework/`

Each student has:

- one permanent personal folder under `homework/`
- a separate folder for every assignment

## Students

| Student | Personal folder | Branch |
|---|---|---|
| Afia | [homework/afia](homework/afia) | `afia-dev` |
| Azim | [homework/azim](homework/azim) | `azim-dev` |
| Farhad | [homework/farhad](homework/farhad) | `farhad-dev` |
| Fekir | [homework/fekir](homework/fekir) | `fekir-dev` |
| Hasan | [homework/hasan](homework/hasan) | `hasan-dev` |
| Irfan | [homework/irfan](homework/irfan) | `irfan-dev` |
| Leila | [homework/leila](homework/leila) | `leila-dev` |
| Mahmud | [homework/mahmud](homework/mahmud) | `mahmud-dev` |
| Muntasir | [homework/muntasir](homework/muntasir) | `muntasir-dev` |
| Rabia | [homework/rabia](homework/rabia) | `rabia-dev` |
| Raisul | [homework/raisul](homework/raisul) | `raisul-dev` |
| Sabrina | [homework/sabrina](homework/sabrina) | `sabrina-dev` |
| Sayed Azad | [homework/sayed-azad](homework/sayed-azad) | `azad-dev` |
| Shishir | [homework/shishir](homework/shishir) | `shishir-dev` |
| Zeny | [homework/zeny](homework/zeny) | `zeny-dev` |

## Folder structure

```text
homework/
└── your-name/
    └── assignments/
        ├── 01-java-basics/
        ├── 02-q6-bank/
        ├── 03-email-sorter/
        └── 04-movie-ticket-booking/
```

Always put homework inside your own folder. Do not edit another student's folder.

## Framework

The `framework/` folder contains the shared Selenium automation testing framework. All students can:
- **Use** it as a reference and base for their learning
- **Contribute** improvements and bug fixes
- **Pull** the latest updates

### Using the Framework

1. The framework is available to all when you clone the repository
2. Study the code in `framework/src/`
3. Refer to it in your assignments
4. See [CONTRIBUTING.md](CONTRIBUTING.md) for how to contribute improvements

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

1. Open your folder: `homework/your-name/assignments/`
2. Open the correct assignment folder.
3. Add your Java, Python, or other homework files there.
4. Check what changed:

```bash
git status
```

## Commit and push homework

Replace the example message with a short description of your work.

```bash
git add homework/your-name/
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
git add homework/your-name/
git commit -m "Describe your homework"
git push origin YOUR-BRANCH
```
