Feature: Funcionário (Criar / Editar / Excluir)

Scenario: Criar Funcionário
Given launch browser login
When Login
Then Click Novo Usuario
Then Preencher Novo Usuario
Then Verificar Criação Novo Usuario
And Fechar

