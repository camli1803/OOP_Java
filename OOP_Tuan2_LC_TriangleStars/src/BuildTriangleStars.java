public class BuildTriangleStars {
    int Height;

    public void setHeight(int Height) {
        this.Height = Height;
    }

    public void DisplayTriangleStars(){
            for(int i=0;i<=Height;i++)
        {
            for(int j=1;j<=Height - i;j++)
                System.out.print(" ");
            for(int j=1;j<=2*i-1;j++)
                System.out.print("*");
            System.out.print("\n");
        }
    }
}
