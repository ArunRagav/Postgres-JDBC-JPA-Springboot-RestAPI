# Postgres-JDBC-JPA-Springboot-RestAPI

prerequesties:
  Spring Tool Suite 4 (java8)
  pgadm4 for PostgresDB
  
  Configure application.xml:
  #configure DB to connect
  spring.datasource.url=jdbc:postgresql://localhost:5432/students
  spring.datasource.username=postgres
  spring.datasource.password=install
  ## Hibernate Properties
  # The SQL dialect makes Hibernate generate better SQL for the chosen database
  spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.PostgreSQLDialect
  # Hibernate ddl auto (create, create-drop, validate, update)
  spring.jpa.hibernate.ddl-auto=update
  spring.jpa.show-sql=true

