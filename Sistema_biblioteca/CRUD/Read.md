**DOCUMENTAÇÃO DE IMPLEMENTAÇÃO DE TESTES**

Grupo: 3

**Teste Read**


**////////////////////////////////////////////////////////**

**Teste 1**

*1.Pesquisar dado Nome*

Nome: Caio


*2.Retorna autor*

**Resultado esperado:** *Autor Encontrado!*


**Exibir Dados:**

 *País: Brasil*


*ID: auto increment*


*Livros: O Pequeno Principe*

**////////////////////////////////////////////////////////**

**Teste 2**

*1.Pesquisar dado Nome*
Nome: " "

**Resultado esperado:** *Autor não pode ser vazio!*

**////////////////////////////////////////////////////////**

**Teste 3**

*1.Pesquisar dado Nome*


Nome: 1298397

**Resultado esperado:** *Caracter inválido!*

**////////////////////////////////////////////////////////**

**Teste 4**

*1.Pesquisar dado Nome*
Nome: @dkl&

**Resultado esperado:** *Caracter inválido!*

**////////////////////////////////////////////////////////**

**Teste 5**

*1.Pesquisar dado País*

País: Brasil


*2.Retorna país*

**Resultado esperado:** *Autores encontrados*


*Exibe todos os autores que contenham o país inserido*

**////////////////////////////////////////////////////////**

**Teste 6**

*1.Pesquisar dado País*
País: " "


**Resultado esperado:** *Não pode estar vazio!*

**////////////////////////////////////////////////////////**

**Teste 7**

*1.Pesquisar dado País*
País: 109384756


**Resultado esperado:** *Caracter inválido*

**////////////////////////////////////////////////////////**

**Teste 8**

*1.Pesquisar dado País*
País: @dkl&

**Resultado esperado:** *Caracter inválido*

**////////////////////////////////////////////////////////**

**Teste 9**

*1.Pesquisar dado ID*
ID: 1


*2.Retorna ID*

**Resultado esperado:** *Autor encontrado!*


**Exibir Dados:**
*Nome: Caio*

*País: Brasil*

*Livros: O Pequeno Principe*


**////////////////////////////////////////////////////////**

**Teste 10**

*1.Pesquisar dado ID*
ID: " "


**Resultado esperado:** *ID não pode estar vazio!*

**////////////////////////////////////////////////////////**

**Teste 11**

*1.Pesquisar dado ID*
ID: @dkl&

**Resultado esperado:** *Caracter inválido!*

**////////////////////////////////////////////////////////**

**Teste 12**

*1.Pesquisar dado Livros*
Nome: O Pequeno Principe


*2.Retorna livros*

**Resultado esperado:** *Livro Encontrado!*


**Exibir Dados:**

Nome: O Pequeno princípe


Autor: Caio


Idioma: Português, Inglês e Alemão


Data Lançamento: 06/04/1943


Data Cadastro: 15/08/2023

Isbn: 1234567890000


**Teste 13**

*1.Pesquisar dado Livros*
Nome: " "

**Resultado esperado:** *Não pode ser vazio!*

**////////////////////////////////////////////////////////**

**Teste 14**

*1.Pesquisar dado Livros*
Nome: 1298397

**Resultado esperado:** *Caracter inválido!*

**////////////////////////////////////////////////////////**

**Teste 15**

*1.Pesquisar dado Livros*

Nome: @dkl&

**Resultado esperado:** *Caracter inválido!*

**////////////////////////////////////////////////////////**

**Teste 16**

*1.Pesquisar dado Livros*

Autor: Caio

**Resultado esperado:** *Livros encontrados!*

*2. Retorna livros*

Nome: O Pequeno princípe


Autor: Caio


Idioma: Português, Inglês e Alemão


Data Lançamento: 06/04/1943


Data Cadastro: 15/08/2023

Isbn: 1234567890000

**////////////////////////////////////////////////////////**

**Teste 17**

*1.Pesquisar dado Livros*

Autor: " "

**Resultado esperado:** *Não pode ser vazio!*

**////////////////////////////////////////////////////////**

**Teste 18**

*1.Pesquisar dado Livros*

Autor: 1232131

**Resultado esperado:** *Caracter inválido!*

**////////////////////////////////////////////////////////**

**Teste 19**

*1.Pesquisar dado Livros*

Autor: !(@!(@*!()))

**Resultado esperado:** *Caracter inválido!*

**////////////////////////////////////////////////////////**

**Teste 20**

*1.Pesquisar dado Livros*

Idioma: Pt_Br

**Resultado esperado:** *Livros encontrados!*

*2. Retorna os livros que tiver este idioma*

**////////////////////////////////////////////////////////**

**Teste 21**

*1.Pesquisar dado Livros*

Idioma: " "

**Resultado esperado:** *Não pode ser vazio!*

**////////////////////////////////////////////////////////**

**Teste 22**

*1.Pesquisar dado Livros*

Idioma: 12312

**Resultado esperado:** *Caracter inválido!*

**////////////////////////////////////////////////////////**

**Teste 23**

*1.Pesquisar dado Livros*

Idioma: !@!@!#3

**Resultado esperado:** *Caracter inválido!*

**////////////////////////////////////////////////////////**

**Teste 24**

*1.Pesquisar dado Livros*

Data Lançamento: 06/04/1943

**Resultado esperado:** *Caracter inválido!*

*2. Retorna todos os livros que conter essa data de lançamento*

**////////////////////////////////////////////////////////**

**Teste 25**

*1.Pesquisar dado Livros*

Data Lançamento: 1823/10/19

**Resultado esperado:** *Data inválida!*

**////////////////////////////////////////////////////////**

**Teste 26**

*1.Pesquisar dado Livros*

Data Lançamento: " "

**Resultado esperado:** *Não pode ser vazio!*

**////////////////////////////////////////////////////////**

**Teste 27**

*1.Pesquisar dado Livros*

Data Lançamento: 12312312

**Resultado esperado:** *Caracter inválido!*

**////////////////////////////////////////////////////////**

**Teste 28**

*1.Pesquisar dado Livros*

Data Lançamento: !@#!@!#

**Resultado esperado:** *Caracter inválido!*

**////////////////////////////////////////////////////////**