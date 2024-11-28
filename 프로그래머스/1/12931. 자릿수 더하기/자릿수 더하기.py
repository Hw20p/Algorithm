def solution(n):
    answer = 0
    
    line = list(map(int,str(n)))
    
    for num in line:
        answer += num

    return answer