package Greedy_Algorithm.Easy;
import java.util.*;
public class N_meeting_rooms {
    
    public static class Meeting{
        int start;
        int end;
        int index;
        Meeting(int start,int end,int index){
            this.start=start;
            this.end=end;
            this.index=index;
        }
    }
    public static void main(String[] args) {
        
        int s[] = {1, 3, 0, 5, 8, 5}, f[] = {2, 4, 6, 7, 9, 9} ;

        Meeting meeting[] = new Meeting[s.length];
        for(int i=0;i<s.length;i++){
            meeting[i]=new Meeting(s[i],f[i],i+1);
        }

        Arrays.sort(meeting, (a,b)-> a.end-b.end);


       int count=1;
       int lastFinish=meeting[0].end;
       ArrayList<Integer> ans = new ArrayList<>();
       ans.add(meeting[0].index);
       
       for(int i=1;i<meeting.length;i++){
        if(meeting[i].start>lastFinish){
            count++;
            lastFinish=meeting[i].end;
            ans.add(meeting[i].index);
        }
       }


       System.out.println("Meetings = " + ans);
        System.out.println("Count = " + count);
    }

}
