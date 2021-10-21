public class UlamSpiralSieveLife
{
    public static void drawUniverse(int[][] universe, int generation)
    {
        StdDraw.clear();
        for (int y = 1; y < universe.length - 1; y++)
            for (int x = 1; x < universe[y].length - 1; x++) {
            if (universe[y][x] == 1)
                StdDraw.point(x, y);
        }
        
        StdDraw.text(0, 0, Integer.toString(generation));
        StdDraw.show(5);
    }
    
    public static void main(String[] args)
    {
        // Draw the spiral on the screen
        final int SCALE = 800; // default: 200
        final double PEN = 0.002; // default: 0.005
        final int N = SCALE*SCALE; // used as a counter

        // data structure for prime sieve
        boolean[] isPrime = new boolean[N+1];
        StdDraw.setCanvasSize(SCALE, SCALE);
        StdDraw.setXscale(0, SCALE);
        StdDraw.setYscale(0, SCALE);
        StdDraw.setPenRadius(PEN);
        StdDraw.setPenColor(StdDraw.BLACK);
        int x = 0, y = 0;
        int step = 1;
        int dirX = 1, dirY = 1;
// prepare data structure for the game of life
        int[][][] universe = new int[2][SCALE+2][SCALE+2];
        int cUniv = 0;
// StdDraw.clear();
// sieve the prime array
        for (int i = 1; i <= N; i++)
            isPrime[i] = true;
        for (int i = 2; i <= N/i; i++)
{
if (isPrime[i])
{
for (int j = i; j <= N/i; j++)
isPrime[i*j] = false;
}
}
int count = 1;
int loops = 0;
while (count <= N)
{
if (loops % 2 == 0)
{
for (int j = 0; j < step; j++)
{
boolean draw = false;
if (isPrime[count])
draw = true;
if (draw)
{
StdDraw.point(x + SCALE / 2, y + SCALE / 2);
universe[cUniv][y + SCALE/2 + 1][x + SCALE / 2 + 1] = 1;
}
x += dirX;
count++;
}
dirX *= -1;
}
else
{
for (int j = 0; j < step; j++)
{
boolean draw = false;
if (isPrime[count])
draw = true;
if (draw)
{
StdDraw.point(x + SCALE / 2, y + SCALE / 2);
universe[cUniv][y + SCALE / 2 + 1][x + SCALE / 2 + 1] = 1;
}
y += dirY;
count++;
}
dirY *= -1;
step++;
}
loops++;
}
// let the life begin!
int gen = 0;
final int GENERATIONS = 10000;
drawUniverse(universe[cUniv], gen);
gen++;
while (gen <= GENERATIONS)
{
// prepare edges for calculation
for (int i = 1; i <= SCALE; i++)
{
universe[cUniv][0][i] = universe[cUniv][SCALE][i];
universe[cUniv][SCALE+1][i] = universe[cUniv][1][i];
universe[cUniv][i][0] = universe[cUniv][i][SCALE];
universe[cUniv][i][SCALE+1] = universe[cUniv][i][1];
}
for (y = 1; y <= SCALE; y++)
{
for (x = 1; x <= SCALE; x++)
{
int sum = 0;
for (int i = 0; i < 3; i++)
{
sum += universe[cUniv][y-1][x-1+i];
sum += universe[cUniv][y+1][x-1+i];
}
sum += universe[cUniv][y][x-1];
sum += universe[cUniv][y][x+1];
if (sum < 2 || sum > 3)
universe[1-cUniv][y][x] = 0;
else if (sum == 3)
universe[1-cUniv][y][x] = 1;
}
}
cUniv = 1-cUniv;
drawUniverse(universe[cUniv], gen);
gen++;
}
}
}