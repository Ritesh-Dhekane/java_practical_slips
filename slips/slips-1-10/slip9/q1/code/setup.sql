-- SQL setup script for Slip 9 Q1
-- Run this in MySQL before testing the JSP

CREATE DATABASE IF NOT EXISTS college_db;
USE college_db;

CREATE TABLE IF NOT EXISTS student (
    roll_no INT PRIMARY KEY,
    name    VARCHAR(50),
    course  VARCHAR(30),
    marks   INT
);

INSERT INTO student VALUES (101, 'Amit Sharma',  'MCA', 85);
INSERT INTO student VALUES (102, 'Priya Patel',  'MCA', 91);
INSERT INTO student VALUES (103, 'Rahul Verma',  'MCA', 78);
INSERT INTO student VALUES (104, 'Sneha Joshi',  'MCA', 88);
INSERT INTO student VALUES (105, 'Rohan Desai',  'MCA', 74);
