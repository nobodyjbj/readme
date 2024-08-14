
패트리샤 머클 트리(Patricia Merkle Tree)는 수정된 머클 패트리샤 트리라고도 하며, 블록체인 기술에서 안전하고 변조 불가능한 방식으로 대량의 데이터를 효율적으로 저장하고 검색하는 데 사용되는 데이터 구조다. 블록체인 시스템에서 사용하도록 특별히 설계된 머클 트리의 한 유형이다.

패트리샤 머클 트리에서 각 노드는 키-값 쌍을 나타내는데, 여기서 키는 저장되는 데이터의 해시이고 값은 실제 데이터입니다. 노드는 데이터를 쉽게 검색하고 검색할 수 있는 방식으로 구성된다. 일반적인 머클 트리와 달리 패트리샤 머클 트리의 노드는 노드당 두 개의 자식으로 제한되지 않는다.

"패트리샤"라는 이름은 "알파벳 숫자로 코딩된 정보를 검색하는 실용적인 알고리즘"을 의미하며, 이는 트리의 효율적인 데이터 검색 기능을 나타냅니다. 패트리샤 머클 트리를 사용하면 블록체인 시스템은 데이터를 보다 효율적으로 저장하고 검색할 수 있어 시스템 성능을 개선하는 데 도움이 된다.

## Merkle vs Patricia

머클 트리와 패트리샤 트리는 둘 다 데이터를 효율적으로 저장하고 검색하는 데 사용되는 데이터 구조이지만, 내부 구조와 최적화되는 데이터 유형이 다르다.

머클 트리는 각 리프 노드에 데이터 블록의 해시가 포함되고 각 비리프 노드에 두 자식 노드의 연결 해시가 포함된 이진 트리 구조다. 트리의 루트는 전체 데이터 세트의 해시를 나타내며, 데이터를 변경하려면 루트까지 영향을 받는 모든 노드의 해시를 업데이트해야 한다. 머클 트리는 일반적으로 대규모 데이터 세트의 무결성을 확인하는 데 사용되며, 전체 데이터 세트가 변조되지 않았는지 확인하려면 루트 해시만 확인하면 된다.

패트리샤 트리는 라딕스 트리 또는 트라이라고도 하며, 각 노드가 문자열을 나타내고, 에지가 다음 노드로 이어지는 문자를 나타내는 트리 데이터 구조다. 머클 트리와 달리 패트리샤 트리는 해시뿐만 아니라 임의의 데이터를 저장할 수 있다. 패트리샤 트리는 키-값 저장 및 검색에 최적화되어 있으며, 종종 데이터베이스와 파일 시스템에서 사용된다.

이더리움 상태 트리는 패트리시아 트리의 변형으로 구현되는데, 머클 트리와 패트리시아 트리의 이점을 결합한 수정된 머클 패트리시아 트리(MMPT)라고 한다. MMPT는 이더리움 네트워크의 계정 상태, 계약 스토리지, 트랜잭션 트리를 저장하는 데 사용된다.

https://docs.cryptohandbook.org/ethereum/general/what-is-ethereum/merkle-trees/patricia-merkle-tree

## Tries

이더리움에서 트라이는 블록체인의 상태를 저장하고 구성하는 데 사용되는 데이터 구조이다. 이는 각 노드가 키의 접두사를 나타내는 트리 데이터 구조의 한 유형이다. 이더리움의 트라이 데이터 구조의 키는 일반적으로 사용자 계정의 주소, 계정 내의 저장 키, 스마트 계약 코드를 참조하는 트랜잭션 해시다.

이더리움은 다양한 종류의 정보를 저장하기 위해 세 가지 유형의 Tries를 사용한다.
1. 상태 트리(State Trie): 이 트리는 잔액과 계약 코드를 포함하여 이더리움 블록체인의 모든 계정의 현재 상태를 저장합니다.
2. 저장 트라이(Storage Trie): 이 트라이는 이더리움 블록체인의 각 스마트 계약에 대한 저장 데이터를 저장합니다.
3. 거래 트라이(Transactions Trie): 이 트라이는 이더리움 블록체인의 모든 거래에 대한 거래 데이터를 저장합니다.
4. 영수증 트라이(Receipts Trie): 이 트라이는 이더리움 블록체인의 모든 거래에 대한 영수증 데이터를 저장합니다.

일반적으로, 트라이는 빠른 삽입, 삭제, 검색 작업이 가능하므로 대량의 데이터를 저장하는 효율적인 방법이다.
