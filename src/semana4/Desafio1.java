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
    	
    	System.out.println (estoque.produto[0].NIU());
    }
}	
    	class Produto { 
private String nome;
private String tamanho;
  private String cor;
private String marca;

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

    String NIU() 
{
	return this.getNome() + " " + this.getCor() + ", " + "Tamanho" +" "+ this.getTamanho() +", "+ "Marca" +" "+this.getMarca();
}
    	}
    
class Estoque {
	private int quantidade= 1;
private int id;
Produto[] produto=new Produto[(this.getQuantidade())]; 
	    int getQuantidade() {
	return this.quantidade;}
public void setQuantidade(int quantidade) {
	this.quantidade=quantidade;}
	
	public int getId() {
	return this.id;}
	public void setId(int id) {	
this.id=id;}
		
}
    
