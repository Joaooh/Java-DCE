# Desafios - Java Básico (DCE)

Este repositório reúne exercícios classificados como de dificuldade básica ou intermediária, resolvidos durante as aulas de Java do DCE Mova-se (UniCEUB). Cada exercício propõe a criação de pequenos programas que praticam variáveis, estruturas de controle, entrada de dados, e outros fundamentos da linguagem.

## Índice

* [Desafio 1: Conversor de Temperatura](#desafio-1-conversor-de-temperatura)
* [Desafio 2: Gerador de Mensagem Codificada](#desafio-2-gerador-de-mensagem-codificada)
* [Desafio 3: Contador de Vogais e Consoantes](#desafio-3-contador-de-vogais-e-consoantes)
* [Desafio 4: Calculadora com Funções](#desafio-4-calculadora-com-funções)
* [Desafio 5: Jogo de Adivinhação](#desafio-5-jogo-de-adivinhação)

---

## Desafio 1: Conversor de Temperatura

**Arquivo:** `desafio1_conversor.java`  
**Tópico:** Variáveis e Tipos de Dados

Este exercício propõe a criação de um conversor de temperatura de Celsius para Fahrenheit, utilizando variáveis do tipo `double` e entrada de dados com a classe `Scanner`. O resultado deve ser exibido com duas casas decimais, usando `System.out.printf()`.

### Regras

* Solicitar ao usuário a temperatura em graus Celsius
* Converter para Fahrenheit utilizando a fórmula:
  `F = (C * 9/5) + 32`
* Exibir o resultado formatado com duas casas decimais

### Exemplo

```plaintext
Digite a temperatura em Celsius: 25
25.00°C equivalem a 77.00°F.
```

### Aprendizados

* Declaração e uso de variáveis do tipo `double`
* Operações matemáticas básicas
* Leitura de dados com `Scanner`
* Saída formatada com `System.out.printf()`

---

## Desafio 2: Gerador de Mensagem Codificada

**Arquivo:** `desafio2_codificador.java`  
**Tópicos:** Manipulação de Strings e Arrays, Operações Matemáticas, Conversão de Tipos

Este exercício propõe a criação de um gerador de mensagens codificadas. O programa solicita ao usuário uma palavra e retorna uma mensagem no formato `[primeira letra] [última letra] [quantidade de letras]`.

### Regras

* Solicitar ao usuário uma palavra (`String`)
* Obter:
  - A primeira letra da palavra
  - A última letra da palavra
  - O número total de letras
* Exibir a mensagem codificada no formato:
  `[primeira] [última] [tamanho]`

### Exemplos

```plaintext
Digite uma palavra: banana
Mensagem codificada: b a 6
```

```plaintext
Digite uma palavra: java
Mensagem codificada: j a 4
```

### Aprendizados

* Acesso a caracteres de uma string com `.charAt()`
* Cálculo de tamanho com `.length()`
* Formatação de saída com `System.out.printf()`
* Leitura de entrada com `Scanner`

---

## Desafio 3: Contador de Vogais e Consoantes

**Arquivo:** `desafio3_contador.java`  
**Tópico:** Arrays e Strings

Este exercício propõe a criação de um programa que analisa uma frase digitada pelo usuário e conta quantas vogais e consoantes existem. Espaços e caracteres especiais são ignorados. Para facilitar a comparação, a frase é convertida para minúsculas usando `.toLowerCase()`.

### Regras

- Solicitar uma frase ao usuário
- Contar quantas vogais (a, e, i, o, u) e consoantes existem
- Ignorar espaços e caracteres especiais (como `!`, `?`, `,`)
- Exibir o total de vogais e consoantes separadamente

### Exemplo

```plaintext
Digite uma frase: Olá, mundo!
Vogais: 4
Consoantes: 4
```

### Aprendizados

- Leitura de frases com `Scanner`
- Conversão de texto para minúsculas (`toLowerCase()`)
- Verificação de letras com `Character.isLetter()`
- Uso de `String.indexOf()` para identificar vogais
- Contagem condicional dentro de `for`

> Este exercício pode apresentar comportamentos inesperados ao ser executado diretamente no terminal do Visual Studio Code.
> Caso enfrente problemas, recomenda-se utilizar outra IDE como **IntelliJ**, **Eclipse**, ou um compilador online como [OneCompiler](https://onecompiler.com/java) ou [OnlineGDB](https://www.onlinegdb.com/online_java_compiler).

---

## Desafio 4: Calculadora com Funções

**Arquivo:** `desafio4_calculadora.java`  
**Tópico:** Métodos, Operações Matemáticas e Entrada de Dados

Este exercício propõe a criação de uma calculadora que permite ao usuário escolher uma operação matemática e executa o cálculo usando métodos estáticos separados para cada operação.

### Regras

- Exibir opções de operação: soma, subtração, multiplicação e divisão
- Usar `Scanner` para capturar:
  - A operação escolhida (`+`, `-`, `*`, `/`)
  - Dois números reais (`double`)
- Criar um método estático separado para cada operação
- Chamar o método correspondente com base na escolha do usuário
- Tratar o caso de divisão por zero ou número negativo com uma nova solicitação de entrada

### Exemplo

```plaintext
Escolha uma operação:
+ -> Soma
- -> Subtração
* -> Multiplicação
/ -> Divisão

Digite um número: 10
Digite outro número: 2
Resultado: 5.0
```

### Aprendizados

- Declaração e uso de métodos estáticos
- Encapsulamento de lógica em funções reutilizáveis
- Estrutura condicional (`if/else if/else`)
- Leitura de entradas numéricas e textuais com `Scanner`
- Validação de entrada (divisão por zero ou número negativo)

---

## Desafio 5: Jogo de Adivinhação

**Arquivo:** `desafio5_random.java`  
**Tópico:** Laços de Repetição, Condicional e Números Aleatórios

Este exercício propõe a criação de um jogo em que o usuário deve adivinhar um número secreto gerado aleatoriamente entre 1 e 100. O jogador tem até 5 tentativas, recebendo dicas a cada erro.

### Regras

- Gerar um número aleatório entre 1 e 100 usando `Random`
- Permitir até 5 tentativas para o usuário adivinhar
- Após cada tentativa incorreta, exibir uma dica:
  - “O número é MAIOR que X” ou “MENOR que X”
- Se o usuário acertar, exibir: “Você venceu!”
- Se esgotar as tentativas, exibir: “Você perdeu! O número era X”

### Exemplo

```plaintext
Tentativa 1/5: Digite um palpite: 50
Dica: O número é MAIOR que 50.

Tentativa 2/5: Digite um palpite: 75
Dica: O número é MENOR que 75.

Tentativa 3/5: Digite um palpite: 63
Você venceu! O número era 63.
```

### Aprendizados

- Geração de números aleatórios com `Random`
- Controle de tentativas com `while`
- Comparação de valores e uso de `if/else`
- Lógica de repetição com contadores
- Exibição de mensagens condicionais

## Como executar qualquer exercício

1. Compile o arquivo Java:

   ```bash
   javac desafioX_nome.java
   ```

2. Execute o programa compilado:

   ```bash
   java desafioX_nome
   ```
