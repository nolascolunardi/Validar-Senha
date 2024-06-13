package application;
import java.util.Scanner;

import entity.Senha;

public class ValidadorSenha {

	public static void main(String[] args) {
		 
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite senha: ");
		String senha =  scanner.next();
		
		Senha senha1 = new Senha(senha);
		int forca =0;
		
		
		if(senha1.isValida(senha1)){
			
			if (senha1.getTamanho()==10) {
				forca += 75;
			}else if(senha1.getForca()==30) {
				forca += 100;
			}else {
				forca += 80;
			}
			
			if(senha1.isMaiuscula(senha1)) {
				forca +=1;
			}else {
				forca -= 1;
			}
			
			if(senha1.isMinuscula(senha1)) {
				forca +=1;
			}else {
				forca -= 1;
			}
			
			if(senha1.isDigito(senha1)) {
				forca +=1;
			}else {
				forca -= 1;
			}
			
			if(senha1.isEspecial(senha1)) {
				forca +=1;
			}else {
				forca -= 1;
			}
			
			if(senha1.isRepetido(senha1)) {
				forca +=1;
			}else {
				forca -= 1;
			}
			senha1.setForca(forca);
			
			System.out.println(senha1.getForca());

		
		}
		 
		 
		 

	}

}
