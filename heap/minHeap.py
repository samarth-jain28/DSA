import os
os.system("clear")
import math

class minHeap:
    def __init__(self, ar):
        self.heap = []
        for i in ar:
            self.insert(i)

    def left(self, root):
        return root*2 + 1
    
    def right(self, root):
        return root*2 + 2
    
    def root(self, i):
        return math.ceil(i/2)-1
    
    def insert(self, i):
        self.heap.append(i)
        idx = len(self.heap)-1
        while self.root(idx) > -1:
            if self.heap[self.root(idx)] > self.heap[idx]:
                self.heap[self.root(idx)], self.heap[idx] = self.heap[idx], self.heap[self.root(idx)]
                idx = self.root(idx)
            else:
                break
        return
    
    def pop(self):
        ans = self.heap[0]
        
             

    def delete(self, i):
        pass 


ar = [60, 20, 50, 10, 60, 30, 90, 20, 25, 80, 40, 41, 45, 91, 900]
min_heap = minHeap(ar)
print(min_heap.heap)
