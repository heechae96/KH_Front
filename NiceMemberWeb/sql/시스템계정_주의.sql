CREATE USER MEMBERWEB IDENTIFIED BY MEMBERWEB;
GRANT CONNECT, RESOURCE TO MEMBERWEB;

ALTER USER MEMBERWEB DEFAULT TABLESPACE USERS QUOTA UNLIMITED ON USERS;