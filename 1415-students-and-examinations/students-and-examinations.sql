# Write your MySQL query statement below

select s.student_id,s.student_name,sub.subject_name,
(select count(*) from examinations e
where s.student_id=e.student_id and sub.subject_name =e.subject_name) 
as attended_exams from students s,subjects sub
order by student_id,subject_name


