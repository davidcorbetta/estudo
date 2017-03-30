#!/bin/bash
# Para ficar mais r�pido, faz a configura��o do GIT, e ja ajusta o SSL.
echo "Informe seu user do github:"
read user;
echo "Informe seu e-mail do github "
read email;
echo "Informe sua senha do github "
read -s senha;
# Configura name e email do user utilizado no github
git config --global user.name "$user"
git config --global user.email "$email"
git config --global user.senha "$senha"
mkdir estudo 
cd estudo
git init
# Desabilita verifica��o HTTP e SSL
git config http.sslVerify false
git remote add origin https://"$user":"$senha"@github.com/davidcorbetta/estudo.git
git pull origin master
git checkout master
# Devido a falta do certificado, n�o � possivel instalar depend�ncia do npm
npm set strict-ssl false
start sh.exe --login -i