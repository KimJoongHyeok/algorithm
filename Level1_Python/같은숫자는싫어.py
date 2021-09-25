def solution(arr):
    answer = []
    #answer = list(set(arr))
    arr.append(-1)
    for i in range(len(arr)-1):
        if(arr[i] != arr[i+1]):
            answer.append(arr[i])
    return answer