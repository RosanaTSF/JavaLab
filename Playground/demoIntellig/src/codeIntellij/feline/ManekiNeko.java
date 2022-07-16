package codeIntellij.feline;

import java.util.Objects;

public class ManekiNeko {
 private String nome;
 private String cor;
 private Integer idade;

 public ManekiNeko() {}

 public ManekiNeko(String nome, String cor, Integer idade) {
  this.nome = nome;
  this.cor = cor;
  this.idade = idade;
 }

 public String getNome() {
  return nome;
 }

 public String getCor() {
  return cor;
 }

 public Integer getIdade() {
  return idade;
 }

 public void setNome(String nome) {
  this.nome = nome;
 }

 public void setCor(String cor) {
  this.cor = cor;
 }

 public void setIdade(Integer idade) {
  this.idade = idade;
 }

 @Override
 public boolean equals(Object o) {
  if (this == o) return true;
  if (o == null || getClass() != o.getClass()) return false;
  ManekiNeko that = (ManekiNeko) o;
  return Objects.equals(nome, that.nome) && Objects.equals(cor, that.cor) && Objects.equals(idade, that.idade);
 }

 @Override
 public int hashCode() {
  return Objects.hash(nome, cor, idade);
 }

 @Override
 public String toString() {
  return "manekiNeko{" +
          "nome='" + nome + '\'' +
          ", cor='" + cor + '\'' +
          ", idade=" + idade +
          '}';
 }
}
