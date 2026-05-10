# JDBC Super Slip - Explanation

## What this project demonstrates
- JDBC driver loading
- `DriverManager.getConnection(...)`
- table creation with `Statement`
- parameterized insert with `PreparedStatement`
- record fetch with `ResultSet`
- structured exception handling with `SQLException`

## File roles
- `JdbcReferenceApp.java`: end-to-end JDBC reference program
- `setup.sql`: database creation and table setup
- `db.properties.example`: example configuration values

## JDBC workflow
1. load the JDBC driver
2. create a connection
3. create table if needed
4. insert records using `PreparedStatement`
5. fetch records using `ResultSet`
6. close resources

## Connection string explanation
- `jdbc:mysql://`: JDBC protocol for MySQL
- `localhost:3306`: database host and port
- `college_db`: database name

## Common mistakes
- forgetting the MySQL Connector/J jar in the classpath
- using `Statement` for dynamic input instead of `PreparedStatement`
- not closing database resources
- inserting duplicate data without planning rerun behavior
