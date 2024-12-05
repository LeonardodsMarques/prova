# Projeto Consulta

## Estrutura Básica

Uma classe deve ser declarada da seguinte forma:

```java
package modelo; // Nome da pasta 

public class Inquilino { // Nome do arquivo e da classe
    // Definição de atributos e métodos
}
```

## Sintaxe Padrão

A sintaxe para implementação das classes segue este padrão:

```java
TipoDeAcesso TipoDoValor NomeDaVariavel(ParametrosTipo parametrosNome)*{
    // Lógica com Return do Valor
}*
```

### Exemplo de Implementação de Variável

```java
private String nome; // Variável de acesso de valor de uma classe sem a necessidade de um tipo de retorno, pois retorna o proprio valor.
```

### Exemplo de Implementação de Método

```java
public void setNome(String nome) {
    this.nome = nome;
}
```
// Retorno do tipo Void implica em nenhum retorno, serve para fazer alterações sem a necessidade de retornar algo.
// Este método recebe 'nome' como variável e a atribui à classe com o 'this', que representa a instância atual da classe.

### Exemplo de Método de Retorno

```java
public String getNome() {
    return nome; // Valor acessado de dentro do objeto, conseguindo acessar valores privados da classe
}
```

### Exemplo de Uso

```java
Pessoa pessoa = new Pessoa(); // Construtor vazio padrão
pessoa.setNome("Isa");
```
// Atribui o valor "Isa" para a variável 'nome' da instância 'pessoa'.

## Estrutura do Projeto

O projeto está organizado da seguinte forma:

```
projeto-consulta/
  modelos/
    Apartamento.java
    ApartamentoTipoA.java
    ApartamentoTipoB.java
    Predio.java
    Inquilino.java
  telas/
    Tela.java
```

### Classes e Relações

#### Predio

- Um **Prédio** pode conter vários ou nenhum apartamento.
- Representação em **Predio.java**:

```java
// Linha 8 - Predio.java
private List<Apartamento> apartamentos;
```

#### Apartamento

- Um **Apartamento** está associado a apenas um **Prédio** e um **Inquilino**.
- Representação em **Apartamento.java**:

```java
// Linhas 7 e 8 - Apartamento.java
private Predio predio;
private Inquilino inquilino;
```

#### ApartamentoTipoA e ApartamentoTipoB

- **ApartamentoTipoA** e **ApartamentoTipoB** são classes que estendem **Apartamento**.
- Representação em **ApartamentoTipoA.java** e **ApartamentoTipoB.java**:

```java
// Linha 3 - ApartamentoTipoA.java
public class ApartamentoTipoA extends Apartamento {
    // Implementações específicas do Tipo A
}
```

```java
// Linha 3 - ApartamentoTipoB.java
public class ApartamentoTipoB extends Apartamento {
    // Implementações específicas do Tipo B
}
```

#### Inquilino

- Um **Inquilino** está associado a apenas um **Apartamento**.
- Representação em **Inquilino.java**:

```java
// Linha 5 - Inquilino.java
private Apartamento apartamento;
```

Estrutura de manipulação dos valores em lista

    public void addApartamento(Apartamento apartamento) {
        apartamentos.add(apartamento);
    }

    // recebe o objeto apartamento e adiciona na lista de apartamentos

    public void removeApartamento(Apartamento apartamento){
        apartamentos.remove(apartamento);
    }

    // recebe o objeto apartamento e remove da lista de apartamentos

Estrutura de itens individuais

    public void setInquilino(Inquilino inquilino) {
        this.inquilino = inquilino;
        inquilino.setApartamento(this);
    }

    // adiciona inquilo ao valor do predio e chama a função setApartamento passando apartamento como parametro

    public void setApartamento(Apartamento apartamento) {
        this.apartamento = apartamento;
    }

    // dentro de inquilino adiciona apartamento ao inquilino

    public void removeInquilino(){
        this.inquilino = null;
    }

    // atribui null ao valor inquilino