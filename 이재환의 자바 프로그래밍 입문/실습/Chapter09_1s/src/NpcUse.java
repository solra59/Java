//클래스: 프로그래밍에서 객체(실제세계의 모든 사물들)와 관련된 데이터와 처리 동작을 한데 모은 코드 뭉치. 
//but 현실 객체를 프로그래밍에서 모두 묘사하기엔 데이터와 처리 동작이 너무 많아서 어느정도 특징적인 데이터와 동작을 추려내는데
//이렇게 특징적인 테이터와 처리동작을 추려내는 과정을 '추상화'라고 한다.
//명사적인 특징을 뽑아내는 추상화 과정 -> 멤버변수(필드) 추출
//동사적인 특징을 뽑아내는 추상화 과정 -> 멤버함수(메서드) 추출
//'클래스를 정의한다' : 어떤 객체를 자바의 클래스 파일에 데이터는 필드로, 동작은 메서드로 추상화하여 기술하는 것.

// 클래스 정의
class Npc
{
	
	// 필드 : 데이터
	String name;
	int    hp;
	
	//메서드 : 동작
	void say()
	{
		System.out.println("안녕하세요.");
	}
}

public class NpcUse{
	public static void main(String[] args) //.main()메서드만 파일 이름과 같은 class안에 존재하면 된다.
	{
		//~클래스를 객체(: 클래스에 기술된대로 구현한 것을 메모리에 탑재해 메모리 주소를 부여한 것)로 만드는 코드~
		//설계도를 이용해 실체를 만드는 것과 같이.. 소프트웨어 세계에선 클래스를 이용해 메모리에 적제될 값을 만든다. new가 객체 생성한다는거)
		//아래의 Npc()는 생성자. 객체 생성을 할때만 호출되는 특수한 메서드. new연산자가 객체의 생성자를 이용해서 객체를 생성해준다.
		//-클래스(public class Npc)를 이용해 객체 생성(new~) '객체 생성한다' = '인스턴스화한다' = '실체화하는 작업을 한다'
		//-클래스 타입의 변수(여기선 saram1)는 new를 통해 객체를 생성한다.
		Npc saram1 = new Npc();  //이걸 지우고 아래에 Npc.name 이런식으로 하면 전체 에러.
		
		//필드 접근
		saram1.name = "경비";
		saram1.hp   = 100;
		System.out.println(saram1.name + ":" + saram1.hp);
		
		//메서드 호출
		saram1.say();
	}

}

