import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Tradutor {

	private String palavra;
	
	public Tradutor(String palavra) {
		this.palavra = palavra;
	}
	
	public String traducao() {
		try {
			Scanner scanner = new Scanner(new File("C:\\palavras.txt"));
			String linha;
			String[] palavras;
			
			while(scanner.hasNext()) {
				linha = scanner.next();
				palavras = linha.split("-");
				
				if(palavras[0].equalsIgnoreCase(getPalavra())) {
					return palavras[1];
				}else {
					return palavras[0];
				}
			}
			
		}catch (IOException e) {
			e.printStackTrace();
		}
		return "Palavra não encontrada!";
	}
	
	public String getPalavra() {
		return palavra;
	}
}
