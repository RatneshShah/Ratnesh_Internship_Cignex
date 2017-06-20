create database library_data;
use  library_data;
SET FOREIGN_KEY_CHECKS=0;
CREATE TABLE Book_Details (
    ISBN_Code INT PRIMARY KEY,
    Book_Title VARCHAR(100),
    Language VARCHAR(10),
    Publication_id INT,
    No_Copies_Actual INT,
    No_Copies_Current INT,
    Category_id INT,
    Publication_year INT
);
    
CREATE TABLE Publication_Details (
    Publication_id INT PRIMARY KEY,
    Publication_Name VARCHAR(50)
);
ALTER TABLE Book_Details ADD CONSTRAINT Publication_ID_FK FOREIGN KEY(Publication_id) REFERENCES Publication_Details(Publication_id);
    
CREATE TABLE Borrower_Details (
    Borrower_id INT PRIMARY KEY,
    Book_id INT,
    Borrowed_From DATE,
    Borrowed_To DATE,
    Actual_Return_Date DATE,
    Issued_by INT
);

ALTER TABLE Borrower_details ADD CONSTRAINT Book_Id_FK FOREIGN KEY(Book_id) REFERENCES Book_Details(ISBN_Code);

CREATE TABLE Staff_Details (
    Staff_id INT PRIMARY KEY,
    Staff_Name VARCHAR(50),
    Password VARCHAR(16),
    Is_Admin BOOLEAN,
    Designation VARCHAR(20),
    Pass varchar(20),
    email varchar(20)
);

ALTER TABLE Borrower_Details  
ADD CONSTRAINT Issued_by_FK FOREIGN KEY(Issued_by) REFERENCES Staff_Details(Staff_id);

CREATE TABLE Student_Details (
    Student_id VARCHAR(10) PRIMARY KEY,
    Student_Name VARCHAR(50),
    Date_Of_Birth DATE,
    Borrower_id INT,
    Department VARCHAR(10),
    contact_Number VARCHAR(11),
    Pass varchar(20),
    email varchar(50)
);
    
ALTER TABLE student_details  
    ADD CONSTRAINT borrower_id_FK FOREIGN KEY(Borrower_id) REFERENCES Borrower_Details(Borrower_id);
    
CREATE TABLE Shelf_Details (
    Shelf_id INT PRIMARY KEY,
    Shelf_No INT,
    Floor_No INT
);  

ALTER TABLE Book_Details ADD(Shelf_Id int);  
  
ALTER TABLE Book_Details  
ADD CONSTRAINT Shelf_Id_FK FOREIGN KEY(Shelf_Id) REFERENCES Shelf_Details(Shelf_id); 

describe book_details;