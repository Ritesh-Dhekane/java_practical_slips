# JDBC Super Slip - Architecture

## Folder structure
```text
jdbc-super-slip/
├── JdbcReferenceApp.java
├── setup.sql
├── db.properties.example
├── explanation.md
├── run.md
└── architecture.md
```

## Component responsibilities
- `JdbcReferenceApp.java`: connection management and SQL execution
- `setup.sql`: one-time database bootstrap
- `db.properties.example`: configuration reference for future improvements

## Execution flow
```text
Program start -> load driver -> open connection -> create table -> insert rows -> select rows -> print output
```

## Reuse value for normal slips
Use this project as the reference for:
- JDBC insert slips
- JDBC display slips
- JSP + JDBC slips
- database setup documentation
