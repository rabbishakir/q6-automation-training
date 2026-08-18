# Q6 Automation Training — Shared Framework

This repository contains one shared Selenium automation framework. All students collaborate on the same project inside `framework/`.

## Repository structure

```text
q6-automation-training/
├── framework/          # Shared Maven/Selenium project
├── README.md           # Project overview
├── CONTRIBUTING.md     # Collaboration rules
└── WORKFLOW.md         # Copy-and-paste Git commands
```

## Student branches

| Student | Branch |
|---|---|
| Afia | `afia-dev` |
| Azim | `azim-dev` |
| Farhad | `farhad-dev` |
| Fekir | `fekir-dev` |
| Hasan | `hasan-dev` |
| Irfan | `irfan-dev` |
| Leila | `leila-dev` |
| Mahmud | `mahmud-dev` |
| Muntasir | `muntasir-dev` |
| Rabia | `rabia-dev` |
| Raisul | `raisul-dev` |
| Sabrina | `sabrina-dev` |
| Sayed Azad | `azad-dev` |
| Shishir | `shishir-dev` |
| Zeny | `zeny-dev` |

## First-time setup

Replace `YOUR-BRANCH` with your branch from the table.

```bash
git clone https://github.com/rabbishakir/q6-automation-training.git
cd q6-automation-training
git switch YOUR-BRANCH
git fetch origin
git merge origin/main
```

Open `framework/` as the Maven project in Eclipse or IntelliJ.

## Daily collaboration

Before changing the framework:

```bash
git switch YOUR-BRANCH
git pull origin YOUR-BRANCH
git fetch origin
git merge origin/main
```

After changing files inside `framework/`:

```bash
git status
git add framework/
git commit -m "Describe your framework change"
git push origin YOUR-BRANCH
```

Then open a pull request with:

- **base:** `main`
- **compare:** your personal `-dev` branch

Do not push directly to `main` or merge your own pull request. The instructor will review it first.

See [WORKFLOW.md](WORKFLOW.md) for the full command sequence and [CONTRIBUTING.md](CONTRIBUTING.md) for collaboration rules.
