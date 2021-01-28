use spring_jpa

insert into vaitro(code,name) values('ADMIN','QUẢN TRỊ')
insert into vaitro(code,name) values('USER','NGƯỜI DÙNG')

insert into nhanvien values('NV01','KIENNEIK',2000-12-20,'CEO','da-emp-1.jpg',2000,'dep zai bao ngau`')
insert into nhanvien values('NV02','JUSTATEE',1999-12-20,'COO','da-emp-2.jpg',2000,'dep zai bao ngau`')
insert into nhanvien values('NV03','BINZ',2001-12-20,'CFO','da-emp-3.jpg',2000,'dep zai bao ngau`')
insert into nhanvien values('NV04','MIN',2010-12-20,'CFM','da-emp-4.jpg',2000,'dep zai bao ngau`')
insert into nhanvien values('NV05','YUNO SMALL BOI',1920-12-20,'SEO','da-emp-5.jpg',2000,'dep zai bao ngau`')
insert into nhanvien values('NV06','BRAY',1942-12-20,'KEO','da-emp-6.jpg',2000,'dep zai bao ngau`')

insert into taikhoan(username,password,fullname,status)
values('admin','$2a$10$/RUbuT9KIqk6f8enaTQiLOXzhnUkiwEJRdtzdrMXXwU7dgnLKTCYG','mạc trung kiên',1);
insert into taikhoan(username,password,fullname,status)
values('nguyenvana','$2a$10$/RUbuT9KIqk6f8enaTQiLOXzhnUkiwEJRdtzdrMXXwU7dgnLKTCYG','nguyễn văn A',1);
insert into taikhoan(username,password,fullname,status)
values('nguyenvanb','$2a$10$/RUbuT9KIqk6f8enaTQiLOXzhnUkiwEJRdtzdrMXXwU7dgnLKTCYG','nguyễn văn B',1);

insert into user_role values(1,1)
insert into user_role values(2,1)
insert into user_role values(3,2)
insert into user_role values(4,2)
