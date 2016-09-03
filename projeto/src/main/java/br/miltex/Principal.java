/**
 * 
 */
package br.miltex;

import javax.annotation.ManagedBean;

/**
 * @author Milton
 *
 */
@ManagedBean
public class Principal {

	private String nome = "Milton";

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
