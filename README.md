Este projeto consiste em uma API desenvolvida em Java utilizando o framework Spring Boot, destinada ao gerenciamento de produtos. A API fornece endpoints RESTful para realizar operações CRUD (Create, Read, Update, Delete) em um banco de dados de produtos.

Funcionalidades Principais:
Cadastro de Produtos: Permite adicionar novos produtos ao sistema com informações detalhadas como nome, descrição, preço e quantidade em estoque.

Consulta de Produtos: Oferece endpoints para listar todos os produtos cadastrados, bem como buscar produtos por ID ou outros critérios específicos.

Atualização de Produtos: Permite atualizar as informações de um produto existente, como modificar o preço, atualizar a descrição, etc.

Exclusão de Produtos: Permite remover produtos do sistema de forma segura, mantendo a integridade dos dados.

Tecnologias Utilizadas:
Java: Linguagem de programação principal para o desenvolvimento da lógica de negócios da API.

Spring Boot: Framework utilizado para simplificar a configuração e o desenvolvimento de aplicações baseadas em Spring.

Spring Data JPA: Facilita o acesso e a manipulação de dados no banco de dados relacional, usando uma abordagem baseada em Repositórios.

MySQL (ou outro banco de dados relacional): Banco de dados utilizado para armazenar e persistir os dados dos produtos.

RESTful APIs: Utilização de padrões REST para expor endpoints que permitem a interação com a API de forma eficiente e padronizada.

Swagger (Opcional): Pode ser integrado para facilitar a documentação e o teste da API.
