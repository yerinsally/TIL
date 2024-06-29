import java.util.Arrays;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        int array[] = {a,b,c,d};
        Arrays.sort(array);
        
        if(array[0]!=array[1] && array[1]!=array[2] && array[2]!=array[3]){
            answer = array[0];
        }else if(array[2]!=array[3] && array[0]==array[1] && array[0]==array[2]){       //[1,1,1,2]
            answer = (10*array[0]+array[3])*(10*array[0]+array[3]);                   
        }else if(array[0]!=array[1] && array[2]==array[3] && array[1]==array[2]){       //[1,2,2,2]
            answer = (10*array[3]+array[0])*(10*array[3]+array[0]);
        }else if(array[1]!=array[2] && array[0]==array[1] && array[2]==array[3]){       //[1,1,2,2]
            answer = (array[0]+array[3])*Math.abs(array[0]-array[3]);
        }else if(array[1]!=array[2] && array[0]!=array[1] && array[2]==array[3]){       //[1,2,3,3]   
            answer = array[0]*array[1];
        }else if(array[0]==array[1] && array[1]!=array[2] && array[2]!=array[3]){       //[1,1,2,3]
            answer = array[2]*array[3];
        }else if(array[0]!=array[1] && array[2]!=array[3] && array[1]==array[2]){       //[1,2,2,3]
            answer = array[0]*array[3];
        }else if(array[0]==array[1] && array[1]==array[2] && array[2]==array[3]){       //[1,1,1,1]
            answer = array[0]*1111;
        }else{                                                                          //[1,2,3,4]
            answer = array[0];
        }
        return answer;
    }
}