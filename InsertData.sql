select * from blog.t_user;
select * from blog.t_article;
select * from blog.t_visitor;

insert into blog.t_user values(1, 'Teddy', 'I am Teddy', '', 'shadberry89@gmail.com', 'male', 'shadberry', 'shadberry');
insert into blog.t_article values(1, 'My first Article', 'for test', 'for test and omitted much thing', SYSDATE(), 1, SYSDATE(), 1);
insert into blog.t_article values(2, 'My second Article', 'balabala', 'balabala omitted much thing', SYSDATE(), 1, SYSDATE(), 1);