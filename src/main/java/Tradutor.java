import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Tradutor {

	private String palavra;
	
	public Tradutor(String palavra) {
		this.palavra = palavra;
	}
	
	public String traducao() {
		String palavraAchada = "Palavra não encontrada";
		try {
			Scanner scanner = new Scanner(new File("C:\\palavras.txt"));
			String linha;
			String[] palavras;
			
			while(scanner.hasNext()) {
				linha = scanner.next();
				palavras = linha.split("-");
				
				if(palavras[0].equalsIgnoreCase(getPalavra())) {
					palavraAchada = palavras[1];
				}else
				if (palavras[1].equalsIgnoreCase(getPalavra())){
					palavraAchada = palavras[0];
				}
			}
			
		}catch (IOException e) {
			e.printStackTrace();
		}
		return palavraAchada;
	}
	
	public String getPalavra() {
		return palavra;
	}
}
