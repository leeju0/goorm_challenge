import java.util.Scanner;

class TEST4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int K = scanner.nextInt();
        scanner.nextLine(); // 줄바꿈 기호를 없애줍니다.

        String[][] matrix = new String[N][N];
        for (int i = 0; i < N; i++) {
            matrix[i] = scanner.nextLine().split(" ");
        }

        int[] dx = {0, 0, 0, 1, -1};
        int[] dy = {0, 1, -1, 0, 0};
        int[][] score = new int[N][N];

        for (int k = 0; k < K; k++) {
            int x = scanner.nextInt() - 1; // Adjusting index
            int y = scanner.nextInt() - 1; // Adjusting index

            for (int i = 0; i < 5; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (0 <= nx && nx < N && 0 <= ny && ny < N) {
                    if (!matrix[nx][ny].equals("#")) {
                        if (matrix[nx][ny].equals("@")) {
                            score[nx][ny] += 2;
                        } else {
                            score[nx][ny] += 1;
                        }
                    }
                }
            }
        }

        int result = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                result = Math.max(result, score[i][j]);
            }
        }

        System.out.println(result);
        scanner.close();
    }
}