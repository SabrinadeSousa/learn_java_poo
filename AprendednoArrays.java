        /*
Aprendendo Java
*/

public class AprendednoArrays {
    public static void main(String[] args) {

        int num = 3;
        int[] vnum = new int[num];
        
        vnum[0] = 3;
        vnum[1] = 6;
        vnum[2] = 9;
        
        for(int posicao = 0; posicao < 3; posicao++){
            System.out.println(vnum[posicao]);
        }
    }
}

