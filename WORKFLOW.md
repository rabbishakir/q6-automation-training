# Student Collaboration Workflow

Replace `YOUR-BRANCH` with your personal `-dev` branch.

## First time only

```powershell
git clone https://github.com/rabbishakir/q6-automation-training.git
cd q6-automation-training
git switch YOUR-BRANCH
git fetch origin
git merge origin/main
```

Open the repository folder as the Maven project.

## Every time before working

```powershell
git switch YOUR-BRANCH
git pull origin YOUR-BRANCH
git fetch origin
git merge origin/main
git status
```

## Save your framework change

```powershell
git add .
git commit -m "Describe your framework change"
git push origin YOUR-BRANCH
```

## Submit for review

On GitHub, open a pull request from `YOUR-BRANCH` into `main`. Do not merge it yourself.

## Important

- Everyone collaborates in this shared Maven/Selenium project.
- Pull the latest `main` before starting.
- Never commit real usernames or passwords.
- Never push directly to `main`.
- Ask the instructor for help with merge conflicts.
