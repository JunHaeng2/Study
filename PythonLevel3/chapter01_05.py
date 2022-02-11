"""
chapter01_05
keyword - contextlib, __enter__, __exit__

"""

"""
contextlib - Measure execution(타이머) 제작

"""

# Ex1
# Use Class

import time

class ExecuteTimer(object):
    def __init__(self, msg):
        self._msg = msg

    def __enter__(self):
        self._start = time.monotonic()
        return self._start

    def __exit__(self, exc_type, exc_value, exc_traceback):
        if exc_type:
            print("Logging exception {}".format((exc_type, exc_value, exc_traceback)))
        else:
            print('{} : {} s'.format(self._msg, time.monotonic() - self._start))
        return True

with ExecuteTimer('Start! job') as v:
    print('Received start monotonic1 : {}'.format(v))
    # Excute job
    for i in range(10000000):
        pass

# 연습 !
class ExecuteTimer2(object):
    def __init__(self, msg):
        self._msg = msg

    def __enter__(self):
        self._start = time.monotonic()
        return self._start

    def __exit__(self, exc_type, exc_value, exc_traceback):
        if exc_type:
            print("Logging exception {}".format((exc_type, exc_value, exc_traceback)))
        else:
            print("{} : {}s".format(self._msg, time.monotonic() - self._start))
        return True

with ExecuteTimer2("Start coding !") as v:
    print('Received start monotonic2 : {}'.format(v))

    for i in range(3000000):
        pass
    raise Exception('Raise! Exception!') # 강제로 발생
