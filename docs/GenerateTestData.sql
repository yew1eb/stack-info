DROP PROCEDURE IF EXISTS go;
DELIMITER ;;
CREATE PROCEDURE go()
BEGIN
	declare i int;
    declare N int;
    declare Token varchar(128);
    declare Login varchar(128);
    declare AcctId int;
    declare LastTime Long;
    set LastTime = unix_timestamp()  - 24 * 60 * 60 * 30;
    set N = 500000;
    set i = 1;
    while i <= N do
		set i = i + 1;
		SELECT DATE_FORMAT(NOW(), '%Y%m%d%H%i%sX') INTO Token;
        SET Token = concat(Token,i);
        set Login = Token;
        set AcctId = floor(40+5000000*rand());
		insert into biz_auth_qa.access_token(id,token,login,acct_id,ctime,last_time,type,version,last_city,last_ip)
        values(null,Token, Login, AcctId, 0, LastTime, 0, '0', 0, 0);
    end while;
END
;;
DELIMITER ;
call go();