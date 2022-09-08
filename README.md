# Mapeamento objeto-relacional (ORM) - Implementação Java com Spring Boot.

Projeto desenvolvido com Spring, utilizando JPA(Mapeamento do relacional com o objeto) e banco de dados h2(em memória).

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

