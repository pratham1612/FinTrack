
CREATE DATABASE IF NOT EXISTS fintrack;

USE fintrack;

-- Create User table
CREATE TABLE IF NOT EXISTS User (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL,
    email VARCHAR(100) NOT NULL,
    password VARCHAR(100) NOT NULL,
    age INT,
    risk_tolerance VARCHAR(50)
);

-- Create IncomeSource table
CREATE TABLE IF NOT EXISTS IncomeSource (
    id INT AUTO_INCREMENT PRIMARY KEY,
    source_name VARCHAR(100) NOT NULL,
    amount DECIMAL(10, 2) NOT NULL,
    frequency VARCHAR(50) NOT NULL,
    user_id INT,
    FOREIGN KEY (user_id) REFERENCES User(id)
);

-- Create Expense table
CREATE TABLE IF NOT EXISTS Expense (
    id INT AUTO_INCREMENT PRIMARY KEY,
    amount DECIMAL(10, 2) NOT NULL,
    date DATE NOT NULL,
    type ENUM('Needs', 'Wants', 'Savings') NOT NULL,
    description VARCHAR(255),
    user_id INT,
    FOREIGN KEY (user_id) REFERENCES User(id)
);

-- Create Account table
CREATE TABLE IF NOT EXISTS Account (
    id INT AUTO_INCREMENT PRIMARY KEY,
    account_type ENUM('Income', 'Savings', 'Investments', 'Expenses') NOT NULL,
    balance DECIMAL(10, 2) NOT NULL,
    user_id INT,
    FOREIGN KEY (user_id) REFERENCES User(id)
);

-- Create Goal table
CREATE TABLE IF NOT EXISTS Goal (
    id INT AUTO_INCREMENT PRIMARY KEY,
    goal_name VARCHAR(100) NOT NULL,
    target_amount DECIMAL(10, 2) NOT NULL,
    current_savings DECIMAL(10, 2) NOT NULL,
    monthly_contribution DECIMAL(10, 2) NOT NULL,
    term_years INT NOT NULL,
    is_want BOOLEAN NOT NULL,
    user_id INT,
    FOREIGN KEY (user_id) REFERENCES User(id)
);
