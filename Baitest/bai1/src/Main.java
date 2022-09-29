import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//     *********************MENU*********************
//1. Nhập giá trị các phần tử của mảng [1 điểm]
//2. In giá trị các phần tử của mảng theo ma trận [1 điểm]
//3. In giá trị các phần tử nằm trên chéo chính, chéo phụ và tính tổng [1 điểm]
//4. Sắp xếp mảng tăng dần theo cột [1 điểm]
//5. Thoát [0.5 điểm]

        int n = Integer.parseInt(sc.nextLine());
        int array[] = new int[n];


        do{
            System.out.println("****************MENU***************");
            System.out.println("1. Nhập giá trị các phần tử mảng");
            System.out.println("2. In giá trị các phần tử của mảng theo ma trận");
            System.out.println("3. In giá trị các phần tử nằm trên chéo chính, chéo phụ và tính tổng");
            System.out.println("4. Sắp xếp mảng tăng dần theo cột");
            System.out.println("5. Thoát");


            int choice = Integer.parseInt(sc.nextLine());


            switch (choice){
                case 1:
                    System.out.println("Nhập các phần tử cho mảng: ");
                    for (int i = 0; i < array.length; i++) {
                        System.out.print("Nhập phần tử thứ " + i + ": ");
                        array[i] = Integer.parseInt(sc.nextLine());
                    }

                    break;
                case 2:

                case 3:

                case 4:

                case 5:
                    System.exit(0);
                    break;
            }

        }while (true);
    }
}