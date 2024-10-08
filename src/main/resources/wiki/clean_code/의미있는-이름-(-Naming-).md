## 의미있는 이름 ( Naming )

모든 것에는 이름이 있다. 소프트웨어에서 이름을 지을 때 규칙을 소개한다.  

변수, 함수, 클래스등등 소프트웨어에서 이름이 붙는 모든 것은 의도가 분명하고 의미가 있는 이름을 지어줘야 한다.  
변수(혹은 함수나 클래스)의 존재 이유는?  
수행 기능은?  
과 같은 의도가 담겨져 있어야 한다.  

```java
// 리펙토링 전의 코드
public List<int[]> getAList() {
  List<int[]> list = new ArrayList<int[]>();
  
  for (int[] a : theList)
    if (a[0] == 4)
      list.add(a);
  return list;
}
```

메서드 이름에서 getAList는 무엇을 가져오는지?  
'list' 라는 변수에는 무엇이 담길 것인지?  
'int[] a' 는 'theList' 에서 무엇을 가져 오는 것인지?  
'theList' 에는 무엇이 들어 있는지?  
'4'의 의미는 무엇을 말하는지?  

동작은 하더라도 아무런 의미가 없는 코드나 다름이 없다. 각 변수가 어떤 역할이며 존재이유와 무엇을 수행하는지 이름만 보고 알 수 없기 때문이다.  
무엇을 가져오는지 파악하려면 전, 후의 히스토리를 알아야만 파악이 가능 할 것이다. 파악하는데 시간이 든다는 것이 문제다.  
소스를 조금 수정하면 아래의 소스처럼 할 수 있다.  

```java
// 리펙토링 후 코드
public List<Player> getScoringPlayers() {
  List<int[]> scoringPlayers = new ArrayList<int[]>();
  
  for (Player player : players)
    if (player.isGoal())
      scoringPlayers.add(player);

  return scoringPlayers;
} 
```

메서드 이름에서 득점선수를 가져오는 것을 알 수 있다.   
'scoringPlayers'에는 득점한 선수들의 명단이 담길 것이다.  
'players' 에서 'player' 를 가져온다.  
'players' 에는 선수 명단이 들어있다.  
득점 선수만 찾아오는 조건문이다.  

이와 같이 의도가 있는 이름을 붙여주면 메서드, 변수의 역할에 존재의 이유와 수행기능을 파악할 수 있고, 무엇보다 시간을 절약 할 수 있다.

책을 읽다보면 여러 방법들이 제시된다. 정리해 보면,  
* 그릇된 정보를 피하라
  - 한 단어에 여러 의미를 같는 단어는 되도록 피하는 것이 좋다. 의미가 헷갈릴 수 있다.
  - 흡사한 모양의 문자 사용을 지양하는 것이 좋다.
  - List와 같은 프로그래머에게 어떤 특수한 의미를 줄 수 있는 단어를 변수 또는 메서드에 붙이지 않아야 한다.
* 의미있게 구분하라
  - 메서드나 함수 이름에도 의미가 부여되어야 한다.
  - Product 클래스가 있다면 ProductData, ProductInfo와 같이 의미가 중복되는 클래스 명을 짓는 것은 피해야 한다.
* 발음하기 쉬운 이름을 사용하라
  - 읽기 어려운 변수명은 꼭 줄임말이더라. 줄임말 의미파악하는데 시간든다. 읽기 쉬운 이름을 사용하자.
* 검색하기 쉬운 이름을 사용하라
  - 하드코딩하지 말고 상수에 이름을 붙여주자.
* 인코딩을 피하라
* 자신의 기억력을 자랑하지 마라
  - 명료한 단어를 찾는 것이 좋다. a, b, c, i, j, k 는 최악의 변수명인 것 같다.
* 클래스 이름
  - 클래스와 객체의 이름은 명사나 명사구가 적합하다. Manager, Processor, Data, Info 등과 같은 단어는 피하는 것이 좋다.
* 메서드 이름
  - 메서드 이름은 동사나 당사구가 적합하다. 
* 기발한 이름은 피하라
  - 이런 이름은 유행을 타거나 한 분야에서만 사용하는 경우가 많다. 개발자나 개발하고 있는 도메인에 맞는 단어를 선택해야 한다.
* 한 개념에 한 단어를 사용하라
  - 개념이 같은 동작의 메서드의 이름은 같은 이름을 사용하는 것이 좋다. 같은 개념인데도 다른 메서드 명이라면 혼란스럽기 때문이다.
* 말장난을 하지마라
  - 한 단어를 두가지 목적으로 사용하면 안된다. 한 클래스에서 add()메서드의 개념이 더하기 1 이라면 다른 클래스에서도 동일한 개념이어야 한다.
* 해법 영역에서 가져온 이름을 사용하라
  - 프로그래머들이 자주 사용하는 이름을 사용하면 좋다.
* 문제 영역에서 가져온 이름을 사용하라
  - 개발하는 도메인에서 많이 사용하는 이름을 사용하는 것이 좋다.

이름하나 짓는데 이렇게나 많은 규칙을 지켜야 한다는 것이 귀찮거나 복잡해 보일 수 있겠지만 어찌보면 아주 당연한 이야기들을 책에서 제시해준 것 같다.  
어려울 수 있지만 연습하다보면 습관처럼 좋은 이름이 떠오를 것이라고 믿는다.