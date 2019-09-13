n=int(input("enter the size"))


# for right triangle size

x=n//2+1

# for upper portion

for i in range(1,n+1):
    print("  "*(n+2) + "*")
    
# for middle portion
    
for i in range(1,x):
    print("  "*(n+2) + "@ "*i)
    
for i in range(1,2):
    print("$ "*(n+2) + "@ "*x)
    
h=x-1    
for i in range(x,1,-1):
    print("  "*(n+2) + "@ "*h)
    h=h-1
   
# for lower portion   
   
for i in range(1,n+1):
    print("  "*(n+2) + "*")
