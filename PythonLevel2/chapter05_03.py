# 외부에서 호출된 함수의 변수값, 상태(레퍼런스) 복사 후 저장
# -> 후에 접근(엑세스) 가능
# 외부에서 호출되어있는 함수의 값을 그 함수나 클래스 안에다가 상태(레퍼런스)로
# 저장을 해둔 다음에 다음에 접근할수있도록 만들어주는걸 클로저라고 한다.

# Closure 사용
def closure_ex1():

    # Free variable
    # 클로저 영역
    series = []
    def averager(v):
        series.append(v)
        print('inner >> {} / {}'.format(series, len(series)))
        return sum(series) / len(series)

    return averager

avg_closure1 = closure_ex1()

print(avg_closure1(10))
print(avg_closure1(30))
print(avg_closure1(50))

print()
print()

# function inspection
print(dir(avg_closure1))
print()
print(dir(avg_closure1.__code__))
# 자유변수 출력
print(avg_closure1.__code__.co_freevars)
# 이 cell_contents에 저장을 해두는거
print(avg_closure1.__closure__[0].cell_contents)

print()
print()

# 잘못된 클로저 사용
def closure_ex2():
    # Free variable
    cnt = 0
    total = 0

    def averager(v):
        cnt += 1
        total += v
        return total / cnt

    return averager

avg_closure2 = closure_ex2()
# scope 에러 발생
# print(avg_closure2(10)) # 예외

def closure_ex3():
    # Free variable
    cnt = 0
    total = 0

    def averager(v):
        # 프리 변수로서 바꿔준다는 소리임
        nonlocal cnt, total
        cnt += 1
        total += v
        return total / cnt

    return averager

avg_closure2 = closure_ex3()
print(avg_closure2(10))
print(avg_closure2(30))
print(avg_closure2(50))
