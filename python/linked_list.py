# 冒泡排序
def bubble_sort(alist):
    length = len(alist)
    for i in range(length - 1):
        # i表示比较多少轮
        for j in range(length - i - 1):
            # j表示每轮比较的元素的范围，因为每比较一轮就会排序好一个元素的位置，
            # 所以在下一轮比较的时候就少比较了一个元素，所以要减去i
            if alist[j] > alist[j + 1]:
                alist[j], alist[j + 1] = alist[j + 1], alist[j]

# 选择排序
def selection_sort(alist):
    length = len(alist)
    for i in range(length - 1, 0, -1):
        for j in range(i):
            if alist[j] > alist[i]:
                alist[j], alist[i] = alist[i], alist[j]

# 插入排序
def insert_sort(alist):
    for i in range(1, len(alist)):
        # 从第二个元素开始，每次取出一个元素，插入前面的序列使其有序
        for j in range(i, 0, -1):
            if alist[j] < alist[j - 1]:
                alist[j], alist[j - 1] = alist[j - 1], alist[j]
