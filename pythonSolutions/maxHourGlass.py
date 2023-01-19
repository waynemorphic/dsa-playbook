class MaxHourGlass:
    def hour_glass(arr):
        maximum = -1000
        row = 6
        col = 6
        
        for i in range(row - 2):
            for j in range(col - 2):
                addition = (arr[i][j] + arr[i][j + 1] + arr[i][j + 2]) + (arr[i + 1][j + 1]) + (arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2])
                
                if addition > maximum:
                    maximum = addition
                    
        return maximum
        
    arr = [[1, 1, 1 ,0 ,0, 0],[0, 1 ,0 ,0 ,0, 0],[1, 1, 1 ,0 ,0, 0],[0, 0 ,2 ,4 ,4 ,0],[0 ,0 ,0, 2, 0 ,0],[0, 0, 1 ,2 ,4, 0]]
    print(hour_glass(arr))