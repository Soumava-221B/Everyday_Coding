if __name__ == '__main__':
    x = int(input())
    y = int(input())
    z = int(input())
    n = int(input())
    l = []
    for i in range(x+1):
        for j in range(z+1):
            if i+j+k == n:
                continue
            l.appened([i,j,k])
    print(l)