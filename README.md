### 💬 **Explicação Inicial — Métodos em Java (POO)**

Pessoal,  vamos praticar bastante o uso de **métodos** dentro da **Programação Orientada a Objetos** com Java.

Vamos usar tanto **métodos com retorno** (que devolvem algum valor depois de processar algo), quanto **sem retorno** (que apenas executam uma ação, como imprimir algo na tela ou alterar um estado interno). São exercícios simples mas que ajudarão no processo.

A ideia é que vocês comecem a entender como os dados "viajam" de um lugar para outro dentro do programa. Isso é algo que usamos o tempo todo: **mandar informações para um método, fazer ele trabalhar com esses dados e, às vezes, devolver um resultado.**

Esses exercícios vão te ajudar a:

- Criar métodos que recebem e processam valores;
- Entender quando um método precisa ou não devolver algo;
- Praticar a estrutura básica de classes, atributos e comportamentos em POO.

Tudo isso é essencial para a nossa próxima fase na construção de programas mais organizados, reutilizáveis e fáceis de entender utilizando POO.

Bora praticar!

## 📘 **Exercícios de Métodos em Java com POO**

### 🔹 Parte 1: Métodos **sem retorno** (`void`)

obs. Criem get & set para todos

1. **Classe Pessoa**
    
    Crie uma classe `Pessoa` com os atributos `nome` e `idade`. Crie um método `mostrarDados()` que exiba os dados no console.
    
2. **Classe Aluno**
    
    Crie uma classe `Aluno` com atributos `nome` e `nota`. Crie um método `verificarAprovacao()` que exiba se o aluno está aprovado (nota >= 7).
    
3. **Classe Carro**
    
    Crie uma classe `Carro` com atributos `modelo` e `velocidade`. Crie um método `acelerar()` que aumente a velocidade em 10 km/h e exiba a nova velocidade.
    
4. **Classe Lampada**
    
    Crie uma classe `Lampada` com um atributo `ligada`. Crie métodos `ligar()` e `desligar()` que alterem o estado da lâmpada e mostrem no console.
    
5. **Classe ContaBancaria**
    
    Crie uma classe com atributo `saldo`. Crie métodos `sacar(double valor)` e `depositar(double valor)` que modifiquem o saldo e exibam a nova situação.
    
6. **Classe Relogio**
    
    Crie uma classe com atributo `hora`. Crie um método `ajustarHora(int novaHora)` que atualize a hora e exiba no console.
    
7. **Classe Impressora**
    
    Crie uma classe com método `imprimirDocumento(String documento)` que apenas imprime o texto recebido.
    
8. **Classe CalculadoraSimples**
    
    Crie uma classe com método `somar(int a, int b)` que exibe o resultado da soma, sem retornar.
    
9. **Classe Produto**
    
    Crie uma classe com método `exibirPreco()` que mostre o preço do produto no console.
    
10. **Classe Animal**
    
    Crie uma classe com atributo `nome`. Crie um método `emitirSom()` que apenas exibe "Som emitido por [nome]".
    

---

### 🔹 Parte 2: Métodos **com retorno**

1. **Classe Calculadora**
    
    Crie métodos `somar`, `subtrair`, `multiplicar` e `dividir`, todos retornando o resultado da operação.
    
2. **Classe Retangulo**
    
    Crie métodos `calcularArea()` e `calcularPerimetro()` que retornem respectivamente a área e o perímetro do retângulo.
    
3. **Classe Aluno**
    
    Crie método `media()` que retorna a média entre duas notas.
    
4. **Classe ContaBancaria**
    
    Crie método `consultarSaldo()` que retorna o saldo atual da conta.
    
5. **Classe Livro**
    
    Crie método `getTitulo()` que retorna o título do livro.
    
6. **Classe Funcionario**
    
    Crie método `calcularSalarioComBonus(double bonus)` que retorna o salário + bônus.
    
7. **Classe Triangulo**
    
    Crie método `ehTrianguloValido()` que retorna verdadeiro se os lados formarem um triângulo válido.
    
8. **Classe ConversorTemperatura**
    
    Crie método `celsiusParaFahrenheit(double celsius)` que retorna a temperatura convertida.
    
9. **Classe Data**
    
    Crie método `formatarData()` que retorna uma String no formato `dd/mm/yyyy`.
    
10. **Classe Motor**
    
    Crie método `getPotencia()` que retorna a potência do motor.
