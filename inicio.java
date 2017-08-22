package cat;
import java.io.*;

public class juego {
	public static void main(String[]arg) throws IOException{
		int matriz[][] = new int[3][3];
		BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
		int k=1;
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[0].length;j++) {
				matriz[i][j] = k;
				k++;
			}
		}
		k = 0;
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[0].length;j++) {
				System.out.print(matriz[i][j]);
				k++;
				if(k%3==0) {
					System.out.println();
				}
			}
		}
		
	}

}
