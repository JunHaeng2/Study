# chapter06_01

# 병행성(Concurrency)
# 이터레이터, 제너레이터
# Iterator, Generator

# 제너레이터는 반복 가능한 객체를 만들어주는것
# 이터레이터는 반복 가능한 객체

# 파이썬 반복 가능한 타입
# collections, list, dict, set, tuple
# unpacking, *args....
# 모두 iterable 하다.

# 반복 가능한 이유 -> 내부적으로 iter(x) 호출
t = 'ABCDEFGHIJKLMNOPQRSTQVWXYZ'
print(dir(t))

# text 이기 때문에 반복이 가능하다.
for c in t:
    print(c)

# while
w = iter(t)

# next를 사용하면 위치를 기억하고 나서, 마지막에 StopIteration 발생

while True:
    try:
        print(next(w))
    except StopIteration:
        break

print()

# 반복형 확인
# hasattr
print(hasattr(t, '__iter__'))

from collections import abc
# Iterable 클래스를 상속받았는지에 대해 알기위한 코드 !
print(isinstance(t, abc.Iterable))

print()
print()

# next 패턴
class WordSplitter:
    def __init__(self, text):
        self._idx = 0
        self._text = text.split(' ')

    def __next__(self):
        print('Called __next__')
        try:
            word = self._text[self._idx]
        except IndexError:
            raise StopIteration('Stoppped Iteration.')
        self._idx += 1
        return word

    def __repr__(self):
        return 'WordSplit(%s)' % (self._text)

wi = WordSplitter('Do today what you could do tommorrow')

print(wi)
print(next(wi))
print(next(wi))
print(next(wi))
print(next(wi))
print(next(wi))
print(next(wi))
print(next(wi))
# print(next(wi))

print()
print()

# Generator 패턴
# 1. 지능형 리스트, 딕셔너리, 집합 -> 데이터 양 증가 증가 후 메모리 사용
# 증가, -> 제너레이터 사용 권장
# 2. 제너레이터를 알아야 코루틴(Coroutine) 구현과 연동
# 3. 작은 메모리 조각 사용

class WordSplitGenerator():
    def __init__(self, text):
        self._text = text.split(' ')

    def __iter__(self):
        for word in self._text:
            # 다음에 리턴될 단어의 위치를 기억하고 있음.
            yield word # 제너레이터
        return

    def __repr__(self):
        return 'WordSplit(%s)' % (self._text)

wg = WordSplitGenerator('Do today what you could do tommorrow')

wt = iter(wg)

print(wt)

print(wt, wg)
print(next(wt))
print(next(wt))
print(next(wt))
print(next(wt))
print(next(wt))
print(next(wt))
print(next(wt))
# print(next(wt))

print()
print()
