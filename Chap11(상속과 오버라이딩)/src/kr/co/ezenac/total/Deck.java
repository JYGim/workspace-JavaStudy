package kr.co.ezenac.total;

public class Deck {

	final int CARD_NUM = 52;		//카드의 갯수 (13 * 4)
	
	//카드 객체 배열 (2차원 배열 형태)
	Card[] card = new Card[CARD_NUM];
	int i = 0;
	
	//인스턴스 초기화 블록 -- 52개 카드를 초기화
	{
		for(int k=Card.KIND_MAX; k>0; k--) {			//무늬 : 4,3,2,1
			for(int n=1; n<Card.NUM_MAX+1; n++) {		//카드번호 : 1부터 시작
				card[i++] = new Card(k, n);
			}
		}
		
		//초기화 내용 출력
		for(int j=0; j<card.length; j++) {
			System.out.printf("Card[%d]의 무늬 : %d, Card[%d]의 숫자 : %d\n",
								j, card[j].kind,j,card[j].number);
		}
	}
	
	//생성자
	public Deck() {
		System.out.println("Deck 기본생성자 호출");
	}
	
	//카드 하나를 선택한다 (pick() 메서드)
	
	//카드를 섞는다 (shuffle() 메서드)
	
}







