package entity;

public class Senha {
	
	private String conteudo;
	private int forca;
	
	public Senha(String senha) {
		setConteudo(senha);
		setForca(forca);
	}
	
	public void setConteudo(String senha) {
		if(senha != null && !senha.isEmpty()) {
			this.conteudo = senha;
		}
	}
	public void setForca(int forca) {
			this.forca += forca;
	}

	
	public String getConteudo() {
		return this.conteudo;
	}
	
	public int getTamanho() {
		return this.conteudo.length();
	}
	
	public int getForca() {
		return this.forca;
	}
	
	
	public Boolean isValida(Senha senha) {
		if(senha.getTamanho() >=10 && senha.getTamanho() <=30) {
			return true;
		}
		System.out.println("Caracteres minimos e maximos da senha nao atingido.");
		return false;
		
	}
	
	
	public Boolean isMaiuscula(Senha senha) {
		for(int i=0; i < senha.getTamanho() ; i++) {
			if(Character.isUpperCase(senha.getConteudo().charAt(i))){
				return true;
			}
		}
		return false;	
	}
	
	public Boolean isMinuscula(Senha senha) {
		for(int i=0; i < senha.getTamanho() ; i++) {
			if(Character.isLowerCase(senha.getConteudo().charAt(i))){
				return true;
			}
		}
		return false;	
	}
	
	public Boolean isDigito(Senha senha) {
		for(int i=0; i < senha.getTamanho() ; i++) {
			if(Character.isDigit(senha.getConteudo().charAt(i))){
				return true;
			}
		}
		return false;	
	}
	
	public Boolean isEspecial(Senha senha) {
		for(int i=0; i < senha.getTamanho() ; i++) {
			if(!Character.isLetterOrDigit(senha.getConteudo().charAt(i))){
				return true;
			}
		}
		return false;	
	}
	
	public Boolean isRepetido(Senha senha) {
		for(int i=0; i < senha.getTamanho() ; i++) {
			if(senha.getConteudo().contains("abc") || senha.getConteudo().contains("123") || senha.getConteudo().contains("qwert") || senha.getConteudo().contains("asdfg")){
				return true;
			}
		}
		return false;	
	}
	
	
}
