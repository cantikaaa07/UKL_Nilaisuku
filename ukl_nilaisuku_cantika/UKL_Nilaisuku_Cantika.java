
package ukl_nilaisuku_cantika;


public class UKL_Nilaisuku_Cantika {

  
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int n = 10;
        int sum = 0;
        
        System.out.println("Deret Aritmatika");
        for (int i = 0; i < n; i++) {
            int suku = a + i * b;
            System.out.print(suku);
            
            sum += suku;
            
            if (i < n - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Jumlah: " + sum);
        
    }
    }
    

