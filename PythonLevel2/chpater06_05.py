# chapter06_05
# Futures wait 예제

# concurrent.futures wait, as_completed
# 각각의 작업이 걸리는 시간이 다르기 때문에 !
# 작업이 모두다 성공한다는 보장도 없음

import os
import time
from concurrent.futures import ThreadPoolExecutor, ProcessPoolExecutor, wait, as_completed

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
    # futures
    futures_list = []

    # 결과 건수
    # map -> 작업 순서를 유지하고 즉시 실행한다.
    # map 함수 같은 경우는 작업이 다 끝날떄까지 기다리는거임
    with ThreadPoolExecutor() as excutor:
        for work in WORK_LIST:
            # future만 반환
            future = excutor.submit(sum_generator, work)
            # 스케줄링
            futures_list.append(future)
            # 스케줄링 확인
            print('Scheduled for {} : {}'.format(work, future))
            print()

        # # timeout 시간까지만 기달려주고 그 안에 작업이 못끝나면
        # # 작업을 중지시켜버린다 ! wait
        # result = wait(futures_list, timeout=7)
        # # 성공
        # print('Completed Tasks : ' + str(result.done))
        # # 실패
        # print('Pending ones after waiting for 7 seconds : ' + str(result.not_done))
        # # 결과 값
        # print([future.result() for future in result.done])

        # as_completed 결과 출력
        for future in as_completed(futures_list):
            result = future.result()
            done = future.done()
            cancelled = future.cancelled()

            # future 결과 확인
            print('Future Result : {}, Done : {}'.format(result, done))
            print('Future cancelled : {}'.format(cancelled))

    # 종료 시간
    end_tm = time.time() - start_tm

    print('{:0.2f}s'.format(end_tm))

# 실행
if __name__ == '__main__':
    main()
