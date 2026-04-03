// We start from origin (0,0) and simulate movement based on given directions.
// Maintain two variables x and y to track horizontal and vertical position.
// For each direction: N → y++, S → y--, E → x++, W → x--.
// After processing the entire string, we get the final coordinates (x, y).
// The shortest path is the direct straight-line distance from origin to (x, y).
// We calculate it using Euclidean formula: √(x² + y²). 
// underrrot of (x2 - x1)^ 2 + (y2 - y1)^2

// Instead of simulating actual path, we directly compute displacement and then apply distance formula.

// Distance - Total path traveled
// Displacement - Shortest straight-line distance from start to end
// we calculating displacement, NOT distance

// Time Complexity is O(n) and Space Complexity is O(1).



public class ShortestPath{

    public static float getShortestPath(String path){
        int x = 0, y = 0;

        for(int i=0; i<path.length(); i++){
            char dir = path.charAt(i);

           // South
           if(dir == 'S'){
             y--;
           }

           // North
           else if(dir == 'N'){
              y++;
           }

           // West
           else if(dir == 'W'){
              x--;
           }

           // East
           else {
              x++;
           }
        }

        int X2 = x*x;
        int Y2 = y*y;
        return (float)Math.sqrt(X2 + Y2);

    }


    public static void main(String[] args) {
        String path = "WNEENESENNN";
        float shortPath = getShortestPath(path);
        System.out.println("Shortest Path = " + shortPath);
    }
}