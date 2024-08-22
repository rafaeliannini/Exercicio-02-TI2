package com.ti2cc;

public class Carro {
	private int codigo;
	private String marca;
	private String modelo;
	private int ano;
	
	public Carro() {
		this.codigo = -1;
		this.marca = "";
		this.modelo = "";
		this.ano = -1;
	}
	
	public Carro(int codigo, String marca, String modelo, int ano) {
		this.codigo = codigo;
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	@Override
	public String toString() {
		return "Carro [codigo=" + codigo + ", marca=" + marca + ", modelo=" + modelo + ", ano=" + ano + "]";
	}	
}
