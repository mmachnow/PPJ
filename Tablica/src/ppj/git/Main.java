package ppj.git;
/**
 *<h1>Tablica wype³niana pêtl¹ - zadanie domowe z PPJ</h1>
 * @author Micha³ Machnowski
 * @version v.0.98
 * @since 2019-10-10
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n = new int[11];
        for (int i = 0; i <=10; i++){
            n[i] = i;
            for(int j = 0; j <= i; j++)
            {
              System.out.print((j == 0 ? "" : ", ") + n[j]);
            }
            System.out.println();
        }
    }
}
