select * from blog.t_user;
select * from blog.t_article;
select * from blog.t_visitor;
SELECT * from blog.t_comment;

#DELETE from blog.t_user
#DELETE from blog.t_article;

insert into blog.t_user values(1, 'Teddy', 'I am Teddy', '', 'shadberry89@gmail.com', 'male', 'teddy', 'teddy');
insert into blog.t_article values(1, 'My first Article', 'for test', 'for test and omitted much thing', SYSDATE(), 1, SYSDATE(), 1);
insert into blog.t_article values(2, 'My second Article', 'balabala', 'balabala omitted much thing', SYSDATE(), 1, SYSDATE(), 1);

insert into blog.t_user values(2, 'Shall', 'I am Shall', '', 'shall28@163.com', 'female', 'shall', 'shall');
insert into blog.t_article values(3, 'Shall''s first Article', 'for testdfv', 'for test123 and omitted much thing', SYSDATE(), 2, SYSDATE(), 2);
insert into blog.t_article values(4, 'Shall''s second Article', 'b123alabala', 'balabsdfsala omitted much thing', SYSDATE(), 2, SYSDATE(), 2);
