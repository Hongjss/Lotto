
public class lottoCheck {
	
	private userLotto ul = null;
	
	public lottoCheck() {
		int count = 0;
		for(int i=0; i<ul.lottery(); i++) { //로또 정답 배열
			for(int j=0; j<number.length; j++) { //사용자 로또 번호 배열
				if(lotto[i] == number[j]) { 
					count ++; //사용자 로또 배열 값이 로또 정답 배열 값이랑 같은게 있을 경우 count 증가
				}
			}
		}
		
		System.out.println("맞힌 개수 : "+count);
		
		if(count == 6) {
			System.out.println("등수 : "+"1등 입니다");	
		}
		else if(count == 5) {
			System.out.println("등수 : "+"2등 입니다");
		}
		else if(count == 4) {
			System.out.println("등수 : "+"3등 입니다");
		}
		else {
			System.out.println("등수 : "+"꽝 ... 입니다");
		}
	}
	
	

}
