public class watermelon {
    public boolean CanBeDivided(int w){
        if(w>2 && w<=100)
        {
            if((w%2)==0)
                return true;
            else
                return false;
        }
        else
            return false;
    }
}
