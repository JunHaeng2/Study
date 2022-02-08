# 비동기 작업 처리
# 파이썬 GIL 설명
# 동시성 처리 실습 예제
# Process, Thread 예제

# Future, 동시성
# 비동기 작업의 실행
# A -> B -> END
# 지연시간(Block) CPU 및 리소스 낭비 방지 -> (File)
# network I/D 관련 작업 -> 동시성 활용 권장한다.. !
# 쓰는 중이던가 네트워크 아이디관련작업을 하고있을때 다른 부가적인 작업을
# 해도되는거기 때문에
# 비동기 작업과 적합한 프로그램일 경우 압도적으로 성능 향상된다.

import threading
import multiprocessing

# futures : 비동기 실행을 위한 API를 고수준으로 작성 ->
# 사용하기 쉽도록 개선
# concurrnet.futures
# 1. 멀티스레딩/멀티프로세싱 API 통일 -> 매우 사용하기 쉬움
# 2. 실행중인 작업 취소, 완료 여부 체크, 타임아웃 옵션, 콜백추가
# 동기화 코드 매우 쉽게 작성 가능하다. -> Promise 개념


# 2가지 패턴 실습
# concurrent.futures 사용법1
# concurrent.futures 사용법2

# GIL : 파이썬에만 있는 독특한것..
# Global Interpret Lock
# 두개 이상의 스레드가 동시에 실행될 때 하나의 자원을 엑세스 하는 경우
# -> 문제점을 방지하기 위해 GIL이 실행된다, 리소스 전체에 락이 걸린다
# -> context Switch(문맥 교환) 서로 일한걸 합치는 비용

# GIL : 멀티 프로세싱 사용, CPython(이때는 GIL 안걸림)

import os
import time
from concurrent import futures

WORK_LIST = [100000, 1000000, 10000000, 100000000]

# 동시성 합계 계산 메인 함수
# 누적 합계 함수(제너레이터)

def sum_generator(n):
    return sum(n for n in range(1, n+1))

def main():
    # Worker Count
    worker = min(10, len(WORK_LIST))

    # 시작 시간
    start_tm = time.time()

    # 결과 건수
    with futures.ProcessPoolExecutor() as excutor:
        # map -> 작업 순서를 유지하고 즉시 실행한다.
        # map 함수 같은 경우는 작업이 다 끝날떄까지 기다리는거임
        result = excutor.map(sum_generator, WORK_LIST)

    # 종료 시간
    end_tm = time.time() - start_tm

    # 출력 포맷
    msg = '\n Result -> {} Time : {:.2f}s'
    # 최종결과 출력
    print(msg.format(list(result), end_tm))

# 실행
if __name__ == '__main__':
    main()
