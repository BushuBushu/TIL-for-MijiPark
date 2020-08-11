import java.util.*;

//https://programmers.co.kr/learn/courses/30/lessons/42584
class Solution {
    public int[] solution(int[] prices) {
        int[] answer = {};
        answer = new int[prices.length]; //안하면 크기 인식 불가, 에러 발생
        
        
        for(int i=0; i<prices.length; i++) { //현재 항목을 돎
				for(int j=i+1; j<prices.length; j++) { //현재 항목의 다음 항목을 돎
					if(prices[i] > prices[j]) { //현재값이 다음 값보다 크다면
						answer[i] = j-i; //인덱스 차이만큼 answer에 저장하고 break
	                    break;
					}
					//다음 인덱스가 마지막 인덱스라면 인덱스 차이만큼 answer에 저장
	                if(j == answer.length-1) answer[i] = j-i;
				}
				
			}
		        return answer;
		}
}