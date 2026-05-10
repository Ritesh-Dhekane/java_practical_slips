# JDBC Super Slip - How to Run

## Prerequisites
- JDK 17 or compatible
- MySQL server running
- MySQL Connector/J jar downloaded

## Database setup
Run:

```bash
mysql -u root -p < setup.sql
```

## Compile
Windows:

```bash
javac -cp ".;mysql-connector-j-8.4.0.jar" JdbcReferenceApp.java
```

Linux/macOS:

```bash
javac -cp ".:mysql-connector-j-8.4.0.jar" JdbcReferenceApp.java
```

## Run
Windows:

```bash
java -cp ".;mysql-connector-j-8.4.0.jar" JdbcReferenceApp
```

Linux/macOS:

```bash
java -cp ".:mysql-connector-j-8.4.0.jar" JdbcReferenceApp
```

## What to observe
- table creation step
- sample inserts
- ordered result display using `ResultSet`
