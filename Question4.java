// Create a two dimensional array of integers and display:
// sum of all elements of each column
// sum of all elements of each row
class Question4
{
    public static void rowSum(int arr[][],int n,int m)
    {
        for(int i=0;i<n;i++)
        {
            int rowsum=0;
            for(int j=0;j<m;j++)
            {
                rowsum+=arr[i][j];
            }
            System.out.println("row "+i+":"+rowsum);
        }
    }
    public static void colSum(int arr[][],int n,int m)
    {
        for(int i=0;i<n;i++)
        {
            int colsum=0;
            for(int j=0;j<m;j++)
            {
                colsum+=arr[j][i];
            }
            System.out.println("col "+i+":"+colsum);
        }
    }
    public static void main(String[] args)
    {
        int n=3,m=3;
        int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
        Question4.rowSum(arr,n,m);
        Question4.colSum(arr,n,m);
    }
}