import java.util.*;
class question1{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        if(args.length==0){
            System.out.println("No values");
        }
        else{
            for(int i =0;i<args.length;i++){
                System.out.print(args[i]);
                if(i<args.length-1){
                    System.out.print(" , ");

                }
            }
            
        }
    }
}