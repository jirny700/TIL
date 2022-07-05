##database란?
파일이 가진 성능의 한계를 극복하기 위해 고안된 전문화된 소프트웨어

->데이터를 안전하고 빠르게 보관
ex.mysql,mongoDB 등

##datebase의 본질?->C.R.U.D
데이터베이스의 입력->create,update,delete

데이터베이스의 출력->read

##database의 장점
프로그래밍적으로 정리가 가능하며, 컴퓨터언어를 이용해 데이터를 제어할수 있다. 
데이터베이스를 구축시, 웹이나 앱을 통해 사람들과 공유가 가능하며 분석이 가능하다.
보안기능이 있다. 
사용자에게 권한을 지정해 줄 수 있다.

##관계형 데이터베이스
데이터를 표의 형태로 정리할 수 있고, 정렬 등을 쉽게 할 수 있다.
웹이 성장하며 동시에 관계형 데이터베이스인 mysql도 상호작용하며 급성장함.

##mysql의 구조
datebase(=스키마): 서로 연관된 표(table)들을 그룹핑한 것

datebase server: 스키마들이 저장된 곳

##기본명령어
1. 데이터베이스 서버 접속 명령어 :
mysql -uroot -p
2. 데이터베이스(스키마) 생성 명령어 : 
CREATE DATABASE 데이터베이스이름;
3. 데이터베이스 생성확인 : 
SHOW DATABASES;
4. 데이터베이스 사용 :
USE 데이터베이스이름;

##table 생성
CREATE TABLE 테이블이름( 

->id(->이름) INT(11)(->컬럼1의 데이터타입(size)) NOT NULL AUTO_INCREMENT(1씩증가)

->title(->이름) VARCHAR(100) NOT NULL(공백을 허용하지 않음)

->description TEXT NULL

->created DATETIME NOT NULL

->author VARCHAR(30) NULL

->profile VARCHAR(100) NULL 

->PRIMARY KEY(id));

##CRUD
###1. insert
INSERT INTO 테이블이름 (title,description,created,author,profile) VALUES('MYSQl','MYSQL is...',now(),'yejin','developer')

->생성된 테이블(표)에 데이터를 입력하는 문법.

###2.select
SELECT * FROM 테이블 이름

->테이블의 모든 데이터 읽기

SELECT 추출하고 싶은 컬럼이름 FROM 테이블 이름 

->테이블에서 원하는 컬럼 읽기

+ where author='yejin'; : 작가컬럼이 'yejin'인 데이터 중에서
+ ORDER BY id DESC; : 정렬
+ LIMIT 2; : 2행만 출력

###3.update(수정)
UPDATE 테이블이름 SET description='mysql is...' WHERE id=1;

->id가 2인 데이터의 description 부분을 'mysql is...'로 수정해라

->웨어문을 빠뜨리면 큰일남

###4.delete
DELETE FROM 테이블이름 WHERE id=1;

->id가 1인 행을 삭제해라















