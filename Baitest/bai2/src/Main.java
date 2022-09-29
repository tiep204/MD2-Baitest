import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        *******************MENU*******************
//        1. Nhập giá trị các phần tử mảng [1 điểm]
//        2. Hiển thị giá trị các phần tử mảng [1 điểm]
//        3. In giá trị các phần tử là số nguyên tố trong mảng [1 điểm]
//        4. In giá trị max, min các phần tử trong mảng [1 điểm]
//        5. Sắp xếp mảng giảm dần [1 điểm]
//        6. Thoát [0.5 điểm]


        int array[] = new int[5];


        do{
            System.out.println("****************MENU***************");
            System.out.println("1. Nhập giá trị các phần tử mảng");
            System.out.println("2. Hiển thị giá trị các phần tử mảng");
            System.out.println("3. In giá trị các phần tử là số nguyên tố trong mảng");
            System.out.println("4. In giá trị max, min các phần tử trong mảng");
            System.out.println("5. Sắp xếp mảng giảm dần");
            System.out.println("6. Thoát");

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

                    System.out.println("Mảng ban vua nhap la : ");
                    for (int i = 0; i < 5; i++) {
                        System.out.print(array[i] + "\t");
                    }
                    System.out.println("\n");
                    break;
                case 3:
                    boolean check = false;
                    for (int i = 0; i < array.length; i++) {
                        if (array[i]>=2) {
                            for (int j = 2; j <= Math.sqrt(array[i]); j++) {
                                if (array[i] % j == 0) {
                                    check = true;
                                    break;
                                }
                            }
                            if (!check) {
                                System.out.printf("%d la so nguyen to\n", array[i]);
                            }
                        }
                        continue;
                    }
                    break;
                case 4:
                    int  max = array[0];
                    int min = array[0];
                    for (int num: array) {
                        if(max < num)
                            max = num;
                    }
                    System.out.println("gia tri Max: " + max);
                    for (int num: array) {
                        if(min > num)
                            min = num;
                    }
                    System.out.println("gia tri min:" +min);

                    break;
                case 5:
                    int A = 0;
                    for (int i = 0; i < array.length - 1; i++) {
                        for (int j = i + 1; j <= array.length - 1; j++) {
                            if (array[i] < array[j]) {
                                A = array[i];
                                array[i] = array[j];
                                array[j] = A;
                            }
                        }
                    }
                    System.out.println("Mảng sau khi sắp xếp là: ");
                    for (int i = 0; i < array.length; i++) {
                        System.out.println(array[i] + "\t");
                    }
                    break;
                case 6:
                    System.exit(0);
                    break;
            }

        }while (true);
    }
}