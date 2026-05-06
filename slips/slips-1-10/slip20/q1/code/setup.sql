-- SQL setup for Slip 20 Q1
CREATE DATABASE IF NOT EXISTS college_db;
USE college_db;

CREATE TABLE IF NOT EXISTS employee (
    emp_id     VARCHAR(10) PRIMARY KEY,
    name       VARCHAR(50),
    department VARCHAR(30),
    salary     DOUBLE
);
