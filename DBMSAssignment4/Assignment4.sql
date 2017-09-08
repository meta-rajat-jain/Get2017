    /* DBMS ASSIGNMENT 4 */

    /* ASSIGNMENT 1*/

    /* 
    Write a SELECT command to display name of those members
    who belong to the category AS to which member
    “JON SNOW” belongs.
     */
    SELECT member_nm,categoryauthors
    FROM members
    WHERE category = (SELECT category FROM members WHERE member_nm = 'Jon Snow');
    /*
    Write a SELECT command to display information on the books
    that have not been returned till date. The information should
    include book issue date, title, member name and due date.
    */

    /* VIA COLRELATED SUBQUERY */
    SELECT member_nm,t.title_nm,b.issue_dt,due_dt
    FROM book_issue b
    LEFT JOIN members M
    ON M.member_id = b.member_id
    JOIN books c
    ON b.accession_no= c.accession_no
    JOIN titles t
    ON c.title_id= t.title_id
    WHERE (b.accession_no,b.member_id) NOT IN (SELECT accession_no,member_id FROM book_return );


    /*
    SELECT command to display information on the books
    that have been returned after their due dates. The information
    should include book issue date, title, member name and due
    date.
    */

    /*VIA COLRELATED SUBQUERY*/
    SELECT b.issue_dt,t.title_nm,m.member_nm,b.due_dt
    FROM book_issue b
    LEFT JOIN members M
    ON M.member_id = b.member_id
    JOIN books c
    ON b.accession_no= c.accession_no
    JOIN titles t
    ON c.title_id= t.title_id
    WHERE (b.accession_no,b.member_id) IN (SELECT accession_no,member_id FROM book_return r WHERE DATEDIFF(r.return_dt,b.due_dt) > 0);



    /*
    to display information of those books
    whose price is equal to the most expensive book purchASed so far.
    */
    SELECT t.title_id,b.purchASe_dt,b.price,t.title_nm
    FROM books b,titles t
    WHERE t.title_id = b.title_id and price  = (SELECT MAX(price) FROM books );


    /*
    Write a SELECT command to display the second maximum price
    of a book.
    */
     SELECT MAX(price) FROM books
     WHERE price NOT IN (SELECT MAX(price) FROM books );
      
  
      /* ASSIGNMENT 2 */
      
      /*
      Create a View which contains three columns, member name,
    member id and full description of category, i.e., Faculty, Students
    and Others instead of F,S and O.
    */
      DROP VIEW IF EXISTS CATEGORY;
      Create view CATEGORY
      AS
      SELECT member_nm , member_id ,IF(category IN ('F','S'),IF(category='F','Faculty','Student'),'OTHERS') AS 'Category' 
      FROM members;
      
      SELECT * FROM CATEGORY;
      
      /* 
     SELECT member_name , member_id ,
     CASE category WHEN 'F' THEN 'Faculty' WHEN 'S' THEN 'Student' ELSE 'Others' END as 'Category' 
     FROM members
        */
      
     /*
     View which can be used to display member name and
     all issue details of the member using a simple SELECT command.
     */
      
      DROP VIEW IF EXISTS Member_detail;
      Create view Member_detail
      AS
      SELECT member_nm,issue_dt,due_dt
      FROM members m,book_issue b
      WHERE m.member_id = b.member_id;
      
      SELECT * FROM Member_detail;
      /*
      View which contains the information – subject name,
      title, member name, category, issue date, due date and return
      date. If the books have not been returned, NULL should be
      displayed instead of return date.
      */


        DROP VIEW IF EXISTS Information;
        Create view Information
        AS
        SELECT s.subject_nm, t.title_nm, m.member_nm, m.category, bi.issue_dt,bi.due_dt , br.return_dt FROM book_issue bi
        JOIN books b ON (b.accession_no = bi.accession_no)
        LEFT JOIN book_return br ON (br.accession_no = bi.accession_no and br.member_id = bi.member_id)
        JOIN titles t ON (b.title_id = t.title_id)
        JOIN subjects s ON (s.subject_id = t.subject_id)
        JOIN members m ON (bi.member_id = m.member_id);

        SELECT * FROM Information;