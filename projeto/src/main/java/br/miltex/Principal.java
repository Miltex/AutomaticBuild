/**
 * 
 */
package br.miltex;

import javax.annotation.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 * @author Milton
 *
 */
@ManagedBean
@SessionScoped
public class Principal {

	private String nome = "Milton";

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void console(){
		System.out.println("Chamou console...");
	}

}
