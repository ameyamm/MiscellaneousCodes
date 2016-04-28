#!/usr/bin/python

import random 

def insertion_sort(arr):
    for j in range(1,len(arr)):
        i = j - 1
        temp = arr[j]
        while i >= 0 and arr[i] > temp:
            arr[i+1] = arr[i]
            i -= 1
        arr[i + 1] = temp

if __name__ == "__main__":
    l = [1,2,3,4,5,6,7,8,9,0]
    random.shuffle(l)
    print("original array:", l)
    insertion_sort(l)
    print("sorted array:", l)
    random.shuffle(l)


