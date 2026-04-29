1. Desenvolva um sistema log de um aplicativo
de gerenciamento de tarefas. Sempre que uma
tarefa é criada, o sistema deve registrar
data e hora exatas da criação.

- Simule a criação de uma tarefa através de 
variáveis (ex: String tarefa = "Enviar relatório semanal")

- Registre a data e hora exatas da criação

- Exiba essas informações no formato adequado:

Data atual: yyy-MM-dd
Hora atual: horario:minuto:segundo.milisegundo

2.  Capturar a data e a hora atuais.
        Formatar a data no padrão dd-MM-yyyy (dia-mês-ano).
        Formatar a hora no padrão HH:mm (hora e minutos).
        Exibir o resultado da formatação.

Data formatada: dd-MM-yyyy
Hora formatada: hora:minuto

3. Receba dois horários representando o início 
e o término de uma atividade. Calcule a diferença
em horas e minutos entre esses dois horários.
Exiba o resultado formatado.

4. Receba uma data de início.
Adicione o prazo em dias ao início do projeto.
Exiba a data final formatada corretamente.

5. Receba uma data de vencimento original.
   Adicione um número de meses ao vencimento.
   A data ajustada deve ser exibida no formato dd-MM-yyyy.

6. Receba uma data de evento previamente 
cadastrada.
   Compare essa data com a data atual.
   Exiba a data do evento e a data atual no 
formato dd-MM-yyyy.
   Informe se o evento já ocorreu ou ainda 
está por vir.

7. Crie um programa que, a partir de uma data 
de vencimento e um período de antecedência em
dias, calcule e exiba a data que o lembrete 
para pagamento deve ser disparado.

Saída esperada: Se a data de vencimento for 30 de março 
de 2025 e o período de antecedência for 5 dias, a saída deve
ser

Data do lembrete: 25-03-2025

8. Crie um programa que exiba o horário atual no fuso horário de 
Tóquio (Asia/Tokyo). Utilize a classe ZonedDateTime para realizar 
a tarefa. Lembre-se de formatar a saída para exibir apenas horas,
minutos e segundos.

Saída esperada: Horário atual em Tóquio: 21:04:09

9. Crie um programa que converta o horário atual do sistema 
fuso horário padrão) para o fuso horário de Sydney (Australia/Sydney) 
e exiba apenas as horas e os minutos. Dica: Utilize o método 
withZoneSameInstant() para realizar a conversão.

10. Crie um programa que:
    Capturar o horário de entrada.
    Adicionar a carga horária diária para calcular o horário de saída previsto.
    Capturar o horário real de saída
    Calcular a diferença entre o tempo trabalhado e a carga horária.
    Exibir as informações formatadas corretamente.

Dica: Para tornar o sistema mais interativo, utilize a classe Scanner para capturar 
a entrada do usuário, permitindo que ele informe os horários diretamente. Neste caso, 
primeiro, crie um objeto Scanner para ler os dados digitados. Depois, defina um 
DateTimeFormatter para garantir que os horários sejam inseridos no formato correto, 
ou seja, com duas casas para horas e minutos, separados por dois pontos (HH:mm), como
"08:05". Isso evita erros ao converter o valor digitado em um objeto LocalTime. 
Em seguida, solicite a entrada do usuário com System.out.print() e utilize 
LocalTime.parse() para interpretar a string informada e transformá-la em um 
horário válido.