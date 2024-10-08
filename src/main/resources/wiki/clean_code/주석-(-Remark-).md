## 주석 ( Remark )

프로그래밍을 하다보면 주석을 보았거나 주석을 작성해 본 경험이 있다. 이 장에서는 주석에 대한 의미와 좋은 주석은 어떻게 표기 할 것인지에 대한 고민을 해본다.  

### 가장 좋은 주석은 주석을 작성하지 않는 것이다.

주석을 달지 않는 것이 가장 좋은 주석이라는 이유를 이야기 해본다.

* 주석은 나쁜 코드를 보완하지 못한다.  
주석을 추가하는 일반적인 이유는 코드 품질이 나쁘기 때문이다. 이럴때는 주석을 다는 것이 아니라 코드품질을 높이는 것이 정답에 가깝다.  

* 코드로 의도를 표현하다.
  ```java
  // before
  // 트리플 더블을 달성한 선수를 찾는다.
  if ( player.goal > TRIPLE_DOUBLE_GOAL && player.assist > TRIPLE_DOUBLE_ASSIST && player.rebound > TRIPLE_DOUBLE_REBOUND )

  // after
  if ( player.getTripleDoublePlayers() )
  ```

  함수 이름으로 조건문을 표현했다. 주석을 달지 않아도 트리플 더블을 달성한 선수를 찾는 다는 것을 알 수 있다.  

* 좋은 주석  
좋은 주석은 의도가 분명한 이름들을 통해 정보를 잘 전달해서 주석을 달지 않는 것이 제일 좋은 방법이다.  
하지만 주석을 작성해야 하는 경우는 분명히 존재한다. 예를 들어, JavaDoc이나 Spring Rest Docs, 의미나 의도를 강조하는 주석, TODO (hoistory 를 담은) 주석, 중요부분을 강조하는 주석, 경고 주석, 법적 의무로 작성해야함 하는 주석 등이 있다. 
아래는 주석을 작성할 때 고민해야 할 부분을 정리했다.  
  ```java
  // 한 줄 주석
  /* 
   * 블
   * 록
   * 주
   * 석
   */
  ``` 
  한 줄을 표현하는데 '/* 주석 */'와 같은 형식으로 작성하는 경우가 있는데 이렇게 작성하면 안된다. 용도에 맞게 사용하는 것이 중요하다.  
  필요로 의해 작성된 주석은 가독성이 좋아야 한다. 의미전달을 분명하고 명료하게 작성하는 것이 중요하다.  
  주석도 들여쓰기를 준수해야 한다. 들여쓰기를 맞춰주지 않으면 주석이 굉장히 뜬금없는 위치에 있는 느낌을 받는다.  

* 나쁜 주석  
주절거리는 주석  
의미가 불명확한 주석  
이력을 기록하는 주석  
의무적으로 다는 주석  
있으나 마나 한 주석  
위치를 표시하는 주석  
닫는 괄호의 주석  
공로를 돌리거나 저자를 표시하는 주석  
주석으로 처리한 코드  
HTML 주석  

등등 의미없는 주석을 사용하는 일을 자주 해서는 안된다.
  
  
  

