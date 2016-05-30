USE `stackinfo`;
DROP PROCEDURE IF EXISTS go;
DELIMITER ;;
CREATE PROCEDURE go()
  BEGIN
    DECLARE i INT;
    DECLARE N INT;
    DECLARE name VARCHAR(128);
    DECLARE age INT;
    DECLARE passwd VARCHAR(128);
    DECLARE CurTime VARCHAR(128);
    DECLARE RandomNum INT;

    SET N = 50;
    SET i = 1;
    WHILE i <= N DO
      SET i = i + 1;
      SELECT DATE_FORMAT(NOW(), 'HN%Y%m%d%H')
      INTO CurTime;
      SET name = concat(CurTime, i);
      SET age = floor(10 + 80 * rand());
      SET RandomNum = floor(1000 + 1000 * rand());
      SET passwd = concat(name, RandomNum);
      INSERT INTO user (id, name, age, password)
      VALUES (i, name, age, passwd);
    END WHILE;
  END
;;
DELIMITER ;
CALL go();