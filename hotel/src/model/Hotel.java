package model;

public class Hotel {
   private int Id;
   private String nomeFilial;
   private String  rua;
   private String numero;
   private String cidade ;
   private String estado ;
   private boolean e5Estrelas ;

public Hotel(){}

 public Hotel(int id, String nomeFilial, String rua, String numero, String cidade, String estado, boolean e5Estrelas) {
  Id = id;
  this.nomeFilial = nomeFilial;
  this.rua = rua;
  this.numero = numero;
  this.cidade = cidade;
  this.estado = estado;
  this.e5Estrelas = e5Estrelas;
 }


 public Hotel( String nomeFilial, String rua, String numero, String cidade, String estado, boolean e5Estrelas) {
  this.nomeFilial = nomeFilial;
  this.rua = rua;
  this.numero = numero;
  this.cidade = cidade;
  this.estado = estado;
  this.e5Estrelas = e5Estrelas;
 }
 public int getId() {
  return Id;
 }

 public void setId(int id) {
  Id = id;
 }

 public String getNomeFilial() {
  return nomeFilial;
 }

 public void setNomeFilial(String nomeFilial) {
  this.nomeFilial = nomeFilial;
 }

 public String getRua() {
  return rua;
 }

 public void setRua(String rua) {
  this.rua = rua;
 }

 public String getNumero() {
  return numero;
 }

 public void setNumero(String numero) {
  this.numero = numero;
 }

 public String getCidade() {
  return cidade;
 }

 public void setCidade(String cidade) {
  this.cidade = cidade;
 }

 public String getEstado() {
  return estado;
 }

 public void setEstado(String estado) {
  this.estado = estado;
 }

 public boolean isE5Estrelas() {
  return e5Estrelas;
 }

 public void setE5Estrelas(boolean e5Estrelas) {
  this.e5Estrelas = e5Estrelas;
 }
}
