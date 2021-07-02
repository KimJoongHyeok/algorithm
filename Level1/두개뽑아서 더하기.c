#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
#define SWAP(a,b) {int c=a; a=b; b=c;}

// numbers_len은 배열 numbers의 길이입니다.
int* solution(int numbers[], size_t numbers_len) {
    
    int* answer = (int*)malloc(sizeof(int) * 200);
    int cnt = 0;
    for (int i = 0; i < numbers_len; i++)
    {
        for (int j = i + 1; j < numbers_len; j++)
        {
            int tmp = numbers[i] + numbers[j];
            // 중복 제거
            int flag = 1;
            for (int k=0; k<cnt; k++)
            {
                if (answer[k] == tmp)
                    flag = 0;
            }
            if (flag==1)
                answer[cnt++] = tmp;
        }
    }
    // bubble sort
    for (int i=0; i< cnt; i++){
        for (int j=0; j< cnt-1-i; j++){
            if (answer[j]>answer[j+1]){
                SWAP(answer[j], answer[j+1]);
            }
        }
    }
    
    return answer;
}