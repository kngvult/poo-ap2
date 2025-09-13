# Sistema de Gerenciamento de Veículos
Este projeto implementa um sistema simples de gerenciamento de veículos utilizando conceitos de Programação Orientada a Objetos em Java.

## Estrutura do Projeto
```
sistema-veiculos/
├── src/
│   ├── Veiculo.java
│   ├── Carro.java
│   ├── Moto.java
│   └── Main.java
└── README.md
``` 
## Descrição das Classes
## 1. Veiculo (Classe Abstrata)
A classe base abstrata que define os atributos e métodos comuns a todos os veículos.

**Atributos:**

- `marca` (público): Marca do veículo
- `modelo` (público): Modelo do veículo
- `ano` (privado): Ano de fabricação

**Métodos:**

- `informacoesVeiculo()`: Método abstrato que retorna informações do veículo
- `getAno()`: Retorna o ano do veículo
- `setAno(int ano)`: Define o ano do veículo

## 2. Carro (Subclasse de Veiculo)
Classe que representa um carro, herdando de Veiculo.

**Atributo adicional:**

- `numeroPortas` (público): Número de portas do carro
- `tipoCombustivel` (publico): Tipo de combustível (Flex, Gasolina, Elétrico, etc.)
- `temSensorEstacionamento` (público): Indica se possui sensor de estacionamento 
- `capacidadePortaMalas` (público): Capacidade do porta-malas em litros

**Método implementado:**

- `informacoesVeiculo()`: Retorna todas as informações do carro

## 3. Moto (Subclasse de Veiculo)
Classe que representa uma moto, herdando de Veiculo.

**Atributo adicional:**

- `cilindrada` (privado): Cilindrada da moto em cc
- `tipoPartida` (privado): Tipo de partida (Elétrica, Pedal, etc.)
- `temABS` (privado): Indica se possui sistema ABS
- `pesoSeco` (privado): Peso seco da moto em kg

**Métodos:**

- `informacoesVeiculo()`: Retorna todas as informações da moto
- `getCilindrada()`, `setCilindrada(int cilindrada)`: Acessam a cilindrada
- `getTipoPartida()`, `setTipoPartida(String tipoPartida)`: Acessam o tipo de partida
- `getPesoSeco()`, `setPesoSeco(double pesoSeco)`: Acessam o peso seco
- `setTemABS(boolean temABS)`: Define se possui ABS

## 4. Main (Classe Principal)
Classe principal que demonstra o uso do sistema.

## Como Executar o Projeto

<ol>
<li>Navegue até a pasta do projeto:</li>

```
cd sistema-veiculos/src
```
<li>Compile todos os arquivos Java:</li>

```
javac *.java
```
<li>Execute a classe principal:</li>

```
java Main
```
<li>Saída esperada:</li>

```
===== Informações do Carro =====
Marca: Honda
Modelo: City Sedan
Ano: 2025
Número de Portas: 4
Tipo de Combustível: Flex
Sensor de Estacionamento: Sim
Capacidade do Porta-Malas: 519 litros

===== Informações da Moto =====
Marca: Royal Enfield
Modelo: Hunter
Ano: 2025
Cilindrada: 350cc
Tipo de Partida: Elétrica
ABS: Sim
Peso Seco: 181.0 kg
```
</ol>

## Conceitos de POO Aplicados

- **Classes Abstratas:** A classe `Veiculo` é abstrata e define a estrutura base.
- **Herança:** `Carro` e `Moto` herdam de Veiculo.
- **Polimorfismo:** Implementação do método `informacoesVeiculo()` de forma diferente em cada subclasse.

## Personalização do Código
Você pode modificar os valores dos veículos no arquivo `Main.java`:

```java
// Para modificar o carro
carro.marca = "NovaMarca";
carro.modelo = "NovoModelo";
carro.setAno(2023);
carro.numeroPortas = 2;
carro.tipoCombustivel = "Flex";
carro.temSensorEstacionamento = false;
carro.capacidadePortaMalas = 350;

// Para modificar a moto
moto.marca = "NovaMarcaMoto";
moto.modelo = "NovoModeloMoto";
moto.setAno(2023);
moto.setCilindrada(109);
moto.setTipoPartida("Pedal");
moto.setTemABS(false);
moto.setPesoSeco(150.5);
```

## Requisitos do Sistema
- Java JDK 8 ou superior
- Sistema operacional: Windows, macOS ou Linux

## Autora
Ana Quézia de Oliveira Souza