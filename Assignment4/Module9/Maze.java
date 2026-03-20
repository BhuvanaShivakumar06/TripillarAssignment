package Assignment4.Module9;

public class Maze {
    static void solve(int i, int j, int n, String path) {
        if (i == n - 1 && j == n - 1) {
            System.out.println(path);
            return;
        }

        if (i < n) solve(i + 1, j, n, path + "D");
        if (j < n) solve(i, j + 1, n, path + "R");
    }

    public static void main(String[] args) {
        solve(0, 0, 3, "");
    }
}
