public class BuildTriangleStars {
    int iHeight;

    public void setiHeight(int iHeight) {
        this.iHeight = iHeight;
    }

    public void DisplayTriangleStars(){
            for(int i=0;i<=iHeight;i++)
        {
            for(int j=1;j<=iHeight - i;j++)
                System.out.print(" ");
            for(int j=1;j<=2*i-1;j++)
                System.out.print("*");
            System.out.print("\n");
        }
    }
}
