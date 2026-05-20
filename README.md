<<<<<<< HEAD
# AutomationTesting-CI-CD
=======
# selenium-demo

## CI Setup

This project includes a GitHub Actions workflow at `.github/workflows/ci.yml`.
The workflow runs Selenium TestNG tests in headless Chrome.
It is configured to run on pushes and pull requests targeting the `main` branch.

### GitHub Actions badge

```md
[![CI](https://github.com/shacheeparikh/AutomationTesting-CI-CD/actions/workflows/ci.yml/badge.svg)](https://github.com/shacheeparikh/AutomationTesting-CI-CD/actions/workflows/ci.yml)
```

### Run tests locally

```bash
mvn -B -Dheadless=true -DfailIfNoTests=false test
```

### CI badge example

Use this badge in your README after replacing `YOUR_USERNAME` and `YOUR_REPOSITORY`:

```md
[![CI](https://github.com/YOUR_USERNAME/YOUR_REPOSITORY/actions/workflows/ci.yml/badge.svg)](https://github.com/YOUR_USERNAME/YOUR_REPOSITORY/actions/workflows/ci.yml)
```

### How CI works

The GitHub Actions workflow runs on each push and pull request to `main`. It executes the same Maven command used locally and uploads `target/surefire-reports` as an artifact.

### Notes

- `headless=true` enables headless Chrome for CI.
- `failIfNoTests=false` prevents pipeline failure when no tests are found.
- Test results are uploaded from `target/surefire-reports`.
>>>>>>> f86c2ac (Add selenium Maven TestNG project with CI workflow)
