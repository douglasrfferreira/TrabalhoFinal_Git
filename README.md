# TrabalhoFinal_Git
🧮 Projeto Calculadora em Java (com operações separadas)

Este projeto implementa uma calculadora simples usando Java, com cada operação representada em uma classe específica (Somar, Subtrair, Multiplicar, Dividir).
A calculadora utiliza princípios de orientação a objetos, incluindo polimorfismo, interfaces e organização em pacotes.

👤 Participação / Cooperação no Projeto - Douglas Rafael Ferreira

Eu, Douglas Rafael Ferreira, realizei as seguintes contribuições no desenvolvimento deste projeto:

✔ Criação da base do projeto

Criei o repositório no GitHub

Clonei o repositório para minha máquina usando git clone

Criei o projeto no IntelliJ IDEA

✔ Estruturação do código

Organizei toda a estrutura de pastas, incluindo:

/calculadora

/operacao

/soma

/subtrair

/dividir

/multiplicar

✔ Implementações realizadas

Implementei diretamente:

A classe Calculadora (classe principal)

Após isso, subi os arquivos no Github via terminal bash utilizando os comandos git add.,git commit -m descrevendo as alteraçoes e git push

Após as implementações do outro participante (Jean Guilher), atualizei o projeto via terminal atraves do comando git pull e implementei a Classe Dividir

Essas classes constituem partes essenciais do funcionamento do sistema.

🛠️ Comandos Git utilizados

Durante o desenvolvimento, utilizei os seguintes comandos:

git clone <url-do-repositorio>
git add .
git commit -m "<mensagem do commit>"
git push origin main

📜 Logs utilizados no git bash:

dougl@DESKTOP-9HQ3HKE MINGW64 ~ (main)
$ git clone git@github.com:douglasrfferreira/TrabalhoFinal_Git.git
Cloning into 'TrabalhoFinal_Git'...
remote: Enumerating objects: 3, done.
remote: Counting objects: 100% (3/3), done.
remote: Total 3 (delta 0), reused 0 (delta 0), pack-reused 0 (from 0)
Receiving objects: 100% (3/3), done.

dougl@DESKTOP-9HQ3HKE MINGW64 ~ (main)
$ git add .


dougl@DESKTOP-9HQ3HKE MINGW64 ~ (main)
$ cd TrabalhoFinal_Git

dougl@DESKTOP-9HQ3HKE MINGW64 ~/TrabalhoFinal_Git (main)
$ git add .
warning: in the working copy of '.idea/misc.xml', LF will be replaced by CRLF the next time Git touches it
warning: in the working copy of 'untitled/.gitignore', LF will be replaced by CRLF the next time Git touches it
warning: in the working copy of 'untitled/src/Main.java', LF will be replaced by CRLF the next time Git touches it

dougl@DESKTOP-9HQ3HKE MINGW64 ~/TrabalhoFinal_Git (main)
$ git commit -m "Cria projeto, implementa classe Calculadora (Principal), cria estrutura do projeto"
[main 492ddd6] Cria projeto, implementa classe Calculadora (Principal), cria estrutura do projeto
 18 files changed, 173 insertions(+)
 create mode 100644 .idea/.gitignore
 create mode 100644 .idea/misc.xml
 create mode 100644 .idea/modules.xml
 create mode 100644 .idea/vcs.xml
 create mode 100644 TrabalhoFinal_Git.iml
 create mode 100644 untitled/.gitignore
 create mode 100644 untitled/.idea/.gitignore
 create mode 100644 untitled/.idea/misc.xml
 create mode 100644 untitled/.idea/modules.xml
 create mode 100644 untitled/.idea/vcs.xml
 create mode 100644 untitled/src/Calculadora.java
 create mode 100644 untitled/src/Dividir.java
 create mode 100644 untitled/src/Main.java
 create mode 100644 untitled/src/Multiplicar.java
 create mode 100644 untitled/src/Operacao.java
 create mode 100644 untitled/src/Somar.java
 create mode 100644 untitled/src/Subtrair.java
 create mode 100644 untitled/untitled.iml

dougl@DESKTOP-9HQ3HKE MINGW64 ~/TrabalhoFinal_Git (main)
$ git push
Enumerating objects: 24, done.
Counting objects: 100% (24/24), done.
Delta compression using up to 12 threads
Compressing objects: 100% (18/18), done.
Writing objects: 100% (23/23), 3.30 KiB | 563.00 KiB/s, done.
Total 23 (delta 4), reused 0 (delta 0), pack-reused 0 (from 0)
remote: Resolving deltas: 100% (4/4), done.
To github.com:douglasrfferreira/TrabalhoFinal_Git.git
   b793a94..492ddd6  main -> main

dougl@DESKTOP-9HQ3HKE MINGW64 ~/TrabalhoFinal_Git (main)
$ git pull
remote: Enumerating objects: 15, done.
remote: Counting objects: 100% (15/15), done.
remote: Compressing objects: 100% (7/7), done.
remote: Total 8 (delta 1), reused 8 (delta 1), pack-reused 0 (from 0)
Unpacking objects: 100% (8/8), 1.06 KiB | 18.00 KiB/s, done.
From github.com:douglasrfferreira/TrabalhoFinal_Git
   492ddd6..9e5d5cd  main       -> origin/main
Updating 492ddd6..9e5d5cd
Fast-forward
 untitled/src/Multiplicar.java | 6 +++++-
 untitled/src/Operacao.java    | 5 ++++-
 untitled/src/Somar.java       | 7 ++++++-
 untitled/src/Subtrair.java    | 6 +++++-
 4 files changed, 20 insertions(+), 4 deletions(-)

dougl@DESKTOP-9HQ3HKE MINGW64 ~/TrabalhoFinal_Git (main)
$ git add .

dougl@DESKTOP-9HQ3HKE MINGW64 ~/TrabalhoFinal_Git (main)
$ git commit -m "Implementa classe dividir"
[main d233a8f] Implementa classe dividir
 1 file changed, 7 insertions(+), 1 deletion(-)

dougl@DESKTOP-9HQ3HKE MINGW64 ~/TrabalhoFinal_Git (main)
$ git push
Enumerating objects: 9, done.
Counting objects: 100% (9/9), done.
Delta compression using up to 12 threads
Compressing objects: 100% (5/5), done.
Writing objects: 100% (5/5), 633 bytes | 633.00 KiB/s, done.
Total 5 (delta 2), reused 0 (delta 0), pack-reused 0 (from 0)
remote: Resolving deltas: 100% (2/2), completed with 2 local objects.
To github.com:douglasrfferreira/TrabalhoFinal_Git.git
   9e5d5cd..d233a8f  main -> main

📜 E por fim, editei o Readme do repositório descrevendo minha participação no projeto

📄 README.md – Calculadora em Java
🧮 Projeto Calculadora em Java (com operações separadas)

Este projeto implementa uma calculadora simples em Java, estruturada de forma modular, com cada operação representada em uma classe específica.
O sistema utiliza orientação a objetos, interface Operacao, polimorfismo e organização limpa de pastas.


🧑‍💻 Jean Guilherme
✔ Atualização do repositório

Clonou o repositório com git clone

Após as alterações feitas por Douglas, atualizou seu repositório local com:

git pull

✔ Implementações realizadas

Jean implementou as seguintes classes fundamentais para o funcionamento do projeto:

Operacao (interface base)

Somar

Subtrair

Multiplicar

Essas classes completam a lógica de operações básicas da calculadora.

✔ Envio das alterações ao GitHub

Após desenvolver suas classes, ele utilizou:

git add .
git commit -m "mensagem"
git push origin main

✔ Contribuição no README

Editou este README, documentando sua participação no projeto.

🛠 Logs utilizados pelos participante:
📄 README.md – Calculadora em Java
🧮 Projeto Calculadora em Java (com operações separadas)

Este projeto implementa uma calculadora simples em Java, estruturada de forma modular, com cada operação representada em uma classe específica.
O sistema utiliza orientação a objetos, interface Operacao, polimorfismo e organização limpa de pastas.



Usuario@DESKTOP-9FTOCQT MINGW64 ~/TrabalhoFinal_Git (main)
$ git push
Enumerating objects: 15, done.
Counting objects: 100% (15/15), done.
Delta compression using up to 4 threads
Compressing objects: 100% (8/8), done.
Writing objects: 100% (8/8), 1.08 KiB | 1.08 MiB/s, done.
Total 8 (delta 1), reused 0 (delta 0), pack-reused 0 (from 0)
remote: Resolving deltas: 100% (1/1), completed with 1 local object.
To github.com:douglasrfferreira/TrabalhoFinal_Git.git
   492ddd6..9e5d5cd  main -> main

Usuario@DESKTOP-9FTOCQT MINGW64 ~/TrabalhoFinal_Git (main)
$

