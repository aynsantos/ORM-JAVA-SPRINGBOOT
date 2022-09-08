# Mapeamento objeto-relacional (ORM) - Implementação Java com Spring Boot.

Projeto desenvolvido com Spring, utilizando JPA(Mapeamento do modelo relacional com o objeto) e banco de dados h2(em memória).

JPA
Anotações 

@Entity e @Table:  
faz o mapeamento do modelo de objeto para tabela e serem persistidos no banco de dados.

@Id:
Indica que o atributo será a chave primaria da tabela.

@GeneratedValue
Indicando para o banco de dados  que o ID vai se auto-incrementar.

@ManyToOne(Um Department para Muitos Funcionários):
Mapeando relacionamento Department x Employee

@JoinColumn
A entidade "Employee" vai ter uma chave estrangeira(foreign key)  chamada "department_id" referindo-se ao principal
atributo de nossa entidade "Department".

## Configurando banco de dados h2 (application.properties)

# Dados de conexão com o banco H2
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.username=sa
spring.datasource.password=

# Configuração do cliente web do banco H2
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console

## Seed da base de dados (import.sql)

INSERT INTO tb_department(name) VALUES ('Vendas');
INSERT INTO tb_department(name) VALUES ('Marketing');
INSERT INTO tb_department(name) VALUES ('TI');

INSERT INTO tb_employee(name, salary, department_id) VALUES ('Maria', 6000.0, 1);
INSERT INTO tb_employee(name, salary, department_id) VALUES ('Pedro', 5000.0, 3);
INSERT INTO tb_employee(name, salary, department_id) VALUES ('Ana', 7000.0, 3);
INSERT INTO tb_employee(name, salary, department_id) VALUES ('Carlos', 6000.0, 1);
INSERT INTO tb_employee(name, salary, department_id) VALUES ('Antonio', 5000.0, 2);