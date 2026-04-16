1. Estrutura dos pacotes:

Criar pacotes:
br.com.cursoalura.exercicios.minhamusica.modelos
br.com.cursoalura.exercicios.minhamusica.principal

2. Superclasse Audio (pacote modelos):

Criar a classe Audio

Declarar os atributos:
- titulo : String
- totalReproducoes : int
- totalCurtidas : int
- classificacao : int

Criar getter para todos os atributos
Criar setter apenas para titulo
Criar método curte() que incrementa totalCurtidas
Criar método reproduz() que incrementa totalReproducoes

3. Classe Musica (pacote modelos):

Criar classe Musica que herda de Audio

Declarar os atributos:
- album: String
- cantor: String
- genero: String
Criar getters e setters para todos os atributos da classe

4. Classe Podcast (pacote modelos):

Criar classe Podcast que herda de Audio

Declarar os atributos:
- apresentador: String
- descricao: String
Criar getters e setters para todos os atributos da classe

5. Classe Principal (pacote principal):

Criar classe Principal com o método main(String[]args)

Dentro do método main:
Criar uma instância Musica minhaMusica:

Definir:
titulo = "Forever"
cantor = "Kiss"

Criar for para:
simular 1000 reproduções (reproduz())
simular 50 curtidas (curte())

Criar uma instância Podcast meuPodcast:

Definir:
titulo = "BolhaDev"
apresentador = "Marcos Mendes"

Criar for para:
simular 5000 reproduções (reproduz())
simular 1000 curtidas (curte())
