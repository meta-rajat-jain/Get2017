use lis;
/* Assignment 1 */
desc members;

select member_nm,member_id,category from members;

select member_nm,member_id from members where category = "F";

select DISTINCT(category) as Distinct_categories from members;

select member_nm,category from members ORDER BY member_nm DESC;

select title_nm,subject_nm,publisher_nm from titles t,subjects s,publisher p where t.subject_id = s.subject_id and t.publisher_id = p.publisher_id;

select count(member_id) as Members_Present,category from members group by category;

select member_nm from members where category  = (select category from members where member_nm = "Raj") and member_nm not in ("Raj");

select f.member_nm from members f join members s on s.member_nm="Raj" and f.category=s.category and f.member_nm not in ("Raj"); 

select * from book_issue i left join book_return r on i.accession_no = r.accession_no;

/* Assignment 2 */

select * from book_issue i left join book_return r on i.accession_no = r.accession_no order by i.issue_dt,i.member_id;