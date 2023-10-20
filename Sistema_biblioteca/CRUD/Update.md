**DOCUMENTAÇÃO DE IMPLEMENTAÇÃO DE TESTES**

Grupo: 3

**Teste Update**


**////////////////////////////////////////////////////////**

**Teste 1**
*1.Pesquisar nome do autor*

Nome: Caio

*2.Retorna autor*

**Resultado esperado:** *Autor Encontrado!*

**Exibir Dados:**

 *País: Brasil*


*ID: auto increment*


*Livros: O Pequeno Principe*

*3.Atualizar autor*

**Selecionar o dado que deseja modificar**

*Trocar nome do autor*
Nome: " "

**Resultado esperado:** *Autor não pode ser vazio!*

*Trocar nome do autor*

Nome: Caio45

**Resultado esperado:** *Caracter inválido!*

*Trocar nome do autor*

Nome: Caio

**Resultado esperado** *Nome ja existente*

**////////////////////////////////////////////////////////**

**Teste 2**

*1.Pesquisar nome do autor*
Nome: Caio

*2.Retorna autor*

**Resultado esperado:** *Autor Encontrado!*

**Exibir Dados:**

 *País: Brasil*


*ID: auto increment*


*Livros: O Pequeno Principe*

*3.Atualizar País*

**Selecionar o dado que deseja modificar**

*Trocar nome do País*

País: " "

**Resultado esperado:** *País não pode ser vazio!*

*Trocar nome do País*

País: Bras1l

**Resultado esperado:** *Caracter inválido!*

*Trocar nome do País*

País: Monitor

**Resultado esperado** *O nome não é um país*

**////////////////////////////////////////////////////////**

**Teste 3**

*1.Pesquisar nome do autor*

Nome: Caio

*2.Retorna autor*

**Resultado esperado:** *Autor Encontrado!*

**Exibir Dados:**

 *País: Brasil*


*ID: auto increment*


*Livros: O Pequeno Principe*

*3.Atualizar Livro*

**Selecionar o dado que deseja modificar**

*Trocar Livros do Autor*

*Retorna troca de livros*

**Resultado esperado:** *Os livros do autor não podem ser alterados por aqui*

**////////////////////////////////////////////////////////**

**Teste 4**

*1.Pesquisar nome do autor*

Nome: Caio

*2.Retorna autor*

**Resultado esperado:** *Autor Encontrado!*

**Exibir Dados:**

 *País: Brasil*


*ID: auto increment*


*Livros: O Pequeno Principe*

*3.Atualizar autor*

**Selecionar o dado que deseja modificar**

*Trocar nome do autor*

Nome: "Luan"

**Resultado esperado:** *Nome alterado com sucesso*

**////////////////////////////////////////////////////////**

**Teste 5**

*1.Pesquisar nome do autor*

Nome: Caio

*2.Retorna autor*

**Resultado esperado:** *Autor Encontrado!*

**Exibir Dados:**

 *País: Brasil*

*ID: auto increment*

*Livros: O Pequeno Principe*


*3.Atualizar País*

**Selecionar o dado que deseja modificar**

*Trocar nome do País*
País: "Russia"

**Resultado esperado:** *País alterado com sucesso*

**////////////////////////////////////////////////////////**

**Teste 6**

*1.Pesquisar nome do livro*

Nome: O pequeno principe

*2.Retorna Livro*

**Resultado esperado:** *Livro Encontrado!*

**Exibir Dados:**

 *Idioma: Pt*

*ID: auto increment*

*ISBN: 1234567890000*

*Data de lançamento: 20/10/1980*

*3.Atualizar nome*

**Selecionar o dado que deseja modificar**

*Trocar nome do Livro*

Nome:" "

**Resultado esperado:** *Nome não pode ser vazio*

**////////////////////////////////////////////////////////**

**Teste 7**

*1.Pesquisar nome do livro*

Nome: O pequeno principe

*2.Retorna Livro*

**Resultado esperado:** *Livro Encontrado!*

**Exibir Dados:**

 *Idioma: Pt*

*ID: auto increment*

*ISBN: 1234567890000*

*Data de lançamento: 20/10/1980*

*3.Atualizar Idioma*

**Selecionar o dado que deseja modificar**

*Trocar Idioma do livro*

Idioma: " "

**Resultado esperado:** *Idioma não pode ser vazio*

*Trocar Idioma do livro*

Idioma: 1723632#@!7636

**Resultado esperado:** *Caracter inválido*

*Trocar Idioma do livro*

Idioma: Mortadela

**Resultado esperado:** *Não é um país*

**////////////////////////////////////////////////////////**

**Teste 8**
*1.Pesquisar nome do livro*

Nome: O pequeno principe

*2.Retorna Livro*

**Resultado esperado:** *Livro Encontrado!*

**Exibir Dados:**
 *Nome: O Pequeno Principe*

 *Idioma: Pt*

*ID: auto increment*

*ISBN: 1234567890000*

*Data de lançamento: 20/10/1980*

*3.Atualizar ISBN*


**Selecionar o dado que deseja modificar**

*Trocar ISBN do livro*

ISBN: " "

**Resultado esperado:** *ISBN não pode estar vazio!*

*Trocar ISBN do livro*

ISBN: 5124¨#5dasd51

**Resultado esperado:** *Caracter Inválido*

*Trocar ISBN do livro*

ISBN: 123456789000001035

**Resultado esperado:** *Mais que 13 numeros*

*Trocar ISBN do livro*

ISBN: 1231035

**Resultado esperado:** *Menos que 13 numeros*

**////////////////////////////////////////////////////////**

**Teste 9**

*1.Pesquisar nome do livro*

Nome: O pequeno principe

*2.Retorna Livro*

**Resultado esperado:** *Livro Encontrado!*

**Exibir Dados:**

 *Idioma: Pt*

*ID: auto increment*

*ISBN: 1234567890000*

*Data de lançamento: 20/10/1980*

*3.Atualizar Nome*

**Selecionar o dado que deseja modificar**

*Trocar nome do livro*

Nome: Mad Max

**Resultado esperado:** *Nome alterado com sucesso*

**////////////////////////////////////////////////////////**

**Teste 10**

*1.Pesquisar nome do livro*

Nome: O pequeno principe

*2.Retorna Livro*

**Resultado esperado:** *Livro Encontrado!*

**Exibir Dados:**

 *Idioma: Pt*

*ID: auto increment*

*ISBN: 1234567890000*

*Data de lançamento: 20/10/1980*

*3.Atualizar Idioma*

**Selecionar o dado que deseja modificar**

*Trocar Idioma*

Nome: de

**Resultado esperado:** *País com sucesso*

**////////////////////////////////////////////////////////**

**Teste 11**

*1.Pesquisar nome do livro*

Nome: O pequeno principe

*2.Retorna Livro*

**Resultado esperado:** *Livro Encontrado!*

**Exibir Dados:**

 *Idioma: Pt*

*ID: auto increment*

*ISBN: 1234567890000*

*Data de lançamento: 20/10/1980*

*3.Atualizar data de lançamento*

**Selecionar o dado que deseja modificar**

*Trocar data de lançamento*

Data: 16/10/2000

**Resultado esperado:** *Data alterada com sucesso*