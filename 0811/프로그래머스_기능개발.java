import java.util.*;

//https://programmers.co.kr/learn/courses/30/lessons/42586
	
public class FucntionDev {
	//작업 완료까지 걸리는 일자가 { 5일,3일,4일,9일,6일 } 이라면 5일보다 작은 3,4일까지 한세트이고 9,6일이 한세트
	//형식으로 묶어서 품

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] progresses = {93,30,55};
		int[] speeds = {1,30,5};
		double max=0;
		//int[] answer = new int[progresses.length];
		//작업 완료 날짜 배열
		double[] days = new double[progresses.length];
		
		for(int i=0; i<progresses.length; i++) {
			//나머지가 존재하지 않을 때 -> days
			if((100-progresses[i]) %speeds[i] == 0) {
				days[i] = (100-progresses[i]) %speeds[i];
			}else {//나머지가 존재하지 않을 때 -> days+1
				days[i] = ((100-progresses[i]) %speeds[i])+1;
			}
		
		}
		
		ArrayList<Integer> ans = new ArrayList();
		
		int j=0;
		for(int i = 0; i < days.length; i++) {
            int count = 0;
            for(j = i + 1; j < days.length; j++) {
            	//이전 기능의 기간이 현재 기능 기간보다 길 때
                if(days[i] < days[j]) {
                    i = j - 1;
                    break;
                }
                count++;

            }
            ans.add(count + 1);
            if(j == days.length) break; //마지막 원소일 때

        }
		
		int[] answer = new int[ans.size()];

        for(int i = 0; i < answer.length;i++){
            answer[i] = ans.get(i);
            
        }
		return answer;
	}

}
