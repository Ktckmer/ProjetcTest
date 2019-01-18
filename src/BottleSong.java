import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class BottleSong {
	
	public BottleSong() {
		super();
	}
	
	public void sing() {
		try {
			
			List<String> var=new ArrayList<String>();
			
			File f1 = new File("song.txt");
			
			FileReader fr = new FileReader(f1);
			
			BufferedReader br = new BufferedReader(fr);
			
			String s;
			
			while ((s=br.readLine())!=null) {
				var.add(s);

				System.out.println(var);
				
				/*String[] tab = (String[]) var.toArray();
				for (int i = 0; i < tab.length; i++) {
					System.out.println(tab[i]);
				}*/
			}
			br.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
