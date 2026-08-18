# HMS Selenium Framework

This folder is the shared Maven/Selenium project for the class.

## Open the project

In Eclipse or IntelliJ, import the `framework/` folder as an existing Maven project.

## Current structure

```text
framework/
├── pom.xml
└── src/
    └── test/
        ├── java/
        │   └── Test/
        └── resources/
            └── config.properties
```

## Configuration

`src/test/resources/config.properties` contains safe example values. Never commit a real username or password. Ask the instructor which test environment and credentials to use.

## Collaboration

All changes to this project must be made on a student's personal `-dev` branch and submitted through a pull request to `main`.

See the root [WORKFLOW.md](../WORKFLOW.md) for commands.
