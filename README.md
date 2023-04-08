HRMS (Human Resource Management System)
=======================================

Ödev 3
ÖNEMLİ 1 : Doğrulama işlemleri için sahte servisler oluşturunuz. Örneğin, gerçekten mail göndermeniz gerekmez.

ÖNEMLİ 2 : Gereksinimler dışında kodlama yapmayınız. Bu, Proje yönetimi ve ALM (Application LifeCycle Management) kurallarına aykırı bir yazılım geliştirici davranışıdır.

Req 1 : İş Arayanlar sisteme kayıt olabilmelidir.

Kabul Kriterleri:

Kayıt sırasında kullanıcıdan ad, soyad, tcno, doğum yılı, e-Posta, şifre, şifre tekrarı bilgileri istenir.
Tüm alanlar zorunludur. Kullanıcı bilgilendirilir.
Mernis doğrulaması yapılarak sisteme kayıt gerçekleştirilir.
Doğrulama geçerli değilse kullanıcı bilgilendirilir.
Daha önce kayıtlı bir e-posta veya tcno var ise kayıt gerçekleşmez. Kullanıcı bilgilendirilir.
Kayıdın gerçekleşmesi için e-posta doğrulaması gerekir.
Req 2 : İş verenler sisteme kayıt olabilmelidir.

Kabul Kriterleri:

Kayıt sırasında kullanıcıdan şirket adı, web sitesi, web sitesi ile aynı domaine sahip e-posta, telefon, şifre, şifre tekrarı bilgileri istenir. Burada amaç sisteme şirket olmayanların katılmasını engellemektir.
Tüm alanlar zorunludur. Kullanıcı bilgilendirilir.
Şirket kayıtları iki şekilde doğrulanır. Kayıdın gerçekleşmesi için e-posta doğrulaması gerekir. HRMS personelinin (bizim :)) onayı gerekmektedir.
Daha önce kayıtlı bir e-posta var ise kayıt gerçekleşmez. Kullanıcı bilgilendirilir.
Req 3 : Sisteme genel iş pozisyonu isimleri eklenebilmelidir. Örneğin Software Developer, Software Architect.

Kabul Kriterleri:

Bu pozisyonlar tekrar edemez. Kullanıcı uyarılır.
Req 4 : İş verenler listelenebilmelidir. (Sadece tüm liste)

Req 5 : İş arayanlar listelenebilmelidir. (Sadece tüm liste)

Req 6 : İş pozisyonları listelenebilmelidir. (Sadece tüm liste)

Technologies Used
-----------------

*   Java 11
*   Spring Boot 2.5.5
*   PostgreSQL 13.4
*   Maven
*   Hibernate
*   JPA
*   Swagger
*   Lombok

Features
--------

### For Job Seekers

*   Create a profile with personal information
*   Search for jobs by keyword, location, and category
*   Apply for job openings
*   Get updates on job applications
*   View application history

### For Employers

*   Create a company profile
*   Post job openings with job descriptions and requirements
*   View applicant profiles and resumes
*   Manage the hiring process with interview scheduling and candidate feedback

Getting Started
---------------

### Prerequisites

*   Java 11
*   PostgreSQL 13.4
*   Maven

### Installing

1.  Clone the repository to your local machine.
2.  Open the project in your preferred IDE.
3.  Configure the PostgreSQL database settings in the `application.properties` file.
4.  Run the application using Maven.

### Running the Tests

To run the unit tests, use the following command:

bashCopy code

`mvn test`

API Documentation
-----------------

The API documentation is available using Swagger. To access the documentation, run the application and go to `http://localhost:8080/swagger-ui.html` in your browser.

Authors
-------

*   Umıt Sınanoglu

License
-------

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
