import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /* Membuat objek BT */
        BinaryTree<String> bt = new BinaryTree<>();
        /* Melakukan operasi pada pohon */
        System.out.println("Uji Pohon Biner\n");
        char ch;
        do {
            System.out.println("\nOperasi Pohon Biner\n");
            System.out.println("1. sisipkan ");
            System.out.println("2. cari");
            System.out.println("3. hitung node");
            System.out.println("4. periksa kosong");
            int choice = input.nextInt();
            input.nextLine(); // Membersihkan buffer
            switch (choice) {
                case 1:
                    System.out.println("Masukkan elemen yang akan disisipkan");
                    bt.insert(input.nextLine());
                    break;
                case 2:
                    System.out.println("Masukkan elemen yang akan dicari");
                    System.out.println("Hasil pencarian : " + bt.search(input.nextLine()));
                    break;
                case 3:
                    System.out.println("Jumlah node = " + bt.countNodes());
                    break;
                case 4:
                    System.out.println("Status kosong = " + bt.isEmpty());
                    break;
                default:
                    System.out.println("Masukan Salah \n ");
                    break;
            }
            /* Menampilkan pohon */
            System.out.print("\nPost order : ");
            bt.postorder();
            System.out.print("\nPre order : ");
            bt.preorder();
            System.out.print("\nIn order : ");
            bt.inorder();
            System.out.println("\n\nApakah Anda ingin melanjutkan (Ketik y atau n)\n");
            ch = input.next().charAt(0);
        } while (ch == 'Y' || ch == 'y');
    }
}



