create database library_data;
use  library_data;
SET FOREIGN_KEY_CHECKS=0;
CREATE TABLE Book_Details  
    (  
        ISBN_Code int PRIMARY KEY,  
        Book_Title varchar(100),  
        Language varchar(10),  
        Publication_id int,  
        No_Copies_Actual int,  
        No_Copies_Current int,  
        Category_id int,  
        Publication_year int  
    )  ;
    
 CREATE TABLE Publication_Details  
    (  
        Publication_id int PRIMARY KEY,  
        Publication_Name varchar(50)  
    )  ;
ALTER TABLE Book_Details ADD CONSTRAINT Publication_ID_FK FOREIGN KEY(Publication_id) REFERENCES Publication_Details(Publication_id); 
    
CREATE TABLE Borrower_Details  
(  
    Borrower_id int PRIMARY KEY,  
    Book_id int,  
    Borrowed_From date,  
    Borrowed_To date,  
    Actual_Return_Date date,  
    Issued_by int  
) ;

ALTER TABLE Borrower_details ADD CONSTRAINT Book_Id_FK FOREIGN KEY(Book_id) REFERENCES Book_Details(ISBN_Code);

    CREATE TABLE Staff_Details  
    (  
        Staff_id int PRIMARY KEY,  
        Staff_Name varchar(50),  
        Password varchar(16),  
        Is_Admin boolean,  
        Designation varchar(20)  
    )  ;

ALTER TABLE Borrower_Details  
ADD CONSTRAINT Issued_by_FK FOREIGN KEY(Issued_by) REFERENCES Staff_Details(Staff_id);   

Create TABLE Student_Details  
    (  
        Student_id varchar(10) PRIMARY KEY,  
        Student_Name varchar(50),  
        Sex Varchar(20),  
        Date_Of_Birth date,  
        Borrower_id int,  
        Department varchar(10),  
        contact_Number varchar(11)  
    ) ;
    
ALTER TABLE student_details  
    ADD CONSTRAINT borrower_id_FK FOREIGN KEY(Borrower_id) REFERENCES Borrower_Details(Borrower_id);  
    
Create Table Shelf_Details  
    (  
        Shelf_id int PRIMARY KEY,  
        Shelf_No int,  
        Floor_No int  
    );  

ALTER TABLE Book_Details ADD(Shelf_Id int);  
  
ALTER TABLE Book_Details  
ADD CONSTRAINT Shelf_Id_FK FOREIGN KEY(Shelf_Id) REFERENCES Shelf_Details(Shelf_id); 