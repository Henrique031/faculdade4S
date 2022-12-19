import pymysql
conexao = pymysql.connect(db='escola', user='root', passwd='toor')
cursor = conexao.cursor()

# Mostrar tabela alunos.
cmd = 'SELECT * FROM tbl_alunos' 
cursor.execute(cmd)
resultado1 = cursor.fetchall() 
print('ra / nome / email / idade / pk_aluno / fk_aluno')
for linha1 in resultado1 :
     print(linha1)
     
print('')

#Pesquisar o ra do aluno com else no final caso não seja encontrado o valor digitado.
print('Busca por RA')
ra = input('Entre com o RA do Aluno: ')
cmd1 = 'SELECT nome FROM tbl_alunos where ra = '+ra
cursor.execute(cmd1)
resultado = cursor.fetchall()
if len(resultado)> 0:
    print('Busca por RA:')
    print('ra / nome')
    for linha in resultado :
        print(linha)
else:
    print('RA não encontrado')
    
print('')

#Inclusão de novos alunos que não existão no banco
print('Inclusão de alunos')
ra = input('Entre com o RA do Aluno: ')
cmd2 = 'SELECT nome FROM tbl_alunos where ra = '+ra
cursor.execute(cmd2)
resultado = cursor.fetchall()
if len(resultado) == 0:
     print('Aluno novo detectado!')
     ra = input('Entre com o RA do Aluno: ')
     nome = input('Entre com o Nome do Aluno: ')
     email = input('Entre com o email do aluno: ')
     idade = input ('Entre com a Idade do Aluno: ')
     cmd3 = 'INSERT INTO tbl_alunos (ra, nome, email, idade) Values ('+ra+', "'+nome+'", "'+email+'", '+idade+');'
     #print(cmd3)
     cursor.execute(cmd3)
     conexao.commit()
     print('INSERIDO COM SUCESSO!')
     print('RA: '+ra+' Nome: '+nome+' Idade: '+idade+ ' Email: '+email)
     cmd = 'SELECT ra, nome, email, idade FROM tbl_alunos'
     cursor.execute(cmd)
     resultado1 = cursor.fetchall()
     print('')
     for linha1 in resultado1:
         print(linha1)
else:
     print('RA informado já existe')

print("")

# Exclusão de Aluno pelo RA.
print('Exclusão de Aluno pelo RA')
ra = input('Entre com o RA do Aluno: ')
cmd = 'SELECT ra FROM tbl_alunos WHERE ra = '+ra
cursor.execute(cmd)
resultado = cursor.fetchall()
if len(resultado) == 0:
     print('RA não existente. Não é possível excluir')
else:
     print('Exclusão de Aluno:')
     cmd2 = 'DELETE FROM tbl_alunos WHERE ra = '+ ra
     #print(cmd2)
     cursor.execute(cmd2)
     conexao.commit()
     print('Aluno com RA: '+ra+' excluído com SUCESSO!')
     print('')
     cmd = 'SELECT ra, nome, email, idade FROM tbl_alunos'
     cursor.execute(cmd)
     resultado1 = cursor.fetchall()
     print('')
     for linha1 in resultado1:
         print(linha1)

print('')

# Alteração de tabela
print('Alteração de uma coluna da tabela')
ra = input('Entre com o RA do aluno:')
cmd = 'SELECT ra FROM tbl_alunos WHERE ra = '+ra
cursor.execute(cmd)
resultado = cursor.fetchall()
if len(resultado) == 0:
     print('RA não existente. Não é possível alterar')
else:
     print('Alteração de Aluno: ')
     ra = input('Entre com o NOVO ra do aluno: ')
     nome = input('Entre com o NOVO nome do aluno: ')
     email = input('Entre com o NOVO email do aluno: ')
     idade = input('Entre com o NOVA idade do aluno: ')
     cmd2 = 'UPDATE tbl_alunos SET ra = '+ra+', nome = "'+nome+'", email = "'+email+'", idade = ' +idade+ ' WHERE ra = '+ra
     #print(cmd2)
     cursor.execute(cmd2)
     conexao.commit()
     print('RA: '+ra+' alterado com SUCESSO!')
     print('')
     cmd = 'SELECT ra, nome, email, idade FROM tbl_alunos'
     cursor.execute(cmd)
     resultado1 = cursor.fetchall()
     print('')
     for linha1 in resultado1:
         print(linha1)
conexao.close()
