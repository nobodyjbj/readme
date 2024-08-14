이더리움 가상머신(EVM, Ethereum Virtual Machine)은 이더리움 블록체인의 스마트 컨트랙트를 실행하는 엔진이다. 이더리움 네트워크의 핵심 컴포넌트로, 스마트 컨트랙트의 배포 및 실행을 담당하며 이더리움의 탈중앙화된 애플리케이션(DApp) 생태계를 지원한다. EVM은 이더리움 네트워크의 각 노드에서 실행되며, 동일한 상태와 트랜잭션을 처리함으로써 네트워크의 일관성을 유지한다.
### EVM의 주요 기능과 작동 방식
1. **스마트 컨트랙트 실행**:
    - EVM은 Solidity, Vyper 등 이더리움의 스마트 컨트랙트 언어로 작성된 코드를 실행한다.
    - 컴파일된 바이트코드 형태의 스마트 컨트랙트를 실행하여 계약 조건을 자동으로 이행한다.
2. **상태 유지**:
    - 이더리움 블록체인은 전역 상태(state)를 유지한다. 상태는 모든 계정과 스마트 컨트랙트의 데이터를 포함한다.
    - EVM은 트랜잭션을 처리할 때 상태를 업데이트하며, 이 업데이트는 블록체인에 기록된다.
3. **가스(Gas) 시스템**:
    - EVM은 코드 실행과 연산에 가스를 요구한다. 가스는 트랜잭션 수수료로 사용된다.
    - 가스 비용은 연산 복잡성, 저장 공간 사용량, 트랜잭션 데이터에 따라 결정된다.
    - 가스 한도(gas limit)는 트랜잭션이 소모할 수 있는 최대 가스를 의미하며, 이를 초과하면 트랜잭션은 실패한다.
4. **디터미니즘**:
    - EVM은 디터미니스틱하게 작동하여 동일한 입력과 상태에서 동일한 결과를 보장한다. 이는 네트워크의 모든 노드가 일관된 결과를 얻도록 한다.
### EVM의 작동 과정
1. **트랜잭션 생성**:
    - 사용자가 스마트 컨트랙트를 호출하거나 새로운 컨트랙트를 배포하는 트랜잭션을 생성한다.
    - 트랜잭션은 보내는 주소, 받는 주소, 가스 한도, 가스 가격, 입력 데이터 등을 포함한다.
2. **트랜잭션 처리**:
    - 각 노드는 받은 트랜잭션을 EVM에서 실행한다.
    - EVM은 트랜잭션의 바이트코드를 읽고, 지정된 연산을 수행하며, 상태를 업데이트한다.
3. **가스 소비**:
    - EVM은 각 연산에 대해 필요한 가스를 소비한다.
    - 가스가 부족하면 트랜잭션이 중단되고, 이미 사용된 가스는 반환되지 않는다.
4. **상태 변경 기록**:
    - 성공적으로 실행된 트랜잭션의 상태 변경은 블록에 기록된다.
    - 실패한 트랜잭션도 기록되지만 상태는 변경되지 않는다.

EVM은 이더리움 네트워크의 스마트 컨트랙트 실행을 책임지며, 분산된 환경에서 일관된 결과를 보장하는 중요한 역할을 한다. 이를 통해 다양한 탈중앙화 애플리케이션이 안전하고 신뢰성 있게 운영될 수 있다.