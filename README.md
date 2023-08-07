# Api-Program: generate token
**เตรียมความพร้อมก่อนการใช้งาน** 
1. download PostgreSQL จาก https://www.enterprisedb.com/downloads/postgres-postgresql-downloads
2. สร้าง database จาก PostgreSQL version 13 
- Hostname : localhost
- Port : 5432
- Database : ssotest 
- Table : sso_user_test  
- Username : ssodev  
- Password : sso2022ok

**SQL ของ Table**

    **create table** sso_user_test  
    (  
    **request_date** **timestamp not null  
    constraint** pk_sso_user_test  
    **primary key**,  
    **ssotype** **varchar**(50),  
    **systemid** **varchar**(50),  
    **systemname** **varchar**(250),  
    **systemtransactions** **varchar**(250),  
    **systemprivileges** **varchar**(250),  
    **systemusergroup** **varchar**(50),  
    **systemlocationgroup** **varchar**(50),  
    **userid** **varchar**(200),  
    **userfullname** **varchar**(500),  
    **userrdofficecode** **varchar**(250),  
    **userofficecode** **varchar**(250),  
    **clientlocation** **varchar**(250),  
    **locationmachinenumber** **varchar**(500),  
    **tokenid** **varchar**(1000)  
    );

**ตัวอย่าง** **Request**

    {
    
    "ssoType": "SSOData",
    
    "systemId": "VATDEDEV",
    
    "systemName": "ระบบบันทึกข้อมูลภาษีมูลค่าเพิ่มทดสอบ)",
    
    "systemTransactions": "PRIV-010,PRIV-020,PRIV-040,PRIV-050",
    
    "systemPrivileges": "0|0|0|0",
    
    "systemUserGroup": "GRP-010,GRP-020,GRP-040",
    
    "systemLocationGroup": "CliC001",
    
    "userId": "WS233999",
    
    "userFullName": "ประสาท จันทร์อังคาร ",
    
    "userRdOfficeCode": "01000999",
    
    "userOfficeCode": "01001139",
    
    "clientLocation": "01001139",
    
    "locationMachineNumber": "CLI00000718-9999",
    
    "tokenId": "eyJzdWIiOiIxMjM0IiwiYXVkIjpbImFkbWluIl0sImlzcyI6Im1hc29uLm1ldGFtdWcubmV0IiwiZXhwIjoxNTc0NTEyNzY1LCJpYXQiOjE1NjY3MzY3NjUsImp0aSI6ImY3YmZlMzNmLTdiZjctNGViNC04ZTU5LTk5MTc5OWI1ZWI4YSJ9"
    
    }

**ตัวอย่าง.** **Response**
**Header HTTP CODE 200 OK**

    {
    
    "responseCode": "I07000",
    
    "responseMessage": "ทำรายการเรียบร้อย",
    
    "responseData": {
    
    "userId": "WS233200",
    
    "tokenId": "eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdWQiOlsiZWZpbGluZyIsInNwIl0sInNjb3BlIjpbInJlYWQiLCJ3cml0ZSJdLCJjaGFubmVsIjoic3AiLCJleHAiOjE2NDk0OTc2MDMsImF1dGhvcml0aWVzIjpbIlJPTEVfU1AiXSwianRpIjoiMjc4NDBkNjEtZGM3Yy00YzllLTlhYTItYzU0ZmI3NWM1YzE1IiwiY2xpZW50X2lkIjoiT0ExLTAxMDU1MjQwMTczMTMifQ.AU8Gp4sMisgcASTyxay_bggeyC_-kkaNUodV67tVThzjCsYdykxR8Hm4Rg7wvpVxEif8NXTdc5_R3AHBbzcG2XQHD8j_5b9IlmaIm9lHrUYwZ0cD6EPf-y_8ftueOmCpvg8EHXpq9fqBYG6AXOoLgBxTZvi44_97arH68muzprmBpp-5c_ccvDgySARnQo-SA7IhgO6Y5rvscx8OY49f0LHBHnnyDigbwMC8Uia5d40F07NR5827l9UBHWBneNATZZdO7V3mKqDfaQzlT9Fmpg4L07xuUgzICNGn3UIjkWcJIPuqPb1_5Q-r_Q2RftAlmqmzEsC8mYd1pNpP2f2XGQ"
    
    }
    
    }
**หากทำการ** **insert ไม่ได้ ให้ response**


    {
    
    "responseCode": "E000001",
    
    "responseMessage": "ไม่สามารถบันทึกข้อมูลลงฐานข้อมูลได้",
    
    "responseData": {
    
    "userId": "WS233200",
    
    "tokenId": " "
    
    }
    
    }

**Dependency ที่ใช้ทั้งหมด**

    <?xml version="1.0" encoding="UTF-8"?>  
    <project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"  
      xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">  
     <modelVersion>4.0.0</modelVersion>  
     <parent> <groupId>org.springframework.boot</groupId>  
     <artifactId>spring-boot-starter-parent</artifactId>  
     <version>2.7.14</version>  
     <relativePath/> <!-- lookup parent from repository -->  
      </parent>  
     <groupId>pcc.apitest</groupId>  
     <artifactId>api-program</artifactId>  
     <version>0.0.1-SNAPSHOT</version>  
     <name>api-program</name>  
     <description>Demo project for Spring Boot</description>  
     <properties> <java.version>11</java.version>  
     </properties> <dependencies> <dependency> <groupId>org.springframework.boot</groupId>  
     <artifactId>spring-boot-starter-data-jpa</artifactId>  
     </dependency> <dependency> <groupId>org.springframework.boot</groupId>  
     <artifactId>spring-boot-starter-web</artifactId>  
     </dependency>  
     <dependency> <groupId>org.postgresql</groupId>  
     <artifactId>postgresql</artifactId>  
     <scope>runtime</scope>  
     </dependency> <dependency> <groupId>org.springframework.boot</groupId>  
     <artifactId>spring-boot-starter-test</artifactId>  
     <scope>test</scope>  
     </dependency>  
     <dependency> <groupId>io.springfox</groupId>  
     <artifactId>springfox-swagger2</artifactId>  
     <version>2.9.2</version>  
     </dependency> <dependency> <groupId>io.springfox</groupId>  
     <artifactId>springfox-swagger-ui</artifactId>  
     <version>2.9.2</version>  
     </dependency> </dependencies>  
     <build> <plugins> <plugin> <groupId>org.springframework.boot</groupId>  
     <artifactId>spring-boot-maven-plugin</artifactId>  
     </plugin> </plugins> </build>  
    </project>
