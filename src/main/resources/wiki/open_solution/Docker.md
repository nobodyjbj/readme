## Docker

### Docker

어플리케이션을 패키징 할 수 있는 툴, 하나의 컨테이너에 시스템 툴, 환경설정, 어플리케이션 등을 하나로 묶어서 다른 서버나 PC에 배포하여 안정적으로 운영할 수 있는 툴이다.  

### 가상화

#### 가상머신, 하이퍼 바이저

하나의 물리적 서버 호스트에서 여러 개의 서버 운영 체제를 게스트로 실행할 수 있게 해주는 소프트웨어 아키텍처이다.  
이러한 서버 가상화를 구현해주는 기술을 '**하이퍼바이저**'라고 한다.  
  
하이퍼바이저
여러 개의 운영체제를 하나의 호스트 OS에 생성해서 사용할 수 있게 하는 소프트웨어이다. 가상머신이라는 단위로 구별한다.  
각 게스트OS는 다른 게스트OS와는 완전히 독립된 구조이며, 시스템 자원을 할당받아 사용된다.  
  
가상화 작업은 하이퍼바이저를 반드시 거쳐야 하기 때문에 일반 호스트에 비해 성능 손실이 발생한다.  
가상머신에는 '게스트 운영체제'를 사용하기 위한 라이브러리, 커널등을 포함하기에 이미지 크기가 크다.   
대표적인 툴로는 Virtual Box, VMWare 등이 있다.  
  
가상머신은 완벽한 운영체제를 생성할 수 있는 장점이 있지만, 성능이 느리고 용량상 부담이 크다.

<img width="431" alt="image" src="https://github.com/nobodyjbj/readme/assets/21189169/f8306c29-dfbd-4fbf-b15f-9aac21e7a8dd">

#### 컨테이너 기반 가상화

작은 프로그램을 띄우는데 OS 까지 함께 설정하거나 구동하는 것은 부담이 크다.  
그래서 개발된 것이 컨테이너기반의 가상화 기술이다.   
리눅스의 chroot, 네임스페이스, cgroup을 사용하여 구현 되었다.  
  
어플리케이션을 만드는데 OS를 사용하지 않고 컨테이너 엔진을 사용하기 때문에 어플리케이션에 필요한 라이브러리 및 실행 파일만 존재하기 때문에 가상 머신에 비해 이미지 용량이 작다.  
따라서 이미지를 배포하는 시간이 가상머신에 비해 빠르며, 가상화된 공간을 사용할때 성능 손실도 적다.  
 
<img width="429" alt="image" src="https://github.com/nobodyjbj/readme/assets/21189169/cedc7778-a4d7-4828-a982-4181b38be4d1">

### 도커의 구성요소

1. Dockerfile
  * 컨테이너를 어떻게 만들어야 하는지에 대한 정보를 가지고있다.
  * 구동하기 위한 파일
  * 외부 dependencies
  * 환경 변수 설정
  * 구동 방법에 대한 스크립트
2. Image
  * 코드, 런타임 환경, 시스템 툴, 시스템 라이브러리가 포함된 스냅샷
3. Container
  * 이미지를 고립된 환경에서 실행할 수 있는 것을 말한다.

<img src="https://github.com/nobodyjbj/readme/assets/21189169/4d74a79c-e42d-42f1-8b39-1432ae08dd21" width="480" height="320" />

<img src="https://github.com/nobodyjbj/readme/assets/21189169/208202ce-1c23-413b-9232-7ed303821bcc" width="480" height="320" />
