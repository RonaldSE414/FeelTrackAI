# 🧠 FeelTrackAI
### Sistema Inteligente para Monitoramento e Análise do Bem-Estar Emocional no Ambiente Corporativo

---

# 📋 Sobre o Projeto

O **FeelTrackAI** é uma aplicação desktop desenvolvida em Java com o objetivo de auxiliar empresas no acompanhamento do estado emocional de seus colaboradores.

Através de questionários de autoavaliação, o sistema coleta informações relacionadas ao bem-estar emocional dos usuários e utiliza uma camada de análise para apresentar resultados e recomendações que auxiliam na identificação de possíveis situações de estresse, fadiga emocional e desmotivação.

O projeto foi desenvolvido como atividade acadêmica do curso de Engenharia de Software, integrando conhecimentos de:

- Programação Orientada a Objetos (POO)
- Interfaces Gráficas com Java Swing
- Banco de Dados PostgreSQL
- Arquitetura MVC
- Padrões de Projeto
- Persistência de Dados

---

# 👨‍💻 Autores

- Alisson Araújo
- Arthur Oliveira
- Marcos Vynicios
- Vladimir Gustavo
- Ronald Machado
- Mikaella Martins
- Francisco Lemos

---

# 🎯 Objetivo Geral

Desenvolver uma solução computacional capaz de auxiliar no monitoramento do bem-estar emocional dos colaboradores por meio da coleta e análise de informações emocionais, contribuindo para a promoção da saúde mental no ambiente organizacional.

---

# 🎯 Objetivos Específicos

- Permitir cadastro de usuários.
- Realizar autenticação de acesso.
- Aplicar questionários emocionais.
- Registrar respostas dos usuários.
- Gerar resultados emocionais.
- Exibir recomendações personalizadas.
- Armazenar informações em banco de dados PostgreSQL.
- Aplicar padrões arquiteturais estudados em sala de aula.

---

# 🛠 Tecnologias Utilizadas

## Linguagem de Programação

- Java

## Interface Gráfica

- Java Swing

## Banco de Dados

- PostgreSQL

## IDE

- Apache NetBeans

## Controle de Versão

- Git
- GitHub

---

# 🏛 Arquitetura do Sistema

O projeto foi desenvolvido utilizando a arquitetura **MVC (Model-View-Controller)**, promovendo a separação das responsabilidades da aplicação.

```text
VIEW
 ↓
CONTROLLER
 ↓
DAO
 ↓
DATABASE
```

Essa arquitetura proporciona:

- Organização do código
- Facilidade de manutenção
- Reutilização de componentes
- Escalabilidade

---

# 📂 Estrutura do Projeto

A organização do código-fonte está estruturada da seguinte forma:

```text
src
│
├── app
│   ├── FeelTrackIA.java
│   └── Main.java
│
├── components
│   ├── AnimatedBreathingPanel.java
│   ├── GradientPanel.java
│   ├── ModernButton.java
│   ├── ModernPasswordField.java
│   ├── ModernTextField.java
│   └── RoundedPanel.java
│
├── controller
│   ├── CadastroController.java
│   ├── LoginController.java
│   └── AssistenteController.java
│
├── dao
│   └── UsuarioDAO.java
│
│
├── model
│   ├── AnaliseTextoIA.java
│   ├── EstadoEmocional.java
│   ├── HistoricoEmocional.java
│   ├── HumorIA.java
│   ├── MensagemIA.java
│   ├── Questionario.java
│   ├── Resultado.java
│   ├── RespostaIA.java
│   └── Usuario.java
│
├── service
│   ├── AnaliseIAService.java
│   └── AssistenteEmocionalService.java
│
├── util
│   ├── ConnectionFactory.java
│   └── Sessao.java
│
└── view
    ├── AssistenteIAView.java
    ├── CadastroView.java
    ├── DashboardView.java
    ├── HomeView.java
    ├── LoginView.java
    ├── QuestionarioView.java
    └── ResultadoIAView.java
```

---

# 🧩 Padrões de Projeto Utilizados

## MVC (Model - View - Controller)

O padrão MVC foi utilizado para separar a aplicação em três camadas principais:

### Model

Responsável pelos dados da aplicação.

Classes:

```text
Usuario
Questionario
Resultado
EstadoEmocional
HistoricoEmocional
HumorIA
RespostaIA
MensagemIA
AnaliseTextoIA
```

---

### View

Responsável pela interface gráfica.

Classes:

```text
HomeView
AssistenteIAView
LoginView
CadastroView
DashboardView
QuestionarioView
ResultadoIAView
```

---

### Controller

Responsável pela lógica de negócio e comunicação entre View e DAO.

Classes:

```text
CadastroController
LoginController
AssistenteController
```

---

## DAO (Data Access Object)

O padrão DAO foi utilizado para centralizar o acesso ao banco de dados.

Classe:

```text
UsuarioDAO
```

Responsabilidades:

- Inserção de usuários
- Consulta de usuários
- Autenticação
- Persistência dos dados

Benefícios:

- Baixo acoplamento
- Maior organização
- Facilidade de manutenção

---

## Singleton

O padrão Singleton foi aplicado à classe:

```text
ConnectionFactory
```

Objetivo:

Garantir um único ponto centralizado de acesso às configurações do banco de dados.

Vantagens:

- Redução de conexões desnecessárias
- Centralização das configurações
- Melhor gerenciamento dos recursos

---

# 🗄 Banco de Dados

## SGBD Utilizado

PostgreSQL

## Banco de Dados

```text
feeltrack
```

---

# 📊 Modelo Relacional

## Tabela Usuario

| Campo | Tipo |
|---------|---------|
| id | SERIAL |
| nome | VARCHAR(150) |
| email | VARCHAR(150) |
| senha | VARCHAR(255) |
| tipo | VARCHAR(30) |

---

## Tabela Questionario

| Campo | Tipo |
|---------|---------|
| id | SERIAL |
| usuario_id | INTEGER |
| estresse | INTEGER |
| cansaco | INTEGER |
| motivacao | INTEGER |
| data_resposta | TIMESTAMP |

---

## Tabela Resultado

| Campo | Tipo |
|---------|---------|
| id | SERIAL |
| questionario_id | INTEGER |
| nivel_estresse | INTEGER |
| estado | VARCHAR(50) |
| recomendacao | TEXT |

---

# 🔗 Relacionamentos

```text
USUARIO
   │
   │ faz
   ▼
QUESTIONARIO
   │
   │ gera
   ▼
RESULTADO
```

### Cardinalidade

```text
USUARIO (1) -------- (N) QUESTIONARIO

QUESTIONARIO (1) -------- (1) RESULTADO
```

---

# ⚙ Funcionalidades Implementadas

## Cadastro de Usuários

Permite o registro de novos usuários contendo:

- Nome
- E-mail
- Senha
- Tipo de usuário

---

## Login

Autenticação através de:

- E-mail
- Senha

---

## Dashboard

Tela principal de acompanhamento do sistema.

Permite:

- Visualização de informações gerais
- Navegação entre funcionalidades
- Acesso ao questionário emocional

---

## Questionário Emocional

Coleta informações relacionadas ao estado emocional do usuário.

Indicadores avaliados:

- Estresse
- Cansaço
- Motivação

---

## Resultado da Análise

Após o preenchimento do questionário o sistema apresenta:

- Nível emocional identificado
- Estado emocional
- Recomendações de bem-estar

---

# 📸 Capturas de Tela

## 🏠 Tela Inicial

Tela de entrada do sistema, responsável por apresentar a proposta do FeelTrackAI e fornecer acesso às funcionalidades de login e cadastro.

<img width="100%" alt="Tela Inicial" src="https://github.com/user-attachments/assets/3fbe2e61-9229-47b9-9201-012af6b66212" />

---

## 🔐 Tela de Login

Tela responsável pela autenticação dos usuários cadastrados no sistema.

<img width="100%" alt="Tela de Login" src="https://github.com/user-attachments/assets/d75cbf88-83d5-4f50-b6b0-7f6395a39f1d" />

---

## 📊 Dashboard

Painel principal do sistema, apresentando informações gerais e acesso às funcionalidades disponíveis.

<img width="100%"  alt="Captura de tela 2026-06-03 181144" src="https://github.com/user-attachments/assets/34ffb3b5-d1d6-46ff-b8b6-879c9283b82a" />

---

## 🤖 AssistenteIA

Tela voltada para interação da IA com o usuário. 

<img width="100%"  alt="Captura de tela 2026-06-03 181228" src="https://github.com/user-attachments/assets/f4dc5940-e492-4ffe-9587-e59eac90bb03" />

---

## 📝 Questionário Emocional

Tela destinada ao preenchimento do questionário utilizado para coleta de informações emocionais dos usuários.

<img width="100%" alt="Questionário Emocional" src="https://github.com/user-attachments/assets/85dc489f-23d0-46c3-92b7-3094f5b53813" />

---

# 🚀 Como Executar o Projeto

## 1. Clonar o Repositório

```bash
git clone URL_DO_REPOSITORIO
```

---

## 2. Abrir no NetBeans

```text
Arquivo → Abrir Projeto
```

---

## 3. Criar o Banco de Dados

```sql
CREATE DATABASE feeltrack;
```

---

## 4. Executar o Script DDL

Criar as tabelas:

- usuario
- questionario
- resultado

---

## 5. Configurar o ConnectionFactory

```java
private static final String URL =
"jdbc:postgresql://localhost:5432/feeltrack";

private static final String USER =
"postgres";

private static final String PASSWORD =
"SUASENHA";
```

---

## 6. Executar o Sistema

Executar a classe:

```text
Main.java
```

---

# 📈 Resultados Obtidos

O sistema desenvolvido atende aos requisitos propostos para o projeto, possibilitando:

- Cadastro de usuários
- Autenticação
- Aplicação de questionários emocionais
- Geração de resultados
- Persistência em banco PostgreSQL
- Utilização de padrões de projeto

A adoção dos padrões MVC, DAO e Singleton proporcionou uma estrutura organizada e alinhada às boas práticas de desenvolvimento de software.

---

# 📚 Considerações Finais

O FeelTrackAI representa uma aplicação prática dos conhecimentos adquiridos durante a graduação em Engenharia de Software, integrando desenvolvimento desktop, banco de dados, arquitetura de software e padrões de projeto em uma solução voltada para o acompanhamento do bem-estar emocional dos colaboradores.

O projeto demonstra a importância da tecnologia como ferramenta de apoio à promoção da saúde emocional e qualidade de vida dentro das organizações.

---

## 🎓 Curso

Engenharia de Software

## 📅 Ano

2026

## 📌 Versão

1.0
