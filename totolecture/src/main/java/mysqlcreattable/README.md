## 이메일 전송 리스트 테이블 만들기
```
create table if not exists email_sending_list
(
email             varchar(100)  not null
primary key,
code              varchar(100)  not null,
sending_date_time datetime      not null,
register_token    varchar(100)  not null,
number_of_request int default 0 not null
);

INSERT INTO email_sending_list (email, code, sending_date_time, register_token, number_of_request)
VALUES ('taeyeon@naver.com', LEFT(UUID(),8), '2022-07-14 20:53:41', UUID(), 1);

INSERT INTO email_sending_list (email, code, sending_date_time, register_token, number_of_request)
VALUES ('yoona@naver.com', LEFT(UUID(),8), '2022-07-14 20:53:41', UUID(), 1);

INSERT INTO email_sending_list (email, code, sending_date_time, register_token, number_of_request)
VALUES ('yuri@naver.com', LEFT(UUID(),8), '2022-07-12 20:53:41', UUID(), 1);

INSERT INTO email_sending_list (email, code, sending_date_time, register_token, number_of_request)
VALUES ('hyoyeon@naver.com', LEFT(UUID(),8), '2022-07-01 20:53:41', UUID(), 1);

INSERT INTO email_sending_list (email, code, sending_date_time, register_token, number_of_request)
VALUES ('sooyeong@naver.com', LEFT(UUID(),8), '2022-07-03 20:53:41', UUID(), 1);

INSERT INTO email_sending_list (email, code, sending_date_time, register_token, number_of_request)
VALUES ('seohyeon@naver.com', LEFT(UUID(),8), '2022-07-07 20:53:41', UUID(), 1);

INSERT INTO email_sending_list (email, code, sending_date_time, register_token, number_of_request)
VALUES ('sunny@naver.com', LEFT(UUID(),8), '2022-07-14 20:53:41', UUID(), 1);

INSERT INTO email_sending_list (email, code, sending_date_time, register_token, number_of_request)
VALUES ('tiffany@naver.com', LEFT(UUID(),8), '2022-07-14 20:53:41', UUID(), 1);
```


## 멤버테이블 만들기
```
create table if not exists member
(
email                 varchar(100) not null
primary key,
name                  varchar(100) not null,
id                    varchar(100) not null,
introduction          varchar(100) not null,
creating_account_date datetime     null
);

INSERT INTO member (email, name, id, introduction, creating_account_date)
VALUES ('taeyeon@naver.com', '김태연', 'taeyeon', '안녕하세요. 태연입니다.', '2022-07-14 20:53:41');

INSERT INTO member (email, name, id, introduction, creating_account_date)
VALUES ('yoona@naver.com', '임윤아', 'yoona', '안녕하세요. 윤아입니다.', '2022-07-14 20:53:41');

INSERT INTO member (email, name, id, introduction, creating_account_date)
VALUES ('yuri@naver.com', '권유리', 'yuri', '안녕하세요. 유리입니다.', '2022-07-12 20:53:41');

INSERT INTO member (email, name, id, introduction, creating_account_date)
VALUES ('hyoyeon@naver.com', '김효연', 'hyoyeon', '안녕하세요. 효연입니다.', '2022-07-01 20:53:41');

INSERT INTO member (email, name, id, introduction, creating_account_date)
VALUES ('sooyeong@naver.com', '최수영', 'sooyeong', '안녕하세요. 수영입니다.', '2022-07-03 20:53:41');

INSERT INTO member (email, name, id, introduction, creating_account_date)
VALUES ('seohyeon@naver.com', '서주현', 'seohyeon', '안녕하세요. 서현입니다.', '2022-07-07 20:53:41');

INSERT INTO member (email, name, id, introduction, creating_account_date)
VALUES ('sunny@naver.com', '써니', 'sunny', '안녕하세요. 써니입니다.', '2022-07-14 20:53:41');

INSERT INTO member (email, name, id, introduction, creating_account_date)
VALUES ('tifanny@naver.com', '티파니', 'tifanny', '안녕하세요. 티파니입니다.', '2022-07-14 20:53:41');
```

## 24시간 이내에 생성된 계정 조회하기
```
SELECT *
FROM member 
WHERE creating_account_date > DATE_ADD(NOW(), INTERVAL -1 DAY)
```