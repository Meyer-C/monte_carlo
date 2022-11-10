import random
import math
import time

def monte_carlo(n):
    on_count = 0
    for i in range(n):
        point = (random.uniform(-1,1), random.uniform(-1,1))
        if dist(point, (0,0)) <= 1:
            on_count += 1
    return (on_count * 4) / n

def dist(point_1, point_2):
    return math.sqrt(abs(((point_1[0] - point_2[0])**2) + (abs(point_1[1] - point_2[1]))**2))

start = time.time()
pi = monte_carlo(100000)
end = time.time()
tot_time = end - start
print(pi)
print(tot_time)