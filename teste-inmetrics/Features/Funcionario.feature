Feature: Funcionário (Criar / Editar / Excluir)

Scenario: Criar Funcionário
Given launch browser login
When Login
Then Click Novo Usuario
Then Preencher Novo Usuario
Then Verificar Criação Novo Usuario
And Fechar

Scenario: Editar Funcionário
Given launch browser login
When Login
Then Click Editar funcionário
Then Realizar Alteração
Then Verificar Alteração
And Fechar

Scenario: Excluir Funcionário
Given launch browser login
When Login
Then Click Excluir funcionário
Then Verificar Exclusão
And Fechar

