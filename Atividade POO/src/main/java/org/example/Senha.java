package org.example;

public class Senha {
public int senha, senhacorreta;


 public Senha (int senha, int senhacorreta) {
     this.senha = senha;
     this.senhacorreta = senhacorreta;
 }
     public String senhuda (){

         if (senha == senhacorreta) {
             return "Acesso permitido.";
         } else return "Acesso negado.";}
     }
