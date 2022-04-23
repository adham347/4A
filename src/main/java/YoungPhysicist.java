public class YoungPhysicist {
    public int n;
    public int[][] vector = new int[n][3];
    YoungPhysicist(int n, int[][] vector){
        this.n=n;
        this.vector=vector;
    }

    public String IsEquilibrium(){
        int x=0,y=0,z=0;
        if(n>=1) {
            for (int i = 0; i < n; i++) {
                x = x + vector[i][0];
                y = y + vector[i][1];
                z = z + vector[i][2];
            }
            if (x == 0 && y == 0 && z == 0)
                return "yes";
            else
                return "no";
        }
        else
            return "not enough forces";
    }
    public static void main(String[] args){
        int[][] array={{0,0,0},{0,0,0},{0,0,0}};
        YoungPhysicist coordinates= new YoungPhysicist(3,array);

        coordinates.IsEquilibrium();
    }
}
