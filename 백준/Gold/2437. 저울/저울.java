import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();    //개행 제거
        int[] arr = Arrays.stream(sc.nextLine().split(" "))
                          .mapToInt(Integer::parseInt)
                          .toArray();
        //오름차순 정렬
        Arrays.sort(arr);
        
        //같은 숫자가 있으면 최소 무게에 더함
        int min_weight = 1;
        for(int i=0; i<n; i++){
            //최소가 1로 시작할 경우
            if(arr[0]==1 && min_weight >= arr[i]){
                min_weight += arr[i];
            }else{
                break;
            }
            //최소가 1로 시작하지 않을 경우
            if(arr[0]!=1){
                System.out.println(1);
            }
        }
        System.out.println(min_weight);
    }
}