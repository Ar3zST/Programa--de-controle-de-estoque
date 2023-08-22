/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetointerr;

/**
 *
 * @author jonas
 */
public class Venda{

	private int codigo;
	private Cliente comprador;
	private String data;
	private Item[] itens;
	private int qntDeProdutosDiferentes;
	
	public Venda(int codigo, Cliente comprador, String data, Item[] itens, int qntProdutosDif) {
		this.codigo=codigo;
		this.comprador=comprador;
		this.data = data;
		this.itens = itens;
		this.qntDeProdutosDiferentes = qntProdutosDif;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public Cliente getComprador() {
		return comprador;
	}
	public String getData() {
		return data;
	}
	public Item[] getItens() {
		return itens;
	}
	public int getQntProdutosDiferentes() {
		return qntDeProdutosDiferentes;
	}
}
