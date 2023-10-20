# sistemabiblioteca



**DOCUMENTAÇÃO DE IMPLEMENTAÇÃO DE TESTES**
Grupo: 3

**////////////////////////////////////////////////////////**

**Teste de cadastro do autor**

*Cadastrar autor:*

**////////////////////////////////////////////////////////**


**Teste 1**


**Entrada de dados:**

Nome: Caio


País: Brasil


ID: auto increment


Livros: O Pequeno Principe
 
**Resultado esperado:** *Autor cadastrado!*


*Validação do teste:*

**////////////////////////////////////////////////////////**

**Teste 2**


Nome: (vazio)


País: Brasil


ID: auto increment


Livros: O Pequeno Principe

**Resultado esperado:** *Erro, dados incorretos!*


*Validação do teste:*

**////////////////////////////////////////////////////////**

**Teste 3**


*Entrada de dados:*

Nome: 123dfsa


País: Brasil


ID: auto increment


Livros: O Pequeno Principe

**Resultado esperado:** *Erro, dados incorretos!*


*Validação do teste:*


**////////////////////////////////////////////////////////**

**Teste 4**


*Entrada de dados:*

Nome: Murilo


País: (12312s)


ID: auto increment


Livros: O Pequeno Principe

**Resultado esperado:** *Erro, dados incorretos!*
*Validação do teste:*

**////////////////////////////////////////////////////////**

**Teste 5**


*Entrada de dados:*

Nome: Murilo


País: (vazio)


ID: auto increment


Livros: O Pequeno Principe

**Resultado esperado:** *Erro, dados incorretos!*


*Validação do teste:*

**////////////////////////////////////////////////////////**

**Teste 6**


*Entrada de dados:*

Nome: Murilo


País: !@$@!


ID: auto increment


Livros: O Pequeno Principe

**Resultado esperado:** *Erro, dados incorretos!*


*Validação do teste:*

**////////////////////////////////////////////////////////**

**Teste 7**


*Entrada de dados:*

Nome: Murilo


País: Brasil


ID: auto increment


Livros:(vazio)

**Resultado esperado:** *Erro, dados incorretos!*

*Validação do teste:*

**////////////////////////////////////////////////////////**

**Teste 9**


*Entrada de dados:*

Nome: Murilo


País: Brasil


ID: auto increment


Livros: 1212

**Resultado esperado:** *Erro, dados incorretos!*


*Validação do teste:*

**////////////////////////////////////////////////////////**

**Teste 9**


*Validação do teste:*


*Entrada de dados:*

Nome: Murilo


País: Brasil


ID: auto increment


Livros:!@*!#!

**Resultado esperado:** *Erro, dados incorretos!*


*Validação do teste:*


**Teste de cadastro do livro**
*Cadastrar livro:*

**////////////////////////////////////////////////////////**

**Teste 1**


**Entrada de dados:**

Nome: O Pequeno princípe


Autor: Caio


Idioma: Português, Inglês e Alemão


Data Lançamento: 06/04/1943


Data Cadastro: 15/08/2023

Isbn: 1234567890000

 
**Resultado esperado:** *Livro cadastrado!*

*Validação do teste:*

**////////////////////////////////////////////////////////**

**Teste 2**

Nome: (vazio)


Autor: Caio


Idioma: Português, Inglês e Alemão


Data Lançamento: 06/04/1943


Data Cadastro: 15/08/2023

Isbn: 1234567890000


**Resultado esperado:** *Erro, dados incorretos!*

*Validação do teste:*

**////////////////////////////////////////////////////////**

**Teste 3**

Nome: O Pequeno princípe


Autor: 0987b


Idioma: Português, Inglês e Alemão


Data Lançamento: 06/04/1943


Data Cadastro: 15/08/2023

Isbn: 1234567890000


**Resultado esperado:** *Erro, dados incorretos!*

*Validação do teste:*

**////////////////////////////////////////////////////////**

**Teste 4**


**Entrada de dados:**

Nome: O Pequeno princípe


Autor: Caio


Idioma: 132334


Data Lançamento: 06/04/1943


Data Cadastro: 15/08/2023

Isbn: 1234567890000

 
**Resultado esperado:** *Erro, dados incorretos!*

*Validação do teste:*

**////////////////////////////////////////////////////////**

**Teste 5**


**Entrada de dados:**

Nome: O Pequeno princípe


Autor: Caio


Idioma: Português, Inglês e Alemão


Data Lançamento: Ab/Qn/Re


Data Cadastro: 15/08/2023

Isbn: 1234567890000

 
**Resultado esperado:** *Erro, dados incorretos!*

*Validação do teste:*

**////////////////////////////////////////////////////////**

**Teste 6**


**Entrada de dados:**

Nome: O Pequeno princípe


Autor: Caio


Idioma: Português, Inglês e Alemão


Data Lançamento: 06/04/1943


Data Cadastro: Qr/Po/Rtyp

Isbn: 1234567890l

 
**Resultado esperado:** *Erro, dados incorretos!*

*Validação do teste:*

**////////////////////////////////////////////////////////**

**Teste 7**


**Entrada de dados:**

Nome: O Pequeno princípe


Autor: Caio


Idioma: Português, Inglês e Alemão


Data Lançamento: 06/04/1943


Data Cadastro: Qr/Po/Rtyp

Isbn: 123456bhj

 
**Resultado esperado:** *Erro, dados incorretos!*

*Validação do teste:*

**////////////////////////////////////////////////////////**
