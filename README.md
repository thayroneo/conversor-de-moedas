# Conversor de Moedas em Java

Este projeto Java tem como objetivo implementar um conversor de moedas utilizando a ExchangeRate-API para obter taxas de câmbio atualizadas. Ele permite converter entre algumas moedas específicas e foi desenvolvido como parte de um exercício de aprendizado.

## Tecnologias Utilizadas

- Java
- Java Standard Library (HttpClient, JSON)
- ExchangeRate-API

## Autor
José Tayrone Santos de Oliveira

## Funcionalidades

- Conversão entre as seguintes moedas:
  - Dólar (USD)
  - Peso Argentino (ARS)
  - Real Brasileiro (BRL)
  - Peso Colombiano (COP)
- Interface simples através da linha de comando.
- Utilização da API ExchangeRate-API para obter as taxas de câmbio.

## Configuração

Antes de executar o programa, certifique-se de configurar sua chave de API e a URL base da API no arquivo `config.properties`. Coloque este arquivo na pasta `src/main/resources` com o seguinte formato:

```
api_key=34adc1b5c43c9416ed028be0
api_url=https://v6.exchangerate-api.com/v6/
```

## Como Executar

1. Clone o repositório para sua máquina local:

   ```bash
   git clone https://github.com/thayroneo/conversor-de-moedas.git

2. Importe o projeto para sua IDE Java (Eclipse, IntelliJ, ...).

3. Configure o arquivo config.properties.

4. Execute a classe Main para dar iniciar ao programa.

## Exemplo de Uso

Ao iniciar o programa, você verá um menu interativo onde pode escolher a conversão desejada e inserir o valor a ser convertido. Por exemplo:
```bash
*******************************************************
Bem vindo ao Conversor de Moeda!
*******************************************************
        1) Dólar (USD) -> Peso Argentino (ARS)
        2) Peso Argentino (ARS) -> Dólar (USD)
        3) Dólar (USD) -> Real Brasileiro (BRL)
        4) Real Brasileiro (BRL) -> Dólar (USD)
        5) Dólar (USD) -> Peso Colombiano (COP)
        6) Peso Colombiano (COP) -> Dólar (USD)
        9) Sair
*******************************************************
Digite a opção desejada: 3
Digite o valor a ser convertido: 10
10,0000 USD é igual a 54,3910 BRL
```

## Contribuições

Contribuições são bem-vindas! Se você encontrar algum problema ou tiver sugestões de melhorias, sinta-se à vontade para abrir uma issue ou enviar um pull request.

