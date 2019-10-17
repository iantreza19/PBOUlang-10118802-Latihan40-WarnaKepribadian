
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author IantReza
 */
public class Latihan40 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Warna warna = new Warna();
        User user = new User();
        Scanner scanner = new Scanner(System.in);

        warna.menampilkanTemplate();
        warna.pilihWarnaFavorit();
        user.memasukkanNama();

        System.out.println("\n====HASIL TEST KEPRIBADIAN "+ user.namaUser.toUpperCase()+"====");
        warna.tesKepribadian(warna.namaWarna,user.namaUser);
        
    }
    
}
