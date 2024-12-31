import java.util.*;

public class ImageSmoother {
    public static int[][] directions = {
        {-1, -1}, {-1, 0}, {-1, 1},
        {0, -1}, {0, 0}, {0, 1},
        {1, -1}, {1, 0}, {1, 1}
    };

    public static int[][] Smoother(int[][] img, int m, int n) {
        int[][] result = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int sum = 0;
                int count = 0;
                for (int[] dir : directions) {
                    int ni = i + dir[0];
                    int nj = j + dir[1];

                    if (ni >= 0 && ni < m && nj >= 0 && nj < n) {
                        sum += img[ni][nj];
                        count++;
                    }
                }
                result[i][j] = sum / count; 
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int m = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int n = sc.nextInt();

        int[][] img = new int[m][n];
        System.out.println("Enter the elements of the image matrix (row by row):");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                img[i][j] = sc.nextInt();
            }
        }

        int[][] smoothedImage = Smoother(img, m, n);

        System.out.println("Smoothed Image:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(smoothedImage[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
