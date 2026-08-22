# Contributing to the Shared Framework

Every student works on the same Maven/Selenium framework project, but each student commits through their own `-dev` branch.

## Before you start

```bash
git switch YOUR-BRANCH
git pull origin YOUR-BRANCH
git fetch origin
git merge origin/main
```

If Git reports a merge conflict, stop and ask the instructor for help.

## Make your change

Only edit files related to your assigned framework task. Common contributions include:

- Page Object classes
- Test runners and test cases
- Reusable utility methods
- Configuration improvements
- Bug fixes
- Documentation and comments

Do not commit:

- Real usernames or passwords
- `target/`, `.class`, IDE, or operating-system files
- Unrelated changes
- Deleted functionality unless the instructor assigned it

## Commit and push

```bash
git status
git add .
git commit -m "Add screenshot utility"
git push origin YOUR-BRANCH
```

Use a short commit message that explains the change.

## Open a pull request

1. Open the repository on GitHub.
2. Select **Pull requests** → **New pull request**.
3. Set **base** to `main`.
4. Set **compare** to your personal `-dev` branch.
5. Explain what you changed and how you tested it.
6. Create the pull request and wait for instructor review.

Do not merge your own pull request.

## After another change is merged

Bring the shared change into your branch:

```bash
git switch YOUR-BRANCH
git fetch origin
git merge origin/main
git push origin YOUR-BRANCH
```
