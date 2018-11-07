package semana4;

/**
 * 	Uma classe â€œprodutosâ€� com atributos
 * 		- nome do produto
 * 		- tamanho do produto
 * 		- cor
 * 		- marca
 * 	Uma classe â€�estoqueâ€� que tem um objeto de produto
 * 		- quantidade
 * 		- id
 * 		- produto
 * 	 Uma classe "funcionario" que tem os mÃ©todos
 * 		-Cadastrar
 * 		-Editar
 * 		-Excluir
 * 		-Consultar
 *
 *  mostre os metodos em execuÃ§Ã£o
 */
public class Desafio1{

    public static void main(String[] args) {
Estoque estoque = new Estoque();
estoque.produto[0] = new Produto();
    	estoque.produto[0].setNome ("Camiseta");
    	estoque.produto[0].setTamanho ("M");
    	estoque.produto[0].setCor ("Vermelha");
estoque.produto[0].setMarca ("Element");
    	estoque.produto[0].setQuantidade (5);
    	
    	System.out.println (estoque.produto[0].NIU());
    }
}	
    	class Produto { 
private String nome;
private String tamanho;
  private String cor;
private String marca;
private int quantidade;

// get e set 
public String getNome() {
	return this.nome;}
public void setNome(String nome) {
this.nome=nome;}
	
public String getTamanho() {
	return this.tamanho; }
public void setTamanho(String tamanho) {
	this.tamanho=tamanho;}

public String getCor() { 	
return this.cor;}
public void setCor(String cor) {
	this.cor=cor;}

public String getMarca() {
return this.marca;}
public void setMarca(String marca) {
	this.marca=marca;} 
public int getQuantidade() {
    return this.quantidade;}
public void setQuantidade(int quantidade) { 
	this.quantidade=quantidade;}

	String NIU() 
{
	return this.getNome() + " " + this.getCor() + ", " + "Tamanho" +" "+ this.getTamanho() +", "+ "Marca" +" "+this.getMarca() +", "+ "Quantidade em estoque= " + this.getQuantidade();
}
}
    
class Estoque {
private int q=1;
	private int id;
Produto[] produto=new Produto[(this.getQ())]; 

public int getQ() {
	return this.q;}
public void setQ(int q) {
	this.q=q;}

	public int getId() {
	return this.id;}
	public void setId(int id) {	
this.id=id;}
		
}
    
