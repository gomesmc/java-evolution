1. Sua tarefa é criar uma classe que:

Represente um produto com os atributos nome, preço e
quantidade. Implemente um método que mostre os dados
formatados, garantindo que o preço seja exibido com
duas casas decimais.

Saída esperada:
Produto: Mouse Gamer
Preço: R$ 159,90
Quantidade em estoque: 25

2. Desenvolva uma estrutura que armazene dados de 
obras literárias e as exiba em um formato padronizado,
facilitando a consulta por outros leitores.

Defina uma classe com os atributos título, autor e páginas.
Implemente um método que use printf para mostrar os dados no formato: 
"[TÍTULO]" de [AUTOR] com [PÁGINAS] páginas.

Saída esperada:
"O Guia do Mochileiro das Galáxias" de Douglas Adams 
com 208 páginas

3. Imagine que você está desenvolvendo um sistema de
conta digital onde os usuários podem realizar transações
financeiras. Em determinadas situações, como
encerramento de conta, é necessário zerar o saldo 
disponível.

Crie um programa que:

Defina uma classe com o atributo saldo.
Implemente um método que redefine o valor do saldo 
para 0.0.
Implemente um método que mostra o saldo atual formatado.

Exemplo de saída:

Saldo atual: R$ 1579.42
Saldo atual: R$ 0.00 

4. criar uma solução que automatize o cálculo de médias
e forneça rapidamente o resultado, eliminando a
necessidade de cálculos manuais e reduzindo erros.

Crie uma classe que:

Represente os alunos com os atributos nome, nota 1
e nota 2.
Implemente um método que:
Calcule a média das notas.
Exiba o nome do aluno, suas notas e a média (com uma 
casa decimal).
Indique se o aluno foi aprovado (média >= 7) ou 
reprovado.

Saída esperada: 

Aluno: João Silva
Nota 1: 6.5
Nota 2: 7.5
Média: 7,0
Situação: Aprovado

5. Você está desenvolvendo um sistema de controle de 
colaboradores para uma empresa de tecnologia. 
Às vezes, é necessário atualizar o cargo e o nível de 
acesso de um funcionário devido a promoções ou mudanças
de departamento. Seu programa deve permitir essas 
alterações e mostrar as informações atualizadas.

Crie uma classe que:

Represente um colaborador com os atributos nome, cargo e
nivel de acesso. Implemente um método que permita alterar
o cargo e o nível de acesso. Exiba no console as
informações antes e depois da atualização.

Saída esperada:

--- Antes da atualização ---
Nome: Júlia Oliveira
Cargo: Pessoa Desenvolvedora Júnior
Nível de acesso: 1

--- Após atualização ---
Nome: Júlia Oliveira
Cargo: Pessoa Desenvolvedora Plena
Nível de acesso: 2

6. Você está desenvolvendo um sistema de gerenciamento
de tarefas pessoais para ajudar usuários a organizar 
suas atividades diárias. Cada tarefa precisa ser 
registrada com uma descrição e um status que
indique se já foi concluída ou não. Seu objetivo é
criar uma estrutura que armazene essas tarefas e
permita visualizá-las.

Crie um programa que:

Defina uma classe com os atributos descrição e concluída.
Implemente um método que mostre a descrição da tarefa 
e seu status.
Crie uma lista de tarefas e exiba todas as tarefas 
cadastradas. 
Dica: use ArrayList.

Saída esperada:

Tarefa: Estudar Java - Status: Pendente  
Tarefa: Fazer exercícios - Status: Concluída

8. Você está desenvolvendo um sistema de gerenciamento
para uma loja de roupas e precisa garantir que o estoque
seja atualizado corretamente a cada venda realizada.
Seu programa deve processar as vendas e alertar quando
não houver produtos suficientes no estoque.

Crie um programa que:

Defina uma classe com os atributos nome e quantidade.
Implemente um método que:
Subtraia a quantidade vendida do estoque se houver 
disponibilidade.
Exiba uma mensagem formatada com o saldo atual usando 
printf 
Exiba um alerta “Estoque insuficiente” quando não for 
possível atender a venda

Saída esperada:

Venda realizada. Estoque restante de Camiseta: 7
Estoque insuficiente

9. Imagine que você está desenvolvendo um sistema de
controle de devoluções para uma livraria. Quando um 
livro é devolvido com atraso, é necessário calcular 
o valor da multa conforme os dias de atraso.

Crie um programa que:

Defina uma classe com os atributos título e dias 
de atraso.
Implemente um método que:
Cobre R$ 2,50 por dia de atraso.
Retorne o valor total da multa.
Implemente um método que mostre o título e o valor 
da multa formatado.

Livro: Dom Casmurro | Multa por 3 dias de atraso:R$ 7,50  

10. Você está desenvolvendo o sistema de checkout de um 
e-commerce de produtos eletrônicos. Seu desafio é 
calcular o valor total do carrinho de compras, 
considerando que cada produto pode ter quantidades 
diferentes e preços variados.

Crie um programa que:

Defina uma classe com os atributos nome, preço e
quantidade.
Implemente um método que retorne o valor total do item 
(preço x quantidade).
Crie uma lista de item e calcule o valor total da compra