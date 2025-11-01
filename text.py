num = int(input("enter a number: "))
tag = 0
if num<= 1:
  print("not a prime number")
else:
  for i in rang (2, num):
    if (num%i == 0):
      tag = 1
  if (tag == 0):
    print(f"The number {num} is prime")
  else:
    print(f"The number {num} is  not prime")










