# 📱 Desafio - Diagramação de classes do iPhone

## 📋 Descrição
Desafio promovido pela **Digital Innovation One** em parceria com o **Santander**, como parte _Santander
Bootcamp 2023 - Backend Java_, e também em parceria com a **AWS** no âmbito do Bootcamp _Desenvolvimento Java com Cloud
AWS_. **O objetivo deste desafio é representar de forma detalhada e precisa as funcionalidades de um iPhone.**

Este projeto utiliza princípios de programação orientada a objetos e técnicas de modelagem UML para criar uma estrutura
que permite que um dispositivo iPhone desempenhe três funções distintas e cruciais: **Reprodutor Musical**, **Aparelho
Telefônico** e **Navegador na Internet**.




## 📊 Diagrama UML

  <img src="https://i.imgur.com/mhMmDZn.png">

### `iPhone`

A classe `iPhone` é a classe principal que representa o dispositivo como um todo. Ela implementa as interfaces
`ReprodutorMusical`, `AparelhoTelefonico` e `NavegadorInternet`. Isso permite que o iPhone desempenhe os papéis
de reprodutor musical, aparelho telefônico e navegador na Internet.

### `ReprodutorMusical`

A interface `ReprodutorMusical` define os métodos necessários para controlar a reprodução de música, como `tocar()`,
`pausar()` e `selecionarMusica()`. As classes que implementam essa interface são capazes de reproduzir músicas.

### `AparelhoTelefonico`

A interface `AparelhoTelefonico` define os métodos para realizar chamadas telefônicas e enviar mensagens, incluindo
`ligar()`, `atender()` e `iniciarCorreioVoz()`. As classes que implementam essa interface podem funcionar como
dispositivos telefônicos.

### `NavegadorInternet`

A interface `NavegadorInternet` define métodos para a navegação na web, como `exibirPagina()`, `adicionarNovaAba()`
e `atualizarPagina()`. As classes que implementam essa interface podem atuar como navegadores da Internet.

Cada classe ou interface desempenha um papel específico no sistema e contribui para a versatilidade do dispositivo
iPhone, tornando-o capaz de realizar uma variedade de funções.
