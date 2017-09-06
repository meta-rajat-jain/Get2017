use lis;
/* Assignment 1 */

/*Assignment 1.1 select details from members and issued books where book has been issued for more than 2 months*/

SELECT m.member_nm, bi.member_id, t.title_nm, bi.accessiON_no, bi.issue_dt, bi.due_dt, DATEDIFF(bi.due_dt, bi.issue_dt) / 30 AS DateDiff
FROM book_issue bi
JOIN members m
ON m.member_id = bi.member_id
JOIN books b
ON b.accessiON_no = bi.accessiON_no
JOIN titles t
ON b.title_id = t.title_id
WHERE DATEDIFF(bi.due_dt, bi.issue_dt) /30 > 2
ORDER BY member_nm, title_nm;

/*Assignment 1.2 select details from members where name of member is longest*/

SELECT member_nm, LENGTH(member_nm) as name_length
FROM members
WHERE LENGTH(member_nm) = (SELECT MAX(LENGTH(member_nm)) FROM members);

/*Assignment 1.3 select count of total books issued*/

SELECT COUNT(issue_dt) as Books_Issued_So_Far
FROM book_issue;

/* ASsignment 2 */

/*Assignment 2.1 select details from subjects when a book is purchased*/

SELECT COUNT(accessiON_no) as No_Of_Books_Purchased,s.subject_nm,s.subject_id
FROM books b
JOIN titles t
ON b.title_id = t.title_id
JOIN subjects s
ON s.subject_id = t.subject_id
GROUP BY s.subject_id;

/*Assignment 2.2 select books issued for more than 2 months*/

SELECT m.member_nm, bi.member_id, t.title_nm, bi.accessiON_no, bi.issue_dt, bi.due_dt, DATEDIFF(bi.due_dt, bi.issue_dt) / 30 AS DateDiff
FROM book_issue bi
JOIN members m
ON m.member_id = bi.member_id
JOIN books b
ON b.accessiON_no = bi.accessiON_no
JOIN titles t
ON b.title_id = t.title_id
WHERE DATEDIFF(bi.due_dt, bi.issue_dt) /30 > 2
ORDER BY member_nm, title_nm;

/*Assignment 2.3 select books having price more than minimum price of purchased book*/

SELECT title_id, price
FROM books
WHERE price > (SELECT MIN(price) FROM books where purchase_dt is not null);

/* ASsignment 3 */

/*Assignment 3.1 select count of different categories*/

SELECT COUNT(IF(category="A",1,null)) AS Student_COUNT , COUNT(IF(category="B",1,null)) AS Faculty_COUNT , 
COUNT(IF(category!="A" and category!="B",1,null)) AS OTHERS
FROM members;

/*Assignment 3.2 select details of title when book is issued more than once*/

SELECT t.title_nm AS 'Title Name' 
FROM titles t
JOIN (SELECT accessiON_no, COUNT(accessiON_no) AS COUNT
FROM book_issue bo 
GROUP BY accessiON_no) AS derived
JOIN books b 
ON derived.accessiON_no = b.accessiON_no
WHERE t.title_id = b.title_id AND COUNT > 1;

/*Assignment 3.3 select member details having category non faculty*/    

SELECT m.member_nm,m.member_id 
FROM members m
JOIN book_issue b
ON m.member_id = b.member_id
WHERE category not in ('f');

/*Assignment 3.4 select author details for books purchased */

SELECT author_nm,a.author_id
FROM authors a
JOIN title_author t
ON a.author_id = t.author_id
JOIN books b
ON t.title_id = b.title_id
WHERE  exists (SELECT b.purchase_dt FROM books WHERE t.title_id = b.title_id);