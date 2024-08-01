## Desenvolvedores:

Lucas Alcantara &&
Maria Elizabeth

# Implementação do Padrão de Projeto Composite

Este projeto demonstra o uso do padrão de projeto Composite em Java. O padrão Composite permite construir estruturas complexas de objetos que podem ser tratados de forma uniforme, permitindo que clientes tratem objetos individuais e composições de objetos de maneira uniforme.

## Estrutura do Projeto

![UML DEOO](https://github.com/user-attachments/assets/f44a4689-e03a-4786-8290-eeeebe4ac41f)


O projeto está organizado nos seguintes pacotes e classes:

- **Model**
  - `IArquivo`: Uma interface que define as operações comuns para arquivos e diretórios.
  - `Diretorio`: Uma classe que representa um diretório, que pode conter outros diretórios e documentos.
  - `Documento`: Uma classe que representa um arquivo de documento com conteúdo.

- **View**
  - `ClientCode`: Uma classe que fornece uma interface de usuário para interagir com a estrutura de diretórios.

## Padrão de Projeto: Composite

O padrão Composite é usado aqui para representar tanto documentos individuais (`Documento`) quanto diretórios (`Diretorio`) que podem conter múltiplos arquivos ou outros diretórios. Este padrão de design simplifica a interação com estruturas semelhantes a sistemas de arquivos, como demonstrado neste projeto.

### Componentes

- **Componente (IArquivo)**: Uma interface para objetos na composição. Declara operações comuns para objetos simples e complexos.

- **Folha (Documento)**: Representa os objetos folha na composição. Um objeto folha não possui filhos.

- **Composite (Diretorio)**: Define o comportamento para componentes que têm filhos e armazena componentes filhos. Implementa operações relacionadas a filhos na interface do componente.
