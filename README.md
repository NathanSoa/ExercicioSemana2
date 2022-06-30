# ExercicioSemana2

Exercício prático da semana 2 do curso Desenvolvimento Ágil com Java Avançado, curso oferecido pelo ITA na plataforma Coursera.

## Enunciado

O objetivo desse exercício é o aluno praticar a criação de aplicações web com o modelo de camadas MVC utilizando Servlets e JSP.

Deve-se implementar uma aplicação web que apresente um campo texto onde o usuário deve entrar com uma palavra e clicar no botão "Traduzir". A aplicação deve submeter a solicitação ao servidor, que deve processar e retornar uma página com a tradução.

A aplicação deve buscar as traduções em um arquivo que irá possuir as palavras em inglês e português. O formato do arquivo pode ficar por conta do aluno. Deve-se criar um arquivo com pelo menos 20 pares de palavra+tradução. Se for solicitada a tradução de uma palavra que não possui tradução no arquivo, a própria palavra deve ser retornada.

O aluno deve dividir a aplicação nas camadas MVC utilizando classes Java, Servlets e páginas JSP. Não é permitido utilizar nenhum framework adicional. A forma que a divisão é feita faz parte do exercício e será avaliada.

Devem ser criados 3 testes funcionais utilizando o Selenium: dois testes para palavras diferentes que existem no arquivo e um teste para uma palavra que não existe no arquivo.
