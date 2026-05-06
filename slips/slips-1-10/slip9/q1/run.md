# How to Run – Slip 9 Q1 (JSP + JDBC)

## Prerequisites
- Apache Tomcat 9.x
- MySQL Server running
- `mysql-connector-java-x.x.x.jar` placed in Tomcat's `lib/` folder

## Database Setup
Run the provided `setup.sql` in MySQL:
```bash
mysql -u root -p < setup.sql
```

## Project Structure
```
StudentApp/
├── students.jsp
└── WEB-INF/
    └── web.xml
```

## Deploy & Run
1. Copy `StudentApp/` to Tomcat `webapps/`
2. Start Tomcat
3. Open: `http://localhost:8080/StudentApp/students.jsp`