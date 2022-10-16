import java.util.*;
class Solution{
    public static void main(String[] main){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0 ; i <size  ; i++){
       arr.add(sc.nextInt());
      }
int queries= sc.nextInt();

    for(int i=0;i<queries;i++){
        String query= sc.next();
        if(query.equals("Insert")){
            arr.add(sc.nextInt(), sc.nextInt());
        }else if(query.equals("Delete")){
             arr.remove(sc.nextInt());

        }

    }

    for(Integer i: arr){
        System.out.printf("%d ",i);
    }
}
}
