public class SumaPar 
{
    public static int sumaPares(int n)
    {
       if(n==2) return 2; //O(1)
           else
           {
               if(n%2==0)//O(1)
                   return n + sumaPares(n-2); //O(n)
                   else return sumaPares(n-1); //O(n) si se jecutases los 2 si serian n^2, en este caso nunca sseria n^2
           }
    }  
    
    public static void main(String[] args){

        System.out.println(sumaPares(9));
    }


}
