# How to Run – Slip 20 Q1 (JSP + JDBC)

## Prerequisites
- Apache Tomcat 9.x
- MySQL Server running
- `mysql-connector-java-x.x.x.jar` in Tomcat `lib/`

## Database Setup
```bash
mysql -u root -p < setup.sql
```

## Deploy & Run
1. Copy `EmployeeApp/` (containing JSP) to Tomcat `webapps/`
2. Start Tomcat
3. Open: `http://localhost:8080/EmployeeApp/insertEmployees.jsp`
