"""
chapter03_05
keyword - descriptor vs property, low level(decriptor)
high level(property)


"""
"""
디스크립터
1. 상황에 맞는 메소드 구현을 통한 객체 지향 프로그래밍 구현
2. Property와 달리 reuse(재사용) 가능
3. ORM Framework 사용

"""

# Ex1
# Descriptor 예제(1)

import os

class DirectoryFileCount:
    def __get__(self, obj, objtype=None):
        # print(os.listdir(obj.dirname))
        return len(os.listdir)

class DirectoryPath:
    pass
