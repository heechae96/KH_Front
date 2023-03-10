CREATE TABLE STUDENT_TBL(
    STUDENT_ID VARCHAR2(30) PRIMARY KEY,
    STUDENT_PW VARCHAR2(30) NOT NULL,
    STUDENT_NAME VARCHAR2(30) NOT NULL,
    STUDENT_EMAIL VARCHAR2(35),
    STUDENT_PHONE VARCHAR2(13),
    STUDENT_ADDR VARCHAR2(100),
    GENDER VARCHAR2(3) CHECK (GENDER IN ('F', 'M')),
    STUDENT_DATE DATE DEFAULT SYSDATE
);

INSERT INTO STUDENT_TBL VALUES('khuser01', 'user01', '일용자', 'user01@naver.com', 
'01011111111', '서울시 영등포구', 'M', DEFAULT);

COMMIT;

SELECT * FROM STUDENT_TBL;