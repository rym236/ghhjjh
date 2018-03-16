import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaskBravers {



    public static void main(String[] args) throws IOException {

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(r.readLine());


        int mas[][] = new int[N][N];
        int n = 1;

        int y = 0;
        int x = 0;
        int sx = 1;
        int sy = 0;

        int minx = 0;
        int miny = 1;
        int maxx = N - 1;
        int maxy = N - 1;

        boolean found;
        mas[0][0] = n;

      do
      {

          found = false;
          while ((sx > 0 && x < maxx) || (sx < 0 && x > minx) || (sy > 0 && y < maxy) || ( sy < 0 && y > miny)) {

              x += sx;
              y += sy;
              mas[y][x] = ++ n;

              found = true;
          }
          if (sx < 0) minx = x + 1;
          if (sx > 0) maxx = x - 1;
          if (sy < 0) miny = y + 1;
          if (sy > 0) maxy = y - 1;

          int sx_old = sx;
          sx = -sy;
          sy = sx_old;

      } while (found);


        for(int t = 0; t <N; t++){
            for(int s = 0; s < N; s++)
                System.out.print(mas[t][s] + "\t");

            System.out.println();
        }

    }
}
