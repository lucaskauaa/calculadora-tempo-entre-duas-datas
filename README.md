# 📆 Calculadora de Tempo entre Duas Datas

Projeto simples desenvolvido em **Java** que permite ao usuário calcular o tempo decorrido entre duas datas.

## ⚙️ Funcionalidades

1. Lê uma data inicial e uma data final, com a possibilidade de incluir o horário.
2. Calcula e exibe os anos, meses, semanas, dias e horas decorridos.

## ▶️ Como Executar

1. Ter o Java (versão 21) e o editor de código Eclipse instalados no computador.
2. Baixar o arquivo `.zip` ou clonar o repositório: https://github.com/lucaskauaa/calculadora-tempo-entre-duas-datas.git (é necessário ter o Git instalado).
3. Abrir a pasta do projeto no Eclipse → acessar o arquivo `src/program/Main.java` → clicar com o botão direito → **Run As** → **Java Application**.

## 🧪 Exemplo de Uso

```
Insira dia, mês e ano no formato dd/mm/aaaa

Data de início: 01/01/2000
Data final: 12/12/2024

Deseja incluir o horário? s/n n

==============================================  
Data inicial: 01/01/2000 00:00  
Data final: 12/12/2024 00:00

Tempo percorrido: 24 anos, 11 meses e 11 dias.

218688 horas  
9112 dias  
1301 semanas  
303 meses aproximadamente  
24 anos

Deseja repetir? s/n n
```

## 📚 Tecnologias Utilizadas

* Java 21 (`java.time`)
* Programação orientada a objetos

## 📦 Estrutura do Projeto

```
src/
├── program/
│   └── Main.java
└── util/
    └── DateTimeCalculator.java
```

- `Main.java`: Responsável pela interação com o usuário.
- `DateTimeCalculator.java`: Contém a lógica de cálculo usando as classes `LocalDate`, `LocalDateTime`, `Period` e `Duration`.

### Diagrama UML

![Diagrama UML da classe DateTimeFormatter](https://github.com/lucaskauaa/calculadora-tempo-entre-duas-datas/blob/main/img/calculadora-tempo-entre-duas-datas-uml.drawio.png)

## 🧑‍💻 Autor

Desenvolvido por *Lucas Kauã*.
