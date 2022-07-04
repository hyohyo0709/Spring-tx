select constraint_name
from user_constraints
where table_name='mem';

alter table mem
add constraint mem_num_pk primary key(num);

select*from mem;