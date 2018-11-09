package FabricaDinamicaESingleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.Reader;
import java.util.Properties;

import factory.FabricaDinamica;
import com.google.gson.Gson;

public class Tester {

	public static void main(String[] args) {
		
	
		Gson gson = new Gson();
		
		Pastel p1 =  new FabricaPastel().montarPastel();
		p1.setPreco(5.30);
		p1.setSabor("CARNE MOIDA E PIMENTA");
		
		String json = gson.toJson(p1);
	
		
		Properties props = new Properties();

			
			try {
				props.put("jsonPastel", json);
				props.put("pessoa", "Tatiane");

				FileWriter fl = new FileWriter("C:\Users\tatiana\Desktop\FabricaDinamicaESingleton");
				fl.write(props.toString());
				fl.close();
				props.load(new FileInputStream("C:\Users\tatiana\Desktop\FabricaDinamicaESingleton");
				System.out.println(props.toString());
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
		
	}
}
