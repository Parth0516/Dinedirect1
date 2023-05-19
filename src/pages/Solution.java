import java.util.* ;
public class Solution {
     public static void main(String args[] ){
       
        Resort[] a = new Resort[3];
        Scanner sc = new Scanner(System.in);
        for(int i=0 ;i<3 ;i++){
            int id = sc.nextInt() ;sc.nextLine();
            String name  =sc.nextLine();
            double price = sc.nextDouble();
          double rating =sc.nextDouble();
           String category =sc.next(); sc.nextLine();
            a[i]= new Resort(id , name , price , rating,category);
           
        }
        String r = sc.nextLine() ;
        int av = find(a,r);
        if(av==0){
            System.out.println("no");
        }
        else{
            System.out.println(av);
        }
       
         
   
     }
     public static int find(Resort[] a , String r){
         int n = a.length ;
         int avg=0;
         double sum=0 ;
         int count=0 ;
         Resort[] h = new Resort[0];
         for(int i=0 ;i<n ;i++){
             if(a[i].getCategory().equalsIgnoreCase(r)){
                 h = Arrays.copyOf(h ,h.length+1);
                 h[h.length-1]=a[i];
             }
         }
         for(int i=0 ;i<h.length ;i++){
             sum+= a[i].getPrice();
             count++ ;
         }
         if(sum>0){
             avg=(int) sum/count ;
             return avg ;
         }
         else{
             return 0 ;
         }
     }
         
         
         
         
         
     }

class Resort {
    int id ;
    String name ;
    double price;
    double rating ;
    String category ;
   
    Resort(int id , String name , double price , double rating , String category){
        this.id = id ;
        this.name = name ;
        this.price = price ;
        this.rating =rating ;
        this.category =category ;
    }
    public int getId(){
        return id ;
    }
    public String getCategory(){
        return category ;
    }
    public double getPrice(){
        return price ;
    }
   
   
   
   
   
   
}