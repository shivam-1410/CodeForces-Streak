def check_gender():
    username=input().strip()
    d_char=len(set(username))
    
    if d_char%2!=0:
        print("IGNORE HIM!")
    else:
        print("CHAT WITH HER!")
        
if __name__=="__main__":
    check_gender()